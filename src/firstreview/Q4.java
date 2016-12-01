package firstreview;

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
        int j = 20;
        while (j > 3) {
            System.out.print(j + " ");
            j -= 2;
        }

    }
}
