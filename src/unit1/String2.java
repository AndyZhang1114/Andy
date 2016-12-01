package unit1;

/**
 * Created by jianbojia on 11/30/16.
 */
public class String2 {
    public static void main ( String [] args )
    {

        String a = new String("Any old");
        String b = " String";
        String aString = a + b; // aString is "Any old String"

        // Show string a
        System.out.println("a: " + a);

        // Show string b
        System.out.println("b: " + b);

        // Show the result of concatenating a and b
        System.out.println("a + b: " + aString);

        // Show the number of characters in the string
        System.out.println("length: " + aString.length());
    }
}
