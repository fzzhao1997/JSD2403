package OOday05.work.two;

public class StaticMethod {
    int a;
    static int b;
    void  say(){
        System.out.println(a);
    }
    static int plus(int num1,int num2){
        int num = num1 + num2;
        return num;
    }
    void show(){
        System.out.println(this.a);
        System.out.println(StaticMethod.b);
    }
    static void test(){
        System.out.println(StaticMethod.b);
    }
}
