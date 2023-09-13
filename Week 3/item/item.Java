import java.util.Scanner;
public class item
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double item1;
		
		double item2;
		
		double item3;
		
		double item4;
		
		double item5;
		
		double subTotal;
		
		double tax;
		
		double total;
		
		double taxRate = 0.06;
		
		
		System.out.println("Enter price of item #1");
		
		item1 = input.nextDouble();
		
		System.out.println("Enter price of item #2");
		
		item2 = input.nextDouble();
		
		System.out.println("Enter price of item #3");
		
		item3 = input.nextDouble();
		
		System.out.println("Enter price of item #4");
		
		item4 = input.nextDouble();
		
		System.out.println("Enter price of item #5");
		
		item5 = input.nextDouble();
		
		
		subTotal = item1 + item2 + item3 + item4 + item5;
		
		tax = subTotal * taxRate;
		
		total = subTotal + tax;
		
		System.out.println("***********output************");
		
		System.out.println("Subtotal: $" + subTotal);
		
		System.out.println("Sales Tax: $" + tax);
		
		System.out.println("Total: $" + total);
	
	
	}







}