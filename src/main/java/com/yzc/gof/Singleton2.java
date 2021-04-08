package com.yzc.gof;


/**
 * 饿汉式单例模式
 */
public class Singleton2 {
    private static Singleton2 singleton2;

    private Singleton2(){

    }

    public static Singleton2 getInstance(){
        singleton2 = new Singleton2();
        return singleton2;
    }

}
