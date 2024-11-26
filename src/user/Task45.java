package user;

public class Task45 {
    public static void main(String[] args){

        int[] arras = {2,3,4,5,-3,-7};
        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i< arras.length; i++){

            if(arras[i] >= 0) {
                positiveCount++;
            }
            else {
                negativeCount++;
            }
        }
        System.out.println("Musbetlerin sayi: " + positiveCount);
        System.out.println("Menfilerin sayi: " + negativeCount);
    }
}
