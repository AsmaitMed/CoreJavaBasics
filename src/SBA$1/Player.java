package SBA$1;

import java.util.Arrays;

public class Player {

}

    interface Sport{

        void calculateAvgAge(int[] age);
        void retirePlayer(int id);

    }

    class Cricket implements Sport{
    int[] playerIDs;

    public Cricket(){
        playerIDs = new int[12];
        for (int i= 1; i<=playerIDs.length ; i++){
            playerIDs[i] = 1;
            //Arrays.fill(playerIDs,1);
            System.out.println("A new cricket team has been formed");
        }
    }

    public void calculateAvgAge(int[] age){
        int sum = 0;
        int average;
        for (int j=1; j<=age.length;j++){
            sum+= sum+age[j];
        }
        average = sum/11;
        System.out.printf("The average age of  the team is %.2f" + average);
    }

        /**
         *  public void calculateAvgAge(int[] age) {
         *         double sum = 0;
         *         int count = 0;
         *         for (int i = 0; i < age.length; i++) {
         *             if (playerIDs[i+1] != -1) {
         *                 sum += age[i];
         *                 count++;
         *             }
         *         }
         *         double avgAge = sum / count;
         *         System.out.printf("The average age of the team is %.2f\n", avgAge);
         *     }
         * @param id
         */

    public void retirePlayer(int id){
        for (int i= 1; i<=playerIDs.length ; i++){
            playerIDs[i] = -1;
            System.out.println("Player with id " + id + "has retired");
        }
            System.out.println("Player has already retired");
        }
    }

/**
 * public void retirePlayer(int id) {
 *         if (playerIDs[id] == -1) {
 *             System.out.println("Player has already retired");
 *         } else {
 *             playerIDs[id] = -1;
 *             System.out.printf("Player with id:%d has retired\n", id);
 *         }
 *     }
 * }**/




class Football implements Sport{
        int[] playerIDs;
        public Football(){
            playerIDs = new int[12];
            for (int i= 1; i<=playerIDs.length ; i++){
                playerIDs[i] = 1;
                System.out.println("A new football team has been formed");
            }
        }

        /**public Football() {
         playerIDs = new int[11];
         Arrays.fill(playerIDs, 1);
         System.out.println("A new football team has been formed");
         }**/

        public void calculateAvgAge(int[] age){
            int sum = 0;
            int average;
            for (int j=1; j<=age.length;j++){
                sum+= sum+age[j];
            }
            average = sum/11;
            System.out.printf("The average age of  the team is %.2f" + average);
        }

        /**public void calculateAvgAge(int[] age) {
         double sum = 0;
         int count = 0;
         for (int i = 0; i < age.length; i++) {
         if (playerIDs[i+1] != -1) {
         sum += age[i];
         count++;
         }
         }
         double avgAge = sum / count;
         System.out.printf("The average age of the team is %.2f\n", avgAge);
         }**/

        public void retirePlayer(int id){
            for (int i= 1; i<=playerIDs.length ; i++){
                playerIDs[i] = -1;
                System.out.println("Player with id " + id + "has retired");
            }
            System.out.println("Player has already retired");
        }

        /**public void retirePlayer(int id) {
         if (playerIDs[id] == -1) {
         System.out.println("Player has already retired");
         } else {
         playerIDs[id] = -1;
         System.out.printf("Player with id:%d has retired\n", id);
         }
         }**/

        public void playerTransfer(int fee, int id){
            if ( !equals(playerIDs[id]==-1)){
                System.out.println("Player with id:" + id + "has been transferred with a fee of " + fee);

            }
            System.out.println("Player has already retired");
        }

        /**public void playerTransfer(int fee, int id) {
         if (playerIDs[id] == -1) {
         System.out.println("Player has already retired");
         } else {
         System.out.printf("Player with id:%d has been transferred with a fee of %d\n", id, fee);
         }
         }
         }**/



    }
