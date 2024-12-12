package user;

import java.util.Scanner;

public class Mentor {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    // Giriş: Şifrlənmiş mətnlərin sayı
    int n = Integer.parseInt(scanner.nextLine());

    // Hər bir şifrlənmiş mətn üçün işləyək
    for (int i = 0; i < n; i++) {
        // Hər bir sətiri oxuyuruq
        String[] inputLine = scanner.nextLine().split(" ");
        // Şifrlənmiş mətni alırıq
        String encodedString = inputLine[1];

        // Dekodlaşdırılmış mətni yığmaq üçün bir StringBuilder yaradırıq
        StringBuilder decodedString = new StringBuilder();// Əvvəlcədən təyin edilmiş bir uzunluq olmadığından StringBuilder istifadə etmək daha səmərəlidir
        int index = 0;

        // Şifrlənmiş mətn üzərində iterasiya
        while (index < encodedString.length()) {
            // Hər iki halda mövqeləri müəyyən edirik
            if (index + 2 < encodedString.length() && encodedString.charAt(index + 2) == '0') {
                // İki rəqəmli hal (120 -> 12 -> l)
                int position = Integer.parseInt(encodedString.substring(index, index + 2));
                // Ənənəvi indeksləmədən fərqli olaraq, a-dan başlayırıq
                decodedString.append((char) ('a' + position - 1));
                // İndeksi 3 artırırıq, çünki iki rəqəmli bir simvolu işlədik
                index += 3; // İki rəqəm + 0
            } else {
                // Bir rəqəmli hal (1 -> a)
                int position = Character.getNumericValue(encodedString.charAt(index));
                decodedString.append((char) ('a' + position - 1));
                // İndeksi 1 artırırıq, çünki bir rəqəmli bir simvolu işlədik
                index += 1;
            }
        }

        // Nəticəni çap edirik
        System.out.println(decodedString.toString());
    }

    scanner.close();
}
}
