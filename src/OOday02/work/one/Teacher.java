package OOday02.work.one;

public class Teacher extends  Person{
    double salary;
    Teacher(){}
    Teacher(String name,int age,String address,double salary){
        super(name,age,address);
        this.salary = salary;
    }
    void teach(){
        System.out.println(name+"正在上课");
    }

    @Override
    void sayHi() {
        System.out.println("我叫"+name+",来自"+address+",今年"+age+"岁,薪资是"+salary);
    }
}
