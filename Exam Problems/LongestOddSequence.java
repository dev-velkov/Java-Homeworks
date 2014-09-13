import java.util.Scanner;


public class LongestOddSequence {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String inputLine = input.nextLine();
		String[] numbers = inputLine.split("[ ()]+");
		int[] nums = new int[numbers.length-1];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(numbers[i+1]);
		}
		int max = Integer.MIN_VALUE;
		int counter = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 != 0 && (nums[i]+1) % 2 == 0){
				counter+=2;
				if(counter > max){
					max=counter;
				}
			}
			else{
				counter=0;
			}
			
		}
		
		System.out.println(max);
	}

}
