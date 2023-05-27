package Title;
//importing the packages
import java.time.LocalDate;

//here
import java.util.ArrayList;

public class TitleManagement {
    
    // Attributes
    //private Title[] titles;
    private ArrayList<Title> titles = new ArrayList<Title>();
    
    public ArrayList<Title> getTitles() {
        return this.titles;
    }

    public void setTitles(ArrayList<Title> titles) {
        this.titles = titles;
    }

    public Title createTitle( String title, String isbn, String publisher, String[] authors, LocalDate publicationDate) {
        Title newTitle = new Title( title,isbn, publisher, authors, publicationDate);
        addTitle(newTitle);
        return newTitle;
    }

    /* Author: Victor-Ion Cislari 
     * TODO: make this function work
    */
    public Title modifyTitle(String isbn, String commands) {
        Title titleToModify = findTitleByISBN(isbn);
        //todo: change 
        return titleToModify;
    }

    /*
    Comment : Victor
    why do we need addTitle, if we can just throw the same code into createTitle? */
    private void addTitle(Title newTitle) {
        titles.add(newTitle);
       /*  Title[] newTitles = new Title[titles.length + 1];
        for (int i = 0; i < titles.length; i++) {
            newTitles[i] = titles[i];
        }
        newTitles[titles.length] = newTitle;
        titles = newTitles; */
    }

    public Title findTitleByISBN(String isbn) {
        for (Title title : titles) {
            if (title.getISBN().equals(isbn)) {
                return title;
            }
        }
        return null;
    }
/* 
could be interesting.
    public Title findTitle(Title title) {
        for (Title title : titles) {
            if (title.getISBN().equals(isbn)) {
                return title;
            }
        }
        return null;
    } */
}