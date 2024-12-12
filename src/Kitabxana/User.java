package Kitabxana;

public class User {

    // userin balansi olsun
    //kitablarin qiymeti olsun
    //kitablarin qiymetini toplayib balansin catib catmadigini yoxlamaq eger catirsa cixmaq

    private String name;
    private String username;
    private double balance;

    public User(String name, String username, double balance) {
        this.name = name;
        this.username = username;
        this.balance = balance;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public String getUsername() {return username;}

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getBalance(){return balance;}

    public void setBalance(double balance){
        this.balance = balance;
    }

}
