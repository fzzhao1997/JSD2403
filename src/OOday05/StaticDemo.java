package OOday05;

public class StaticDemo {
    public static void main(String[] args) {
        StaticVar o1 = new StaticVar();
        o1.show();
        StaticVar o2 = new StaticVar();
        o2.show();
        StaticVar o3 = new StaticVar();
        o3.show();
    }//静态方法不依赖于对象的实际类型，而是根据引用的类型来确定调用的方法。
    //当对象被创建时，非静态方法的地址会保存在对象的方法表（Method Table）中，
    // 对象在调用非静态方法时会根据方法表中的地址找到对应的方法实现。
    //静态方法也存储在类的方法区中，与非静态方法一样，只有一份静态方法的实现。
    //不同的是，静态方法不依赖于对象的创建，可以直接通过类名调用，因此在编译时就已经确定了调用的方法。
}
