package firstreview;

/**
 * Created by jianbojia on 12/1/16.
 */
public class Q1FromBinary {

    public static void main(String[] args) {
        // Binary to Decimal
        String binaryValue1 = "101010111";
        Integer decimalVal1 = Integer.valueOf(binaryValue1, 2);
        System.out.println("Decimal value of " + binaryValue1 + " =" + decimalVal1);

        // Decimal to Hexadecimal
        String hexaVal1 = Integer.toHexString(decimalVal1);
        System.out.println("Hexadecimal value of " + binaryValue1 + " = " + hexaVal1);


        String binaryValue2 = "1110101100";
        Integer decimalVal2 = Integer.valueOf(binaryValue2, 2);
        System.out.println("Decimal value of " + binaryValue2 + " =" + decimalVal2);

        String hexaVal2 = Integer.toHexString(decimalVal2);
        System.out.println("Hexadecimal value of " + binaryValue2 + " = " + hexaVal2);
    }
}
