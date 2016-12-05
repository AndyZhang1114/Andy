package firstReview;

/**
 * Created by jianbojia on 12/1/16.
 */
public class Q1FromDecimal {
    public static void main(String[] args) {
        // Decimal to Binary
        int n1 = 321;
        String binaryVal1 = Integer.toBinaryString(n1);
        System.out.println("Binary value of " + n1 + " = " + binaryVal1);

        // Decimal to Hexadecimal
        String hexaVal1 = Integer.toHexString(n1);
        System.out.println("Hexadecimal value of " + n1 + " = " + hexaVal1);

        int n2 = 1012;
        String binaryVal2 = Integer.toBinaryString(n2);
        System.out.println("Binary value of " + n2 + " = " + binaryVal1);

        // Decimal to Hexadecimal
        String hexaVal2 = Integer.toHexString(n2);
        System.out.println("Hexadecimal value of " + n2 + " = " + hexaVal2);

    }
}
