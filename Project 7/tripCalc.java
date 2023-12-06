import java.util.Scanner;
public class tripCalc
{
    public static void header()
    {
            System.out.println("***********************************************************");

            System.out.println("*                                                         *");

            System.out.println("*      Enter 1 for Devil's Courthouse Adventure Weekend:  *");

            System.out.println("*             Enter 2 for Scuba Bahama:                   *");

            System.out.println("*        Enter 3 for Sky Dive Colorado:                   *");

            System.out.println("*           Enter 4 for Barron Cliff Spelunk:             *");

            System.out.println("*                                                         *");

            System.out.println("***********************************************************");


    }

    public static void package1()
    {

        Scanner input = new Scanner(System.in);

        System.out.println("This is the 1st package:");
		    System.out.println("*******************************************");

        int party = 0;
        double discountCharges = 0.0;
        double totalCharges = 0.0;
        double baseChargeRate = 350.0;
        double trainingChargesRate = 100.0;
        double discountRate = .10;
        double depositRate = .50;
        double totalRentalCharges = 0.0;
        double totalRentalTentRate= 40.0; //group of 4
        int days = 0;
        int	numberOfTents = 0;
        double baseCharges = 0.0;
        double trainingCharges = 0.0;

        System.out.println("How large is your party?");
        party = input.nextInt();

        //calculating the base cahrges
        baseCharges = baseChargeRate*party;
        totalCharges = baseCharges;

        if(party>=5){
				      double deposit = (baseCharges * depositRate);
              baseCharges = baseCharges - deposit;

              System.out.println("How many days are you staying?");
              days = input.nextInt();
              int nights = (days - 1);

              System.out.println("How many need training?");
              int needTraining = input.nextInt();

              System.out.println("How many tents are needed, each tent fits up to 4 people.");
              numberOfTents = input.nextInt();

              discountCharges = (discountRate * baseCharges);
              totalCharges = (totalCharges - discountCharges);

		          System.out.println("The party size is: " + party + " People");
		          System.out.println("The base charges after you paid the remainder are: $" + baseCharges);
		          System.out.println("Money saved: $" + discountCharges);
              System.out.println("There are: " + needTraining + " in the training group");

              trainingCharges = (needTraining * trainingChargesRate);
              System.out.println("The Training Charges are " + trainingCharges);
              totalCharges = totalCharges + trainingCharges;

              totalRentalCharges = (nights * numberOfTents * totalRentalTentRate);
              System.out.println("The lodging charges are " + totalRentalCharges);

              totalCharges = totalCharges + totalRentalCharges;

              System.out.println("The deposit you will pay upfront is: $" + deposit);
              System.out.println("The total charges are: $" + totalCharges);

			      }
            else
            {
                double deposit = baseCharges * depositRate;
                baseCharges = baseCharges - deposit;
                totalCharges = totalCharges + baseCharges;

                System.out.println("How many days are you staying?");
                days = input.nextInt();
                int nights = (days - 1);

                System.out.println("How many need training?");
                int needTraining = input.nextInt();

                System.out.println("How many tents are needed, each tent fits up to 4 people.");
                numberOfTents = input.nextInt();

                discountCharges = 0.0;
                totalCharges = baseCharges;
                trainingCharges = (needTraining * trainingChargesRate);
                totalCharges = totalCharges + trainingCharges;
                totalRentalCharges = (nights * numberOfTents * totalRentalTentRate);
                totalCharges = totalCharges + totalRentalCharges;



                System.out.println("There are: " + needTraining + " in the training group");
                System.out.println("The Training Charges are " + trainingCharges);
                System.out.println("The lodging charges are " + totalRentalCharges);
                System.out.println("The deposit you will pay upfront is: $" + deposit);
                System.out.println("The total charges are: $" + totalCharges);
            }

    }


    public static void package2()
    {

        Scanner input = new Scanner(System.in);

        System.out.println("This is the 2nd package:");
        System.out.println("*******************************************");

        int party = 0;
        double discountCharges = 0.0;
        double totalCharges = 0.0;
        double baseChargeRate = 1000.0;
        double trainingChargesRate = 100.0;
        double discountRate = .10;
        double depositRate = .50;
        int days = 0;
        double baseCharges = 0.0;
        double trainingCharges = 0.0;

        System.out.println("How large is your party?");
        party = input.nextInt();

        //calculating the base cahrges
        baseCharges = baseChargeRate*party;
        totalCharges = baseCharges;
        //test for discountRate

        if(party>=5){
          double deposit = (baseCharges * depositRate);
          baseCharges = baseCharges - deposit;

          days = 7;

          System.out.println("How many need scuba training?");

          int needTraining = input.nextInt();

          discountCharges = (discountRate * baseCharges);
          totalCharges = (totalCharges - discountCharges);

          System.out.println("The party size is: " + party + " People");
          System.out.println("The base charges are: $" + baseCharges);
          System.out.println("Money saved: $" + discountCharges);

          System.out.println("There are: " + needTraining + " in the scuba training group");
          trainingCharges = (needTraining * trainingChargesRate);
          System.out.println("The Training Charges are " + trainingCharges);
          totalCharges = totalCharges + trainingCharges;

          System.out.println("The deposit you will pay upfront is: $" + deposit);
          System.out.println("The total charges are: $" + totalCharges);

          }
          else
          {
          double deposit = baseCharges * depositRate;
          baseCharges = baseCharges - deposit;
          discountCharges = 0.0;
          totalCharges = baseCharges;

          days = 7;

          System.out.println("How many need scuba training?");
          int needTraining = input.nextInt();
          trainingCharges = (needTraining * trainingChargesRate);
          totalCharges = totalCharges + trainingCharges;
          System.out.println("There are: " + needTraining + " in the training group");
          System.out.println("The Training Charges are " + trainingCharges);

          System.out.println("The deposit you will pay upfront is: $" + deposit);
          System.out.println("The total charges are: $" + totalCharges);


          }


    }

    public static void package3()
    {

      Scanner input = new Scanner(System.in);

      System.out.println("This is the 3rd package:");
      System.out.println("*******************************************");

      int party = 0;
      double discountCharges = 0.0;
      double totalCharges = 0.0;
      double baseChargeRate = 400.0;
      double trainingChargesRate = 100.0;
      double discountRate = .10;
      double depositRate = .50;
      double totalRentalCharges = 0.0;
      double wildernessLodgeRate = 65.0;
      double luxuryInnRate = 120.0;
      int days = 0;
      double baseCharges = 0.0;
      double trainingCharges = 0.0;

      System.out.println("How large is your party?");
      party = input.nextInt();

      System.out.println("Press 1 for wilderness lodge or 2 for Luxury Inn");
      int lodgingChoice = input.nextInt();

      //int number = 0;
      //calculating the base cahrges
      baseCharges = baseChargeRate*party;
      totalCharges = baseCharges;
      //test for discountRate

      if(lodgingChoice == 1 && party >= 5){

        double deposit = (baseCharges * depositRate);
        baseCharges = baseCharges - deposit;

        System.out.println("How many days are you staying?");
        days = input.nextInt();
        int nights = (days - 1);

        double lodgingCharges = (wildernessLodgeRate * nights);
        System.out.println("The lodging chrages are: $" + lodgingCharges);

        discountCharges = (discountRate * baseCharges);
        totalCharges = (totalCharges - discountCharges);

		    System.out.println("The party size is: " + party + " People");
		    System.out.println("The base charges are: $" + baseCharges);
		    System.out.println("Money saved: $" + discountCharges);

        System.out.println("Training is included in the the expirience!");
        trainingCharges = 0;
        System.out.println("The Training Charges are " + trainingCharges);
        totalCharges = totalCharges + trainingCharges;

        System.out.println("The deposit you will pay upfront is: $" + deposit);
        System.out.println("The total charges are: $" + totalCharges);

      }

      if(lodgingChoice == 1 && party < 5){

        double deposit = (baseCharges * depositRate);
        baseCharges = baseCharges - deposit;

        System.out.println("How many days are you staying?");
        days = input.nextInt();
        int nights = (days - 1);

        double lodgingCharges = (wildernessLodgeRate * nights);
        System.out.println("The lodging chrages are: $" + lodgingCharges);

        System.out.println("The party size is: " + party + " People");
        System.out.println("The base charges are: $" + baseCharges);

        System.out.println("Training is included in the the expirience!");
        trainingCharges = 0;
        System.out.println("The Training Charges are " + trainingCharges);
        totalCharges = totalCharges + trainingCharges;

        System.out.println("The deposit you will pay upfront is: $" + deposit);
        System.out.println("The total charges are: $" + totalCharges);

      }

        if(lodgingChoice == 2 && party >= 5){
        //calculating the base cahrges
        baseCharges = baseChargeRate*party;
        totalCharges = baseCharges;
        //test for discountRate

        double deposit = (baseCharges * depositRate);
        baseCharges = baseCharges - deposit;

        System.out.println("How many days are you staying?");
        days = input.nextInt();
        int nights = (days - 1);

        double lodgingCharges = (luxuryInnRate * nights);
        System.out.println("The lodging chrages are: $" + lodgingCharges);

        discountCharges = (discountRate * baseCharges);
        totalCharges = (totalCharges - discountCharges);

		    System.out.println("The party size is: " + party + " People");
		    System.out.println("The base charges are: $" + baseCharges);
		    System.out.println("Money saved: $" + discountCharges);

        System.out.println("Training is included in the the expirience!");
        trainingCharges = 0;
        System.out.println("The Training Charges are " + trainingCharges);
        totalCharges = totalCharges + trainingCharges;

        System.out.println("The deposit you will pay upfront is: $" + deposit);
        System.out.println("The total charges are: $" + totalCharges);

      }

      if(lodgingChoice == 2 && party < 5){
      //calculating the base cahrges
      baseCharges = baseChargeRate*party;
      totalCharges = baseCharges;
      //test for discountRate

      double deposit = (baseCharges * depositRate);
      baseCharges = baseCharges - deposit;

      System.out.println("How many days are you staying?");
      days = input.nextInt();
      int nights = (days - 1);

      double lodgingCharges = (luxuryInnRate * nights);
      System.out.println("The lodging chrages are: $" + lodgingCharges);

      System.out.println("The party size is: " + party + " People");
      System.out.println("The base charges are: $" + baseCharges);

      System.out.println("Training is included in the the expirience!");
      trainingCharges = 0;
      System.out.println("The Training Charges are " + trainingCharges);
      totalCharges = totalCharges + trainingCharges;

      System.out.println("The deposit you will pay upfront is: $" + deposit);
      System.out.println("The total charges are: $" + totalCharges);

    }


    }

    public static void package4(){
      Scanner input = new Scanner(System.in);

      System.out.println("This is the 4th package:");
      System.out.println("*******************************************");

      int party = 0;
      double discountCharges = 0.0;
      double totalCharges = 0.0;
      double baseChargeRate = 700.0;
      double trainingChargesRate = 0;
      double discountRate = .10;
      double depositRate = .50;
      double totalRentalCharges = 0.0;
      double totalRentalTentRate= 40.0; //group of 4
      int days = 0;
      int	numberOfTents = 0;
      double baseCharges = 0.0;
      double trainingCharges = 0.0;

      System.out.println("How large is your party?");
      party = input.nextInt();

      //calculating the base cahrges
      baseCharges = baseChargeRate*party;
      totalCharges = baseCharges;
      //test for discountRate

      if(party>=5){
      double deposit = (baseCharges * depositRate);
      baseCharges = baseCharges - deposit;

      System.out.println("How many days are you staying?");
      days = input.nextInt();
      int nights = (days - 1);

      System.out.println("How many need training?");
      int needTraining = input.nextInt();

      System.out.println("How many tents are needed, each tent fits up to 4 people.");
      numberOfTents = input.nextInt();

      discountCharges = (discountRate * baseCharges);
      totalCharges = (totalCharges - discountCharges);

      System.out.println("The party size is: " + party + " People");
      System.out.println("The base charges are: $" + baseCharges);
      System.out.println("Money saved: $" + discountCharges);

      System.out.println("There are: " + needTraining + " in the training group");
      trainingCharges = (needTraining * trainingChargesRate);
      System.out.println("The Training Charges are " + trainingCharges);
      totalCharges = totalCharges + trainingCharges;

      totalRentalCharges = (nights * numberOfTents * totalRentalTentRate);
      System.out.println("The lodging charges are " + totalRentalCharges);
      totalCharges = totalCharges + totalRentalCharges;

      System.out.println("The deposit you will pay upfront is: $" + deposit);

      System.out.println("The total charges are: $" + totalCharges);

    }
    else
    {
      double deposit = baseCharges * depositRate;
      baseCharges = baseCharges - deposit;

      System.out.println("How many days are you staying?");
      days = input.nextInt();
      int nights = (days - 1);

      System.out.println("How many need training?");
      int needTraining = input.nextInt();

      System.out.println("How many tents are needed, each tent fits up to 4 people.");
      numberOfTents = input.nextInt();

      discountCharges = 0.0;
      totalCharges = baseCharges;
      trainingCharges = (needTraining * trainingChargesRate);
      totalCharges = totalCharges + trainingCharges;
      totalRentalCharges = (nights * numberOfTents * totalRentalTentRate);
      totalCharges = totalCharges + totalRentalCharges;

       System.out.println("There are: " + needTraining + " in the training group");
       System.out.println("The Training Charges are " + trainingCharges);
       System.out.println("The lodging charges are " + totalRentalCharges);
       System.out.println("The deposit you will pay upfront is: $" + deposit);
       System.out.println("The total charges are: $" + totalCharges);


  }

}


public static void main(String[]args){

  header();

  Scanner input = new Scanner(System.in);

  int number = input.nextInt();

  while(number != 0){

      switch(number){

          case 1:

          System.out.println("Devil's Courthouse Adventure Weekend!");
          package1();
          System.out.println();
          break;

          case 2:

          System.out.println("Scuba Bahama");
          package2();
          System.out.println();
          break;

          case 3:
          System.out.println("Sky-Dive Colorado");
          package3();
          System.out.println();
          break;

          case 4:

          System.out.println("Barron Cliff Spelunk");
          package4();
          System.out.println();
          break;

          default: System.out.println("Invalid selection");


      }

      System.out.println("");
      System.out.println("");
      System.out.println("");
      System.out.println("To try another package enter 1, 2, 3, 4. To exit program press 0");
      number = input.nextInt();

  }

 }

}
