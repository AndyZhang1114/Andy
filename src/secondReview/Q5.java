package secondReview;

/**
 * Created by jianbojia on 12/4/16.
 */
public class Q5 {
    public static void main(String[] args) {
        System.out.println("while loop");

        int g = 100;
        double w = 0.1;
        while (w < 1.0) {
            w += 0.1;
            g = (int) (g - g * w);
            System.out.println("w is " + w);
        }

        System.out.println("\nfor loop");

        g = 100;
        w = 0.1;
        for (w = 0.1; w < 1.0; w += 0.1) {
            g = (int) (g - g * w);
            System.out.println("w is " + w);
        }

        System.out.println("\ndo while loop");

        g = 100;
        w = 0.1;
        do {
            g = (int) (g - g * w);
            System.out.println("w is " + w);
            w += 0.1;
        } while (w < 1.0);

    }
}
