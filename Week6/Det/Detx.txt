import java.util.Scanner;
public class Det
{
	public static void main(String [] args)
	{
	
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a, b, c, d, e, f: ");
		
		double a = s.nextDouble();
		
		double b = s.nextDouble();
		
		double c = s.nextDouble();
		
		double d = s.nextDouble();
		
		double e = s.nextDouble();
		
		double f = s.nextDouble();
		
		double detA = (a * e - d * b);
		
		System.out.println(detA);
		
		if (detA == 0)
		{
			System.out.println("This equation has no solutions: ");
		}
		else
		{
			double X = (c * e - f * b)/detA;
			
			double Y = (a * f - d * c)/detA;
			
			System.out.println(" X is : " + X + " and " + " Y is : " + Y );
			
			
		}

		
		


	}

/*

Name: Inigo Dela Vega

Project Name: Solving X and Y

Date: Oct 3rd, 2023

C:\Users\900589666\Desktop\Inigo\Week6\Det>javac Det.java

C:\Users\900589666\Desktop\Inigo\Week6\Det>java Det
Enter a, b, c, d, e, f:
2
-1
18
3
1
2
5.0
 X is : 4.0 and  Y is : -10.0

C:\Users\900589666\Desktop\Inigo\Week6\Det>

*/
















}
