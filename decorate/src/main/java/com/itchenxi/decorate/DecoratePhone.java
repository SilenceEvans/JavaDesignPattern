package com.itchenxi.decorate;

/**
 * 定义一个手机装饰类
 * @author wang
 */
public abstract class DecoratePhone {
    private Phone p;
    DecoratePhone(Phone p) {
        this.p = p;
    }
    public  void call(){
        this.p.call();
    }
}
