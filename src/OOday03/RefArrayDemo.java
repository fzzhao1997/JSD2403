package OOday03;


public class RefArrayDemo {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        System.out.println(dogs[0]);//未new对象,未开辟地址空间,无地址值
//        System.out.println(dogs[1].name);//未new,空指针异常
        Chick[] chicks = new Chick[5];
        Fish[] fish = new Fish[4];
        dogs[0] = new Dog("1",2,"3");
        System.out.println(dogs[0]);//new了对象,开辟了地址空间,有了地址值
        System.out.println("--------");
        Dog[] dd = {new Dog("1",2,"3"),new Dog("2",3,"4")};
        System.out.println(dd[0]);
        dd[1]=dd[0];
        System.out.println(dd[1]);
        System.out.println(dd[0]);
        System.out.println(dd[1].name);
        dd[0].name = "22";
        System.out.println(dd[0]);//未new地址,未开辟新地址空间,地址值不变
        dd = new Dog[]{new Dog("1",2,"3"),new Dog("2",3,"4")};
        System.out.println(dd[0]);//new了,开辟新地址空间,地址值改变
        System.out.println(dd[0].name);
        System.out.println(dogs[0].name);
        System.out.println("----");
        for (int i = 0; i < dd.length; i++) {
            System.out.println(dd[i].name);
        }


        Chick[] chicks1 = new Chick[2];
        chicks1= new Chick[]{new Chick("小花",1,"花"),new Chick("大花",2,"花")};
        for (int i = 0; i < chicks1.length; i++) {
            System.out.println(chicks1[i].name);
            chicks1[i].layEggs();
        }
        Fish[] fish1 = new Fish[4];
        fish1[0] = new Fish("小金",2,"金");
        fish1[1] = new Fish("大金",4,"金");
        fish1[2] = new Fish("小绿",1,"绿");
        fish1[3] = new Fish("小红",2,"红");
        for (int i = 0; i < fish1.length; i++) {
            System.out.println(fish1[i].color);
            fish1[i].swim();
        }
    }
}
