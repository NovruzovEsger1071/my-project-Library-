package user;

public class Task41 {
    public static void main(String[] args){

        int[] arras = {2,3,4,5};
        int cut = 0;
        int tek = 0;

        for (int i = 0; i< arras.length; i++){

            if(arras[i] % 2 == 0) {
                cut += arras[i];
            }
            else {
                tek+= arras[i];
            }
        }
        System.out.println("Cutlerin cemi: " + cut);
        System.out.println("Teklerin cemi: " + tek);
    }
}
