// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// get input number for a limit value and random 3 numbers between 0 and the input
		int number=Integer.parseInt(args[0]);
		number=number+1;
		double num1=Math.random()*number;
		double num2=Math.random()*number;
		double num3=Math.random()*number;
		//save the values in another variables
		int num4=(int)num1;
		int num5=(int)num2;
		int num6=(int)num3;
		//check which number is the min, max and for the middle number i need to subtract the min and the max 
		//from the sum of the numbers.
		int min= Math.min(num4,num5);
		min=Math.min(min,num6);
		int max=Math.max(num4,num5);
		max=Math.max(max,num6);
		int mid= num4+num5+num6-min-max;
		
		System.out.println(min+" "+mid+" "+max);
	
		
	}
}
