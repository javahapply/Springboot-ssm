package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Factorydao;
import com.pojo.Factory;
import com.pojo.Material;
import com.service.Factoryservice;
@Service
public class Factoryimpl implements Factoryservice{
	@Autowired
	private Factorydao factory;

	@Override
	public List<Factory> queryfactory() {
		return factory.queryfactory();
	}
	
	
	
}
