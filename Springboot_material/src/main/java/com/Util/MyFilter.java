package com.Util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.stereotype.Component;
@Component
//@WebFilter(urlPatterns = {"/*"},filterName = "MyFilter")
public class MyFilter implements Filter{
	
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		/*System.out.println("过滤器进行过滤,进行方法之前");*/
		chain.doFilter(request, response);
		/*System.out.println("过滤器进行过滤,进行方法之后");*/
	}
	
	
	
}
