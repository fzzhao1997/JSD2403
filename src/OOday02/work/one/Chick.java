package OOday02.work.one;

public class Chick extends Animal {
    Chick() {
    }
    Chick(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    void eat() {
        System.out.println(color+"色的小鸡正在吃米...");
    }

    @Override
    void drink() {
        System.out.println(color+"色的小鸡正在喝水...");
    }
    void layEggs(){
        System.out.println(color+"色的小鸡正在下蛋");
    }
}
