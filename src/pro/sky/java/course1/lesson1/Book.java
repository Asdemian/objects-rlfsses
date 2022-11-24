package pro.sky.java.course1.lesson1;

import java.util.Objects;

public class Book {

    private String bookName;
    private Author author;
    private int yearOfPublication;

    public Book(String bookName, Author author, int yearOfPublication) {
        this.bookName = bookName;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getAutorName() {
        return author.getName();
    }

    public String getAutorLastName() {
        return author.getLastName();
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return bookName + " " + author + " " + yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication &&
                Objects.equals(bookName, book.bookName) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, yearOfPublication);
    }
}
