import java.util.Scanner;

public class Problem_04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();
		
		String[] cards = userInput.split(", ");
		
		int counter = 0;
		
		for (int a = 0; a < cards.length; a++) {
				for (int b = 0; b < cards.length; b++) {
					for (int c = 0; c < cards.length; c++) {
						for (int d = 0; d < cards.length; d++) {
							for (int e = 0; e < cards.length; e++) {
								if(cards[a].equals("2S") && 
										cards[b].equals("3S") &&
										cards[c].equals("4S") &&
										cards[d].equals("5S") &&
										cards[e].equals("6S")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("3S") && 
										cards[b].equals("4S") &&
										cards[c].equals("5S") &&
										cards[d].equals("6S") &&
										cards[e].equals("7S")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("4S") && 
										cards[b].equals("5S") &&
										cards[c].equals("6S") &&
										cards[d].equals("7S") &&
										cards[e].equals("8S")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("5S") && 
										cards[b].equals("6S") &&
										cards[c].equals("7S") &&
										cards[d].equals("8S") &&
										cards[e].equals("9S")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("6S") && 
										cards[b].equals("7S") &&
										cards[c].equals("8S") &&
										cards[d].equals("9S") &&
										cards[e].equals("10S")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("7S") && 
										cards[b].equals("8S") &&
										cards[c].equals("9S") &&
										cards[d].equals("10S") &&
										cards[e].equals("JS")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("8S") && 
										cards[b].equals("9S") &&
										cards[c].equals("10S") &&
										cards[d].equals("JS") &&
										cards[e].equals("QS")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("9S") && 
										cards[b].equals("10S") &&
										cards[c].equals("JS") &&
										cards[d].equals("QS") &&
										cards[e].equals("KS")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("10S") && 
										cards[b].equals("JS") &&
										cards[c].equals("QS") &&
										cards[d].equals("KS") &&
										cards[e].equals("AS")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
					// SPADES	
					// SPADES
					// SPADES
					// SPADES
								if(cards[a].equals("2H") && 
										cards[b].equals("3H") &&
										cards[c].equals("4H") &&
										cards[d].equals("5H") &&
										cards[e].equals("6H")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("3H") && 
										cards[b].equals("4H") &&
										cards[c].equals("5H") &&
										cards[d].equals("6H") &&
										cards[e].equals("7H")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("4H") && 
										cards[b].equals("5H") &&
										cards[c].equals("6H") &&
										cards[d].equals("7H") &&
										cards[e].equals("8H")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("5H") && 
										cards[b].equals("6H") &&
										cards[c].equals("7H") &&
										cards[d].equals("8H") &&
										cards[e].equals("9H")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("6H") && 
										cards[b].equals("7H") &&
										cards[c].equals("8H") &&
										cards[d].equals("9H") &&
										cards[e].equals("10H")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("7H") && 
										cards[b].equals("8H") &&
										cards[c].equals("9H") &&
										cards[d].equals("10H") &&
										cards[e].equals("JH")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("8H") && 
										cards[b].equals("9H") &&
										cards[c].equals("10H") &&
										cards[d].equals("JH") &&
										cards[e].equals("QH")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("9H") && 
										cards[b].equals("10H") &&
										cards[c].equals("JH") &&
										cards[d].equals("QH") &&
										cards[e].equals("KH")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("10H") && 
										cards[b].equals("JH") &&
										cards[c].equals("QH") &&
										cards[d].equals("KH") &&
										cards[e].equals("AH")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								//HEARTS
								//HEARTS
								//HEARTS
								if(cards[a].equals("2D") && 
										cards[b].equals("3D") &&
										cards[c].equals("4D") &&
										cards[d].equals("5D") &&
										cards[e].equals("6D")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("3D") && 
										cards[b].equals("4D") &&
										cards[c].equals("5D") &&
										cards[d].equals("6D") &&
										cards[e].equals("7D")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("4D") && 
										cards[b].equals("5D") &&
										cards[c].equals("6D") &&
										cards[d].equals("7D") &&
										cards[e].equals("8D")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("5D") && 
										cards[b].equals("6D") &&
										cards[c].equals("7D") &&
										cards[d].equals("8D") &&
										cards[e].equals("9D")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("6D") && 
										cards[b].equals("7D") &&
										cards[c].equals("8D") &&
										cards[d].equals("9D") &&
										cards[e].equals("10D")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("7D") && 
										cards[b].equals("8D") &&
										cards[c].equals("9D") &&
										cards[d].equals("10D") &&
										cards[e].equals("JD")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("8D") && 
										cards[b].equals("9D") &&
										cards[c].equals("10D") &&
										cards[d].equals("JD") &&
										cards[e].equals("QD")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("9D") && 
										cards[b].equals("10D") &&
										cards[c].equals("JD") &&
										cards[d].equals("QD") &&
										cards[e].equals("KD")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("10D") && 
										cards[b].equals("JD") &&
										cards[c].equals("QD") &&
										cards[d].equals("KD") &&
										cards[e].equals("AD")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								//DIAMONDS
								//DIAMONDS
								//DIAMONDS
								if(cards[a].equals("2C") && 
										cards[b].equals("3C") &&
										cards[c].equals("4C") &&
										cards[d].equals("5C") &&
										cards[e].equals("6C")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("3C") && 
										cards[b].equals("4C") &&
										cards[c].equals("5C") &&
										cards[d].equals("6C") &&
										cards[e].equals("7C")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("4C") && 
										cards[b].equals("5C") &&
										cards[c].equals("6C") &&
										cards[d].equals("7C") &&
										cards[e].equals("8C")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("5C") && 
										cards[b].equals("6C") &&
										cards[c].equals("7C") &&
										cards[d].equals("8C") &&
										cards[e].equals("9C")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("6C") && 
										cards[b].equals("7C") &&
										cards[c].equals("8C") &&
										cards[d].equals("9C") &&
										cards[e].equals("10C")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("7C") && 
										cards[b].equals("8C") &&
										cards[c].equals("9C") &&
										cards[d].equals("10C") &&
										cards[e].equals("JC")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("8C") && 
										cards[b].equals("9C") &&
										cards[c].equals("10C") &&
										cards[d].equals("JC") &&
										cards[e].equals("QC")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("9C") && 
										cards[b].equals("10C") &&
										cards[c].equals("JC") &&
										cards[d].equals("QC") &&
										cards[e].equals("KC")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
								}
								if(cards[a].equals("10C") && 
										cards[b].equals("JC") &&
										cards[c].equals("QC") &&
										cards[d].equals("KC") &&
										cards[e].equals("AC")){
									System.out.println("["+ cards[a] + ", "
														+ cards[b] + ", "
														+ cards[c] + ", "
														+ cards[d] + ", "
														+ cards[e] + "]");
									counter++;
							}
						}
					}
				}
			}
		}
		if(counter == 0){
			System.out.println("No Straight Flushes");
		}
	}
}
