package secondReview;

/**
 * Created by jianbojia on 12/4/16.
 */
public class Q4 {
    public static void main(String[] args) {

        System.out.println("First for loop");

        for (int i = 8; i > -2; i--) {
            double k = i * 0.5;
            System.out.println("k is " + k + " and i is " + i);
        }

        System.out.println("\nSecond for loop");

        for (int i = 0; i < 5; i += 2) {
            int s = i * i;
            System.out.println("s is " + s + " and i is " + i);
        }

        System.out.println("First while loop");
        int a = 4;
        int b = 2;
        while (a + b > 0) {
            System.out.println("a is" + a + " and b is " + b);
            a--;
        }

        System.out.println("Second while loop");
        a = 4;
        b = -2;
        while (a + b > 0) {
            System.out.println("a is" + a + " and b is " + b);
        }
        a--;


        System.out.println("First do while loop");
        int m = 0;
        do {
            System.out.println("m is " + m);
            m++;
        } while (m > 5);
    }
}
