package user;

public class Faktorial {

    public static void main(String[] args){
        Faktorial Faktorial = new Faktorial();
        int netice = Faktorial.fktorial();

        System.out.println(netice);


    }
    public int fktorial(){

        int number = 4;
        int fktrl = 1;
        for (int i = 1; i <= number; i++){
            fktrl = fktrl * i;
    }
        return fktrl;

    }

}
