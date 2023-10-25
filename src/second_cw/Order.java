package second_cw;

import java.util.List;

class Order implements Promotion {
    private Customer customer;
    private List<Product> products;

    public Order(Customer customer, List<Product> products) {
        setCustomer(customer);
        setProducts(products);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double calculateTotalPrice(int discountPercentage) {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.calculateDiscount(discountPercentage);
        }
        return totalPrice;
    }

    public void printOrderInfo(int discountPercentage) {
        System.out.println("Информация о заказе:");
        System.out.println("Клиент: " + customer.getLastName() + " " + customer.getFirstName() + " " + customer.getMiddleName());
        System.out.println("Продукты в заказе:");
        for (Product product : products) {
            product.printInfo();
        }
        System.out.println("Общая стоимость заказа: " + calculateTotalPrice(discountPercentage));
    }

    @Override
    public void applyDiscount(Product product, int discountPercentage) {

    }

    @Override
    public void getPromotionDetails() {
        System.out.println("Вы можете купить у нас рекламу или провести акцию! (в разработке🤗)");
    }
}
