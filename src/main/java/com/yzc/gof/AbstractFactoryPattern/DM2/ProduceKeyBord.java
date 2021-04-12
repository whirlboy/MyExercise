package com.yzc.gof.AbstractFactoryPattern.DM2;

/**
 * <p>键盘接口 -- 生产键盘 </p>
 */
public interface ProduceKeyBord {
    /**
     * 约定键盘生产的规格数据
     * @param name  名称
     * @param color 颜色
     */
    public void produceKeyBord(String name,String color);
}
