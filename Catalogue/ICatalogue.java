package Catalogue;

import java.time.LocalDate;
import java.util.ArrayList;

public interface ICatalogue {
    public ArrayList<Copy> getCopies(Title t);

    public void createBook(String title, String ISBN_13, String publisher, 
        String[] authors, LocalDate publicationDate);

    public Title searchBook(String ISBN_13);

    public void deleteCopy(Title title);

    public void addCopy(Title title, String storagePlace, boolean rented);

    public void returnCopy(Copy copy);

    public Copy rentCopy(Title title);

    public boolean checkAvailability(Title title);

    public Copy openOnlineLocation(Title title);
}
