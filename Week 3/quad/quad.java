import java.util.Scanner;
public class quad
{
	public static void main(String[] args)
	{
		
		Scanner scan = new Scanner(System.in);
		
		double x1;
		
		double x2;
		
		double d,d1;
		
		int a,b,c;
		
		System.out.println("Please enter a value for a:");
		
		a = scan.nextInt();
		
		System.out.println("Please enter a value for b:");
		
		b = scan.nextInt();
		
		System.out.println("Please enter a value for c:");
		
		c = scan.nextInt();
		
		d = (b * b - 4 * a * c);
		
		d1 = Math.sqrt(d);
		
		x1 = (-b + d1) / (2 * a);
		
		x2 = (-b - d1) / (2 * a);
		
		System.out.println("*************outputs*************");
		
		if(d>0)
		{
			
			System.out.println("There are two unrepeated roots:");
			
		}
		else
			if(d == 0)
			{
				
				System.out.println("There are two repeated roots:");
				
			}
			else
			{
				
				System.out.println("There are two complex roots:");
				
			}
		
		System.out.println("The value for a is:" + a);
		
		System.out.println("The value for b is:" + b);
		
		System.out.println("The value for c is:" + c);
		
		System.out.println("The X1 value is:" + x1);
		
		System.out.println("The X2 value is:" + x2);
		
		
		/*
		
		Name : 
		
		Project Name:
		
		Date: 9/12/23
		
		Please enter a value for a:
1
Please enter a value for b:
6
Please enter a value for c:
8
*************outputs*************
There are two unrepeated roots:
The value for a is:1
The value for b is:6
The value for c is:8
The X1 value is:-2.0
The X2 value is:-4.0

CUsers900589666DesktopInigoWeek 3quadjava quad
Please enter a value for a
1
Please enter a value for b
6
Please enter a value for c
8
outputs
There are two unrepeated roots
The value for a is1
The value for b is6
The value for c is8
The X1 value is-2.0
The X2 value is-4.0

CUsers900589666DesktopInigoWeek 3quadjava quad
Please enter a value for a
1
Please enter a value for b
1
Please enter a value for c
1
outputs
There are two complex roots
The value for a is1
The value for b is1
The value for c is1
The X1 value isNaN
The X2 value isNaN

CUsers900589666DesktopInigoWeek 3quadjava quad
Please enter a value for a
1
Please enter a value for b
2
Please enter a value for c
1
outputs
There are two repeated roots
The value for a is1
The value for b is2
The value for c is1
The X1 value is-1.0
The X2 value is-1.0
		
		*/
		
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	














}