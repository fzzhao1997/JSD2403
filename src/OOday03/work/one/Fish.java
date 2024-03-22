package OOday03.work.one;

public class Fish extends Animal implements Swim{
    Fish(){}
    Fish(String name,int age,String color){
        super(name,age,color);
    }

    @Override
    void eat() {
        System.out.println(name+"是一个"+ color+"色的小鱼,今年"+age+"岁,正在鱼饵...");
    }

    @Override
    void drink() {
        System.out.println(name+"是一个"+ color+"色的小鱼,今年"+age+"岁,正在喝水...");
    }

    @Override
    void sleep() {
        System.out.println(name+"是一个"+ color+"色的小鱼,今年"+age+"岁,正在睡觉...");
    }

    @Override
    public void swim() {
        System.out.println(name+"是一个"+ color+"色的小鱼,今年"+age+"岁,正在游泳...");
    }
}
