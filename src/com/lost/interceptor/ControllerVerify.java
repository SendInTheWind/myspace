package com.lost.interceptor;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.lost.javabean.pojo.User;

public class ControllerVerify implements HandlerInterceptor{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		//获取请求URL
		String url=request.getRequestURI();
		if(url.indexOf("ogin")>0||url.indexOf("egister")>0||url.indexOf("ourist")>0){
			return true;
		}
		//获取Session
		HttpSession session = request.getSession();
		User user=(User) session.getAttribute("UserSession");
		if(user!=null){
			return true;
		}
		request.setAttribute("verifyError", "您还没有登录，请登录后操作");
		request.getRequestDispatcher("/lost/jsp/login.jsp").forward(request, response);
		return false;
	}
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	

}
