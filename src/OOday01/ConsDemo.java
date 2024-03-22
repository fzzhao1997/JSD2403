package OOday01;

public class ConsDemo {
    public static void main(String[] args) {
        Student mnb = new Student("马牛逼",99,"牛逼01班","牛逼003");
        mnb.sayHi();
        Student nbyeye = new Student();
        nbyeye.name  = "牛逼爷爷";
        nbyeye.age = 900;
        nbyeye.className = "牛逼克拉斯班";
        nbyeye.stuId = "牛逼007";
        nbyeye.sayHi();
    }
}
