import java.util.Scanner;


public class Number_3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String[] arr = str.split(" ");
		int counterTemp = 1;
		int counter = 1;
		int positionOfWord = 0; 
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].equals(arr[i - 1])) {
				counterTemp++;
			} else {
				counterTemp = 1;
			}
			if (counterTemp > counter) {
				counter = counterTemp;
				positionOfWord = i;
			}
		}
		for (int j = 0; j < counter - 1; j++) {
			System.out.print(arr[positionOfWord] + " ");
		}
		System.out.println(arr[positionOfWord]);
	}

}
