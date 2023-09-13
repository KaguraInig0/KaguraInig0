import java.util.Scanner;
public class totalSale
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double purchase;
		
		double stateTax;
		
		double countyTax;
		
		double totalTax;
		
		double totalSale;
		
		// constants
		
		double stateTaxRate = 0.04;
		
		double countyTaxRate = 0.02;
		
		System.out.println("Please enter the purcahse amount:");
		
		purchase = input.nextDouble();
		
		stateTax = stateTaxRate * purchase;
		
		countyTax = countyTaxRate * purchase;
		
		totalTax = stateTax + countyTax;
		
		totalSale = purchase + totalTax;
		
		System.out.println("***********output************");
		
		System.out.println("The Purchase amount is: $" + purchase);
		
		System.out.println("The State tax is: $" + stateTax);
		
		System.out.println("The County tax is: $" + countyTax);
		
		System.out.println("The Total tax is: $" + totalTax);
		
		System.out.println("The Total Sale is: $" + totalSale);
	
	
	
	
	
	
	
	
	}









}