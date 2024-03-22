package OOday03.Practice;

public abstract class Teacher {
    String name;
    int age;
    double salary;
    Teacher(){}
    Teacher(String name,int age,double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    void clockIn(){
        System.out.println(name+"上班打卡成功");
    }
    void clockOut(){
        System.out.println(name+"下班打卡成功");
    }
    abstract void FinishWork();
}
