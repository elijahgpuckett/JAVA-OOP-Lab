public class LibraryFactory {
    public static LibraryItem createItems(ItemInLibrary item) {

        if (item == null) {
            return null;
        }
        switch (item) {
            case GENERALBOOK:
                GeneralBook b = new GeneralBook();
                return b;
            case REFERENCEBOOK:
                ReferencedBook r = new ReferencedBook();
                return r;
            case MAGAZINE:
                Magazine m = new Magazine();
                return m;
            case NEWSPAPER:
                NewsPaper n = new NewsPaper();
                return n;
            default:
                return null;

        }
    }
}