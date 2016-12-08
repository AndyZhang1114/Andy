package thirdReveiw;

/**
 * Created by jianbojia on 12/8/16.
 */
public class Q38 {
    public static void main(String[] args) {
//        blah();

        blah1();
    }

    static int x = 1;

    public static void blah() {
        if ((x % 2) > 0 && x < 20) {
            x += 3;
            blah();
        } else if ((x % 2) == 0 && x < 20) {
            x += 1;
            blah();
        } else
            System.out.println(x);
    }

    public static void blah1() {
        int x = 1;
        if ((x % 2) > 0 && x < 20) {
            x += 3;
            blah1();
        } else if ((x % 2) == 0 && x < 20) {
            x += 1;
            blah1();
        } else
            System.out.println(x);
    }
}
