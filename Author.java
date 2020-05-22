public class Author {
    private String name;
    private PublishingCompany publisher;

    public Author(String name, PublishingCompany publisher){
        this.name = name;
        this.publisher = publisher;

    }

    public String getAName(){
        return name;
    }

    public PublishingCompany getPublishingCompany(){
        return publisher;
    }

    public void setAName(String name){
        this.name = name;
    }

    public void setPublisher(PublishingCompany publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString(){
        
        return getAName() + " " + publisher ;
    }    
}