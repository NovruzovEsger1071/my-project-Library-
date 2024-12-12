package Kitabxana;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Library Management System...

        // Library - Book - User(Istifadeci) -- istifade olunacaq classklar

        // kitabnaxa ucun istifade olunacaq datalar..
        // Library -> Book[] books , int bookCount... int capacity(kitablari saxlayan array olcusu)

        // kitab ucun istifade olunacaq datalar...
        // Book -> int id , String title , String author , String description , String status (yararli / yarasiz)

        // user ucun istifade olunacaq datalar...
        // User -> String name , String username

        Library library = new Library(); // max kitab tutumu 10 olacaq...

        library.addBoook(new Book(4,"Qirmizi-kitab","Esger",true,15,20));
//        library.addBoookCheck(new Book(5,"Qirmizi-kib","Esr",true,20,100));


        // library.updateBookStatus(4,true);
        //library.deleteBook(4);
//        library.borrowBook();
       // library.showBook();
       // library.updatestatus(4);
//        library.findById(4);
        //library.findByTitle("qirmizi-kitab");

    }
}