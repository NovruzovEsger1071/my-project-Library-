package user;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        // Məsələ 1: Müsbət ədədlərin kvadratlarının cəmi
//Verilmiş bir siyahıda (List<Integer>) yalnız müsbət ədədləri seç və onların kvadratlarının cəmini hesabla.

//        List<Integer> numbers = Arrays.asList(-2, 3, -1, 4, -5);
//        int cem = numbers.stream()
//                .filter(eded -> eded >= 0)
//                .map(eded -> eded * eded)
//                .reduce(0, Integer::sum);
//        System.out.println(cem);



//        Məsələ 2: Uzunluğu 5-dən çox olan sözləri seçmək
//        Verilmiş sözlər siyahısından (List<String>) yalnız uzunluğu 5 və ya daha çox olan sözləri seç və nəticəni böyük hərflərlə çap et.

//        List<String> words = Arrays.asList("Java", "Stream", "Programming", "API", "Filter");
//        List<String> result =  words.stream()
//                .filter(herf -> herf.length() >= 5)
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//        System.out.println(result);



//        Məsələ 3: Tək ədədləri cüt ədədə çevirmək
//        Verilmiş ədədlər siyahısından (List<Integer>) yalnız tək ədədləri seç və hər birini 1 vahid artıraraq onları cüt ədədə çevir.

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        List<Integer> result = (List<Integer>) numbers.stream()
//                .filter(eded-> eded % 2 == 1)
//                .map(eded-> eded + 1)
//                .collect(Collectors.toList());
//        System.out.println(result);


//        Məsələ 4: Ədədlərin ən böyüyünü tapmaq
//        Verilmiş siyahıdan ən böyük ədədi Stream.max() metodu ilə tap.

//        List<Integer> numbers = Arrays.asList(10, 23, 45, 67, 89);
//        List<Integer> result = numbers.stream()
//                .sorted()
//                .collect(Collectors.toList());
//        System.out.println(result.reversed().stream().findFirst());



//        Məsələ 5: Unikal hərfləri tapmaq
//        Verilmiş sözlər siyahısının bütün hərflərini birləşdir və yalnız təkrarlanmayən hərfləri taparaq çap et.

//        List<String> words = Arrays.asList("apple", "banana", "grape");
//        String result = words.stream()
//                .collect(Collectors.joining());
//
//        List<String> netice = Arrays.asList(result.split(""));
//        netice.stream()
//                .filter(herf -> netice.indexOf(herf) == netice.lastIndexOf(herf))
//                .forEach(System.out::println);



//        Məsələ 8: Ədədləri qruplaşdırmaq
//        Verilmiş ədədləri cüt və tək olaraq qruplaşdır və nəticəni çap et.

//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//        List<Integer> result = numbers.stream()
//                .filter(eded-> eded % 2 == 0)
//                .collect(Collectors.toList());
//        System.out.println(result);
//        List<Integer> result1 = numbers.stream()
//                .filter(eded-> eded % 2 != 0)
//                .collect(Collectors.toList());
//        System.out.println(result1);



//        Məsələ 9: Təkrarlanan sözlərin sayını tapmaq
//        Verilmiş sözlər siyahısında hər sözün təkrar sayını hesabla və nəticəni çap et.

//        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "banana");
//        Map<String, Long> frequencyMap = words.stream()
//                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
//        System.out.println(frequencyMap);

// chatgbt ile yazdim amma 90ci setiri basa dusmedim sintaksisi !!!!!!!!!!!!!!!!!!!!


    }
}
