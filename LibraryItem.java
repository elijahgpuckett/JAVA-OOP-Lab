public class LibraryItem {

    private String Type, Genre;
    private int Pages, Year;
    public Author Author;

    public LibraryItem( String Type, Author Author, String Genre, int Pages, int Year) {
        this.Type = Type;
        this.Author = Author;
        this.Pages = Pages;
    }

    public String getType() {
        return Type;
    }
    public Author getAuthor() {
        return Author;
    }
    public String getGenre() {
        return Genre;
    }
    public int getPages() {
        return Pages;
    }
    public int getYear() {
        return Year;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
    public void setAuthor(Author Author) {
        this.Author = Author;
    }
    public void setGenre(String Genre) {
        this.Genre = Genre;
    }
    public void setPage(int Pages) {
        this.Pages = Pages;
    }
    public void setYear(int Year) {
        this.Year = Year;
    }

    @Override
    public String toString() {
        return "Looks like you got a " + this.getType() + " by " + Author.class.getName() + " From " + this.getGenre() + ". It's got " + this.getPages() + " pages and is from " + getYear();
    }
    
}