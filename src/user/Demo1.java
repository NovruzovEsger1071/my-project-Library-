package user;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {
        public static void main(String[] args) {

            List<Integer> firstList = new ArrayList<>();
            firstList.add(1);
            firstList.add(0);
            firstList.add(3);
            firstList.add(3);
            firstList.add(7);
            firstList.add(4);
            firstList.add(5);

            List<Integer> resultList = new ArrayList<>();
            int unique = 0;

            for (Integer number : firstList) {
                if(!number.equals(unique)){
                    unique = number;
                    resultList.add(unique);
                }


            }

            System.out.println("Unique elements in list: " + resultList);

        }

}
