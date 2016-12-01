package unit1;

/**
 * Created by jianbojia on 11/30/16.
 */
public class PrintfFormatting {
    public static void main(String [] args)
    {
        System.out.println("\n\n\n");

        String name = new String("Skip Mueller");
        double height = 71.501239;
        double weight = 173.67543901;
        int height2 = (int)height;
// converts decimal height to integer
        long height3 = Math.round(height);
// rounds decimal height to integer
        int age = 17;

        System.out.printf("Name: %-4s%n", name);
//next to String literal, left align name in field of width 4, then skip
//        to new line
        System.out.printf("Height: %8.2f%n", height);
//next to String literal, right align height to 2 dec places in field of
//        width 8, new line
        System.out.printf("Weight: %8.2f%n", weight);
        System.out.printf("Age: %8d%n", age);
        System.out.printf("\nHeight: %8d%n", height2);
        System.out.printf("Height: %8d%n", height3);

        System.out.println("\n\n\n"); //Three new lines
    }
}
