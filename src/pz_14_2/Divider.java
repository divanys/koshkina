package pz_14_2;

class Divider extends WritingMaterials {
    private String name = "Divider";
    private String dividerType;
    private boolean isMetal;
    private boolean isDraw = true;
    private static int count = 0;
    private int number;

    public Divider(boolean isMetal, String dividerType) {
        setName(name);
        setMetal(isMetal);
        setDividerType(dividerType);
        setLength(getLength());
        setColor(getColor());
        setPrice(getPrice());
        setDraw(isDraw);
        count++;
        number = count;
    }

    // добавили static инициализатор
    static {
        defaultName = "Pencil";
        defaultColor = "Green";
    }

    private static String defaultName;
    private static String defaultColor;

    public Divider() {
        setColor(defaultColor);
        setName(defaultName);
        count++;
        number = count;
    }

    public void setDividerType(String dividerType) {
        this.dividerType = dividerType;
    }

    public String getDividerType() {
        return dividerType;
    }

    public void setMetal(boolean isMetal) {
        this.isMetal = isMetal;
    }

    public boolean isMetal() {
        return isMetal;
    }

    public final void draw_circle() {
        System.out.println("Нарисован круг!");
    }

    @Override
    public void display() {
        System.out.printf("I am a %s\n", getName());
        super.display();
        System.out.printf("Divider Type: %s\nIs Metal?: %b", dividerType, isMetal);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("I can paint all the places!");
    }

    @Override
    public String toString() {
        return String.format("Number: %d\nName: %s \nColor: %s \nPrice: %d \nLength: %.2f \nIs Draw?: %b \nDivider Type: %s \nIs Metal?: %b \n",
                number, name, getColor(), getPrice(), getLength(), isDraw , dividerType, isMetal);
    }
}
