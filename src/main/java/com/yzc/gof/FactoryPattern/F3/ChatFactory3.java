package com.yzc.gof.FactoryPattern.F3;


import com.yzc.gof.FactoryPattern.DM1.Chat;
import com.yzc.gof.FactoryPattern.DM1.QQ;
import com.yzc.gof.FactoryPattern.DM1.WeiXin;

/**
 * <p>静态工厂模式，无需创建工厂类实例</p>
 */
public class ChatFactory3 {

    public static Chat createQQChat(){
        return  new QQ();
    }
    public static Chat createWeiXinChat(){
        return new WeiXin();
    }

}
