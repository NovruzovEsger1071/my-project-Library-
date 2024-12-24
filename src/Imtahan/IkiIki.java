package Imtahan;

public class IkiIki extends Iki{

    @Override
    public void sesCikar() {
        System.out.println("berkden qisqirir");
    }

    public static void main(String[] args) {
        IkiIki ikiIki = new IkiIki();
        ikiIki.sesCikar();
    }
}
