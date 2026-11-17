
package com.prac.Question6;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {

    private final List<Book> books = new ArrayList<>();

    public BookRepository() {

        // Sample book data
        books.add(new Book("Spring Boot in Action", "Craig Walls"));
        books.add(new Book("Spring Start Here", "Laurentiu Spilca"));
        books.add(new Book("Effective Java", "Joshua Bloch"));
        books.add(new Book("Java Programming", "James Gosling"));
        books.add(new Book("Python Basics", "John Smith"));

    }

    public List<Book> searchBooks(String title, String author) {

        return books.stream()

                .filter(book ->
                        book.title().toLowerCase()
                                .startsWith(title.toLowerCase()))

                .filter(book ->
                        author == null ||
                                book.author().toLowerCase()
                                        .startsWith(author.toLowerCase()))

                .toList();
    }
}
