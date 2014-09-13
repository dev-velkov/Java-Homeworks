import java.util.Scanner;


public class Video_Duration {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int totalMinutes = 0;
		int totalHours = 0;
		
		while (true){
			String videoDuration = input.nextLine();
			if (videoDuration.equals("End")){
				break;
			}
			String[] video = videoDuration.split(":");
			int hours = Integer.parseInt(video[0]);
			int minutes = Integer.parseInt(video[1]);
			
			totalMinutes += minutes;
			totalHours += hours;
		}
		
		totalHours += (totalMinutes / 60);
		totalMinutes = totalMinutes % 60;
		
		System.out.printf(totalHours + ":" + "%02d\n", totalMinutes);
		
	}

}
