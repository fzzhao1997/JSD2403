package OOday05;

public class StaticBlockDemo {
    public static void main(String[] args) {
//        StaticBlock o1 = new StaticBlock();
//        StaticBlock o2 = new StaticBlock();
//        StaticBlock o3 = new StaticBlock();
        System.out.println(StaticBlock.a);
    }
}//1.栈内存:
// 1)栈帧(类似线程对于进程):返回值地址,操作数帧,局部变量列表,动态链接(方法指向方法的运行时常量池中的方法引用，用于在运行时动态解析方法调用。)
//2.方法区:
//1)类的元数据信息：方法区存储了加载的类的元数据信息，包括类的名称、访问修饰符、父类、实现的接口、字段描述符、方法描述符、!!!!方法字节码!!等。
//2) 静态变量
// 3)常量池:常量池主要用于存储类的常量、字符串常量、类和接口的全限定名、字段和方法的符号引用等
//3.堆内存
//类的加载在进栈之前,进栈和类德加载都属于运行期间