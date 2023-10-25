package second_cw;

import java.util.ArrayList;

class Store {
    private final ArrayList<Product> products = new ArrayList<>();
    private final ArrayList<Customer> customers = new ArrayList<>();
    private final ArrayList<Order> orders = new ArrayList<>();
    private final ArrayList<Cashier> cashiers = new ArrayList<>();

    public void addProduct(Product product) {
        boolean isProductExist = false;
        for (Product existingProduct : products) {
            if (existingProduct.getTitle().equals(product.getTitle()) &&
                    existingProduct.getManufacturer().equals(product.getManufacturer()) &&
                    (existingProduct.getPrice() == (product.getPrice())) &&
                    (existingProduct.getPackageQuantity_NetWeight() == product.getPackageQuantity_NetWeight()) &&
                    existingProduct.getDateOfManufacture().equals(product.getDateOfManufacture()) &&
                    existingProduct.getValidUntil().equals(product.getValidUntil())) {
                System.out.printf("%s уже зарегистрирован в магазине.\n", product.getTitle());
                isProductExist = true;
                break;
            }
        }
        if (!isProductExist) {
            product.printInfo();
            products.add(product);
        }
    }

    public void clearProducts() {
        products.clear();
        System.out.println("Массив продуктов очищен.");
    }

    public void addCustomer(Customer customer) {
        boolean isCustomerExist = false;
        for (Customer existingCustomer : customers) {
            if (existingCustomer.getLastName().equals(customer.getLastName()) &&
                    existingCustomer.getFirstName().equals(customer.getFirstName()) &&
                    existingCustomer.getMiddleName().equals(customer.getMiddleName())) {
                System.out.printf("%s %s %s %s уже зарегистрирован в магазине.\n",
                        customer.getWhoIs(), customer.getLastName(), customer.getFirstName(), customer.getMiddleName());
                isCustomerExist = true;
                break;
            }
        }
        if (!isCustomerExist) {
            customer.printInfo();
            customers.add(customer);
        }
    }

    public void addCashier(Cashier cashier) {
        boolean isCashierExist = false;
        for (Cashier existingCashier : cashiers) {
            if (existingCashier.getLastName().equals(cashier.getLastName()) &&
                    existingCashier.getFirstName().equals(cashier.getFirstName()) &&
                    existingCashier.getMiddleName().equals(cashier.getMiddleName())) {
                System.out.printf("%s %s %s %s уже зарегистрирован в магазине.\n",
                        cashier.getWhoIs(), cashier.getLastName(), cashier.getFirstName(), cashier.getMiddleName());
                isCashierExist = true;
                break;
            }
        }
        if (!isCashierExist) {
            cashier.printInfo();
            cashiers.add(cashier);
        }
    }

    public void addOrder(Order order, int discountPercentage) {
        boolean isOrderExist = false;
        for (Order existingOrder : orders) {
            if (existingOrder.getCustomer() == order.getCustomer() && existingOrder.getProducts().equals(order.getProducts())) {
                System.out.println("Заказ уже существует.");
                isOrderExist = true;
                break;
            }
        }
        if (!isOrderExist) {
            orders.add(order);
            System.out.println("Заказ успешно добавлен.\n");
            order.printOrderInfo(discountPercentage);
        }
    }

}
