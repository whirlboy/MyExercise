package com.yzc.gof.ProxyPattern.DM8;


import com.yzc.gof.ProxyPattern.DM8.DP动态代理.DynamicProxy;
import com.yzc.gof.ProxyPattern.DM8.SP静态代理.DogProxy;
import com.yzc.gof.ProxyPattern.DM8.SP静态代理.UserProxy;
import com.yzc.gof.ProxyPattern.DM8.service.CommodityService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * <p>代理类工厂</p>
 */
public class ProxyFactory {

	/**
	 * 获取一个静态用户代理类对象
	 */
	public static CommodityService getUserProxy() {
		return new UserProxy();
	}
	
	/**
	 * 获取一个静态宠物狗的代理类对象
	 */
	public static CommodityService getDogProxy() {
		return new DogProxy();
	}

	public static Object getDynProxy(Object target) {
		InvocationHandler handler = new DynamicProxy(target);
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
	}

}
