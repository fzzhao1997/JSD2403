package OOday03;


public class InterfaceDemo {
    public static void main(String[] args) {
//        Inter O = new Inter();编译错误,接口不能实例化
    }
}

interface Inter {
    abstract void show();//接口的方法默认都是抽象的,前面默认有abstract

    void test();
//    void say(){}编译错误,抽象方法不能有方法体
}

interface Inter2 {
    void buy();
}

abstract class InterImpl implements Inter {
    public void show() {
    }

    public void test() {
    }
    abstract void next();
}

class Boo extends InterImpl implements Inter, Inter2 {
    public void show() {
    }

    public void test() {
    }

    public void buy() {
    }
    void next(){}
}
interface Inter3{
    void show();
}
interface Inter4{
    void test();
}
class Coo implements Inter3,Inter4{
    public void show(){}
    public void test(){}
}
//一个文件最多一个public类，且有public类的话。类名必须与文件名一致
