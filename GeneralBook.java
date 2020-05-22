
public class GeneralBook extends Book implements Loanable {

    public GeneralBook(String Type, Author author, String Genre, int Pages, int Year) {
        super(Type, author, Genre, Pages, Year);

    }

	@Override
    public boolean isLoanable() {
        return true;
    }

    public double lateCharge() {
        return 10.0f;

    }

}