public class Book {
    private String bookName;
    private int yearOfPublish;
    private Author author;
    public Book(String bookName, int yearOfPublish, Author authorName) {
        this.bookName = bookName;
        this.yearOfPublish = yearOfPublish;
        this.author = authorName;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return author;
    }

        public int getYearOfPublish() {
        return this.yearOfPublish;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }
}