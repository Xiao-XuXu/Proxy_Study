package com.DaiLi;

//创建一个实现类RealPicture，实现Picture接口
public class RealPicture implements Picture {
    //有自己的私有属性
    private String filename;

    //有参构造方法
    public RealPicture(String filename){
        this.filename=filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading Picture: " + filename);
    }

    //重写接口里的抽象方法
    public void display() {
        System.out.println("Displaying picture: "+filename);
    }
}
