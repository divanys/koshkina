package pz_16_2;

public class Performance {
    private String showType;
    private String showName;
    private int ageRestriction;

    public Performance(String showType, String showName, int ageRestriction) {
        setShowType(showType);
        setShowName(showName);
        setAgeRestriction(ageRestriction);
    }

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
