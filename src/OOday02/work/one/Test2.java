package OOday02.work.one;


import java.awt.*;

public class Test2 {
    public static void main(String[] args) {
        Dog xh = new Dog("小黑",20,"黑");
        xh.eat();
        xh.lookHome();
        Fish xb = new Fish("小白",23,"白");
        xb.eat();
        Chick xj = new Chick("蔡徐鸡",20,"黑");
        xj.layEggs();
    }
}
