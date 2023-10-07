package pz_13_1;


// Класс Fish:
// Все рыбы должны уметь плавать по умолчанию.
// У рыб должны быть новые свойства:
// - squama - тип чешуи
// - upStreamSwim - умеет ли плавать против течения
// Добавьте рыбам метод bul_bul, который выводит на экран строку "Bul-bul".

class Fish extends Animal {
    private boolean isSwim = true;
    private String squama;
    private boolean upStreamSwim;
    private String type = "Fish";

    public Fish() {
        setType(type);
        setSwim(isSwim);
        setSquama(squama);
        setUpStreamSwim(upStreamSwim);
    }

    public void setSquama(String squama) { this.squama = squama; }

    public void setUpStreamSwim(boolean upStreamSwim) { this.upStreamSwim = upStreamSwim; }

    public String getSquama() { return this.squama; }

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
}
