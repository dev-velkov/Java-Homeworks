import java.util.Scanner;


public class Stuck_Numbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String inputLine = input.nextLine();
		String[] nums = inputLine.split(" ");
		
		int[] numbers = new int[n];
		
		for (int i = 0; i < n; i++) {
			numbers[i] = Integer.parseInt(nums[i]);
		}
		for (int a = 0; a < n; a++) {
			for (int b = 0; b < n; b++) {
				for (int c = 0; c < n; c++) {
					for (int d = 0; d < n; d++) {
						if(numbers[a] != numbers[b]&&
								numbers[a] != numbers[c]&&
								numbers[a] != numbers[d]&&
								numbers[b] != numbers[c]&&
								numbers[b] != numbers[d]&&
								numbers[c] != numbers[d]){
							if((""+numbers[a]+numbers[b]).equals(""+numbers[c]+numbers[d]));{
								System.out.printf("%d|%d == %d|%d", numbers[a], numbers[b], numbers[c], numbers[d]);
							}
						}
							
					}
				}
			}
		}
		
	
	}

}
