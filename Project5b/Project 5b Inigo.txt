import java.util.Scanner;

 public class ComputeChange
 {

 public static void main(String[] args)

    {

      Scanner input = new Scanner(System.in);

      System.out.print("Enter an amount in double, for example 11.56: ");

      double amount = input.nextDouble();

      int remainingAmount = (int)(amount * 100);

      int numberOfOneDollars = remainingAmount / 100;

      remainingAmount = remainingAmount % 100;

      int numberOfQuarters = remainingAmount / 25;

      remainingAmount = remainingAmount % 25;

      int numberOfDimes = remainingAmount / 10;

      remainingAmount = remainingAmount % 10;

      int numberOfNickels = remainingAmount / 5;

      remainingAmount = remainingAmount % 5;

      int numberOfPennies = remainingAmount;

      System.out.println("*******************Outputs*********************");

      System.out.println("Your amount " + amount + " consists of");

      System.out.println(" " + numberOfOneDollars + " dollars");

      System.out.println(" " + numberOfQuarters + " quarters ");

      System.out.println(" " + numberOfDimes + " dimes");

      System.out.println(" " + numberOfNickels + " nickels");

      System.out.println(" " + numberOfPennies + " pennies");
    }

/*

Name: Inigo Dela Vega

Date: 9/24/2023

Project: ComputeChange

Outputs:

C:\Users\Inigo\Desktop\Java\Project5b>java ComputeChange
Enter an amount in double, for example 11.56: 11.56
*******************Outputs*********************
Your amount 11.56 consists of
 11 dollars
 2 quarters
 0 dimes
 1 nickels
 1 pennies

C:\Users\Inigo\Desktop\Java\Project5b>

*/








 }
