
public class Bill3
 {
	public static void main(String[] args)
    {
		// input of three names and full price of bill
		String name1=args[0];
		String name2=args[1];
		String name3=args[2];

		int Fullprice = Integer.parseInt(args[3]);
		//divides the value by 3
        double price =(double)Fullprice/3;
		//round up the value
		price=Math.ceil(price);
		
	//output the value with the names
		System.out.println("Dear "+name3+", "+ name2 +","+" and "+ name1+": "+"pay "+price+" Shekels each");			
				
		
		   
	}
  }
