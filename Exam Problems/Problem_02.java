import java.util.Scanner;

public class Problem_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int centerX = input.nextInt();
		int centerY = input.nextInt();
		int r = input.nextInt();
		int n = input.nextInt();
		
		int[] dartCoords = new int[n*2];
		
		for (int i = 0; i < n*2; i++) {
			dartCoords[i] = input.nextInt();
		}
		
		
		
	}

}
