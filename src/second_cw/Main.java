package second_cw;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        System.out.println("\nСоздаем продукты\n");
        Product product1 = new Product("Category1", "Product1", "Manufacturer1", 10.99,
                "01/10/2023", "01/10/2024", true);
        Product product2 = new Product("Category1", "Product2", "Manufacturer1", 20.99,
                "01/10/2023", "01/10/2024", true);
        Product product3 = new Product("Category2", "Product3", "Manufacturer3", 15.49,
                "02/10/2023", "02/10/2024", false);
        Product product4 = new Product("Category2", "Product4", "Manufacturer2", 60.49,
                "02/10/2023", "02/10/2024", false);


        System.out.println("\nРегистрируем продукты\n");
        product1.regProduct(5);
        product2.regProduct(10);
        product3.regProduct(500);
        product4.regProduct(100);


        System.out.println("\nДобавляем продукты в магазин\n");
        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);
        store.addProduct(product4);

        System.out.println("\nДобавляем имеющийся продукт в магазин\n");
        store.addProduct(product4);


        System.out.println("\nСоздаем клиентов и кассиров\n");
        Customer customer1 = new Customer("Павлова", "Валерия", "Алексеевна", 30);
        Customer customer2 = new Customer("неПавлова", "неВалерия", "неАлексеевна", 19);
        Cashier cashier1 = new Cashier("Великолепная", "Прекрасная", "Диана", 12);
        Cashier cashier2 = new Cashier("вдвойнеВеликолепная", "вдвойнеПрекрасная", "вдвойнеДиана", 24);

        System.out.println("\nДобавляем клиентов и кассиров в магазин");
        store.addCustomer(customer1);
        System.out.println("\nДобавляем имеющегося клиента в магазин\n");
        store.addCustomer(customer1);
        store.addCustomer(customer2);

        store.addCashier(cashier1);
        store.addCashier(cashier2);
        System.out.println("\nДобавляем имеющегося кассира в магазин\n");
        store.addCashier(cashier1);


        System.out.println("\nСоздаем заказ номер 1 (создаём ещё и массив продуктов (корзину))");
        ArrayList<Product> productsInOrder1 = new ArrayList<>();
        productsInOrder1.add(product1);
        productsInOrder1.add(product2);
        productsInOrder1.add(product3);
        Order order1 = new Order(customer1, productsInOrder1);

        System.out.println("\nДобавляем первый заказ в магазин");
        store.addOrder(order1, 10);


        System.out.println("\nОчищаем массив номер 1");
        productsInOrder1.clear();

        System.out.println("\nСоздаем заказ номер 2 (новую корзину)");
        ArrayList<Product> productsInOrder2 = new ArrayList<>();
        productsInOrder2.add(product2);
        productsInOrder2.add(product3);
        productsInOrder2.add(product4);
        Order order2 = new Order(customer2, productsInOrder2);

        System.out.println("\nДобавляем второй заказ в магазин");
        store.addOrder(order2, 0);
    }
}
