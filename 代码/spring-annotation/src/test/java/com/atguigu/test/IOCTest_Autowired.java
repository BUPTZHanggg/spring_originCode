package com.atguigu.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atguigu.bean.Boss;
import com.atguigu.bean.Car;
import com.atguigu.bean.Color;
import com.atguigu.bean.Red;
import com.atguigu.config.MainConifgOfAutowired;
import com.atguigu.dao.BookDao;
import com.atguigu.service.BookService;

public class IOCTest_Autowired {
	
	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConifgOfAutowired.class);
		System.out.println(applicationContext);
//		BookService bookService = applicationContext.getBean(BookService.class);
//		System.out.println(bookService);
//
//		BookDao bean = applicationContext.getBean(BookDao.class);
//		System.out.println(bean);
//		applicationContext.close();
//		Boss bean = applicationContext.getBean(Boss.class);
//		System.out.println(bean);
//		Car bean1 = applicationContext.getBean(Car.class);
//		System.out.println(bean1);
//		Color bean2 = applicationContext.getBean(Color.class);
//		System.out.println(bean2);

	}

}
