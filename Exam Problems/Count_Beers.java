import java.util.Scanner;


public class Count_Beers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int totalBeers = 0;
		
		while (true){
			String orderLine = input.nextLine();
			if (orderLine.equals("End")) {
				break;
			}
			String[] arr = orderLine.split(" ");
			int beers = Integer.parseInt(arr[0]);
			if(arr[1].equals("stacks")){
				beers *= 20;
			}
			totalBeers += beers;
		}
		
		int stacks = totalBeers / 20;
		int beersCount = totalBeers % 20;
		
		System.out.printf("%d stacks + %d beers", stacks, beersCount);
	}

}
