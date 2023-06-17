package com.DongTaiDaiLi;

import java.lang.reflect.Proxy;

public class TestProxy {
    public static void main(String[] args) {
        //接口=实现类,创建了一个实例化的真实图像对象 RealPicture
        Picture realpicture=new RealPicture("picture.png");
        //通过调用 Proxy.newProxyInstance() 方法，我们创建了一个代理对象 proxyPicture，
        //通过传递 realpicture.getClass().getInterfaces() 作为参数，获取 realpicture 对象所属类的接口数组，实现了 Picture接口，并将 PictureProxyHandler 作为参数传递给它。
        Picture proxyPicture= (Picture) Proxy.newProxyInstance(realpicture.getClass().getClassLoader(),realpicture.getClass().getInterfaces(),new PictureProxyHandler(realpicture));
        //调用 proxyImage.display() 来触发动态代理的操作
        proxyPicture.display();
    }
}
