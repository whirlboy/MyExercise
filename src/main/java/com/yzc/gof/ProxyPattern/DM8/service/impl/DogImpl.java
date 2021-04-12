package com.yzc.gof.ProxyPattern.DM8.service.impl;


import com.yzc.gof.ProxyPattern.DM8.service.CommodityService;

/**
 * <p>宠物狗实现商品接口 == 获取狗粮</p>
 */
public class DogImpl implements CommodityService {

	@Override
	public void getCommodity(String name) {
		System.out.println("宠物狗获得商品："+name);
	}

}
