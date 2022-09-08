import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Simyacı",166,"Paulo Coelho","1988"));
        bookList.add(new Book("Kumarbaz",161,"Dostoyevksi","1866"));
        bookList.add(new Book("Suç ve Ceza",160,"Dostoyevksi","1866"));
        bookList.add(new Book("Savaş ve Barış",1225,"Tolstoy","1867"));

        Map<String, String> bookMap = new HashMap<>();
        bookList.stream().forEach(book -> bookMap.put(book.getName(), book.getAuthorName()));
        for (String i : bookMap.keySet()) {
            System.out.println("Book Name: " + i + "\nAuthorName: " + bookMap.get(i));
        }
        System.out.println("*--------------------------------------*");
        // filter
        List<Book> listBook = bookList.stream().filter(book -> book.getPageNumber() > 100).collect(Collectors.toList());
        listBook.stream().forEach(b -> System.out.println("Book name : " + b.getName() + "  " +
                "Page Number : " + b.getPageNumber() + "  " +
                "Author : " + b.getAuthorName() + "  " +
                "ReleaseDate : " + b.getReleaseDate()));

        System.out.println("*--------------------------------------*");

        // to view the total number of books
        long count = bookList.stream().count();
        System.out.println("Number of books: " + count);
    }

}
