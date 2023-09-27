import java.util.Scanner;

public class Loop
{
		public static void header()
		{
				System.out.println("***********************************************************");
				
				System.out.println("*                                                         *");
				
				System.out.println("*      Enter 1 to Add two numbers:                        *");
				
				System.out.println("*      Enter 2 to Subtract two numbers:                   *");
				
				System.out.println("*      Enter 3 to Multiply two numbers:                   *");
				
				System.out.println("*      Enter 4 to Divide two numbers:                     *");
				
				System.out.println("*      Enter 5 to get the Remainder of two numbers:       *");
				
				System.out.println("*                                                         *");
				
				System.out.println("***********************************************************");
				
		}

		public static void sum(int num1, int num2)
		{
				Scanner input = new Scanner(System.in);
				
				double Result = 0;
				
				System.out.println("Enter 1st number: "); 
				
				num1 = input.nextInt();
				
				System.out.println("Enter 2nd number: "); 
				
				num2 = input.nextInt();
				
				Result = num1 + num2;
				
				System.out.println("The sum is: " + Result);
				
		}

		public static void difference(int num1, int num2)
		{
				Scanner input = new Scanner(System.in);
				
				double Result = 0;
				
				System.out.println("Enter 1st number: "); 
				
				num1 = input.nextInt();
				
				System.out.println("Enter 2nd number: "); 
				
				num2 = input.nextInt();
				
				Result = num1 - num2;
				
				System.out.println("The difference is: " + Result);
				
		}
		
		public static void product(int num1, int num2)
		{
				Scanner input = new Scanner(System.in);
				
				double Result = 0;
				
				System.out.println("Enter 1st number: "); 
				
				num1 = input.nextInt();
				
				System.out.println("Enter 2nd number: "); 
				
				num2 = input.nextInt();
				
				Result = num1 * num2;
				
				System.out.println("The product is: " + Result);
				
		}
		
		public static void quotient(int num1, int num2)
		{
				Scanner input = new Scanner(System.in);
				
				double Result = 0;
				
								
					System.out.println("Enter 1st number: "); 
				
					num1 = input.nextInt();
				
					System.out.println("Enter 2nd number: "); 
				
					num2 = input.nextInt();
				
				
				if(num2 == 0)
				{
					
					System.out.println("Cannot divide by 0");
					
				}
				else 
				{	
				
					Result = num1 / num2;
				
					System.out.println("The quotient is: " + Result);

				
				}
				
		}
		
		public static void remainder(int num1, int num2)
		{
				Scanner input = new Scanner(System.in);
				
				double Result = 0;
				
				System.out.println("Enter 1st number: "); 
				
				num1 = input.nextInt();
				
				System.out.println("Enter 2nd number: "); 
				
				num2 = input.nextInt();
				
				Result = num1 % num2;
				
				System.out.println("The remainder is: " + Result);
				
		}
		

		//Main function
		public static void main(String [] args)
		{
			Scanner input = new Scanner(System.in);
			
			header();
			
			System.out.println("Enter 1, 2, 3, 4, 5");
			
			int	number;
			
			int num1 = 0;
			
			int num2 = 0;
			
			number = input.nextInt();
			
			switch(number)
			{
				
				case 1:
				
				System.out.println("The sum function: ");
				
				sum(num1,num2);
				
				System.out.println();
				
				break;
				
				case 2:
				
				System.out.println("The difference function: ");
				
				difference(num1,num2);
				
				System.out.println();
				
				break;
				
				case 3:
				
				System.out.println("The product function: ");
				
				product(num1,num2);
				
				System.out.println();
				
				break;
				
				case 4:
				
				System.out.println("The quotient function: ");
				
				quotient(num1,num2);
				
				System.out.println();
				
				break;
				
				case 5:
				
				System.out.println("The remainder function: ");
				
				remainder(num1,num2);
				
				System.out.println();
				
				break;
				
				
				
				
				
				
				
				
				
				
				default: System.out.println("Invalid selection");
			}
			
			
			
			
			
			
			
			
			
			
			
		}
























}
