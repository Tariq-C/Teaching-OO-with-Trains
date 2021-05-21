class gameTemplate {


   // a method for the station
   // Parameters
   // - int numPeople : A positive or negative value representing the number of people that need to be loaded/removed
   // - int numMail : A positive or negaitve value representing the number of mailpackages that need to be loaded/removed
   // - int[] : A int[] representation of a train.
   //       0 : empty
   //       1 : person
   //       2 : mail
   // Returns
   // - boolean completed
   //       false : Failed
   //       true : Passed
   public static boolean station(int numPeople, int numMail, int[] train){
      // Remove the people and mail first



      System.out.println("All People and Mail have been off boarded | checking for sufficient room");

      // Now check to see if there is sufficient room.

      System.out.println("There is not enough room for all the cargo");

      // Now add the cargo if there is room


      // This code prints the state of the tain for you
      System.out.println();
      for (int i : train){
         System.out.print(i + " | ");
      }
      System.out.println();

      return true;
   }

   // Feel free to make as many helper methods as you want






   // the main game method with the run loop.
   // Do Not Touch The Main Method's code
   public static void main(String[] args) {

      // a train that can hold 5 people
      int[] train = new int[5];

      boolean run = true;


      System.out.println("Arriving at station 1");
      while(run){

         // Station 1
         // Import: N/A
         // Export: 2 people, 1 mail
         run = station(2, 1, train);
         if(!run){
            System.out.println("Exiting Simulation");
            break;
         }
         System.out.println("Going from station 1 to station 2");
         // Station 2
         // Import: 1 person
         // Export: 1 mail
         run = station(-1, 1, train);
         if(!run){
            System.out.println("Exiting Simulation");
            break;
         }
         System.out.println("Going from station 2 to station 3");
         // Station 3
         // Import: 1 person, 1 mail
         // Export: n/a
         run = station(-1, -1, train);
         if(!run){
            System.out.println("Exiting Simulation");
            break;
         }
         System.out.println("Going from station 3 to station 1");
      }
   }
}
