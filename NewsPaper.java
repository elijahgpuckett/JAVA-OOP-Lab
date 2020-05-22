

public class NewsPaper extends Periodical implements Reservable {

    public NewsPaper( String Type, Author Author, String Genre, int Pages, int Year) {
        super(Type, Author, Genre, Pages, Year);
    }

    @Override
    public boolean isReservable() {
        return true; 
    }
    
    @Override
    public int getReserveTime() {
        return 3; 
    }
    
}