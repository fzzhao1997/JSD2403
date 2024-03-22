package OOday03.work.two;

public class Test {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("小黑",1,"黑");
        dogs[1] = new Dog("小白",2,"白");
        dogs[2] = new Dog("小红",3,"红");
        trainArray(dogs);
        System.out.println("---------------------------");
        Fish[] fish = new Fish[4];
        fish[0] = new Fish("大金",1,"金");
        fish[1] = new Fish("小金",2,"金");
        fish[2] = new Fish("小灰",3,"灰");
        fish[3] = new Fish("小红",4,"红");
        trainArray(fish);
        System.out.println("---------------------------");
        Chick[] chicks = new Chick[5];
        chicks[0] = new Chick("小绿",1,"绿");
        chicks[1] = new Chick("小紫",2,"紫");
        chicks[2] = new Chick("小粉",3,"粉");
        chicks[3] = new Chick("小白",4,"白");
        chicks[4] = new Chick("小棕",5,"棕");
        trainArray(chicks);
        System.out.println("---------------------------");
    }
    public static void trainArray(Dog[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i].eat();
            arr[i].drink();
            arr[i].sleep();
            arr[i].swim();
        }
    }
    public static void trainArray(Fish[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i].eat();
            arr[i].drink();
            arr[i].sleep();
            arr[i].swim();
        }
    }
    public static void trainArray(Chick[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i].eat();
            arr[i].drink();
            arr[i].sleep();
            arr[i].swim();
        }
    }
}
