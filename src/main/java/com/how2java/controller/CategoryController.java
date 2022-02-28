package com.how2java.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.how2java.pojo.Category;
import com.how2java.service.CategoryService;
import com.how2java.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;

// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class CategoryController {
	@Autowired
	CategoryService categoryService;

	@RequestMapping("listCategory")
	public ModelAndView listCategory(Page page){
		ModelAndView mav = new ModelAndView();
		PageHelper.offsetPage(page.getStart(),5);
		List<Category> cs= categoryService.list();
		int total = (int) new PageInfo<>(cs).getTotal();
		
		page.caculateLast(total);
		
		// 放入转发参数
		mav.addObject("cs", cs);
		// 放入jsp路径
		mav.setViewName("listCategory");
		return mav;
	}

	@RequestMapping("findListCategory")
	public ModelAndView findListCategory(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		ModelAndView mav = new ModelAndView();




//		PageHelper.offsetPage(page.getStart(),5);

//		int total = (int) new PageInfo<>(cs).getTotal();
		String  name  = request.getParameter("name");
		name = new String(name.getBytes("ISO-8859-1"),"utf-8");
		System.out.println("------------->>>>>>>>>>>>>>>>>"+name);
//		page.caculateLast(total);
		String  date  = request.getParameter("date");
//        date = null;
//		date.toString();
		String  post  = request.getParameter("post");
		List<Category> cs= categoryService.findList( name,date,post);
		// 放入转发参数
		mav.addObject("cs", cs);
		// 放入jsp路径
		mav.setViewName("listCategory");
		return mav;
	}
}
