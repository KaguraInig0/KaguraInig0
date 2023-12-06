import java.util.Scanner;

 public class DisplayTime
 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Prompt the user for input

        System.out.print("Enter an integer for seconds: ");

        int seconds = input.nextInt();

        int minutes = seconds / 60; // Find minutes in seconds

        int remainingSeconds = seconds % 60; // Seconds remaining

        System.out.println("*******************Outputs********************");


        System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds");
    }

/*

Name: Inigo Dela Vega

Date: 9/24/2023

Project: DisplayTime

Outputs:

C:\Users\Inigo\Desktop\Java\Project5a>java DisplayTime
Enter an integer for seconds: 500
*******************Outputs********************
500 seconds is 8 minutes and 20 seconds

C:\Users\Inigo\Desktop\Java\Project5a>

*/




 }
