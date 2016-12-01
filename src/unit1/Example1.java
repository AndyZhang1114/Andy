package unit1;

/**
 * Created by jianbojia on 11/30/16.
 */
public class Example1 {
    public static void main(String[] args)
    {
        // first is declared and initialized
        // second is just declared
        int first = 5;
        int second;
        double  x;
        char  ch;
        boolean  done;
        int math;

        second = -356;
        x = 2.5;
        ch = 'T';
        done = false;

        int sum = first + second;
        math = (int)(( x * second ) / 2);

        System.out.println ( "\n\n" );
        System.out.println ( first + "    " + second );
        System.out.println ( x + "    " + ch );
        System.out.println ( done + "    " + sum );
        System.out.println ( math );
//	  System.out.println ( first + "    " + second );\
        System.out.println ( "\n\n\n" );
    }
}
