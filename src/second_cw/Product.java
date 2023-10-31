package second_cw;

class Product extends Category {
    private String title;
    private String manufacturer;
    private double price;
    private int packageQuantity_NetWeight;
    private String dateOfManufacture;
    private String validUntil;
    private boolean isReg = false;

    public Product(String categoryName, String title, String manufacturer, double price, String dateOfManufacture, String validUntil, boolean packageQuantityORNetWeight) {
        super(categoryName, packageQuantityORNetWeight);
        setTitle(title);
        setManufacturer(manufacturer);
        setPrice(price);
        setDateOfManufacture(dateOfManufacture);
        setValidUntil(validUntil);
    }

    public int getPackageQuantity_NetWeight() {
        return packageQuantity_NetWeight;
    }

    public void setPackageQuantity_NetWeight(int packageQuantity_NetWeight) {
        this.packageQuantity_NetWeight = packageQuantity_NetWeight;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public void setValidUntil(String validUntil) {
        this.validUntil = validUntil;
    }

    public String getTitle() {
        return title;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public String getValidUntil() {
        return validUntil;
    }


    public void printInfo() {
        System.out.printf("Название: %s\n" +
                "Категория: %s\n" +
                "Производитель: %s\n" +
                "Цельное?: %b\n" +
                "Цена: %.2f\n" +
                "Дата изготовления: %s\n" +
                "Годен до: %s\n", getTitle(), getCategoryName(), getManufacturer(), isPackageQuantityORNetWeight(), getPrice(), getDateOfManufacture(), getValidUntil());
        if (isPackageQuantityORNetWeight()) System.out.println("Количество в упаковке " + getPackageQuantity_NetWeight() + "\n");
        else System.out.println("Масса нетто " + getPackageQuantity_NetWeight() + " грамм.\n");
    }

    public double calculateDiscount(int discountPercentage) {
        double discountAmount = (discountPercentage / 100.0) * price;
        return price - discountAmount;
    }

    public void regProduct(int num) {
        if (!isReg) {
            System.out.println("Регистрация продукта  прошла успешно!\n");
            setPackageQuantity_NetWeight(num);
            printInfo();
            isReg = true;
        } else {
            System.out.println("Продукт уже имеется в магазине\n");
        }
    }
}
