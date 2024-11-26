import java.util.Arrays;

public class Abc {
    public static void main(String[] args){

        Abc lessonTen = new Abc();
        char[] herfler = lessonTen.alphabeticArray();
        System.out.println(Arrays.toString(herfler));

    }
    public char[] alphabeticArray(){
        char[] result = new char[50];
        int index = 0;

        for(char letter = 'A'; letter <= 'Z'; letter++){
            result[index] = letter;
            index++;
        }
        return result;
    }
}
