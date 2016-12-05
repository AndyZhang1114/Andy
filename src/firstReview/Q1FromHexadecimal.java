package firstReview;

/**
 * Created by jianbojia on 12/1/16.
 */
public class Q1FromHexadecimal {
    public static void main(String[] args) {
        // Hexadecimal to Decimal
        String hexaVal1 = "F3";
        Integer decimalVal1 = Integer.valueOf(hexaVal1, 16);
        System.out.println("Decimal value of " + hexaVal1 + " = " + decimalVal1);

        // Decimal to Binary
        String binaryVal1 = Integer.toBinaryString(decimalVal1);
        System.out.println("Binary value of " + hexaVal1 + " = " + binaryVal1); // Hexadecimal to Decimal


        String hexaVal2 = "BB4";
        Integer decimalVal2 = Integer.valueOf(hexaVal2, 16);
        System.out.println("Decimal value of " + hexaVal2 + " = " + decimalVal2);

        String binaryVal2 = Integer.toBinaryString(decimalVal1);
        System.out.println("Binary value of " + hexaVal2 + " = " + binaryVal2);
    }
}
