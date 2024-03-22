package OOday05;

import OOday05.work.one.Seasons;

public class SeasonsDemo {
    public static void main(String[] args) {
        System.out.println(Seasons.fromSeasonsDesc("冷"));
        System.out.println(Seasons.fromSeasonName("夏天"));
        Seasons [] seasons = Seasons.values();
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
        }
        switch (seasons[1]){
            case SPRING -> System.out.println(seasons[0].getSeasonsName());
            case SUMMER -> System.out.println(seasons[1].getSeasonsName());
            case AUTUMN -> System.out.println(seasons[2].getSeasonsName());
            case WINTER -> System.out.println(seasons[3].getSeasonsName());
        }
    }
}
