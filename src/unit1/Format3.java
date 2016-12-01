package unit1;

/**
 * Created by jianbojia on 11/30/16.
 */
public class Format3 {
    public static void main ( String [] args )
    {

        double d1 = -123.49934575;
        double d2 = 678.9;
        double d3 = 12345.6789;

        System.out.println ( Format.left ( d1, 15, 6 ) + "left" );
        System.out.println ( Format.center ( d2, 15, 3 ) + "center" );
        System.out.println ( Format.right ( d3, 15, 2 ) + "right" );
    }
}
