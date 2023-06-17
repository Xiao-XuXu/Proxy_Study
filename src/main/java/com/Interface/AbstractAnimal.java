package com.Interface;

//抽象类前面有abstract
public abstract class AbstractAnimal {
        //抽象类也是类，它有自己的属性和方法
        private String name;
        private int number;
        //抽象类是有构造方法的，刚刚说的接口没有构造方法，这里是一个拥有2个参数的有参构造方法
        public AbstractAnimal(String name, int number)
        {
                System.out.println("执行父类的有参构造方法");
                this.name = name;
                this.number = number;
        }
        public AbstractAnimal(){
                System.out.println("执行父类无参构造方法");
        }
        //抽象类里面有抽象方法，抽象方法前面有abstract。抽象方法没有方法体，也就是没有{}
        public abstract void eat();
        //抽象类里面有非抽象方法，就是有{}
        public void normalMethod(){}
}
