package OOday05.work.two;

public class StaticFinalDemo {
    public static void main(String[] args) {
        System.out.println(Loo.PI);
        System.out.println(Loo.COUNT);
        System.out.println(Loo.num);
    }
}

class Loo{
    public static int num = 5;
    public static final int COUNT = 5;
    public static final double PI =3.1415926;
}
