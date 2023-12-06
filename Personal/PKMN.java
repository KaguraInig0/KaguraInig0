import java.util.Scanner;
import java.lang.*;


public class PKMN {
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        String ToPrint = "";
        int action = 0;
        int userPKMN = 0;
        
        String[] PkmnName = {"Bulbasaur", "Squirtle" ,"Charmander"};
        int[] PkmnId = {1 ,2 ,3};
        
        writer("Welcome to The Pokemon Battle Simulator!");
        writer("What's your name?");
       
        while(true){

        ToPrint = input.next();

        if(ToPrint.matches(".*\\d.*")){
          writer("Please enter a name!");
        } else {
          break;
        }
      }
        
        writer("Hi " + ToPrint);
        writer("Choose a pokemon! 1 for Bulbasaur, 2 for Squirtle , and 3 for Charmander.");
        

  }

  public static void writer(String ToPrint){

     for (int i = 0; i < ToPrint.length(); i++){
          
          try {
             Thread.sleep(50);
          } catch (Exception e) {
            System.out.println("no");
          }
            System.out.print(ToPrint.charAt(i));
        }
        System.out.println();
  }
}
