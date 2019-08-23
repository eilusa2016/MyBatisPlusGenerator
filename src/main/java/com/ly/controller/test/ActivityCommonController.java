package com.ly.controller.test;


import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ly.bean.test.ActivityCommon;
import com.ly.service.test.ActivityCommonService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 * 活动的基础表 前端控制器
 * </p>
 *
 * @author xjb
 * @since 2019-08-23
 */
@Controller
@RequestMapping("/activityCommon")
public class ActivityCommonController {

	@Autowired
	private  ActivityCommonService activityCommonService;
	
	@GetMapping("/all")
	@ResponseBody
	public String  getAllList() {
		
		QueryWrapper<ActivityCommon> warp=new QueryWrapper<>();
//		List<ActivityCommon> list=activityCommonService.list(warp);
//		List<ActivityCommon> list=activityCommonService.list(null);
		/**
		 * 这种分页需要配置分页插件
		 * PaginationInterceptor
		 */
		Page<ActivityCommon> page=new Page<ActivityCommon>(1, 2);
		IPage<ActivityCommon> list=activityCommonService.page(page,warp);
		return JSON.toJSONString(list);
		
	}
	
	
	@GetMapping("/allhelper")
	@ResponseBody
	public String  getAllList1() {
		
		PageHelper.startPage(1,2);
		QueryWrapper<ActivityCommon> warp=new QueryWrapper<>();
		List<ActivityCommon> list=activityCommonService.list(null);
		PageInfo<ActivityCommon> pageInfo=new PageInfo<ActivityCommon>(list);
		return JSON.toJSONString(pageInfo);
		
	}
	
	
}
