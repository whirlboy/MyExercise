package com.yzc.gof.AbstractFactoryPattern.Mouse;


import com.yzc.gof.AbstractFactoryPattern.DM2.ProduceMouse;

/**
 * <p>罗技（G）鼠标生产商</p>
 */
public class LuoJiMouse implements ProduceMouse {
    @Override
    public void produceMouse(String name, String type) {
        System.out.println("罗技鼠标 -- "+name+","+type);
    }
}
