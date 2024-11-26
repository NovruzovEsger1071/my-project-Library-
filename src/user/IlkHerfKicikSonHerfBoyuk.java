package user;

public class IlkHerfKicikSonHerfBoyuk {

    public static void main(String[] args) {

        String soz = "armud";
        int uzunluq = soz.length();


        String ilkHissə = soz.substring(0, uzunluq - 1);
        String sonHerfBoyuk = soz.substring(uzunluq - 1).toUpperCase();

        String yeniSoz = ilkHissə + sonHerfBoyuk;

        String SonHisse = yeniSoz.substring(1, uzunluq);

        String IlkHerfKicik = yeniSoz.substring(0,1).toLowerCase();


        String netice = IlkHerfKicik + SonHisse;

        System.out.println(netice);
    }
}
