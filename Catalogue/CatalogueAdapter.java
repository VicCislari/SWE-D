package Catalogue;

import java.time.LocalDate;
import java.util.ArrayList;

public class CatalogueAdapter implements ICatalogue {
    public CatalogueAdapter() {
        catalogue = new Catalogue();
    }

    public ArrayList<Copy> getCopies(Title t) {
        return catalogue.getCopies(t);
    }

    public void createBook(String title, String ISBN_13, String publisher, 
        String[] authors, LocalDate publicationDate)
    {
        catalogue.createBook(title, ISBN_13, publisher, authors, 
                             publicationDate);
    }

    public Title searchBook(String ISBN_13) {
        return catalogue.searchBook(ISBN_13);
    }

    public void deleteCopy(Title title) {
        catalogue.deleteCopy(title);
    }

    public void addCopy(Title title, String storagePlace, boolean rented) {
        catalogue.addCopy(title, storagePlace, rented);
    }

    public void returnCopy(Copy copy) {
        catalogue.returnCopy(copy);
    }

    public Copy rentCopy(Title title) {
        return catalogue.rentCopy(title);
    }

    public boolean checkAvailability(Title title) {
        return catalogue.checkAvailability(title);
    }

    public Copy openOnlineLocation(Title title) {
        return catalogue.openOnlineLocation(title);
    }

    private Catalogue catalogue;
}
