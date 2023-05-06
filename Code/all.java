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
}




public class Copy {
    // Attributes
    private String storagePlace;
    private String copyID;
    private boolean rented;
    private Title title;
    // Methods
    public Copy(String storagePlace, String copyID, boolean rented, Title title){
        this.storagePlace = storagePlace;
        this.copyID = copyID;
        this.rented = rented;
        this.title = title;
    }
    public String getStoragePlace(){
        return storagePlace;
    }
    public void setStoragePlace(String storagePlace){
        this.storagePlace = storagePlace;
    }
     public String getCopyID(){
        return copyID;
    }
    public void setCopyID(String copyID){
        this.copyID = copyID;
    }
     public boolean isRented(){
        return rented;
    }
    public void setRented(boolean rented){
        this.rented = rented;
    }
    
    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Title getTitleOfCopy() {
        return this.title;
    }
}



public class TitleManagement {
    
    // Attributes
    private Title[] titles;
    
   // Methods
    public TitleManagement() {
        this.titles = new Title[0];
    }

    public void createTitle( String title, String isbn, String publisher, String[] authors, LocalDate publicationDate) {
        Title newTitle = new Title( title,isbn, publisher, authors, publicationDate);
        addTitle(newTitle);
    }

    public void modifyTitle(String isbn, String commands) {
        Title titleToModify = findTitleByISBN(isbn);
    }

    private void addTitle(Title newTitle) {
        Title[] newTitles = new Title[titles.length + 1];
        for (int i = 0; i < titles.length; i++) {
            newTitles[i] = titles[i];
        }
        newTitles[titles.length] = newTitle;
        titles = newTitles;
    }

    private Title findTitleByISBN(String isbn) {
        for (Title title : titles) {
            if (title.getISBN().equals(isbn)) {
                return title;
            }
        }
        return null;
    }
}
