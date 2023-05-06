package Title;
//importing the packages
import Inventory.*;
import Title.*;
import Lender.*;
import Reservation.*;
import java.time.LocalDate;

public class TitleManagement {
    
    // Attributes
    private Title[] titles;
    
    // Methods
    public TitleManagement() {
        this.titles = new Title[0];
    }

    public Title[] getTitles() {
        return this.titles;
    }

    public void setTitles(Title[] titles) {
        this.titles = titles;
    }

    public void createTitle( String title, String isbn, String publisher, String[] authors, LocalDate publicationDate) {
        Title newTitle = new Title( title,isbn, publisher, authors, publicationDate);
        addTitle(newTitle);
    }

    public void modifyTitle(String isbn, String commands) {
        Title titleToModify = findTitleByISBN(isbn);
    }

    /*
    Comment : Victor
    why do we need addTitle, if we can just throw the same code into createTitle? */
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