package OOday02.work.two;

public class Person {
    String name;
    int age;
    String address;
    Person(){}
    Person( String name,int age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    void eat(){
        System.out.println(name+"在吃东西...");
    }
    void sleep(){
        System.out.println(name+"在吃睡觉...");
    }
    void sayHi(){
        System.out.println("我叫"+name+",来自"+address+",今年"+age+"岁");
    }

}
