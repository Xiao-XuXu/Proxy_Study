package com.DongTaiDaiLi;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//动态代理处理器，实现InvocationHandler接口
public class PictureProxyHandler implements InvocationHandler {
    //对被代理类的引用
    private Picture realPicture;
    //传入的对象是实现了Picture接口的实现类
    public PictureProxyHandler(Picture realPicture){
        this.realPicture=realPicture;
    }
    //接收了三个参数，proxy：代理对象本身；method：被调用的方法对象；args：方法的参数。
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        // 在调用真实图像对象的方法之前输出了一行额外的信息,这是代理对象的方法被调用之前添加的额外操作
        System.out.println("Proxy image display:");
        //调用了真实图像对象的相应方法，并将其返回结果作为 invoke() 方法的返回值
        return method.invoke(realPicture, args);
    }
}
