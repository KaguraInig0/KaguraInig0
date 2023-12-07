import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
public class eightBallGUI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int num = 1;

        while(num == 1){
             int r = random.nextInt(5);
                if(r == 0){r += 1;};

             System.out.println(" ");
             String question = JOptionPane.showInputDialog("What is your question?");


            switch (r) {
                case 1:
                    JOptionPane.showMessageDialog(null, "As I see it, yes.");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Signs point to yes.");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Reply hazy, try again.");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Don't count on it.");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Outlook not so good.");
                    break;
                
            }

            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Press 1 to ask another question or 0 to Exit."));
        }

       
        
    }
    
}

