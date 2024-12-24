package Imtahan;

import java.util.ArrayList;
import java.util.List;

public class Dord {
    public static void main(String[] args) {
        //4. Bir List<Integer> yaradın və yalnız cüt rəqəmləri çap etmək üçün filter() metodundan istifadə edin
        List<Integer> siyahi = new ArrayList<>();
        siyahi.add(5);
        siyahi.add(2);
        siyahi.add(3);
        siyahi.add(4);
        siyahi.add(8);
        siyahi.stream()
                .filter(eded-> eded % 2 == 0)
                .forEach(System.out::println);

    }

}
