package OOday04;



public class MultiTypeDemo {
    public static void main(String[] args) {
//        Dog o1 = new Dog("小黑",2,"黑");
//        Animal o2 = new Dog("小黑",2,"黑");
//        Swim o3 = new Dog("小黑",2,"黑");
//        o3.swim();
//        Animal o4;
//        o4 = o1;
//        System.out.println(o4);
//        System.out.println(o1);//内存地址一样,引用类型可以不同
//        //        o4.swim();报错
//        o4 =(Animal) o3;
//        System.out.println(o4);
//        System.out.println(o3);
/*        Master ms = new Master();
        Dog o1 = new Dog("小黑", 2, "黑");
        Fish o2 = new Fish("小红", 2, "红");
        ms.feed(o1);
        ms.feed(o2);*/
        Animal[] Arr = new Animal[3];
        Arr[0] = new Dog("小黑", 2, "黑");
        Arr[1] = new Fish("小红", 2, "红");
        Arr[2] = new Chick("小黄", 2, "黄");
//        for (int i = 0; i < Arr.length; i++) {
//            Arr[i].eat();
//            Arr[i].drink();
//        }
//        System.out.println(Arr[0]);
//        Dog d = new Dog();//开辟新空间才是初始化
//        if(Arr[0] instanceof Animal ) {
//           d = (Dog) Arr[0];
//            d.swim();
//            System.out.println(d);
//        }else {
//            System.out.println("错误");
//        }
////        d = (Dog) Arr[0];
//        d.swim();
//        System.out.println(d);
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] instanceof Dog) {
                Dog dog = (Dog) Arr[i];
                dog.lookHome();
            }
            if (Arr[i] instanceof Fish) {
                Fish fish = (Fish) Arr[i];
                fish.eat();
            }
            if (Arr[i] instanceof Chick) {
                Chick chick = (Chick) Arr[i];
                chick.layEggs();
            }
            if (Arr[i] instanceof Swim) {
                Swim swim = (Swim) Arr[i];
                swim.swim();
            }
        }
    }
}
