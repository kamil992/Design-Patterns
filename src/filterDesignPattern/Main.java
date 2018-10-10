package filterDesignPattern;

import filterDesignPattern.entity.Book;
import filterDesignPattern.filters.AuthorFilter;
import filterDesignPattern.filters.CategoryFilter;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book("The Leopard","Jo Nesbo", 700,"Criminal"));
        bookList.add(new Book("The Reedemer", "Jo Nesbo", 578, "Criminal"));
        bookList.add(new Book("The Hobbit", "J.R.R Tolkien", 360, "Fantasy"));

        CategoryFilter categoryFilter = new CategoryFilter();
        categoryFilter.getFilter(bookList, "criminal");

        AuthorFilter authorFilter = new AuthorFilter();
        authorFilter.getFilter(bookList, "Nesbo");

        for(Book b : authorFilter.getFilter(bookList, "Jo Nesbo")){
            System.out.println(b);
        }
    }
}
