package com.yzc.gof.FactoryPattern;


import com.yzc.gof.FactoryPattern.DM1.Chat;
import com.yzc.gof.FactoryPattern.F1.ChatFactory1;
import com.yzc.gof.FactoryPattern.F2.ChatFactory2;
import com.yzc.gof.FactoryPattern.F3.ChatFactory3;

/**
 * <p>工厂模式测试</p>
 */
public class FactoryTest {

    public static void main(String[] args) {

        // 1、使用单方法工厂模式进行测试
        ChatFactory1 chatFactory1 = new ChatFactory1();
        String seqNo = "1";
        Chat weixin1 = chatFactory1.createChat("WeiXin");
        weixin1.chatting(seqNo);
        Chat qq1     = chatFactory1.createChat("QQ");
        qq1.chatting(seqNo);
        Chat momo = chatFactory1.createChat("MoMo");
        if(momo == null){
            System.out.println("创建陌陌聊天工具实例失败");
        }else{
            momo.chatting(seqNo);
        }

        System.out.println("=======分割线=======");

        // 2、使用多方法工厂模式进行测试
        ChatFactory2 chatFactory2 = new ChatFactory2();
        seqNo = "2";
        Chat weixin2 = chatFactory2.createWeiXinChat();
        weixin2.chatting(seqNo);
        Chat qq2     = chatFactory2.createQQChat();
        qq2.chatting(seqNo);

        System.out.println("=======分割线=======");

        // 3、使用静态工厂模式进行测试
        seqNo = "3";
        Chat weixin3 = ChatFactory3.createWeiXinChat();
        weixin3.chatting(seqNo);
        Chat qq3     = ChatFactory3.createQQChat();
        qq3.chatting(seqNo);

        /**
         * 对比发现，静态工厂模式最佳，省了工厂实例的创建
         */
    }

}
