package OOday04;



public class Fish extends Animal implements Swim {
    Fish() {
    }
    Fish(String name, int age, String color) {
        super(name, age, color);
    }
    @Override
    void eat() {
        System.out.println(color+"色的小鱼正在吃东西...");
    }
    @Override
    public void swim() {
        System.out.println(color+"色的"+age+"岁的小鱼"+name+"正在游泳...");
    }
}
