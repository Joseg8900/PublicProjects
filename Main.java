/**
*This class creates an array  
*of bird classes before testing them.
*
*@author Jose Guzman
*@version Jan 7-2022
*/
public class Main{
   /**
   *This method creates the array of 7
   *bird objects, then puts them in a loop
   *that prints, moves, then checks each object
   *and prints the results.
   *
   */
   public static void main(String[] args){
      int counter = 0;
      int round = 0;
      
      Bird[] game = new Bird[7];
      game[0] = new Bird("Hawk",1,2,3);
      game[1] = new Bird("Eagle",4,4,4);
      game[2] = new Bird("Ostrich",0,-1,1);
      game[3] = new Bird("BigBird",2,-2,2);
      game[4] = new Bird("BlueJay");
      game[5] = new Bird("RedRobin");
      game[6] = new Bird();
      
      System.out.println("Beginning of Program");
      for(int i = 0; i < game.length; i++){
         System.out.println(game[i].toString());
      }
      
      do{
         System.out.println("[#############]");
         System.out.println("Round: "+round);
         
         for(int i = 0; i < game.length; i++){
            game[i].move();
            System.out.println(game[i].toString());
         }
         
         for(int i = 0; i < 6; i++){
            for(int j = i+1; j < 7; j++){
               if( game[i].touching(game[j]) ){
                  counter++;
                  System.out.println(game[i].getName()+" is touching "+game[j].getName());
               }
               
            }
         }
         
         round++;
      }while(counter < 6);
      
      System.out.println("");
      System.out.println("Total Number of Rounds: "+round);
      System.out.println("Total Number of Fights: "+counter);
      
   }
}