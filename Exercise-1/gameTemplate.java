class gameTemplate {

   public static void main(String[] args) {

      // a train that can hold 5 people
      int[] train = new int[5];

      boolean run = true;

      while(run){

         // Station 1
         // Import: N/A
         // Export: 2 people
         // Misc: Stops the train if it can't fit 2 people

         // checks to see if there are empty seats
         System.out.println("Arrived at station 1 | Checking for empty seats");
         boolean canLoad = true;

         // if it can board it will add two passengers to the train
         // otherwise it will stop the simulation
         if(canLoad){
            System.out.println("There are more than 2 empty seats | Boarding passengers");

         }else{
            System.out.println("Not enough empty seats to board | Stopping simulation");

         }

         // Print statement to show the end of station 1
         System.out.println("Departed from Station 1");


         // Station 2
         // Import: 1 person
         // Export: 0 people

         System.out.println("Arriving at Station 2 | Checking for passengers");
         boolean canOffBoard = true;

         // Check to see if there is a passenger to remove

         // If there is someone on board remove them, otherwise stop the simulation
         if(canOffBoard){
            System.out.println("There is more than one passenger | OffBoarding a passenger");

         }
         else{
            System.out.println("No passengers to offload | stopping simulation");

         }

         // Print statement to show the end of station 2
         System.out.println("Departed from Station 2");
      }

   }

}
