import java.util.Scanner;


public class Number_2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] arr = str.split(" ");

		System.out.print(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].equals(arr[i - 1])) {
				System.out.print(" " + arr[i]);
			} else {
				System.out.println();
				System.out.print(arr[i]);
			}
		}
	}

}
