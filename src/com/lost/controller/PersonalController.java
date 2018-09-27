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
import com.lost.serviceImpl.UserServiceImpl;

@Controller
public class PersonalController {
	@Autowired
	private UserServiceImpl userServiceImpl;
	@Autowired
	private LostServiceImpl lostServiceImpl;
	@RequestMapping("/jumpLogin.do")
	public String login(){
		return "login";
	}
	
	@RequestMapping("/loginVerify.do")
	public String verify(User user,Model model,HttpServletRequest request){
		String userPhone=user.getUserPhone();
		String userPassword=user.getUserPassword();
		User dbUser=userServiceImpl.queryUser(user);
		if(dbUser!=null){
			if(userPhone.equals(dbUser.getUserPhone()) && userPassword.equals(dbUser.getUserPassword())){
				HttpSession session=request.getSession();
				session.setAttribute("UserSession", dbUser);
				return "redirect:/jumpLost.do";
			}
		}
		//用户验证
		model.addAttribute("verifyError", "账号或密码输入错误");
		return "login";
	}
		
	@RequestMapping("/jumpRegister.do")
	public String jumpRegister(){
		return "register";
	}
	
	@RequestMapping("/register.do")
	public String register(User user,Model model){
		int i=userServiceImpl.addUser(user);
		if(i>0){
			model.addAttribute("register","注册成功，请登录");
			return "forward:/jumpLogin.do";
		}
		model.addAttribute("registerError","用户已存在，注册失败请重新输入");
		return "forward:/jumpRegister.do";
	}
	
	@RequestMapping("/jumpPersonalCenter.do")
	public String jumpPersonalCenter(HttpServletRequest request,Model model){
		HttpSession session=request.getSession();
		User user=(User) session.getAttribute("UserSession");
		model.addAttribute("user", user);
		return "personalCenter";
	}
	
	@RequestMapping("/updateUser.do")
	public String updateUser(User user,HttpServletRequest request,Model model){
		int updateUser = userServiceImpl.updateUser(user);
		System.out.println(updateUser);
		HttpSession session=request.getSession();
		session.setAttribute("UserSession", user);
		model.addAttribute("user", user);
		return "personalCenter";
	}
	/**
	 * 游客登录
	 * */
	@RequestMapping("/jumpTourist.do")
	public String jumpTourist(Model model){
		List<Lost> lostList=lostServiceImpl.queryAllLost(0);
		model.addAttribute("lostList", lostList);
		return "tourist";
	}
	
	
}























