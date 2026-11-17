
package com.prac.Question6;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> searchBooks(String title, String author) {

        // Validate title
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException(
                    "title must not be blank"
            );
        }

        // Search books using repository
        List<Book> result =
                bookRepository.searchBooks(title.trim(), author == null ? null : author.trim());

        // Check whether books are found
        if (result.isEmpty()) {
            throw new NoBooksFoundException("No books found");
        }

        return result;
    }

    public static class NoBooksFoundException
            extends RuntimeException {

        public NoBooksFoundException(String message) {
            super(message);
        }
    }
}
