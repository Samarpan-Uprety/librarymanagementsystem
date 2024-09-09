package models;

public class BookOrder {
    private int bookno;
    private Books book;
    private int quantity;

    public BookOrder(int bookno, Books book, int quantity) {
        this.bookno = bookno;
        this.book = book;
        this.quantity = quantity;
    }

    public int getBookno() {
        return bookno;
    }

    public void setBookno(int bookno) {
        this.bookno = bookno;
    }

    public Books getBook() {
        return book;
    }


    public void setBook(Books book) {
        this.book = book;
    }



    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int calculateTotalPrice() {
        return this.book.getPrice() * this.quantity;
    }
}
