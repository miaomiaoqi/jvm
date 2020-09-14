package com.miaoqi.imooc.concurrency.tools.immutable;

/**
 * 描述：     final的方法
 */
public class FinalMethodDemo {

    public void drink() {
    }

    public final void eat() {
    }

    public static void sleep() {
    }

}

class SubClass extends FinalMethodDemo {

    @Override
    public void drink() {
        super.drink();
        this.eat();
    }

    //    public final void eat() {
    //
    //    }
    public static void sleep() {
    }

}