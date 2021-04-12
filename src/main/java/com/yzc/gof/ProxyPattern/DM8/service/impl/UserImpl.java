package com.yzc.gof.ProxyPattern.DM8.service.impl;


import com.yzc.gof.ProxyPattern.DM8.service.CommodityService;

/**
 * <p>用户实现商品类 == 获取吃的</p>
 */
public class UserImpl implements CommodityService {

	@Override
	public void getCommodity(String name) {
		System.out.println("用户获得商品："+name);
	}

}
