package user;

public class Calisma {

    public static void main(String[] args){

//        int a = 571;
//        int c =  0;
         Calisma Calisma = new Calisma();
        System.out.println(Calisma.ReqemSay(577881));

    }
    public static int ReqemSay(int a){

        int c = 0;
        while (a > 0 ){
            a = a / 10;
            c++;
        }
        return c;
    }

}
