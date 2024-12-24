package Kitabxana;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private String[] authors;
    private int bookCount;

//    public Library(int capacity) { //100 - 101
//        this.books = new Book[capacity];
//        this.bookCount = 0;
    //istifadecinin istediyi kitab varmi ve varsa qiymetini yoxlamaq.
//istifadecinin balansinda itdetidi kitaba uygun mebleg varmi.
//kitaba satila bilen olub olmadiqini ucun filt elave edin(alina bilen ya yox).yeni konustruktor yariladacaq.
//alindiqdan sonra user balanci yenilemek.(metod).kitab silirik.
//}

    public void addBoook(Book book) throws IOException {
        books.add(book);
        System.out.println("Kitab ugurla elave olundu...");
        FileWriter fileWriter = new FileWriter("output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(books.toString());
        bufferedWriter.close();

        //        if (bookCount < books.size()) {
//                books[bookCount++] = book;
//                System.out.println("Kitab elave ugurla olundu...");
//            }
//        else{
//            System.out.println("kitabxana doludu");
//        }
    }

    public void addBoookCheck(Book book) {
        Book byTitle = findByTitle(book.getTitle());
        System.out.println(byTitle);
        if (byTitle.getTitle().equals(book.getTitle())) {
            throw new BookAlreadyExistsException("bu adda kitab artiq elave olunub");
        } else {
            books.add(book);
            System.out.println("Kitab elave ugurla olundu...");

//        if (bookCount < books.size()) {
//            books[bookCount++] = book;
//            System.out.println("Kitab elave ugurla olundu...");
//        }
        }
        //eyni adli kitabi kitabxanaya elave ede bilmesin.
        //findbaytittle cagiririq
        //qayidan deyeri yoxluyuruq ve yoxluyuruq oturduyumuz paremetrle.
        // eyni adda olsa xeta atsin.
    }

    public static List<Book> bookList(List<Book> books) {
        if (books.isEmpty()) {
            System.out.println("Listin ici bosdur");
        }
//        if (bookCount == 0)
//            System.out.println("Kitab yoxdur...");
//        else {
//            for (int i = 0; i < bookCount; i++) {
//                System.out.println(books[i].toString());
//            }
//        }
        return books;
    }

    public Book findById(int bookId) {
        for (Book book : books) {

            if (bookId != book.getId()) {
                throw new BookNotFountException("bu id kitab tapilmadi...");
            }
            return book;
        }
        return null;
    }

    public Book findByTitle(String title) {
        for (Book book : books) {
            if (title.equalsIgnoreCase(book.getTitle()))
                return book;
            throw new BookNotFountException("bu adla kitab tapilmadi ...");
        }
        return null;
    }

    public void updateBookStatus(int bookId, Boolean status) {
        Book foundBook = findById(bookId);
        if (foundBook != null) {
            foundBook.setStatus(status); // true -> Active -- false -> DeActive
            System.out.println("Kitabin statusu yenilendi : " + foundBook.getStatus());
        } else {
            System.out.println(bookId + ": ID`li kitab tapilmadi...");
        }
    }

    public void borrowBook() {
        for (Book book : books) {
            Book foundedBook = findById(book.getId());
            if (foundedBook.getStatus() == Boolean.TRUE) {
                foundedBook.setStatus(false);
                System.out.println("bu kitab goturldu...");
            } else
                System.out.println("bu kitab artiq goturule bilmez...");
        }


    }

    public void deleteBook(int bookId) {
        Book findbook = findById(bookId);
        if (findbook != null) {
            findbook = null;
            System.out.println("kitab silindi...");
        }
    }

    public List<Book> showBook() {
        return books.stream()
                .filter(checkbook -> checkbook.getStatus().equals(true))
                .toList();

//        for (Book book: books) {
//            if (book.getStatus()) {
//                System.out.println(book.getTitle());
//            }
//        }//10 kitabdan 4 eded true dise array kimi geri qaytar.(return tip array olsun)

    }

    public void updatestatus(int bookId) {
        Book findbook = findById(bookId);
        if (!findbook.getStatus()) {
            findbook.setStatus(true);
            System.out.println("kitab statusu update olundu...");
        }

    }

    public void checkBalance(int bookId, User user) {
        Book byId = findById(bookId);
        if (byId != null) {
            if (byId.getPrice() <= user.getBalance()) {
                user.setBalance(user.getBalance() - byId.getPrice());
                byId.setStatus(false);
                System.out.println(user.getBalance());
            }
            System.out.println("Balansinizda kifayet qeder mebleg yoxdu");
        }
        System.out.println("Bele kitab yoxdu");

    }

}
//metodlari duzeldirik.
//harda void return ederik.
//queue ile ne etmek olar burda ?!