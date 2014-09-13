import java.util.Scanner;


public class Number_7 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine().toLowerCase();
		String word = input.nextLine().toLowerCase();
		int counter = 0;

		for (int i = 0; i <= sentence.length() - word.length(); i++) {
			if (sentence.substring(0 + i, word.length() + i).contains(word)) {
				counter++;
			}
		}
		System.out.println(counter);
	}

}
