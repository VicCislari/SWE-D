package Title;
//importing the packages
import java.time.LocalDate;

public class Title {
    // Attributes
    public String title;
    private String isbn;
    private String publisher;
    private LocalDate publicationDate;
    private String[] authors;

    // Methods
    public Title(String title, String isbn, String publisher,  String[] authors, LocalDate publicationDate){
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
        this.authors = authors;
        this.publicationDate = publicationDate;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getISBN(){
        return isbn;
    }
    public void setISBN(String isbn){
        this.isbn = isbn;
    }
    public String getPublisher(){
        return publisher;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public LocalDate getPublicationDate(){
        return publicationDate;
    }
    public void setPublicationDate(LocalDate publicationDate){
        this.publicationDate = publicationDate;
    }
    public String[] getAuthors(){
        return authors;
    }
    public void setAuthors(String[] authors) {
        this.authors = authors; 
    }

    //TODO:
    public String generateBibTex(){
        //this generates a file.. but what file?
        //or thriow exception if something went wrong...
        return "hello thisis some text";
    }

    //TODO:
    public void modifyTitle(String ISBN, String commands){

    }
}
