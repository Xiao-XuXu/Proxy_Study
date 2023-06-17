package com.DaiLi;

//创建代理类
public class ProxyPicture implements Picture{
    //这是对被代理类的一个引用
    private RealPicture realPicture;
    private String filename;
    //代理类的有参构造方法
    public ProxyPicture(String filename){
        this.filename=filename;
    }

    //代理类重写display方法
    public void display(){
        if(realPicture==null){
           realPicture = new RealPicture(filename);
        }
        System.out.println("Proxy picture display:");
        realPicture.display();
    }
}
