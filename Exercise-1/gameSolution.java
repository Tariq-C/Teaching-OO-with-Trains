class gameSolution {

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
         int numEmpty = 0;
         for (int i : train){
            if (i == 0){
               numEmpty++;
            }
         }
         if(numEmpty < 2){
            canLoad = false;
         }

         if(canLoad){
            System.out.println("There are more than 2 empty seats | Boarding passengers");
            for(int i = 0; i < 2; i++){
               for(int j = 0; j < train.length; j++){
                  if(train[j] == 0){
                     System.out.println("Adding Passenger to Seat " + j);
                     train[j] = 1;
                     break;
                  }
               }
            }
         }else{
            System.out.println("Not enough empty seats to board | Stopping simulation");
            run = false;
            break;
         }

         System.out.println("Departed from Station 1");


         // Station 2
         // Import: 1 person
         // Export: 0 people

         System.out.println("Arriving at Station 2 | Checking for passengers");
         boolean canOffBoard = true;
         int numFull = 0;


         for (int i : train){
            if (i == 1){
               numFull++;
            }
         }
         if (numFull < 1){
            canOffBoard = false;
         }

         if(canOffBoard){
            System.out.println("There is more than one passenger | OffBoarding a passenger");
            for(int j = 0; j < train.length; j++){
               if(train[j] == 1){
                  System.out.println("Removing Passenger to Seat " + j);
                  train[j] = 0;
                  break;
               }
            }
         }
         else{
            System.out.println("No passengers to offload | stopping simulation");
            break;
         }
         System.out.println("Departed from Station 2");
      }

   }

}
