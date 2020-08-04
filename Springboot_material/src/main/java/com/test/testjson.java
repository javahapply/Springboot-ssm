package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

public class testjson {
	public static void main(String[] args) {
		String jsonStr ="{\"name\":\"zhangsan\",\"sex\":\"nan\"}";
        //Map<String,Object>map=new HashMap<String,Object>();
        Map map = JSON.parseObject(jsonStr, Map.class);
        System.out.println("姓名："+map.get("name"));
        
	}
}
