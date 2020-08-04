package com.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class Tmp_users implements Serializable{
	
	private static final long serialVersionUID = -6951174609455444819L;
	
	private Integer userid;
	private String loginname;
	private String loginpwd;
	private String realname;
	private String sax;
	private String age;
}
