package thirdReveiw;

/**
 * Created by jianbojia on 12/8/16.
 */
public class Q37 {

    static int count = 0;

    public static void main(String[] args) {

        int a = 5;
        a = rec(5);
        System.out.println("a = " + a);
        System.out.println("count = " + count);
    }

    public static int rec(int a) {
        if (a < 10) {
            count++;
            a += rec((a + 1));
        } else
            return 10;

        return a;
    }
}
