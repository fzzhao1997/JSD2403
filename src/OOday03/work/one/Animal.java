package OOday03.work.one;

public abstract class Animal {
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
    abstract void drink();
    abstract void sleep();
}
