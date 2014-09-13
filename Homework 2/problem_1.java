import java.util.Scanner;


public class problem_1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();
		int end = scan.nextInt();

		for (int i = start; i <= end; i++) {
		     char[] arr = Integer.toString(i).toCharArray();
		     boolean symmetric = true;

		     for (int j = 0, m = 1; j < arr.length/2; j++, m++) {
		          if (symmetric) {
			      if (arr[j] != arr[arr.length-m]) {
				   symmetric = false;
			      }
			  }
		      }

		     if (symmetric) {
			 System.out.print(i + " ");
	            }
		}
	}

}
