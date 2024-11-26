package user;

public class Task2 {

    public static void main(String[] args){

        System.out.println(Task2.tek("salam"));

    }

    public static String tek(String soz){
        String b = "";
        for(int i = 0; i < soz.length(); i++) {
            if (soz.indexOf(soz.charAt(i)) == soz.lastIndexOf(soz.charAt(i))){
                b = b + soz.charAt(i);
}

    }
        return b;


    }


}
