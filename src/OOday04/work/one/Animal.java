package OOday04.work.one;

public abstract class Animal{
    String name;
    int age;
    String color;
    Animal(){}
    Animal(String name,int age,String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    abstract void eat();
    void drink(){
        System.out.println(color+"色的"+name+",今年已经"+age+"岁了,现在它正在喝水...");
    }
}
