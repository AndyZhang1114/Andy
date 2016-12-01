package unit1;

/**
 * Created by jianbojia on 11/30/16.
 */
public class Format2 {
    public static void main ( String [] args )
    {

        String s1 = "left";
        String s2 = "center";
        String s3 = "right";

        System.out.println ( Format.left ( s1, 25 ) + "String" );
        System.out.println ( Format.center ( s2, 25 ) + "String" );
        System.out.println ( Format.right ( s3, 25 ) + "String" );
    }
}
