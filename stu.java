import java.util.ArrayList;
class Book {
    private String title;
    private String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void showBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    private String name;
    private ArrayList<Book> books; 
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showLibraryInfo() {
        System.out.println("\nLibrary Name: " + name);
        System.out.println("Books Available:");
        for (Book b : books) {
            b.showBookInfo();
        }
    }
}

public class stu {
    public static void main(String[] args) {
  
        Book b1 = new Book("Java Programming", "James Gosling");
        Book b2 = new Book("Data Structures", "Mark Allen Weiss");
        Book b3 = new Book("Operating Systems", "Silberschatz");
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");
        lib1.addBook(b1);
        lib1.addBook(b2);
        lib2.addBook(b2); 
        lib2.addBook(b3);
        lib1.showLibraryInfo();
        lib2.showLibraryInfo();
    }
}

    

