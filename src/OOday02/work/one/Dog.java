package OOday02.work.one;

import java.awt.*;

public class Dog extends Animal {
    Dog() {
    }
    Dog(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    void eat() {
        System.out.println(color+"色的狗狗正在啃骨头...");
    }

    @Override
    void drink() {
        System.out.println(color+"色的狗狗正在喝水...");
    }
    void lookHome(){
        System.out.println(color+"色的狗狗正在看家");
    }
}
