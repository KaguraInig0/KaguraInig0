import java.util.Scanner;	
public class trip
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("This is the 1st package:");
		System.out.println("*******************************************");
		int party = 0;
		double discountCharges = 0.0;
		double totalCharges = 0.0;
		double baseChargeRate = 350.0;
		double trainingChargesRate = 100.0;
		double discountRate = .10;
		double depositRate = .50;
		double totalRentalCharges = 0.0;
 		double totalRentalTents= 40.0; //group of 4
		int days = 0;
		int	numberOfTents = 0;
		double baseCharges = 0.0;
		double trainingCharges = 0.0;
		int nights = days-1;
		System.out.println("How large is your party?");
		party = input.nextInt();
		//calculating the base cahrges
		baseCharges = baseChargeRate*party;
		totalCharges = baseCharges;
		//test for discountRate
			if(party>=5)
			{
				discountCharges = (discountRate * baseCharges);
				totalCharges = (totalCharges - discountCharges);
				
				
				
			}
	
	
	
		System.out.println("********************************* outputs *********************************");
		System.out.println("The party size is:" + party + " People");
		System.out.println("The base charges are: $" + baseCharges);
		System.out.println("The Discount Charges are: $" + discountCharges);
		
		
		
		
		System.out.println("The Total Charges are: $" + totalCharges);
	}









}