package OOday04.work.one;

public class Fish extends Animal implements Swim{
    Fish(){}
    Fish(String name,int age,String color){
        super(name,age,color);
    }

    @Override
    public void swim() {
        System.out.println(color+"色的"+name+",今年已经"+age+"岁了,现在它正在游泳...");
    }
    @Override
    void eat() {
        System.out.println(color+"色的"+name+",今年已经"+age+"岁了,现在它正在吃小虾...");
    }
}
