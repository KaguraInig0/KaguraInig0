import java.util.Scanner;
public class Gpm
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
	
		double Miles;
	
		double Gallons;
	
		double Mpg;
			
		System.out.println("Enter the miles driven: ");
			
		Miles = input.nextDouble();
			
		System.out.println("Enter the gallons of feul used: ");
			
		Gallons = input.nextDouble();
			
		Mpg = Miles / Gallons;
		

		System.out.println("************************Outputs***********************");
		
		System.out.println("The number of gallons are: " + Gallons);

		System.out.println("The number of miles are: " + Miles);
		
		System.out.println("The number of miles per gallon are: " + Mpg);
		
		System.out.println("You drove, " + Mpg + " miles per gallon."); 
	
	}		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	





























