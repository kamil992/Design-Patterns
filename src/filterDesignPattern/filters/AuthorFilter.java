package filterDesignPattern.filters;

import filterDesignPattern.Filter;
import filterDesignPattern.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class AuthorFilter implements Filter {
    @Override
    public List<Book> getFilter(List<Book> books, String authorName) {
        List<Book> bookList = new ArrayList<>();

        for(Book b : books){
            if(b.getAuthor().equalsIgnoreCase(authorName))
                bookList.add(b);
        }
        return bookList;
    }
}
