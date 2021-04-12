package com.yzc.gof.AbstractFactoryPattern.KeyBoard;


import com.yzc.gof.AbstractFactoryPattern.DM2.ProduceKeyBord;

/**
 * <p>罗技（G）键盘生产商</p>
 */
public class LuoJiKeyBord implements ProduceKeyBord {
    @Override
    public void produceKeyBord(String name, String color) {
        System.out.println("罗技键盘 -- "+name+","+color);
    }
}
