package secondReview;

import java.util.Scanner;

/**
 * Created by jianbojia on 12/4/16.
 */



public class Q2 {
    static int number;
    static double cost;


    public static void main(String[] args) {

        // call the method called requestInput() with appropriate return types / parameters
        requestInput();

        // call the method called processInput() with appropriate return types / parameters
        processInput();

    }

    public static int requestInput() {
        Scanner tr = new Scanner(System.in);
        System.out.println("Please indicate amount of boxes you would like to order.");
        number = tr.nextInt();
        return number;

    }

    public static void processInput(){

        // if input is less then 1, print an error message - that input is not appropriate
        if (number < 1) {
            System.out.println("that input is not appropriate");
        } else {       // if input is less then 10, calculate cost as being $5 per box times number of boxes
            if (number <= 10) {
                cost = 5.00 * number;
            } else if (number > 10) {  // else if input is more than 10, calcualte cost as being $3.50 per box times number of boxes
                cost = 3.50 * number;
            }
            // print cost to terminal window
            System.out.println("cost = " + "$" + cost);
        }
    }

}
