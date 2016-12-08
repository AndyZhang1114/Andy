package thirdReveiw;

import java.util.Scanner;

/**
 * Created by jianbojia on 12/8/16.
 */
public class Q49 {
    public	static	void	main(String	[]	args)
    { int	hours;
        double	hourlywage;
        Scanner	console	=new Scanner(System.in);
        double	subtotal;
        System.out.println(	"\nEnter	hours	worked	this	week");
        hours	= 40;//console.nextInt();
        System.out.println("\n	Enter	your	hourly	wage");
        hourlywage=7.5;//console.nextDouble();
        System.out.println("Here	is	your	paycheck:");
        subtotal	=	hours *	hourlywage;
        System.out.printf("Hours					%-20s\n",	hours);
        System.out.printf("Rate					$%-20.2f\n", hourlywage	);
        System.out.printf("Subtotal            	$%-20.2f\n", subtotal);
    }
}
