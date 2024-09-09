package models;

import java.util.List;

public class Customer {
    String name;
    String Email;
    private List<Order> Orders;

    public Customer(String name, String email, List<Order> orders) {
        name = name;
        Email = email;
        Orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public List<Order> getOrders() {
        return Orders;
    }

    public void setOrders(List<Order> orders) {
        Orders = orders;
    }

    public void customersinfo(){
        System.out.println("Customer Name: " + name);
        System.out.println("Email: " + Email);
        System.out.println("Orders: " + Orders);
    }

    public void printAllOrders() {
        System.out.println("Orders for Customer: " + name);
        for (Order order : Orders) {
            System.out.println("Order ID: " + order.getOrderid());
            for (BookOrder bookOrder : order.getBookOrders()) {
                Books book = bookOrder.getBook();
                System.out.println("  Book: " + book.getTitle() +
                        ", Quantity: " + bookOrder.getQuantity() +
                        ", Price per unit: " + book.getPrice());
            }


        }

    }
}
