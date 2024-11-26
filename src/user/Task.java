//package user;
//
//import java.util.Arrays;
//
//public class Task {
//    public static void main(String[] args) {
//        int[] number = {1,1,2,4,5,5,77,87,77,90,9,9,33,2};
//
//        // Task Task = new Task();
//
//        Task reverseClass = new Task ();
//        int[] elements = reverseClass.uniqueElements(number);
//        System.out.println(Arrays.toString(elements));
//    }
//
//    public int[] uniqueElements(int[] arrays) {
//        int[] result = new int[arrays.length];
//        int index = 0;
//        int yoxlama = 0;
//        for (int i = 0; i < arrays.length; i++) {
//            for (int j = 0; j < arrays.length; j++) {
//                if (i != j && arrays[i] == arrays[j]) {
//                    yoxlama = 1;
//                }
//
//            }
//            if (yoxlama == 1) {
//                if(arrays[i] )
//                result[index] = arrays[i];
//                index++;
//            }
//        }
//        return result;
//    }
//}
//
