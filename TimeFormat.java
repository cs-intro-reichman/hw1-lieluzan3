
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		int zeronum=0;
		//check situation where hours are bigger than 12
		if(hours>12){
		
			hours=hours-12;
			//separete situations where the input is a single number in pm
			
			 if(minutes<10){
				System.out.println(hours+":"+zeronum+""+minutes+" PM");
			}
			

			else

				System.out.println(hours+":"+minutes+" PM");
		
		}
		//check situation when the hours are 12 exactly
		else if(hours==12){
			
			if(minutes<10)

				System.out.println(hours+":"+zeronum+""+minutes+" PM");
			else

				System.out.println(hours+":"+minutes+" PM");
		} 
		//check if the time is 12 am
		else if(hours==00){
			hours=12;
			if(minutes<10){
				System.out.println(hours+":"+zeronum+minutes+" AM");
			}
			else
			System.out.println(hours+":"+minutes+" AM");
		}
		//check situation when the minutes under 10 both
		else if(minutes<10){

			System.out.println(hours+ ":"+zeronum+""+minutes+" AM");

		}
		
		 
		else
			
        // Replace this comment with the rest of your code
		System.out.println(hours+ ":"+minutes+" AM");
	}
}