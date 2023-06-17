package com.Interface;

//抽象类的子类Cat可以是非抽象的
public class Cat extends AbstractAnimal {
    //创建子类Cat对象，默认会先调用父类的无参构造方法
    public Cat(){
        System.out.println("执行子类的无参构造方法");
    }
    //这是子类的有参构造方法，内部是调用了父类的有参构造方法
    public Cat(String name, int number) {
        super(name, number);
        System.out.println("执行子类有参构造方法");
    }
    //子类必须重写父类所有的抽象方法
    public void eat() {
        System.out.println("我重写了父类的抽象方法");
    }
}
