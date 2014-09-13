import java.util.Scanner;


public class PythaorenNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] nums = new int[n];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = input.nextInt();
		}
		int counter = 0;
		for (int a : nums) {
			for (int b : nums) {
				for (int c : nums) {
					if(a<=b && a*a + b*b == c*c){
						System.out.printf("%d*%d + %d*%d = %d*%d\n", a, a, b, b, c, c);
						counter++;
					}
					
				}
				
			}
			
		}
		if (counter == 0) {
			System.out.println("No");
		}
	}

}
