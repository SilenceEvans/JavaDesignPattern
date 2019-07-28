package com.itchenxi.decorate;

import org.junit.Test;

public class TestDecotrate {
    @Test
    public void test(){
        Phone phone = new PhoneImpl();
        DecoratePhone decoratePhone = new DecoratePhoneRing(phone);
        decoratePhone.call();
    }
}
