import java.util.Scanner;


public class SumTwoNumbers {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		int firstNumber = input.nextInt();
		int secondNumber = input.nextInt();
		int result = firstNumber + secondNumber;
		
		System.out.println(result);
	}

}
