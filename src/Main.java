public class Main {
    public static void main(String[] args) {
        Author first = new Author("Лев", "Толстой");
        Author second = new Author("Михаил", "Булгаков");

        Book firstBook = new Book("Война и мир", first, 1869);
        Book secondBook = new Book("Мастер и Маргарита", second, 1967);

        firstBook.setYear(1234);
        secondBook.setYear(4321);

        System.out.println("Name: " + firstBook.getNameOfBook() + ". Author: " + first.getFirstName() + " " + first.getLastName() + ". Publication year: " + firstBook.getYear());
        System.out.println("Name: " + secondBook.getNameOfBook() + ". Author: " + second.getFirstName() + " " + second.getLastName() + ". Publication year: " + secondBook.getYear());


    }
}
