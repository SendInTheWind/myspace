package com.lost.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lost.javabean.pojo.Lost;
import com.lost.javabean.pojo.Type;
import com.lost.javabean.pojo.User;
import com.lost.serviceImpl.LostServiceImpl;
import com.lost.serviceImpl.TypeServiceImpl;

@Controller
public class LostController {
	@Autowired
	private LostServiceImpl lostServiceImpl;
	@Autowired
	private TypeServiceImpl typeServiceImpl;
	@RequestMapping("/jumpLost.do")
	public String jumpLost(Model model){
		//查询所有的丢失物品
		List<Lost> lostList=lostServiceImpl.queryAllLost(0);
		model.addAttribute("lostList", lostList);
		return "lost";
	}	
	/**
	 * 跳转到addLost
	 * */
	@RequestMapping("/jumpAddLost.do")
	public String jumpAddLost(Model model){
		//查询所有的分类
		List<Type> typeList=typeServiceImpl.queryAllType();
		model.addAttribute("typeList", typeList);
		return "addLost";
	}	
	/**
	 * 添加丢失物品
	 * */
	@RequestMapping("/addLost.do")
	public String addLost(Lost lost,HttpServletRequest request){
		//获取用户
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("UserSession");
		//添加lost数据
		int success=lostServiceImpl.addLost(user.getUserId(),lost);
		if(success>0){
			return "redirect:/jumpLost.do";
		}
		return "redirect:/jumpPersonalLostPickup.do";
	}
	@RequestMapping("/deleteLost.do")
	public String deleteLost(int lostId){
		int i=lostServiceImpl.deleteLostById(lostId);
		return "redirect:/jumpPersonalLostPickup.do";
	}
	
	@RequestMapping("/jumpUpdateLost.do")
	public String jumpUpdateLost(int lostId,Model model){
		Lost lost=lostServiceImpl.queryLostById(lostId);
		List<Type> typeList=typeServiceImpl.queryAllType();
		model.addAttribute("lost", lost);
		model.addAttribute("typeList", typeList);
		return "updateLost";
	}
	
	
	@RequestMapping("/updateLost.do")
	public String updateLost(Lost lost){
		System.out.println(lost);
		int i=lostServiceImpl.updateLost(lost);
		return "redirect:/jumpPersonalLostPickup.do";
	}
	@RequestMapping("/jumpPickup.do")
	public String jumpPickup(Model model){
		List<Lost> pickupList = lostServiceImpl.queryAllLost(1);
		model.addAttribute("pickupList", pickupList);
		return "pickup";
	}
	@RequestMapping("/jumpPersonalLostPickup.do")
	public String jumpPersonalLostPickup(Model model){
		List<Lost> lostList=lostServiceImpl.queryAllLost(0);
		model.addAttribute("lostList", lostList);
		List<Lost> pickupList = lostServiceImpl.queryAllLost(1);
		model.addAttribute("pickupList", pickupList);
		return "personalLostPickup";
	}

}
