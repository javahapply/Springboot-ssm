package com.service;

import java.util.List;
import java.util.Map;

import com.pojo.Material;

public interface Materialservice {
	public List<Material> queryMaterial();
	
	public Material querybyidMaterial(Integer id);
	
	public boolean deleteMater(Integer id);
	
	public boolean piliangdelete(Integer [] arr);
	
	public boolean updateMater(Material material);
	
	public List<Material> materialLike(Map<String, Object> map);//模糊查询
	
	public List<Material> testqueryMaterial();
	
	//循环添加
	public boolean insertMaterial(Material material);

}
