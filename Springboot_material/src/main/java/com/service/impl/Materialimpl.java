package com.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Materialdao;
import com.pojo.Material;
import com.service.Materialservice;
@Service
public class Materialimpl implements Materialservice{
	
	@Autowired
	private Materialdao materialdao;
	
	@Override
	public List<Material> queryMaterial() {
		
		return materialdao.queryMaterial();
	}

	@Override
	public Material querybyidMaterial(Integer id) {
		return materialdao.querybyidMaterial(id);
	}

	

	@Override
	public boolean updateMater(Material material) {
		return materialdao.updateMater(material);
	}

	@Override
	public boolean deleteMater(Integer id) {
		return materialdao.deleteMater(id);
	}

	@Override
	public boolean piliangdelete(Integer[] arr) {
		return materialdao.piliangdelete(arr);
	}

	@Override
	public List<Material> materialLike(Map<String, Object> map) {
		return materialdao.materialLike(map);
	}

	@Override
	public List<Material> testqueryMaterial() {
		
		return materialdao.testqueryMaterial();
	}

	@Override
	public boolean insertMaterial(Material material) {
		return materialdao.insertMaterial(material);
	}

	

	

	

	

	

	

}
