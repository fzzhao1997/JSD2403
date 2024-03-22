package OOday05;

public class StaticVar {
    int a;//实例在对象创建时,重新初始化
    static int b =1;//静态在类加载时进方法区.类加载只有一次
    public StaticVar() {
        a++;
        b++;
    }
    void show(){
        System.out.println(a+"\t"+b);
    }
}
