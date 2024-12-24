package Imtahan;

import java.util.Set;
import java.util.TreeSet;

public class Uc {
    //3. TreeSet istifadə edərək, təsadüfi sıralanmış rəqəmləri sıralı şəkildə çap edin.
    public static void main(String[] args) {
        Set<Integer> triset = new TreeSet<>();
        triset.add(3);
        triset.add(1);
        triset.add(9);
        triset.add(8);
        triset.add(0);
        System.out.println(triset);
        //set ailesi ozunde uniqiue ve sorted seklinde nizamlanmis deyisenler saxlayir
    }
}
