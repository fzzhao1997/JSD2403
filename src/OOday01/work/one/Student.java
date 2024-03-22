package OOday01.work.one;

public class Student {
    String name;
    int age;
    String className;
    String stuId;
    Student(){}
    Student(String name,int age,String className,String stuId){
        this.name = name;
        this.age = age;
        this.className = className;
        this.stuId = stuId;
    }
    void study(){
        System.out.println(name+"在学习");
    }
    void sayHai(){
        System.out.println("我叫"+name+",今年"+age+"岁,来自"+className+"班,学号是"+stuId);
    }
    void  playWith(String name){
        System.out.println(this.name+"在和"+name+"玩");
    }
}
