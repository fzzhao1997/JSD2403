package OOday02.work.two;

public class Fish extends Animal {
    Fish() {
    }
    Fish(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    void eat() {
        System.out.println(color+"色的小鱼正在吃东西...");
    }
}
