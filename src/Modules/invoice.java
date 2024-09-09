package Modules;

public class invoice {
    FLoat tquantity, totalamt;
    Bookorder bookname;
    Genre genre;

    public Invoice(FLoat tquantity, FLoat totalamt, Bookorder bookname, Genre genre) {
        this.tquantity = tquantity;
        this.totalamt = totalamt;
        this.bookname = bookname;
        this.genre = genre;
    }

    public FLoat getTquantity() {
        return tquantity;
    }

    public void setTquantity(FLoat tquantity) {
        this.tquantity = tquantity;
    }

    public FLoat getTotalamt() {
        return totalamt;
    }

    public void setTotalamt(FLoat totalamt) {
        this.totalamt = totalamt;
    }

    public Bookorder getBookname() {
        return bookname;
    }

    public void setBookname(Bookorder bookname) {
        this.bookname = bookname;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}