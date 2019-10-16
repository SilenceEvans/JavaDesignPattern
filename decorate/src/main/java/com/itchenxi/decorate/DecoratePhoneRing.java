package com.itchenxi.decorate;

public class DecoratePhoneRing extends DecoratePhone {
    DecoratePhoneRing(Phone p) {
        super(p);
    }
    @Override
    public void call() {
        System.out.println("打电话之前先响彩铃");
        super.call();
    }
}
