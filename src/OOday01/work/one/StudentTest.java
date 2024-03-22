package OOday01.work.one;

public class StudentTest {
    public static void main(String[] args) {
        Student zs = new Student("张三", 18, "1", "001号");
        zs.study();
        zs.sayHai();
        zs.playWith("李四");
        Student ls = new Student("李四", 18, "2", "002号");
        ls.study();
        ls.sayHai();
        ls.playWith("张三");
    }
}
