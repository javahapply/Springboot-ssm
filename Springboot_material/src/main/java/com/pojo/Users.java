package com.pojo;

import java.io.Serializable;
import java.util.Date;

public class Users implements Serializable{
	private Integer userid;
	private String loginname;
	private String loginpwd;
	private String realname;
	private String sax;
	private String age;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getLoginpwd() {
		return loginpwd;
	}
	public void setLoginpwd(String loginpwd) {
		this.loginpwd = loginpwd;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	
	public String getSax() {
		return sax;
	}
	public void setSax(String sax) {
		this.sax = sax;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
	
	
}
