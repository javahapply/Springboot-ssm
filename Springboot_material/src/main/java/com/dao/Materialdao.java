package com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.pojo.Material;

@Mapper
public interface Materialdao {
	public List<Material> queryMaterial();
	
	public Material querybyidMaterial(Integer id);
	
	public boolean deleteMater(Integer id);
	
	public boolean piliangdelete(Integer [] arr);
	
	public boolean updateMater(Material material);
	
	public List<Material> materialLike(Map<String, Object> map);
	
	public List<Material> testqueryMaterial();
	
	public boolean insertMaterial(Material material);
	
}
