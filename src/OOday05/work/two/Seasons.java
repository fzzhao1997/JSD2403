package OOday05.work.two;

public enum Seasons {
    SPRING("春天","暖和"),
    SUMMER("夏天","热"),
    AUTUMN("秋天","爽"),
    WINTER("冬天","冷");
    private String seasonsName;
    private String seasonsDesc;
    private Seasons(String seasonsName,String seasonsDesc){
        this.seasonsName = seasonsName;
        this.seasonsDesc = seasonsDesc;
    }
    public String getSeasonsName() {
        return seasonsName;
    }
    public String getSeasonsDesc() {
        return seasonsDesc;
    }
    public void setSeasonsName(String seasonsName) {
        this.seasonsName = seasonsName;
    }
    public void setSeasonsDesc(String seasonsDesc) {
        this.seasonsDesc = seasonsDesc;
    }
    public static Seasons fromSeasonName(String seasonsName){
        for(Seasons seasons:Seasons.values()){
            if(seasons.seasonsName.equals(seasonsName)){
                return seasons;
            }
        }
        throw new IllegalArgumentException("无效的季节中文名：" + seasonsName);//必须有,因为可能有返回值
    }
    public static Seasons fromSeasonsDesc(String seasonsDesc){
        for(Seasons seasons:Seasons.values()){
            if(seasons.seasonsDesc.equals(seasonsDesc)){
                return seasons;
            }
        }
        throw new IllegalArgumentException("无效的季节中文名：" + seasonsDesc);
    }
}
