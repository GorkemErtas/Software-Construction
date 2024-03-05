package WEEK4;

import java.util.ArrayList;
import java.util.List;

/**
 * Manages books in the library.
 */

public class Library {
    private final List<Book> bookList;

    public Library(){
        this.bookList = new ArrayList<>();
    }

    /**
     * Adds a new book to the library.
     * @param a The book to be added. Must be not null.
     * @throws IllegalArgumentException If the book is null.
     */
    void addBook(Book a) throws IllegalArgumentException {
        if (a == null) {
            throw new IllegalArgumentException("WEEK4.Book cannot be null.");
        }
        bookList.add(a);
    }

    /**
     * Searches a book by title or author in the library.
     * @param query The title or author to search for.
     * @return An array of books matching the search query.
     */
    public Book[] searchBookByTitle(String query) {
        List<Book> result = new ArrayList<>();
        for(Book book : bookList){
            if( book.getTitle().contains(query) || book.getAuthor().contains(query)){
                result.add(book);
            }
        }
        return result.toArray(new Book[0]);
    }

    /**
     *
     * @param a The book to be checked out.
     * @param b The borrower's information.
     * @throws IllegalStateException If the book is not available.
     */
    public void checkOutBook(Book a, String b) throws IllegalStateException {
        if (a.isAvailable()) {
            a.setAvailable(false);
        } else {
            throw new IllegalStateException("WEEK4.Book is not available for checkout.");
        }
    }

    /**
     * Returns a book to the library.
     * @param a The book to be returned.
     */

    public void returnBook(Book a) {
        a.setAvailable(true);
    }
}
