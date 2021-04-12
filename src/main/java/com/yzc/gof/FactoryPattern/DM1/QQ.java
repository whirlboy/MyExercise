package com.yzc.gof.FactoryPattern.DM1;

/**
 * <p>QQ社交工具实现聊天接口</p>
 */
public class QQ implements Chat {
    @Override
    public void chatting(String seqNo) {
        System.out.println("使用QQ进行聊天 -- " + seqNo);
    }
}