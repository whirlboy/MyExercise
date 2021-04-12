package com.yzc.gof.SingletonPattern;


/**
 * 懒汉式单例模式
*/
public class Singleton1 {
    private static Singleton1 singleton;

    private Singleton1(){
    }

    public static Singleton1 getInstance(){
        if(singleton==null){
            singleton = new Singleton1();
        }
        return singleton;
    }

}
