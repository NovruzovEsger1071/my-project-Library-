package user;

import java.util.Arrays;
import java.util.Scanner;

//Sizə bir şifrlənmiş mətn verilir, hansı ki, aşağıdakı qaydalarla kodlanmışdır:
//
//Əgər hərfin əlifbada mövqeyi bir rəqəmli (9-dan kiçikdirsə), həmin rəqəm olduğu kimi yazılır.
//Məsələn: a -> 1, b -> 2.
//Əgər hərfin əlifbada mövqeyi iki rəqəmli (10 və ya daha böyükdürsə), həmin rəqəm və onun arxasına 0 əlavə edilir.
//Məsələn: l -> 120, m -> 130.
//Tapşırıqda, bu kodlanma qaydasını əks istiqamətdə tətbiq edərək orijinal mətnləri tapmaq lazımdır.
//
//Giriş Formatı:
//
//İlk sətirdə, şifrlənmiş mətnlərin sayını bildirən n tam ədədi verilir.
//Sonrakı n sətirdə hər biri iki hissədən ibarət sətir:
//Şifrlənmiş mətnin uzunluğu (təməl yoxlama üçün).
//Şifrlənmiş mətn.
//Çıxış Formatı:
//
//Hər bir sətirdə kodu açılmış mətnlər çap edilməlidir. Hər biri öz sətirində.
public class TaskEv {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Elementlerin sayini daxil edin: ");
        int say = input.nextInt();
        int[] numbers = new int[say];
        int[] number = new int[say];




        for (int i = 0; i < say; i++) {
            System.out.print((i + 1) + "-ci ədədin uzunlugunu daxil edin: ");
            number[i] = input.nextInt();
            System.out.print((i + 1) + "-ci ədədi daxil edin: ");
            numbers[i] = input.nextInt();
        }
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.toString(number));


        for (int i = 0; i < numbers.length; i++) {
            int a = numbers[i];
            if (numbers[i] <= 9) {
                for (int j = 0; j < number[i]; j++) {
                    int sirasi = 1;
                    for (char soz = 'a'; soz <= 'i'; soz++) {
                        if (sirasi == a) {
                            System.out.print(soz);
                            break;
                        } else {
                            sirasi++;
                        }
                    }

                }

            } else {
                int sirasi = 10;
                for (char soz = 'j'; soz <= 'z'; soz++) {
                    if (sirasi * 10 == a) {
                        System.out.println(soz);
                        break;
                    } else {
                        sirasi++;
                    }
                }
            }
        }


        input.close();
    }
}