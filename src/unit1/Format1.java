package unit1;

/**
 * Created by jianbojia on 11/30/16.
 */
public class Format1 {
    public static void main ( String [] args )
    {

        int i1 = 1234;
        int i2 = 56457;
        int i3 = 891011;

        System.out.println ( Format.left ( i1, 25 ) + "left" );
        System.out.println ( Format.center ( i2, 25 ) + "center" );
        System.out.println ( Format.right ( i3, 25 ) + "right" );
    }
}
