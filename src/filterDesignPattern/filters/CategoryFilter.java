package filterDesignPattern.filters;

import filterDesignPattern.Filter;
import filterDesignPattern.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class CategoryFilter implements Filter {

    @Override
    public List<Book> getFilter(List<Book> books, String category) {
        List<Book> bookList = new ArrayList<>();

        for(Book b : books){
            if(b.getCategory().contains(category))
                bookList.add(b);
        }
        return bookList;
    }

}
