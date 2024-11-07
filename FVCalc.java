// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		//input inves money, number of years and rate of return
		int years =Integer.parseInt(args[2]);
		double currentvalue =Integer.parseInt(args[0]);
		double rate =Double.parseDouble(args[1]);
		//keep the value of the money in another variable , i am doing the same with the years and the rate.
		double futurevalue=currentvalue;
		int yearfirst=years;
		double Orate=rate;
	    rate=rate/100+1;
		//using while loop to getting the invest sum
		while (years>0) 
		{ 
			
			currentvalue= currentvalue*rate;
			years--;
		}
		//output the future money ater investing with the rate and the initial money value

		System.out.println(" After "+ yearfirst +" years"+" $"+(int)futurevalue+" save at "
		+Orate+"%"+" will yield "+"$"+ (int)currentvalue);
		
	}
}