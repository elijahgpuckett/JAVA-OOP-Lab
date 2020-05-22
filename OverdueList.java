  
import java.util.Collection;

public class OverdueList<E> {
    private  Collection<E> overdueList;

    public OverdueList(Collection<E> overdueList){
        this.overdueList = overdueList;
    }

    public Collection<E> getOverdueList(){
        return overdueList;
    }
    
    public void setOverdueList(Collection<E> overdueList){
        this.overdueList = overdueList;
    }
}