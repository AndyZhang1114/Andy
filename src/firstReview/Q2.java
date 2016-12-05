package firstReview;

/**
 * Created by jianbojia on 12/1/16.
 */
public class Q2 {
    public static void main(String[] args) {

        System.out.println("31 * 2 % 7 + 43 = " + (31 * 2 % 7 + 43));

        System.out.println("((int) 5.6 % 14 + (double) 3 / 2) = " + ((int) 5.6 % 14 + (double) 3 / 2));

        System.out.println("(42 + (int)(5.6 / 3 - 0.222 * 102 + 5.143)) = " + (42 + (int)(5.6 / 3 - 0.222 * 102 + 5.143)));

        System.out.println("((char)('T'+342.1/55) = " + ((char) ('T' + 342.1 / 55)));

        System.out.println("((double)(int)(6.3 / 3.1 + 8 % 256) ) = " + ((double) (int) (6.3 / 3.1 + 8 % 256)));

        System.out.println("(-5.3 + -2.1- -66.7) = " + (-5.3 + -2.1- -66.7));

        boolean flag = (2 + 5 * 22 % 7) < (108 % 9 + (int) 'h');
        System.out.println("(2 + 5 * 22 % 7) < (108 % 9 + (int) 'h') = " + flag);

        boolean flag1 = ((int)(15 / 16) + 9 * 8 == 75) || ((int) 'Q'/9 == 3 * 3 / 2);
        System.out.println("((int)(15 / 16) + 9 * 8 == 75) || ((int) 'Q'/9 == 3 * 3 / 2) = " + flag1);

        boolean flag2 = 8.9 * 8.2 - 34 * (double) (1 / 3) >= 75.0;
        System.out.println("8.9 * 8.2 - 34 * (double) (1 / 3) >= 75.0 = " + flag2);
    }
}
