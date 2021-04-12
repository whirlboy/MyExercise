package com.yzc.gof.AbstractFactoryPattern.DM2;

/**
 * <p>电脑抽象工厂接口 == 只提供电脑组件的组装，具体组装成什么样型号的电脑，再由具体工厂类决定</p>
 */
public abstract  interface AComputerFactory {
    ProduceKeyBord createKeyBord();
    ProduceMouse createMouse();
}
