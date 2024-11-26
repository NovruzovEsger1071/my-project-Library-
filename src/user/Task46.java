package user;

public class Task46 {
    public static void main(String[] args){

        int qiymet = 77;

        if(qiymet<60)
            System.out.println("F");
        else if (qiymet>=60 && qiymet<=69) {
            System.out.println("D");
        } else if (qiymet>=70 && qiymet<=79) {
            System.out.println("C");
        }
        else if (qiymet>=80 && qiymet<=89) {
            System.out.println("B");
        }
        else{
            System.out.println("A");
        }


    }
}
