package Catalogue;
//importing the packages
import java.time.LocalDate;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


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

    public void generateBibTex(String key) throws Exception {
        File bibFile = new File(key + ".bib");
        if (!bibFile.createNewFile()) {
            throw new Exception("File exists.");
        }

        FileWriter fw = new FileWriter(bibFile);

        String authorsString = new String();
        for (int i = 0; i < authors.length; ++i) {
            if (i > 0) {
                authorsString += " and ";
            }
            authorsString += authors[i];
        }

        fw.write("@book{" +
                 key + ",\n" +
                 "  author={" + authorsString + "},\n" +
                 "  title={" + title + "},\n" +
                 "  publisher={" + publisher + "},\n" +
                 "  year={" + publicationDate.getYear() + "},\n}");
        fw.close();
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

}
