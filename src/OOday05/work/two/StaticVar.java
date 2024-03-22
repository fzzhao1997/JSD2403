package OOday05.work.two;

public class StaticVar {
    int a;
    static int b;
    public StaticVar() {
        a++;
        b++;
    }
    void show(){
        System.out.println("a="+a+"b="+b);
    }
}
