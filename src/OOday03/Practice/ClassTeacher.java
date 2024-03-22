package OOday03.Practice;

public class ClassTeacher extends Teacher {
    ClassTeacher(){}
    ClassTeacher(String name,int age,double salary){
        super(name,age,salary);
    }
    @Override
    void FinishWork() {
        System.out.println(name+"完成了教班主任工作");
    }
}
