package com;

import java.util.Properties;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;

@SpringBootApplication
@MapperScan(value = "com.ly.dao.test")
public class SpringbootMybatisPlusGenratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisPlusGenratorApplication.class, args);
	}

	/**
	 * 
	 * 分页插件
	 * 
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		return new PaginationInterceptor();
	}

	/**
	 * 
	 * 打印 sql
	 * 
	 */
	@Bean
	public PerformanceInterceptor performanceInterceptor() {
		PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
		// 格式化sql语句
		Properties properties = new Properties();
		properties.setProperty("format", "faalse");
		performanceInterceptor.setProperties(properties);
		return performanceInterceptor;

	}

}
