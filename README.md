#学习参考
------

###mybatis-plus文档地址：
https://mp.baomidou.com/guide/generator.html#%E6%B7%BB%E5%8A%A0%E4%BE%9D%E8%B5%96
##官方
https://baomidou.gitee.io/mybatis-plus-doc/#/generic-crud?id=%E6%B3%A8%E8%A7%A3%E8%AF%B4%E6%98%8E

###Mybatis-plus SQL注入的原理
https://my.oschina.net/u/3574106/blog/2222591

###集成PageHelper做分页

```python

pagehelper:
  helperDialect: postgresql #设置sql语言
  reasonable: true
  supportMethodsArguments: true
  params: count=countSql
```


###PageHelper分页代码
```python
@GetMapping("/allhelper")
	@ResponseBody
	public String  getAllList1() {
		
		PageHelper.startPage(1,2);
		QueryWrapper<ActivityCommon> warp=new QueryWrapper<>();
		List<ActivityCommon> list=activityCommonService.list(warp);
		PageInfo<ActivityCommon> pageInfo=new PageInfo<ActivityCommon>(list);
		return JSON.toJSONString(pageInfo);
		
	}
```

