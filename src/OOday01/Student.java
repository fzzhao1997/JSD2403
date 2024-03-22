package OOday01;

public class Student {
    String name;
    int age;
    String className;
    String stuId;
    Student(){
    }
    Student(String name,int age,String className,String stuId){
        this.name = name;
        this.age = age;
        this.className = className;
        this.stuId = stuId;
    }
    void study(){
        System.out.println(this.name+"在学习...");
    }
    void sayHi() {
        System.out.println("大家好,我叫" + this.name + ",今年" + this.age +
                "岁了,所在班级为" + this.className + ",学号为" + this.stuId);
    }
    void playWith(String anotherName){
        System.out.println(this.name+"和"+anotherName+"玩");
    }
}
