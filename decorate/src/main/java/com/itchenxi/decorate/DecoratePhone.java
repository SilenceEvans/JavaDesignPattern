package com.itchenxi.decorate;

import java.io.BufferedOutputStream;

/**
 * 定义一个手机装饰类
 * @author wang
 */
public abstract class DecoratePhone implements Phone {
    private Phone p;
    DecoratePhone(Phone p) {
        this.p = p;
    }
    public  void call(){
        this.p.call();
    }
}
