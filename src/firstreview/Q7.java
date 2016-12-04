package firstreview;

/**
 * Created by jianbojia on 11/30/16.
 */
public class Q7 {
    public static void main(String[] args) {
        int rst = TwoWay(6,8);
        System.out.println(rst);
    }

    public static int TwoWay(int first, int second)
    {
        if (first < 1) return 1;
        if (second > 10) return 10;
        int rst = TwoWay(first - 2, second + 1) + TwoWay(first - 1, second + 2);
        return  rst;
    }
}
