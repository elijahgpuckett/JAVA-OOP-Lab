

public class ReferencedBook extends Book implements Loanable {
    public ReferencedBook( String Type, Author Author, String Genre, int Pages, int Year) {
        super(Type, Author, Genre, Pages, Year);
    }

    @Override
    public boolean isLoanable() {
        return true; 
    }

    public double lateCharge() {
        return 10.0f;
    }
    
}