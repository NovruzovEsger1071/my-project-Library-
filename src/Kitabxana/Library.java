import java.util.List;

public class Library {
    private List<Book> books;
    private String[] authors;
    private int bookCount;

//    public Library(int capacity) { //100 - 101
//        this.books = new Book[capacity];
//        this.bookCount = 0;
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
        for (int i = 0; i < bookCount; i++) {

            Book book = books[i];

            if (bookId == book.getId())
                return book;
            throw new BookNotFountException("bu id kitab tapilmadi...");
        }
        return null;
    }

    public Book findByTitle(String title) {
        for (int i = 0; i < bookCount; i++) {

            Book book = books[i];

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
        for (int i = 0; i < bookCount; i++) {
            Book book = findById(i);
            if (book.getStatus() == Boolean.TRUE) {
                book.setStatus(false);
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
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getStatus() == true) {
                System.out.println(books[i].getTitle());
            }
        }//10 kitabdan 4 eded true dise array kimi geri qaytar.(return tip array olsun)

    }

    public void updatestatus(int bookId) {
        Book findbook = findById(bookId);
        if (findbook.getStatus() == false) {
            findbook.setStatus(true);
            System.out.println("kitab statusu update olundu...");
        }

    }
}
//metodlari duzeldirik.
//harda void return ederik.
//queue ile ne etmek olar burda ?!