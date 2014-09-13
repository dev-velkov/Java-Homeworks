import java.util.Scanner;


public class pr_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int start = input.nextInt();
		int end = input.nextInt();
		
		for (int i = start; i <= end; i++) {
			if(i<10){
				System.out.print(i + " ");
			}
			if(i<100){
				if((i/10)%10 == i%10){
					System.out.print(i + " ");
				}
			}
			if(i>100){
				if((i/100)%10 == i%10){
					System.out.print(i + " ");
				}
			}
		}
		
	}
}


