package Kitabxana;

import java.io.IOException;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        // Library Management System...

        // Library - Book - User(Istifadeci) -- istifade olunacaq classklar

        // kitabnaxa ucun istifade olunacaq datalar..
        // Library -> Book[] books , int bookCount... int capacity(kitablari saxlayan array olcusu)

        // kitab ucun istifade olunacaq datalar...
        // Book -> int id , String title , String author , String description , String status (yararli / yarasiz)

        // user ucun istifade olunacaq datalar...
        // User -> String name , String username

//        ArrayList<Library> Library = new ArrayList<>();;

        Library library = new Library();
        Book book = new Book();

        library.addBoook(new Book(5,"Kitab","Esger",true,500.0));
        library.addBoook(new Book(6,"Kit","Esger",true,500.0));
        library.addBoook(new Book(7,"Ki","Esger",true,500.0));

        User user = new User("Esger","Novruzov",700.0);
        System.out.println(library.showBook());
//        library.checkBalance(5,user);


//        library.addBoook(new Book(4,"Qirmizi-kitab","Esger",true));
//        library.addBoookCheck(new Book(5,"Qirmizi-kita","Esge",true));
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