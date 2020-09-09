package org.example.repository;

import org.example.contract.Book;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Component
public class BookRepository {

    private List<Book> books;

    @PostConstruct
    public void init() {
        this.books = Arrays.asList(
                new Book("Lord Of The Rings", "J.R.R Tolkien", "This book is a trilogy"),
                new Book("Harry Potter", "J.K. Rowling", "This series has 7 books")
        );
    }

    public List<Book> getAll() {
        return this.books;
    }
}
