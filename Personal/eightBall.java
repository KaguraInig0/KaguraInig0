import java.util.Scanner;
import java.util.Random;
public class eightBall {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        
    
        int num = 1;

        while(num == 1){
             int r = random.nextInt(5);
                if(r == 0){r += 1;};

             System.out.println(" ");
             System.out.println("Enter your quesstion?");
                input.next();


            switch (r) {
                case 1:
                    System.out.println(" ");
                    System.out.println("As I see it, yes.");
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.println("Signs point to yes.");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println(" ");
                    System.out.println("Reply hazy, try again.");
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println(" ");
                    System.out.println("Don't count on it.");
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println(" ");
                    System.out.println("Outlook not so good.");
                    System.out.println(" ");
                    break;
                
            }

        System.out.println("Press 1 to ask another question, or 0 to exit.");
        System.out.println(" ");
        num = input.nextInt();
        }

       
        
    }
    
}
