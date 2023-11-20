import com.sun.source.util.SourcePositions;

public class Main {
    public static void main(String[] args) {
        Author first = new Author("Лев", "Толстой");
        Book firstBook = new Book("Война и мир", first, 1869);
        Author second = new Author("Михаил", "Булгаков");
        Book secondBook = new Book("Мастер и Маргарита", second, 1967);
        firstBook.setYear(1234);

        System.out.println(firstBook);
        System.out.println(secondBook);


    }
}
