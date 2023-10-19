package pz_16_2;

public class Performance {
    private String showType;
    private String showName;
    private int ageRestriction;
    private String date;
    private String time;

    public Performance(String showType, String showName, int ageRestriction, String date, String time) {
        setShowType(showType);
        setShowName(showName);
        setAgeRestriction(ageRestriction);
        setDate(date);
        setTime(time);
    }

    // Геттеры и сеттеры для date и time
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    // (остальные методы как у вас)

    public void setShowType(String showType) {
        this.showType = showType;
    }

    public void setAgeRestriction(int ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public String getShowType() {
        return showType;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public String getShowName() {
        return showName;
    }
}
