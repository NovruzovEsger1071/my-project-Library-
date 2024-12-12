package user;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MehsullarQiymetler {

    public static void main(String[] args) {

        List<Object> MeyveList = new ArrayList<>();
        MeyveList.add("Alma");
        MeyveList.add(1);
        MeyveList.add("Nar");
        MeyveList.add(2);
        MeyveList.add("Heyva");
        MeyveList.add(3);
        System.out.println(MeyveList.stream().toList());

        List<String> MusteriList = new ArrayList<>();
        String musderi = "Alma";
        MusteriList.add(musderi);
        int index = MeyveList.indexOf(musderi);
        System.out.println("Mehsul: " + musderi + ", Qiymeti: " + MeyveList.get(index+1) + " AZN");

    }
}
