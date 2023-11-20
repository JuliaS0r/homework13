public class Book {
    String nameOfBook;
    Author author;
    int year;
    public Book(String nameOfBook, Author author, int year) {
        this.nameOfBook = nameOfBook;
        this.author = author;
        this.year = year;
    }
    public String getNameOfBook() {
        return nameOfBook;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

}

