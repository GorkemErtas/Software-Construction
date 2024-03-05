package WEEK4;

/**
 * Represents a book in the library.
 */
public class Book {
    /**
     * The title of the book.
     */
    public String title;
    /**
     * The author of the book.
     */
    public String author;
    /**
     * The ISBN of the book.
     */
    public String ISBN;
    /**
     * Indicates whether the book is currently available in library.
     */
    public boolean isAvailable;

    /**
     *
     * @param title The title of the book.
     * @param author The author of the book.
     * @param ISBN The ISBN of the book.
     * @param isAvailable Indicates whether the book is currently available in library.
     */

    public Book(String title, String author, String ISBN, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    /**
     * Gets the title of the book.
     * @return The title of the book.
     */

    public String getTitle() {
        return title;
    }

    /**
     * Gets the author of the book.
     * @return The author of the book.
     */

    public String getAuthor() {
        return author;
    }

    /**
     * Gets the ISBN of the book.
     * @return The ISBN of the book.
     */

    public String getISBN() {
        return ISBN;
    }

    /**
     * Checks if the book is available in the library.
     * @return true if the book is available, false otherwise.
     */

    public boolean isAvailable(){
        return isAvailable;
    }

    public void setAvailable(boolean a) {

    }
}
