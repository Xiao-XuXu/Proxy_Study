package com.DaiLi;

//测试一下
public class TestProxy {
        // 使用代理类进行操作
        public static void main(String[] args) {
            //接口=实现类，picture是Picture接口的一个实例
            Picture picture=new ProxyPicture("picture.jpeg");
            picture.display();
        }
}
