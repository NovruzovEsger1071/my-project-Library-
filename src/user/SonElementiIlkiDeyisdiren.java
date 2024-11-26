package user;

import java.util.Arrays;

public class SonElementiIlkiDeyisdiren {

    public static void main(String[] args){

        int[] sayilar = {1, 2, 3, 4, 5};

        int say = sayilar[0];
        sayilar[0] = sayilar[sayilar.length-1];
       sayilar[sayilar.length-1] = say;
        System.out.println(Arrays.toString(sayilar));


    }


}
