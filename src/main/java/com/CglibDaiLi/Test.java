package com.CglibDaiLi;

import net.sf.cglib.proxy.Enhancer;

public class Test {
    public static void main(String[] args) {
        //创建目标类实例
        TargetClass target=new TargetClass();

        //创建Enhancer对象，用于生成代理类
        Enhancer enhancer=new Enhancer();
        //使用 enhancer.setSuperclass(TargetClass.class) 方法设置代理类的父类为 TargetClass，表示代理类继承自 TargetClass
        enhancer.setSuperclass(TargetClass.class);
        //使用 enhancer.setCallback(new SampleInterceptor()) 方法设置代理类的回调函数为 SampleInterceptor 实例。这意味着当代理类的方法被调用时，将会触发 SampleInterceptor 中的逻辑，实现对目标类方法的拦截和增强
        enhancer.setCallback(new SampleInterceptor());

        //创建代理类的实例proxy。生成的代理类将包含继承自目标类target的方法，并且在方法调用时会经过 SampleInterceptor 的拦截。
        TargetClass proxy = (TargetClass) enhancer.create();

        // 使用代理类调用方法
        proxy.Action();

    }
}
