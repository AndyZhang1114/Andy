package firstReview;

/**
 * Created by jianbojia on 12/4/16.
 */
public class DecimalToBinary {

    public static void main(String[] args) {
        int n = 321;

        String binaryValue = decimalToBinary(n);

        System.out.println("binary = " + binaryValue);

        int decimalValue = binaryToDecimal(binaryValue);

        System.out.println("decimalValue = " + decimalValue);
    }

    private static int binaryToDecimal(String binary) {

        int exponent = 0;
        int decimal = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            int last  = binary.charAt(i) - '0';
            decimal += last  * (int) Math.pow(2,exponent);
            exponent++;
        }

        return decimal;
    }

    private static String decimalToBinary(int n) {
        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();
    }

}
