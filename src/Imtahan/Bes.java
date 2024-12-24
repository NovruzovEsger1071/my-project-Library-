package Imtahan;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bes {
    public static void main(String[] args) {
        //5. Bir List<String>-dən hər bir elementin uzunluğunu tapıb yeni bir siyahı yaradın (map() istifadə edin).
        List<String> list = new ArrayList<>();
        list.add("alma");
        list.add("armud");
        list.add("baki");
        list.add("yastiq");
        List<Integer> list1 = list.stream()
                .map(eded-> eded.length())
                .collect(Collectors.toList());
        System.out.println(list1);
    }
}
