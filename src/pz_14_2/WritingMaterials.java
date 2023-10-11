package pz_14_2;
// поля
// name - название предмета (String);
// color - цвет, которым он пишет (String);
// price - его цена (int);
// length - его длина (double);
// draw - ответ на вопрос, умеет ли эта письменная принадлежность писать? (boolean)

// методы
// display()
// replace_rod(String) - принимает новый цвет стержня;
// priceUp(int) - принимает на вход изменение цены. Увеличивает цену на это число;
// priceDown(int) - принимает на вход изменение цены. Уменьшает цену на это число;
// draw() - Если предмет умеет рисовать, то выводит на экран фразу типа: "<Название> провёл линию. Её цвет - <цвет>.",
// в противном случае выводит на экран фразу " <Название> не может ничего нарисовать."

// конструкторы
// позволяющий создать предмет с его названием и цветом;
// позволяющий создать предмет с его названием и ценой. При этом в цвете окажется значение "No Color";
// позволяющий создать предмет с его ценой, длиной и способностью рисовать. При этом в цвете окажется значение "No Color",
// а в названии - "No Name";
// позволяющий создать предмет со всеми его свойствами в том же порядке, который указан на предыдущем слайде.

// инкапсуляция
public class WritingMaterials {
    // поля
    private String name;
    private String color;
    private int price;
    private double length;
    private boolean draw;
    private static int count = 0;
    private int number;


    // конструкторы
    public WritingMaterials(String name, String color, int price, double length, boolean draw) {
        setName(name);
        setColor(color);
        setPrice(price);
        setLength(length);
        setDraw(draw);
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

    public WritingMaterials() {
        setColor(defaultColor);
        setName(defaultName);
        count++;
        number = count;
    }

    public WritingMaterials(String name, String color) {
        setName(name);
        setColor(color);
        count++;
        number = count;
    }

    public WritingMaterials(String name, int price) {
        setName(name);
        setPrice(price);
        setColor("No color");
        count++;
        number = count;
    }

    public WritingMaterials(int price, double length, boolean draw) {
        setPrice(price);
        setLength(length);
        setDraw(draw);
        setName("No name");
        setColor("No color");
        count++;
        number = count;
    }

    // добавили description и статический метод к нему
    private static final String description = "This is the Writing Materials class";

    // Статический метод
    public static void printDescription() {
        System.out.println(description);
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }

    // методы
    public void display() {
        System.out.printf("Name: %s \nColor: %s \nPrice: %d \nLenght: %.2f \nIs Draw?: %b \n", name, color, price, length, draw);
    }

    public void replace_rod(String color) {
        this.color = color;
    }

    public void priceUp(int price) {
        this.price += price;
    }

    public void priceDown(int price) {
        this.price -= price;
    }

//    Перегрузите метод draw() в классе WritingMaterials таким образом:
//    draw() - Если предмет умеет рисовать, то выводит на экран фразу типа: "<Название> провёл линию. Её цвет - <цвет>."
//    draw(String message) - Принимаем сообщение, выводит на экран фразу типа: "<Название> написал текст. Его цвет - <цвет>. Сообщение: <message>."
//    draw(String message, int count) - Принимаем сообщение и количество символов в этом сообщении,
//    выводит на экран фразу типа: "<Название> написал текст. Его цвет - <цвет>. Сообщение: <message>. Количество символов равно <count>."

    public void draw() {
        if (this.draw) System.out.printf("%s провёл линию. Её цвет - %s.\n", name, color);
        else System.out.printf("%s не может ничего нарисовать.\n", name);
    }

    public void draw(int n) {
        if (this.draw) System.out.printf("%s провёл %d линий. Их цвет - %s.\n", name, n, color);
        else System.out.printf("%s не может ничего нарисовать.\n", name);
    }

    public void draw(String color, int n) {
        if (this.draw) System.out.printf("%s провёл %d линий. Их цвет - %s.\n", name, n, color);
        else System.out.printf("%s не может ничего нарисовать.\n", name);
    }

    public void draw(String message) {
        if (this.draw) System.out.printf("%s написал текст. Его цвет - %s.\nСообщение: %s\n", name, color, message);
        else System.out.printf("%s не может ничего написать.\n", name);
    }


    // инкапсуляция
    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public int getPrice() {
        return this.price;
    }

    public double getLength() {
        return this.length;
    }

    public boolean isDraw() {
        return this.draw;
    }

    public static String getDescription() {
        return description;
    }

    // добавили туСтринг
    @Override
    public String toString() {
        return String.format("Number: %d\nName: %s \nColor: %s \nPrice: %d \nLength: %.2f \nIs Draw?: %b \n",
                number, name, color, price, length, draw);
    }
}
