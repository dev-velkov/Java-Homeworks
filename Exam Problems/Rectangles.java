import java.util.Scanner;

public class Rectangles {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String rectangles = input.nextLine();
		rectangles = rectangles.replace("[", "");
		rectangles = rectangles.replace(" ", "");
		String[] rects = rectangles.split("]");
		
		int max = Integer.MIN_VALUE;
		
		int[] sequence = new int[rects.length];
		
		int currentSequence = 0;
		
		
		for (int i = 0; i < rects.length; i++) {
			String currentRectangle = rects[i];
			String[] area = currentRectangle.split("x");
			int sideA = Integer.parseInt(area[0]);
			int sideB = Integer.parseInt(area[1]);
			
			sequence[i] = sideA * sideB;
		}
		
		for (int i = 0; i < sequence.length-2; i++) {
			
			currentSequence = sequence[i] + sequence [i+1] + sequence[i+2];
			if(currentSequence > max){
				max = currentSequence;
			}
			else{
				currentSequence = 0;
			}
				
		}
		
		System.out.println(max);
		
		
		
	}

}
