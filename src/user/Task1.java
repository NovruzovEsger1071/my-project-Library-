package user;

public class Task1 {

    public static void main(String[] args){

        System.out.println(Task1.EnUzun("Allah sizi qorusun"));

    }

    public static String EnUzun(String cumle){

       String[] strArray = cumle.split(" ");
       int max = 0;
       String  herf = "A";
       for (int i = 0; i < strArray.length; i++){
           if(strArray[i].length() > max){
               herf = strArray[i];
           }
       }

        return herf;
    }



}
