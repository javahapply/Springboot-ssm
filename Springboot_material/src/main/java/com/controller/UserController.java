package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pojo.Users;
import com.service.Userservice;

@Controller
@RequestMapping("fc")
public class UserController {
	
	
	@Autowired
	private Userservice userservice;
	
	@RequestMapping("tiaoindex")
	public String  tiaoindex() {
		
		return "forward:/cc/queryMaterial";
	}
	
	@ResponseBody
	@RequestMapping("checkuser")
	public String checkuser(Users users,HttpServletRequest request,HttpServletResponse response) {				
		Users user = userservice.checkusers(users);	
		HttpSession session=request.getSession();
		session.setAttribute("user", user);
		if (user==null) {
			return "false";
		}else {
			return "true";
		}
		
		
		
	}
	
	@RequestMapping("register")
	public String register(Users users,HttpServletResponse response) {
		boolean insertUser = userservice.insertUser(users);
		if (insertUser==true) {
			return "forward:/cc/queryMaterial";
		}
		try {
			 response.setContentType("text/html;charset=utf-8");
			 PrintWriter pw;
			pw = response.getWriter();
			pw.println("<script>alert('注册失败');</script>");
			 pw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "zhuce";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
