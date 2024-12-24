package Imtahan;

public class IkiUc extends Iki {

    @Override
    public void sesCikar() {
        System.out.println("yavas qisqirir");
    }

    public static void main(String[] args) {
        IkiUc ikiUc = new IkiUc();
        ikiUc.sesCikar();
    }
}
