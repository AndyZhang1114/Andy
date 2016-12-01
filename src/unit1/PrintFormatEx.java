package unit1;

/**
 * Created by jianbojia on 11/30/16.
 */
public class PrintFormatEx {
    public	static	void	main(	String	[]	args	)
    {
        String	line1; //	declare	a	String
        line1	=	"Example1";		//	initializes	(really	it	instantiates)	the	String
        String	line2	=	"Example2"; //	declare	and	initializes	(instantiates)
        double	num;
        num	=	123.4567;
        System.out.println("\n\n\n");
        System.out.println("String	examples	using	a	field	width	of	20	and	printf:");
        System.out.printf("%20s",	line1);
        System.out.println("|");		//	this	is	so	you	can	see	the	end	of	the	line.
        System.out.printf("%-20s",	line1);
        System.out.println("|");
        System.out.println("\nString	examples	using	a	field	width	of	50	and	Format:");
        System.out.println(	Format.left(line2,	50)	+	"|"	);
        System.out.println(	Format.center(line2,	50)	+	"|"	);
        System.out.println(	Format.right(line2,	50)	+	"|"	);
//	printf	examples	for	decimals
        System.out.println("\nDecimal	examples	using	printf:");
        System.out.printf("A	number,	%6.2f	printed,	to	two	places.",	num);
        System.out.printf("\nA	number,	%6.3f	printed,	to	three	places.",	num);
//	Format	examples	for	decimals
        System.out.println("\n\nDecimal	examples	using	Format:");
        System.out.println("A	number,	"	+	Format.left(num,	6,	2)
                +	"	printed,	to	two	places.");
//	compare	the	spaces	in	the	String	and	the	field	width.		Then	notice	the	outputs
//	are	the	same	for	the	two	Format	examples
        System.out.println("A	number,"	+	Format.center(num,	8,	2)
                +	"printed,	to	two	places.\n");
//	Example	to	print	a	%	symbol	when	using	printf
//	Two	things	to	notice.		First,	for	now,	we	will	declare	and	initialize	a	variable
//	to	some	value	that	we	know	won't	be	possible,	then	we	will	set	the	variable
//	equal	to	some	work	(expression,	method,	etc.)
//	Second,	notice	the	difference	between	the	expression	and	the	String	literal
//	that	is	printed.
        int	answer	=	-1;
        answer	=	5*4%6;
        System.out.printf("5*4%%6	=	%15d",	answer);
        System.out.println("\n\n\n");
    }
}

