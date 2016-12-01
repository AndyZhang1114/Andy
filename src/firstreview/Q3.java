package firstreview;

/**
 * Created by jianbojia on 12/1/16.
 */
public class Q3 {
    public static void main(String[] args) {
        int fall = -3, leaves = 2, cooler = 8, autumn = -4;
        if ( autumn * leaves > fall * cooler )
        {
            leaves = 10;
            System.out.print ( leaves + " " );
            System.out.println ( leaves + 10 );
            leaves += 10;
        }
        if ( autumn * leaves < fall * cooler )
            System.out.println ( "This is the wrong answer." );
        else
            System.out.println ( "California is best in the fall." );
        System.out.println ( "You can dance, you can sing, or just head to the mall!" );
    }
}
