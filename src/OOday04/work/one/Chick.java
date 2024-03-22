package OOday04.work.one;

public class Chick extends Animal{
    Chick(){}
    Chick(String name,int age,String color){
        super(name,age,color);
    }
    @Override
    void eat() {
        System.out.println(color+"色的"+name+",今年已经"+age+"岁了,现在它正在吃米...");
    }
    void layEggs(){
        System.out.println(color+"色的"+name+",今年已经"+age+"岁了,现在它正在下蛋...");
    }
}
