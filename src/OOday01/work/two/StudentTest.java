package OOday01.work.two;

public class StudentTest {
    public static void main(String[] args) {
        Student ww = new Student("王五", 18, "3", "003号");
        ww.study();
        ww.sayHai();
        ww.playWith("赵六");
        Student ls = new Student("赵六", 18, "4", "004号");
        ls.study();
        ls.sayHai();
        ls.playWith("王五");
    }
}
