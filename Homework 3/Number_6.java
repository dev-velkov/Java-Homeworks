import java.util.Scanner;


public class Number_6 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine().toLowerCase();
		String word = input.nextLine().toLowerCase();
		String[] str = sentence.split("\\W+");
		int counter = 0;

		for (int i = 0; i < str.length; i++) {
			if (word.equals(str[i])) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
