import java.util.Scanner;

/**
 * Created by jianbojia on 11/30/16.
 */
public class WordsSortingSolution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of words");
        int n = 1;//sc.nextInt();

        String[] words = new String[n];
        String[] rsts = new String[n];

        // collect information
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a word");
            words[i] = "9253106478";//sc.next();
            rsts[i] = sortAndSubstringLastThreeChars(words[i]);

        }

        // display the orginal word and results after sorting and substring last three characters

        for (int i = 0; i < n ; i++) {
            System.out.println("Original: " + words[i] + ",\t" + "result: " +rsts[i]);
        }

    }

    private static String sortAndSubstringLastThreeChars(String word) {
        int len = word.length();
        char[] chars = new char[len];

        chars = word.toCharArray();

//        Arrays.sort(chars);
//        bubbleSort(chars);
//        selectSort(chars);
        insertSort(chars);

        String rst = new String(chars);
        if(len <= 3){
            return rst;
        }else {
            return rst.substring(len - 3, len);
        }

    }

    public static void bubbleSort(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    public static void selectSort(char[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            int j = i + 1;
            for (; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            char temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;

        }

    }

    public static void insertSort(char[] arr)  {

        for (int i = 1; i < arr.length; i++) {
            int j = i;
            char temp = arr[j];

            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }

            arr[j] = temp;

        }

    }

}
