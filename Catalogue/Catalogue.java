package Catalogue;

import java.util.*;
import java.time.LocalDate;

public class Catalogue implements ICatalogue {
    private Map<Title, ArrayList<Copy>> books;

    public ArrayList<Copy> getCopies(Title t) {
        return books.get(t);
    }

    public Catalogue() {
        books = new HashMap<Title, ArrayList<Copy>>();
    }

    public void createBook(String title, String ISBN_13, String publisher, 
        String[] authors, LocalDate publicationDate) 
    {
        Title t = new Title(title, ISBN_13, publisher, authors, publicationDate);
        books.put(t, new ArrayList<Copy>());
    }

    public Title searchBook(String ISBN_13) {
        for (Title key: books.keySet()) {
            if (key.getISBN().equals(ISBN_13)) {
                return key;
            }
        }
        return null;
    }

    //this function is optional
    public void deleteCopy(Title title) {
        assert(title != null): "Pre-Condition failed. deleteCopy()";
        int length_old = books.get(title).size();

        books.get(title).remove(0);

        int length_new = books.get(title).size();

        assert ((length_new-1) == length_old): "Post-Condition failed. deleteCopy()";
    }

    //TODO: test
    public void addCopy(Title title, String storagePlace, boolean rented) {
        assert (title != null && storagePlace != null): "Pre-condition failed. addCopy()";

        int length_old=books.get(title).size();

        var copies = books.get(title);
        Copy c = new Copy(storagePlace, false, title);

        assert (!books.get(title).contains(c)): "Pre-Condition failed. addCopy()";

        books.get(title).add(c);
        int length_new=books.get(title).size();

        assert (books.get(title).contains(c) && (length_new-1) == (length_old)): "Post-Condition failed. addCopy()";
    }

    public void returnCopy(Copy copy) {
        copy.setRented(false);
        books.get(copy.getTitle()).add(copy);
    }

    public Copy rentCopy(Title title) {
        var copies = books.get(title);
        if (copies == null) {
            return null;
        }
        if (copies.size() == 0) {
            return null;
        }
        // any copy will do
        var copy = copies.get(0);
        copies.remove(0);
        copy.setRented(true);

        return copy;
    }

    //TODO: implement
    //Question: what input, what output?
    //returns the HashMapValue of the given book. if nothing, than null.
    public boolean checkBookAvailability(String title, String ISBN_13){
        return false;
    }

    //TODO: test
    public boolean checkAvailability(String ISBN_13) {
        var book = searchBook(ISBN_13);
        if ( book == null) {
            return false;
        }
        var copies = books.get(book);
        for (var copy: copies) {
            if (!copy.isRented()) {
                return true;
            }
        }
        return false;
    }


    //TODO:implement
    public int findBookLocation(Title title){
        return 0;
    }
    //TODO:implement
    // is this really needed? we can do the following using the previous method:
    // findBookLocation(searchBook("ISBN"))
    public int findBookLocation(String ISBN_13){
        return 0;
    }

    //TODO:implement
    //returns a copy which is available online
    public Copy openOnlineLocation(Title title){
        return null;
    }

    //TODO:implement
    //returns a copy which is available online
    // look above
    public Copy openOnlineLocation(String ISBN_13){
        return null;
    }

}
