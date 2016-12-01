package unit1;

/**
 * Created by jianbojia on 11/30/16.
 */
public class String1 {
    public static void main ( String [] args )
    {

        String name = "Bob Binary";
        String anotherName = new String("Betty Binary");

        System.out.println ( "name = " + name );
        System.out.println ( "anotherName = " + anotherName );

        name = "Boris";
        anotherName = new String(" Bessy ");

        System.out.println ( "\n\nname = " + name );
        System.out.println ( "anotherName = " + anotherName );

        int n = name.length();
        int m = anotherName.length();

        System.out.println ( "length of name = " + n );
        System.out.println ( "length of anotherName = " + m );
    }
}
