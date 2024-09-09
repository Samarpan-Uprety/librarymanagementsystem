package models;

import java.util.List;

public class Order {
    private int orderid;
    private List<BookOrder> bookOrders;

    public Order( List<BookOrder> bookOrders, int orderID ) {
        this.bookOrders = bookOrders;
        this.orderid = orderID;

    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }
    public List<BookOrder> getBookOrders() {
        return bookOrders;
    }

    public void setBookOrders(List<BookOrder> bookOrders) {
        this.bookOrders = bookOrders;
    }
    public int calculateTotalAmount() {
        int totalAmount = 0;
        for (BookOrder bookOrder : this.bookOrders) {
            totalAmount += bookOrder.calculateTotalPrice();
        }
        return totalAmount;
    }


}
