package filterDesignPattern;

import filterDesignPattern.entity.Book;

import java.util.List;

public interface Filter {
     List<Book> getFilter(List<Book> books, String filterBy);

//    default List<Book> getFilter(List<Book> books, int pages){
//        return null;
//    }
}
