package com.lost.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lost.javabean.pojo.Type;
import com.lost.serviceImpl.TypeServiceImpl;


@Controller
public class AdminController {
	@Autowired
	private TypeServiceImpl typeServiceImpl;
	
	@RequestMapping("/jumpType.do")
	public String jumpType(Model model){
		//查询所有的类型
		List<Type> typeList =typeServiceImpl.queryAllType();
		System.out.println(typeList);
		model.addAttribute("typeList",typeList);
		return "type";
	}
	@RequestMapping("/jumpAddType.do")
	public String jumpAddType(){
		return "addType";
	}
	@RequestMapping("/addType.do")
	public String addType(String typeName,Model model){
		System.out.println(typeName);
		int i=typeServiceImpl.addType(typeName);
		if(i>0){
			model.addAttribute("addType", "添加成功");
			return "forward:/jumpType.do";
		}
		model.addAttribute("addType", "添加失败");
		return "forward:/jumpType.do";
	}
	@RequestMapping("/deleteType.do")
	public String deleteType(int typeId){
		int i=typeServiceImpl.deleteType(typeId);
		return "redirect:jumpType.do";
	}
}
