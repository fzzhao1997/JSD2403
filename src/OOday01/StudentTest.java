package OOday01;

import java.lang.reflect.Method;

public class StudentTest {
    public static void main(String[] args) {
        Student nb = new Student();
        nb.name = "nb";
        nb.age = 3000;
        nb.className = "牛逼克拉斯";
        nb.stuId = "nb001";
        nb.study();
        nb.sayHi();
        nb.playWith("好牛逼");
        Student hnb = new Student("好牛逼",5000,"牛逼克拉斯","nb123");
        hnb.study();
        hnb.sayHi();
        hnb.playWith("牛逼");
        System.out.println();
    }
}
