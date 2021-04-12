package com.yzc.gof.AbstractFactoryPattern.DM2;

/**
 * <p>鼠标接口 -- 生产鼠标</p>
 */
     public interface ProduceMouse {
     /**
     * 约定鼠标生产的规格数据
     * @param name 名称
     * @param type 类型
     */
    public  void produceMouse(String name,String type);
}
