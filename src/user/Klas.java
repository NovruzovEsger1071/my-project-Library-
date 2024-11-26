package user;

import java.util.Arrays;

public class Klas {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 2, 4, 5, 3, 6, 7, 8, 5, 9};
        int[] uniqueArray = extractUniqueElements(inputArray);

        System.out.println("Unikal elementlər: " + Arrays.toString(uniqueArray));
    }

    public static int[] extractUniqueElements(int[] array) {
        int[] tempArray = new int[array.length];
        int uniqueCount = 0;

        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                tempArray[uniqueCount] = array[i];
                uniqueCount++;
            }
        }

        int[] uniqueArray = new int[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueArray[i] = tempArray[i];
        }

        return uniqueArray;
    }
}
