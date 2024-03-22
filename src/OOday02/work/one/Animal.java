package OOday02.work.one;

import java.awt.*;

public class Animal {
    String name;
    int age;
    String color;
    Animal(){}
    Animal(String name,int age,String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    void eat(){
        System.out.println(name+"正在吃东西...");
    }
    void drink(){
        System.out.println(name+"正在喝水...");
    }
}
