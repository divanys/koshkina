package pz_13_1;
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

    public Insect() {
        setType(type);
        setWalk(isWalk);
        setWingCount(wingCount);
        setLikeJesus(likeJesus);
    }

    public void setWingCount(int wingCount) { this.wingCount = wingCount; }

    public void setLikeJesus(boolean likeJesus) { this.likeJesus = likeJesus; }

    public int getWingCount() { return this.wingCount; }

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
}
