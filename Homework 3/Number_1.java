import java.util.Arrays;
import java.util.Scanner;


public class Number_1 {
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.nextLine();
		int[] arrNums = new int[n];
		for (int i = 0; i < arrNums.length; i++) {
			arrNums[i] = input.nextInt();
		}
		Arrays.sort(arrNums);
		for (int j = 0; j < arrNums.length - 1; j++) {
			System.out.print(arrNums[j] + " ");
		}
		System.out.print(arrNums[n - 1]);
	}
}
