package com.pojo;

import java.io.Serializable;

public class Factory implements Serializable{
	private Integer factoryid;
	private String matfactory;
	private String factoryaddress;
	public Integer getFactoryid() {
		return factoryid;
	}
	public void setFactoryid(Integer factoryid) {
		this.factoryid = factoryid;
	}
	public String getMatfactory() {
		return matfactory;
	}
	public void setMatfactory(String matfactory) {
		this.matfactory = matfactory;
	}
	public String getFactoryaddress() {
		return factoryaddress;
	}
	public void setFactoryaddress(String factoryaddress) {
		this.factoryaddress = factoryaddress;
	}
	
	
}
