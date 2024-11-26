import java.util.Arrays;

public class Herfler {

    public static void main(String[] args) {
        Herfler Herfler = new Herfler();
        char[] herif = Herfler.alphabeticArray();

        System.out.println(Arrays.toString(herif));

    }

    public char[] alphabeticArray() {
        char[] result = new char[50];
        int index = 0;
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            result[index] = letter;
            index++;
        }
        return result;
    }

}
