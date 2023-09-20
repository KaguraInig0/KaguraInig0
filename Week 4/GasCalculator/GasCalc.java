import java.util.Scanner;
public class GasCalc
{
	public static void main(String[]args)
	{
	
	Scanner input = new Scanner(System.in);
	
	double tier1GasPrice = 6.99;
	
	int	tier1ID = 1;
	
 	double tier2GasPrice = 6.00;
	
	int	tier2ID = 2;
 	
	double tier3GasPrice = 5.99;
	
	int	tier3ID = 3;
	
	double ServiceCharge = 0.35;
	
	int pinData = 7599;
	
	int gallons;
	
	System.out.println("Welcome to XXX gas station!");
	
	System.out.println("********************output*************************");
	
	System.out.println("Enter your PIN number");
	
	int PIN = input.nextInt();
	
	if (PIN != pinData)
	{
		
	System.out.println("See Cashier for Assistance");	
	
	}
	
	else
	{
		
	System.out.println("What Tier of Gas would you like to purchase?");

	System.out.println("Tier 1 price: " + tier1GasPrice + " Tier 2 price: " + tier2GasPrice + " Tier 3 price: " + tier3GasPrice);
	
	System.out.println("Press 1, 2 ,or 3 to select an option");
	
	int tierSelection = input.nextInt();
		
		if (tierSelection == tier1ID || tierSelection == tier2ID || tierSelection == tier3ID)
		{
			
			System.out.println("How many Gallons do you need?");
			
			gallons = input.nextInt();
		}
		
		if (tierSelection == 1)
		{
			
			
			
			
			
		}
	
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


















}