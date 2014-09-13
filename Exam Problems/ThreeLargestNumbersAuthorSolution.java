import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;


public class ThreeLargestNumbersAuthorSolution {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		input.nextLine();
		
		BigDecimal[] array = new BigDecimal[n];
 		
		for (int i = 0; i < array.length; i++) {
			String num = input.nextLine();
			array[i] = new BigDecimal(num);
		}
		Arrays.sort(array);
		int counter = 3;
		for (int i = array.length-1; i >= 0 && counter > 0; i--, counter--) {
			System.out.println(array[i].toPlainString());
		}
		
	
	}
}
