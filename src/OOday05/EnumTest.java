package OOday05;

public class EnumTest {
    public static void main(String[] args) {
        Seasons s = Seasons.SPRING;
        switch (s){
            case AUTUMN -> System.out.println("春天到了");
            case SPRING -> System.out.println("春天到了");
            case WINTER -> System.out.println("春天到了");
            case SUMMER -> System.out.println("春天到了");
        }
        Seasons[] seasons = Seasons.values();
        String[] arr = new String[4];
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
            arr[i] = seasons[i].toString();
            System.out.println(arr[i]);
        }
        System.out.println(Seasons.SUMMER.getSeasonDesc());
        Seasons.SUMMER.setSeasonDesc("冷");
        System.out.println(Seasons.SUMMER.getSeasonDesc());
        Seasons[] season1 = Seasons.values();
        for (int i = 0; i < season1.length; i++) {
            System.out.print(season1[i]);
            System.out.print("\t"+season1[i].getSeasonName());
            System.out.println("\t"+season1[i].getSeasonDesc());
        }
        System.out.println(Seasons.fromseasonName("春天"));
        System.out.println(Seasons.fromseasonName1("夏天"));
        System.out.println(Seasons.fromseasonName1("冬天"));
    }
}
