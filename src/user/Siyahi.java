package user;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Siyahi {

    public static void main(String[] args) {

        List<String> neticeList = new ArrayList<>();
        neticeList.add("soz");
        neticeList.add("cumle");
        neticeList.add("soz");

        int index = neticeList.indexOf("cumle");
        neticeList.set(index,"kitab");
        System.out.println(neticeList);

//        neticeList.add(5);
//        neticeList.add(3);
//        neticeList.add(3);
//        neticeList.add(1);
//        neticeList.add(5);
//        neticeList.add(7);
//
//        while (neticeList.contains("soz")){
//            neticeList.remove("soz");
//        }
//        System.out.println(neticeList);


//        int min = Collections.min(neticeList);
//        int max = Collections.max(neticeList);
//        System.out.println(min + " " + max);


//        List<Integer> sonList = new ArrayList<>();
//        for( Integer number: neticeList){
//            if(neticeList.indexOf(number) == neticeList.lastIndexOf(number))
//                sonList.add(number);
//        }
//        System.out.println(sonList);
//    }

    }
}
