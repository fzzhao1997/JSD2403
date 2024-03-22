package OOday05;

public class StaticMethod {

    int a;
    static int b;
    void show(){//提供this,也认this
        System.out.println(this.a);
        System.out.println(StaticMethod.b);
    }
    static void test(){//不提供this,也不认this
//        StaticMethod o1 = new StaticMethod();
//        System.out.println(o1.a); 创了对象不报错
//        System.out.println(this.a);报错,静态方法不认this
        System.out.println(b);
    }
    void say(){
        System.out.println(a);
    }
    static int plus(int num1,int num2){
        int num = num1+num2;
        return num;
    }
}

