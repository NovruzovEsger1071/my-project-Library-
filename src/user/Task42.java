package user;

public class Task42 {

    public static void main(String[] args){

        int[] arras = {2,3,102,5};
        int max = 0;
        int min = arras[0];

        for (int i = 0; i< arras.length; i++){

            if(arras[i] > max) {
                max = arras[i];
            }
            if (arras[i] < min){
                min = arras[i];
            }
        }
        if(max>100)
            System.out.println("En boyuk: " + max + " Eded cox boyukdur");
        else
            System.out.println("En boyuk: " + max);
        System.out.println("En kicik: " + min);
    }

}
