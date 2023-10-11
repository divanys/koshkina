package pz_14_1;

// Класс Insect:
// Все насекомые должны уметь ходить по умолчанию.
// У насекомых должны быть новые свойства:
// - wingCount - количество крыльев
// - likeJesus - умеет ли ходить по воде
// Добавьте насекомым метод ggggg, который выводит на экран строку "Ggggg".


class Insect extends Animal {
    private boolean isWalk = true;
    private int wingCount;
    private boolean likeJesus;
    private String type = "Insect";
    private static int count = 0;
    private int number;

    public Insect(int wingCount, boolean likeJesus) {
        setType(type);
        setWalk(isWalk);
        setWingCount(wingCount);
        setLikeJesus(likeJesus);
        count++;
        number = count;
    }

    static {
        defaultName = "АМАТАРАКАНАМАМА";
        defaultType = "ТАРАКАНА";
    }

    private static String defaultName;
    private static String defaultType;

    public Insect() {
        setType(defaultType);
        setName(defaultName);
        count++;
        number = count;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }

    public int getWingCount() {
        return this.wingCount;
    }

    public boolean isLikeJesus() {
        return this.likeJesus;
    }

    public void ggggg() {
        System.out.println("Ggggg");
    }

    @Override
    public void display() {
        System.out.printf("I am a %s\n", type);
        super.display();
        System.out.printf("wingCount: %d\nIs likeJesus: %b", wingCount, likeJesus);
    }

    @Override
    public String toString() {
        String animalInfo = super.toString(); // Получение информации о животном от родительского класса
        return String.format("%s\nwingCount: %d\nIs likeJesus: %b", animalInfo, wingCount, likeJesus);
    }
}
