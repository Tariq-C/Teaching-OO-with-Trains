class gameSolution {


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

      if (numPeople < 0 || numMail < 0){
         int index = 0;
         while(numPeople < 0 || numMail < 0){
            if(train[index] == 1 && numPeople < 0){
               numPeople++;
               train[index] = 0;
            }else if(train[index] == 2 && numMail < 0){
               numMail++;
               train[index] = 0;
            }
            index++;
            if(index >= train.length && numPeople < 0){
               System.out.println("There are not enough people on this train to import");
               return false;
            }else if (index >= train.length && numMail < 0) {
               System.out.println("There are not enough mail on this train to import");
               return false;
            }
         }
      }

      System.out.println("All People and Mail have been off boarded | checking for sufficient room");

      // Now check to see if there is sufficient room.
      int emptyCars = 0;
      for (int i : train){
         if(i == 0){
            emptyCars++;
         }
      }
      if (emptyCars < numPeople + numMail){
         System.out.println("There is not enough room for all the cargo");
         return false;
      }
      int index = 0;
      while (numPeople > 0 || numMail > 0){
         if(train[index] == 0 && numPeople > 0){
            train[index] = 1;
            numPeople--;
         }else if(train[index] == 0 && numMail > 0){
            train[index] = 2;
            numMail--;
         }
         index++;
      }

      System.out.println();
      for (int i : train){
         System.out.print(i + " | ");
      }
      System.out.println();

      return true;
   }

   // Feel free to make as many helper methods as you want






   // the main game method with the run loop.

   public static void main(String[] args) {

      // a train that can hold 5 people
      int[] train = new int[5];

      boolean run = true;


      System.out.println("Arriving at station 1");
      while(run){

         // Station 1
         // Import: N/A
         // Export: 2 people, 1 mail
         // Misc: Stops the train if it can't fit 2 people
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
