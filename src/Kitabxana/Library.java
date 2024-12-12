package Kitabxana;

import java.util.List;

public class Library {
    private List<Book> books;
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

    public void addBoook(Book book) {
        books.add(book);
        System.out.println("Kitab ugurla elave olundu...");
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
        for (Book book: books) {

            if (bookId != book.getId()){
                throw new BookNotFountException("bu id kitab tapilmadi...");
            }
            return book;
        }
        return null;
    }

    public Book findByTitle(String title) {
        for (Book book: books) {
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
        for (Book book: books) {
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

    public void showBook() {
        for (Book book: books) {
            if (book.getStatus()) {
                System.out.println(book.getTitle());
            }
        }//10 kitabdan 4 eded true dise array kimi geri qaytar.(return tip array olsun)

    }

    public void updatestatus(int bookId) {
        Book findbook = findById(bookId);
        if (!findbook.getStatus()) {
            findbook.setStatus(true);
            System.out.println("kitab statusu update olundu...");
        }

    }
}
//metodlari duzeldirik.
//harda void return ederik.
//queue ile ne etmek olar burda ?!