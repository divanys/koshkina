package pz_14_1;


// Класс Fish:
// Все рыбы должны уметь плавать по умолчанию.
// У рыб должны быть новые свойства:
// - squama - тип чешуи
// - upStreamSwim - умеет ли плавать против течения
// Добавьте рыбам метод bul_bul, который выводит на экран строку "Bul-bul".

final class Fish extends Animal {
    private boolean isSwim = true;
    private String squama;
    private boolean upStreamSwim;
    private String type = "Fish";
    private static int count = 0;
    private int number;

    public Fish(String type, String squama, boolean upStreamSwim) {
        setType(type);
        setSwim(isSwim);
        setSquama(squama);
        setUpStreamSwim(upStreamSwim);
        count++;
        number = count;
    }

    static {
        defaultName = "Guppi";
        defaultType = "Fishfish";
    }

    private static String defaultName;
    private static String defaultType;

    public Fish() {
        setType(defaultType);
        setName(defaultName);
        count++;
        number = count;
    }

    public void setSquama(String squama) {
        this.squama = squama;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }

    public String getSquama() {
        return this.squama;
    }

    public boolean isUpStreamSwim() {
        return this.upStreamSwim;
    }

    public void bul_bul() {
        System.out.println("Bul-bul");
    }

    @Override
    public void display() {
        System.out.printf("I am a %s\n", type);
        super.display();
        System.out.printf("Squama: %s\nIs UpStreamSwim: %b", squama, upStreamSwim);
    }

    @Override
    public String toString() {
        return String.format("I am a %s\n%s\nSquama: %s\nIs UpStreamSwim: %b", getType(), super.toString(), squama, upStreamSwim);
    }

}
