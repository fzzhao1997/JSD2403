package OOday05;

public enum Seasons {
    SPRING("春天", "暖和"),//自己构造对象,相当于对象,是静态的,其他类可以类名.调用,也可以传递地址调用
    //1这里是带参构造,进入带参构造方法传递
    SUMMER("夏天", "热"),
    AUTUMN("秋天", "凉爽"),
    WINTER("冬天", "冷");
    private String seasonName;
    private String seasonDesc;

    Seasons(String seasonName, String seasonDesc) {//2.带参构造传递seasonName和seasonDesc的参数
        this.seasonName = seasonName;//成员变量被赋值
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;//返回成员变量值
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;//可以改变成员变量的值
    }

    public void setSeasonDesc(String seasonDesc) {
        this.seasonDesc = seasonDesc;
    }

    public static Seasons fromseasonName(String seasonName) {
        for (Seasons season : Seasons.values()) {
            if (season.seasonName.equals(seasonName)) {
                return season;//中文名对应的英文名
            }
        }
        throw new IllegalArgumentException("无效的季节中文名：" + seasonName);
    }
    public static Seasons fromseasonName1(String seasonName) {
        for (Seasons season1 : Seasons.values()) {
            if (season1.seasonName.equals(seasonName)) {
                return season1;//season1对应的对象名
            }
        }
        throw new IllegalArgumentException("无效的季节中文名：" + seasonName);
    }

}
