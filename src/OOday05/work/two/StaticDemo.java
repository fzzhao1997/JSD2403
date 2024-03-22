package OOday05.work.two;

public class StaticDemo {
    public static void main(String[] args) {
        StaticVar o1 = new StaticVar();
        o1.show();
        StaticVar o2 = new StaticVar();
        o2.show();
        StaticVar o3 = new StaticVar();
        o3.show();
        System.out.println(StaticVar.b);

        StaticBlock o4 = new StaticBlock();
        StaticBlock o5 = new StaticBlock();
        StaticBlock o6 = new StaticBlock();
        StaticMethod.test();
    }
}
