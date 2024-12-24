package Imtahan;

import java.util.ArrayList;
import java.util.List;

public class Yeddi {
    public static void main(String[] args) {
        // Siyahıda olan palindrom sözləri tapıb ayrı bir siyahıya əlavə edin.Palindrom misalı: "ana", "level", "radar".
        List<String> list = new ArrayList<>();
        list.add("ana");
        list.add("mandalin");
        list.add("zaman");
        list.add("level");
        List<String> siyahi = new ArrayList<>();
        for (String soz : list) {
            int a = 0;
            int b = 0;
            while (a < soz.length() / 2) {
                a = a + 1;
                if (soz.charAt(a - 1) == soz.charAt(soz.length() - a)) {
                    b = b;
                } else {
                    b = b + 1;
                }
            }
            if (b == 0)
                siyahi.add(soz);

        }
        System.out.println(siyahi);

    }
}
