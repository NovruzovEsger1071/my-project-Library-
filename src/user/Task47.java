package user;

public class Task47 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 13 == 0) {
                System.out.println(i);
            }
        }
    }
}
