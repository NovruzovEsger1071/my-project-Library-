//package user;
//
//class Person {
//
//    private String name;
//    private int age;
//
//    // 1-ci konstruktor
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    // 2-ci konstruktor
//    public Person(String name) {
//        this.name = name;
//        this.age = 0; // Yaş 0 olaraq təyin edilir
//    }
//
//    public void displayInfo() {
//        System.out.println("Ad: " + name + ", Yaş: " + age);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Person person1 = new Person("Ali", 25);
//        person1.displayInfo(); // Çıxış: Ad: Ali, Yaş: 25
//
//        Person person2 = new Person("Zara");
//        person2.displayInfo(); // Çıxış: Ad: Zara, Yaş: 0
//    }
//
//
//}
package user;

class Personal {

    private String title;
    private String author;
    private double price;

    public Personal(String title,String author,double price){

        this.title = title;
        this.author = author;
        this.price = price;

    }

    public void displayInfo(){
        System.out.println("Basliq: " + title + ",  Muellif: " + author + ",  Qiymet: " + price);
    }

}

public class Main {
    public static void main(String[] args) {

        Personal personal1 = new Personal("Java ", "Esger", 350.0);
        personal1.displayInfo();

    }
}

