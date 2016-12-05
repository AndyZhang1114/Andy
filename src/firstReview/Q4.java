package firstReview;

/**
 * Created by jianbojia on 12/1/16.
 */
public class Q4 {
    public static void main(String[] args) {

        System.out.println("for loop result");
        for (int i = 20; i > 3; i -= 2){
            System.out.print(i + " ");
        }

        System.out.println("\nwhile loop result");
        int i = 20;
        while (i > 3) {
            System.out.print(i + " ");
            i -= 2;
        }


        System.out.println("\ndo while loop result");
        int k = 20;
        do{
            System.out.print(k + " ");
            k -= 2;
        }while(k > 3);

    }
}
