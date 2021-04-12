package com.yzc.gof.FactoryPattern.DM1;

/**
 * <p>微信社交App实现聊天接口</p>
 */
public class WeiXin implements Chat {
    @Override
    public void chatting(String seqNo) {
        System.out.println("使用微信进行聊天 -- " + seqNo);
    }
}
