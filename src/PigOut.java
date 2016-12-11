import java.util.Scanner;

/**
 * Created by jianbojia on 12/10/16.
 */
public class PigOut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("What food would you like to eat? (Type \"I\'m full \" to ternminate)");

        while (true) {
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("I'm full")) {
                break;
            }
            display(input);
        }
    }

    private static void display(String food) {

        int noms = food.length() - 2;

        int count = 0;

        for (int i = 0; i < noms; i++) {
            System.out.print("Nom" + " ");
            count++;

            if (count % 5 == 0 || count == noms) {
                System.out.print("burp\n");
            }
        }

        System.out.println("Nom Nom");

    }
}
