import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SumCards {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		String userInput = scan.nextLine();

		Pattern regex = Pattern.compile("[\\dAJQK]+");
		Matcher match = regex.matcher(userInput);

		ArrayList<Integer> cardsValues = new ArrayList<>();

		while (match.find()) {
			if (match.group().equals("J")) {
				cardsValues.add(12);
			}else if (match.group().equals("Q")) {
				cardsValues.add(13);
			}else if (match.group().equals("K")) {
				cardsValues.add(14);
			}else if (match.group().equals("A")) {
				cardsValues.add(15);
			}else {
				cardsValues.add(Integer.parseInt(match.group()));
			}
		}

		int weight = 0;
		int countCards = 1;
		for (int i = 0; i < cardsValues.size(); i+=countCards) {
			int tempWeight = 0;
			countCards = 1;
			for (int j = i+1; j < cardsValues.size(); j++) {
				if (cardsValues.get(i) == cardsValues.get(j)) {
					countCards++;
				}
				else {
					break;
				}
			}

			tempWeight = cardsValues.get(i) * countCards;
			if (countCards != 1) {
				tempWeight *= 2;
			}
			weight += tempWeight;

		}
		System.out.println(weight);
	}
}