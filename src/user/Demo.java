package user;

import java.util.ArrayList;
import java.util.List;

public class Demo {
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

        for (Integer number : firstList) {
            if (!resultList.contains(number)) {
                int counter = 0;
                for (int i = 0; i < firstList.size(); i++) {
                    if (firstList.get(i) == number) {
                        counter++;
                    }
                }
                if (counter == 1) {
                    resultList.add(number);
                }

            }
        }

        System.out.println("Unique elements in list: " + resultList);

    }
}
