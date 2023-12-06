import java.util.Random;

public class Dice {

    public static void main(String[]args){
        
        Random random = new Random();

        int Roll = random.nextInt(6) + 1;
        
        System.out.println("You rolled a, " + Roll);
    }
}
