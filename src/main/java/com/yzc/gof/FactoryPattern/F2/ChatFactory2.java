package com.yzc.gof.FactoryPattern.F2;


import com.yzc.gof.FactoryPattern.DM1.Chat;
import com.yzc.gof.FactoryPattern.DM1.QQ;
import com.yzc.gof.FactoryPattern.DM1.WeiXin;

/**
 * <p>多方法工厂模式 == 需要哪个，就用哪个方法</p>
 */
public class ChatFactory2 {

    public Chat createQQChat(){
        return  new QQ();
    }
    public Chat createWeiXinChat(){
        return new WeiXin();
    }
}
