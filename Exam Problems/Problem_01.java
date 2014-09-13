import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Problem_01 {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	String userInput = input.nextLine();
	
	Pattern regex = Pattern.compile("[A-z]+");
	Matcher match = regex.matcher(userInput);
	
	ArrayList<String> words = new ArrayList<>();
	
	while(match.find()){
		words.add(match.group());
	}
	int counter = 0;
	String current = "";
	for (int a = 0; a < words.size(); a++) {
		for (int b = 0; b < words.size(); b++) {
			for (int c = 0; c < words.size(); c++) {
				if((words.get(a) + words.get(b)).equals(words.get(c))){
					String output = (words.get(a) + "|" + words.get(b) + "=" + words.get(c));
					if(current.equals(output)){
						
					}
					else{
						System.out.println(output);
					}
					
					current = output;
					
					counter++;
				}
			}
			
		}
		
	}
	
	
	if(counter == 0){
		System.out.println("No");
	}
	}

}
