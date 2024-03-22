package OOday02.work.one;

public class Student extends  Person{
    String className;
    String stuId;
    Student(){}
    Student(String name,int age,String address,String className,String stuId){
        super(name,age,address);
        this.className = className;
        this.stuId = stuId;
    }
    void study(){
        System.out.println(name+"正在学习");
    }

    @Override
    void sayHi() {
        System.out.println("我叫"+name+",来自"+address+",今年"+age+"岁,来自"+className+"班,学号为"+stuId);
    }
}
