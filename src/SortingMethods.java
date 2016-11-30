import java.util.Random;

public class  SortingMethods
{

	private int[] arr;

	public SortingMethods(int size) {
		arr = new int[size];
	}

	public void generate(int bound) {
		Random r = new Random(System.currentTimeMillis());

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(bound);
		}
	}

	public void display() {
		System.out.print("Arr= ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void bubbleSort() {
		int compareTimes = 0;
		int exchangeTimes = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				compareTimes++;
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					exchangeTimes++;
				}
			}
		}

		System.out.println("\nBubble sort run " + compareTimes + " compare times");
		System.out.println("And run " + exchangeTimes + " exchange times\n");
	}

	public void selectSort() {
		int compareTimes = 0;
		int exchangeTimes = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			int j = i + 1;
			for (; j < arr.length; j++) {
				compareTimes++;
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
			exchangeTimes++;

		}
		System.out.println("\nSelect sort run " + compareTimes + " compare times");
		System.out.println("And run " + exchangeTimes + " exchange times\n");

	}

	public void insertSort() {
		int compareTimes = 0;
		int exchangeTimes = 0;

		for (int i = 1; i < arr.length; i++) {
			int j = i;
			int temp = arr[j];

			while (j > 0 && temp < arr[j - 1]) {
				compareTimes++;
				arr[j] = arr[j - 1];
				exchangeTimes++;
				j--;
			}

			arr[j] = temp;
			exchangeTimes++;

		}

		System.out.println("\nInsert sort run " + compareTimes + " compare times");
		System.out.println("And run " + exchangeTimes + " exchange times\n");
	}
	
	public void mergeSort() {
		
	}
	
}
