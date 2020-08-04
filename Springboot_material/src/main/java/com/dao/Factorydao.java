package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.pojo.Factory;

@Mapper
public interface Factorydao {
	public List<Factory> queryfactory();
}
