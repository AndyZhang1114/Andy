package thirdReveiw;

/**
 * Created by jianbojia on 12/8/16.
 */
public class Q55 {

    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 88;
        
        int rst = calculate(num1, num2);

        System.out.println("rst = " + rst);
    }
    public static int calculate(int num1, int num2) {
        //Preconditon	:2	positive	integers	'num1'	and	'num2'
        // num1 >	=	num2
        //Postcondition:	returns	1	integer
        int num3 = num1 % num2;
        while (num3 != 0)
        {
            num1 = num2;
            num2 = num3;
            num3 = num1 % num2;
        }
        return num2;
    }

}
