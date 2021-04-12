package com.yzc.gof.AbstractFactoryPattern.Factory;


import com.yzc.gof.AbstractFactoryPattern.DM2.AComputerFactory;
import com.yzc.gof.AbstractFactoryPattern.DM2.ProduceKeyBord;
import com.yzc.gof.AbstractFactoryPattern.DM2.ProduceMouse;
import com.yzc.gof.AbstractFactoryPattern.KeyBoard.LeiBoKeyBord;
import com.yzc.gof.AbstractFactoryPattern.Mouse.LeiBoMouse;

/**
 * <p>联想电脑生产商 == 电脑型号01【固定键盘和鼠标生产商】</p>
 */
public class LianXiang01Factory implements AComputerFactory {


    @Override
    public ProduceKeyBord createKeyBord() {
        // 使用雷柏的键盘
        return new LeiBoKeyBord();
    }

    @Override
    public ProduceMouse createMouse() {
        // 使用雷柏的鼠标
        return new LeiBoMouse();
    }
}
