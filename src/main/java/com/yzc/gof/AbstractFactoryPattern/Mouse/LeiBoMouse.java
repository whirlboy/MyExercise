package com.yzc.gof.AbstractFactoryPattern.Mouse;


import com.yzc.gof.AbstractFactoryPattern.DM2.ProduceMouse;

/**
 * <p>雷柏（Rapoo）鼠标生产商</p>
 */
public class LeiBoMouse implements ProduceMouse {
    @Override
    public void produceMouse(String name, String type) {
        System.out.println("雷柏鼠标 -- "+name+","+type);
    }
}
