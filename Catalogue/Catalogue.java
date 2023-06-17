package Catalogue;

import java.util.*;
import java.time.LocalDate;

public class Catalogue {
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
    public void deleteBook(String ISBN_13) {
        var book = searchBook(ISBN_13);
        if (book == null) {
            return;
        }
        books.remove(book);
    }

    //TODO: test
    public void addBook(Title title, String storagePlace, boolean rented) {
        if (title == null) {
            return;
        }
        var copies = books.get(title);
        Copy c = new Copy(storagePlace, false, title);

        books.get(title).add(c);
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

    //TODO: test
    public char checkISBN(String str) {
        int sum = 0;
        int multiply = 1;

        for (int i = 0; i < str.length(); i++) {
            char digitChar = str.charAt(i);

            if (Character.isDigit(digitChar)) {
                int digit = Character.getNumericValue(digitChar);
                sum += multiply * digit;
                multiply = (multiply == 1) ? 3 : 1;
            }
        }

        int checkDigit = (10 - (sum % 10)) % 10;
        return (char) (checkDigit + '0');
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
    public void removeBook(String ISBN_13){}
    //TODO:implement
    public void removeBook(Title title){}

    //TODO:implement
    public int findBookLocation(Title title){
        return 0;
    }
    //TODO:implement
    public int findBookLocation(String ISBN_13){
        return 0;
    }

}
