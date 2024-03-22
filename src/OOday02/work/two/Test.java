package OOday02.work.two;

public class Test {
    public static void main(String[] args) {
        Student zg = new Student("张工",29,"长沙","001班","001");
        zg.study();
        zg.sayHi();
        Teacher lk = new Teacher("刘珂",38,"北京",11000);
        lk.sayHi();
        Doctor kl = new Doctor("卡里",78,"上海","院长");
        kl.sayHi();
    }
}
