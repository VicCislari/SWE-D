package Catalogue;

import java.time.LocalDate;
import java.util.ArrayList;

public interface ICatalogue {
    public ArrayList<Copy> getCopies(Title t);

    public void createBook(String title, String ISBN_13, String publisher, 
        String[] authors, LocalDate publicationDate);

    public Title searchBook(String ISBN_13);

    public void deleteBook(String ISBN_13);

    public void addBook(Title title, String storagePlace, boolean rented);

    public void returnCopy(Copy copy);

    public Copy rentCopy(Title title);

    public boolean checkAvailability(String ISBN_13);

    public void removeBook(Title title);

    public Copy openOnlineLocation(Title title);
}