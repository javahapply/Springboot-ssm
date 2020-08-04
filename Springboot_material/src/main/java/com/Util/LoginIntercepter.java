package com.Util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
@Component
public class LoginIntercepter implements HandlerInterceptor{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		/*System.out.println("拦截器指向目标方法之前");*/
		
		return true;
	}
	
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		/*System.out.println("拦截器执行目标方法之后的操作");*/
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		/*System.out.println("拦截器结束时候进行的操作");*/
	}

}
