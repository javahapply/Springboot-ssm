package com.pojo;

import java.io.Serializable;

public class Material implements Serializable{
	private Integer matid;
	private String matuser;
	private String matname;
	private String matsum;
	private double matprice;
	private String matfactory;
	
	public Integer getMatid() {
		return matid;
	}
	public void setMatid(Integer matid) {
		this.matid = matid;
	}
	public String getMatuser() {
		return matuser;
	}
	public void setMatuser(String matuser) {
		this.matuser = matuser;
	}
	public String getMatname() {
		return matname;
	}
	public void setMatname(String matname) {
		this.matname = matname;
	}
	public String getMatsum() {
		return matsum;
	}
	public void setMatsum(String matsum) {
		this.matsum = matsum;
	}
	public double getMatprice() {
		return matprice;
	}
	public void setMatprice(double matprice) {
		this.matprice = matprice;
	}
	public String getMatfactory() {
		return matfactory;
	}
	public void setMatfactory(String matfactory) {
		this.matfactory = matfactory;
	}
	@Override
	public String toString() {
		return "Material [matid=" + matid + ", matuser=" + matuser + ", matname=" + matname + ", matsum=" + matsum
				+ ", matprice=" + matprice + ", matfactory=" + matfactory + "]";
	}
	
	
	
	
	
	
}
