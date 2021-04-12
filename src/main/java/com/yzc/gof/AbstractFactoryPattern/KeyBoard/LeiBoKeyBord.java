package com.yzc.gof.AbstractFactoryPattern.KeyBoard;


import com.yzc.gof.AbstractFactoryPattern.DM2.ProduceKeyBord;

/**
 * <p>雷柏（Rapoo）键盘生产商</p>
 */
public class LeiBoKeyBord implements ProduceKeyBord {
    @Override
    public void produceKeyBord(String name, String color) {
        System.out.println("雷柏键盘 -- "+name+","+color);
    }
}
