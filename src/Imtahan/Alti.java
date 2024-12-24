package Imtahan;

import java.util.ArrayDeque;
import java.util.Queue;

public class Alti {
    public static void main(String[] args) {
        //6. Bir Queue yaradın və peek() metodu ilə növbədəki ilk elementi əldə edin.
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(6);
        queue.add(7);
        queue.add(4);
        System.out.println(queue.peek());
    }
}
