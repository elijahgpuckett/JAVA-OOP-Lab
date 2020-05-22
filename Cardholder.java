import java.util.ArrayList;

public class Cardholder {

    private String firstname, lastname, age;
    private boolean canCheckout;
    private ArrayList<Book> overdueBooks;
    private ArrayList<Periodical> overduePeriodicals;

    public Cardholder(String firstname, String lastname, String age, boolean canCheckout) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.canCheckout = canCheckout;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getAge() {
        return age;
    }

    public boolean isCanCheckout() {
        return canCheckout;
    }

    public ArrayList<Book> getOverdueList() {
        return overdueBooks;
    }

    public ArrayList<Periodical> getOverduePerodicals() {
        return overduePeriodicals;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setCanCheckout(boolean canCheckout) {
        this.canCheckout = canCheckout;
    }

    public void setOverduebooks(ArrayList<Book> overdueBooks) {
        this.overdueBooks = overdueBooks;
    }

    public void setOverdueperiodicals(ArrayList<Periodical> overduePeriodicals) {
        this.overduePeriodicals = overduePeriodicals;
    }

    public void addOverdueBooks(Book book) {
        overdueBooks.add(book);
    }

    public void addOverduePeriodicals(Periodical periodical) {
        overduePeriodicals.add(periodical);
    }

}