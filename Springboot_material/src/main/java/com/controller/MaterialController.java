package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pojo.Factory;
import com.pojo.Material;
import com.service.Factoryservice;
import com.service.Materialservice;

@Controller
@RequestMapping("cc")
public class MaterialController {
	@Autowired
	private Factoryservice factoryservice;
	
	@Autowired
	private Materialservice materialservice;
	
	
	//查询全部
	@RequestMapping("queryMaterial")
	public String queryMaterial(@RequestParam(value="pageNo",defaultValue="1")Integer pageNo,Model model,HttpServletRequest request) {
		String nameString=request.getParameter("shoping");
		String factoryString=request.getParameter("factorying");
		String startmenoy=request.getParameter("startmenoy");
		String endmenoy=request.getParameter("endmenoy");
		Map<String,Object>map=new HashMap<String, Object>();
		map.put("kw", nameString);
		map.put("fac", factoryString);
		map.put("startmenoy", startmenoy);
		map.put("endmenoy", endmenoy);
		
		
		PageHelper.startPage(pageNo, 5);//开始页数与每页多少条
		List<Material> list = materialservice.materialLike(map);
		for (int i = 0; i < list.size(); i++) {
			Material material = list.get(i);
			System.out.println(material.getMatname()+"---"+material.getMatfactory());
		}
		
		
		//List<Material> list = materialservice.queryMaterial();
		PageInfo<Material> pageInfo=new PageInfo<Material>(list);
		
		
		//model.addAttribute("list", list);
		model.addAttribute("pageInfo", pageInfo);		
		return "materiallist";
	}
	
	//回显
	@RequestMapping("querybyidMaterial")
	public String querybyidMaterial(Integer id,Model model) {
		Material list = materialservice.querybyidMaterial(id);
		model.addAttribute("list", list);
		return "update";
	}
	
	
	//查询所有厂商
	@ResponseBody
	@RequestMapping("havefactory")
	public List<Factory> havefactory() {
		List<Factory> factorylist =factoryservice.queryfactory();
		return factorylist;
	}
	
	
	//修改
	@RequestMapping("updateMaterial")
	public String updateMaterial(Material material,HttpServletResponse response) {
		System.out.println(material.getMatname());
		System.out.println(material.getMatid());
		System.out.println(material.getMatfactory());
		
		boolean mater = materialservice.updateMater(material);
		if (mater==true) {
			return "forward:/cc/queryMaterial";
		}
		try {
			 response.setContentType("text/html;charset=utf-8");
			 PrintWriter pw;
			pw = response.getWriter();
			pw.println("<script>alert('修改失败');</script>");
			 pw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "update";	
	}
	
	//删除
	@RequestMapping("deleteMaterial")
	public String deleteMaterial(Integer id,HttpServletResponse response) {
		boolean deleteMater = materialservice.deleteMater(id);
		if (deleteMater==true) {
			return "forward:/cc/queryMaterial";
		}
		try {
			 response.setContentType("text/html;charset=utf-8");
			 PrintWriter pw;
			pw = response.getWriter();
			pw.println("<script>alert('修改失败');</script>");
			 pw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "forward:/cc/queryMaterial";
	}
	//批量删除
	@RequestMapping("pilandelete")
	public String pilandelete(Integer[] box) {
		materialservice.piliangdelete(box);
		return "forward:/cc/queryMaterial";
	}
	
	//模糊查询
	@RequestMapping("materLike")
	public String materLike(HttpServletRequest request,Model model) {
		String nameString=request.getParameter("shoping");
		String factoryString=request.getParameter("factorying");
		String startmenoy=request.getParameter("startmenoy");
		String endmenoy=request.getParameter("endmenoy");
		Map<String,Object>map=new HashMap<String, Object>();
		map.put("kw", nameString);
		map.put("fac", factoryString);
		map.put("startmenoy", startmenoy);
		map.put("endmenoy", endmenoy);
		List<Material> list = materialservice.materialLike(map);
		/*for (int i = 0; i < list.size(); i++) {
			Material material = list.get(i);
			System.out.println(material.getMatname()+"---"+material.getMatuser());
		}*/
		model.addAttribute("list", list);
		return "materLike";
	}
	
	public static String listToString(List<Material> stringList) {
		if (stringList == null) {
			return null;
		}
		StringBuilder result = new StringBuilder();
		boolean flag = false;
		for (Material string : stringList) {
			if (flag) {
				result.append(",");
			} else {
				flag = true;
			}
			result.append(string);
		}
		return result.toString();
	}
	
	
}
