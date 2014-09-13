import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Three_largest_numbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		
		ArrayList<BigDecimal> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			list.add(input.nextBigDecimal());
		}
		
		if(n == 1){
			System.out.println(Collections.max(list));
		}
		if(n==2){
			for (int i = 0; i < 2; i++) {
				System.out.println(Collections.max(list).toPlainString());
				list.remove(Collections.max(list));
			}
			
		}
		
		if(n >= 3){
			for (int i = 0; i < 3; i++) {
				System.out.println(Collections.max(list).toPlainString());
				list.remove(Collections.max(list));
			}
		}
	}
}
