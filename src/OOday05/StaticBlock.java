package OOday05;

public class StaticBlock {

    public StaticBlock() {
        System.out.println("构造方法");
    }
    static {
        System.out.println("静态块");
    }
    static int a;
}
