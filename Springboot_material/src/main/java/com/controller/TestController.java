package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pojo.Material;
import com.service.Materialservice;

@RestController
@RequestMapping("test")
public class TestController {

	@Autowired
	private Materialservice materialservice;
	
	
	@ResponseBody
	@RequestMapping("forinsert")
	public void test(Material material) {
		List<Material> testqueryMaterial = materialservice.testqueryMaterial();
		
		for (int i = 0; i < testqueryMaterial.size(); i++) {
			Material material2 = testqueryMaterial.get(i);
			material.setMatid(material2.getMatid());
			material.setMatuser(material2.getMatuser());
			material.setMatname(material2.getMatuser());
			material.setMatsum(material2.getMatsum());
			material.setMatprice(material2.getMatprice());
			material.setMatfactory(material2.getMatfactory());
			boolean insertMaterial = materialservice.insertMaterial(material);
			if (insertMaterial==true) {
				System.out.println("插入成功");
			}else {
				System.out.println("插入失败");
			}
		}
		
		
		/*if (insertMaterial==true) {
			System.out.println("插入成功");
		}else {
			System.out.println("插入失败");
		}*/
		
	}
	
	
	@ResponseBody
	@RequestMapping("toString")
	public List<Material>  totest() {
		List<Material> testqueryMaterial = materialservice.testqueryMaterial();
		String listToString = MaterialController.listToString(testqueryMaterial);	
		return testqueryMaterial;
		
		
	}
	
	
	@RequestMapping("Testpost")
	public String postString(String name,@RequestBody String age) {
		System.out.println(name);
		System.out.println(age);
		return "插入成功";
	}
	
}
