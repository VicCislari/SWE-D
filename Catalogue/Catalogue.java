package Catalogue;

import java.util.*;
import java.time.LocalDate;

public class Catalogue {
    private Map<Title, ArrayList<Copy>> books;

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

    public void deleteBook(Title title) {
        //var book = searchBook(ISBN_13);
        if (title == null) {
            return;
        }
        books.remove(title);
    }

    public void addBook(String ISBN_13, String storagePlace, boolean rented) {
        Title t = searchBook(ISBN_13);
        if (t == null) {
            return;
        }
        var copies = books.get(t);
        // are you sure that wqe need to have .get(t).? can't we just do t.? doesn't that reference te exact same object in the memory which is also refered to by our books hashmap?
        int newCopyId = 0;
        for (var copy: copies) {
            if (newCopyId < copy.getCopyID()) {
                newCopyId = copy.getCopyID();
            }
        }
        ++newCopyId;

        Copy c = new Copy(storagePlace, newCopyId, false, t);

        books.get(t).add(c);
    }

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

    public char calculateISBNCheckDigit(String str) {
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

    public ArrayList<Copy> getCopies(Title t) {
        return books.get(t);
    }

}
