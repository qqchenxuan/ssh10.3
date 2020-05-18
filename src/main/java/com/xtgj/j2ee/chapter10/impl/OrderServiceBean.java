package com.xtgj.j2ee.chapter10.impl;

import com.xtgj.j2ee.chapter10.OrderService;
/**
 * 实现类
 * @author 迅腾国际
 *
 */
public class OrderServiceBean implements OrderService {

	public void save(String str) {
		System.out.println(" this is save method! "+str);
		
	}

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

		OrderServiceBean orderServiceBean=applicationContext.getBean("orderviceBean");

//		System.out.println();
		orderServiceBean.save("test aop");

	}
}

