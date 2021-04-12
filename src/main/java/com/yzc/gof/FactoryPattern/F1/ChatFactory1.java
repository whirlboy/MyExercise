package com.yzc.gof.FactoryPattern.F1;


import com.yzc.gof.FactoryPattern.DM1.Chat;
import com.yzc.gof.FactoryPattern.DM1.QQ;
import com.yzc.gof.FactoryPattern.DM1.WeiXin;

/**
 * <p>单方法工厂模式</p>
 */
public class ChatFactory1 {

    public Chat createChat(String tools){
        if("QQ".equals(tools)){
            return  new QQ();
        }else if("WeiXin".equals(tools)) {
            return  new WeiXin();
        }else{
            return null;
        }
    }
}
