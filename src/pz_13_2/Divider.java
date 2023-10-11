package pz_13_2;

class Divider extends WritingMaterials {
    private String name = "Divider";
    private String dividerType;
    private boolean isMetal;
    public Divider() {
        setName(name);
        setMetal(isMetal);
        setDividerType(dividerType);
        setLength(getLength());
        setColor(getColor());
        setPrice(getPrice());
        setDraw(true);
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

    public void draw_circle() {
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
}
