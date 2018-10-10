package filterDesignPattern.entity;

public class Book {
    private String title;
    private String author;
    private int numberOfPage;
    private String category;

    public Book(String title, String author, int numberOfPage, String category) {
        this.title = title;
        this.author = author;
        this.numberOfPage = numberOfPage;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPage=" + numberOfPage +
                ", category='" + category + '\'' +
                '}';
    }
}
