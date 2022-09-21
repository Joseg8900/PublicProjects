import java.util.*;
/***
*This class creates, applies method,
*and constructs bird objects.
*
*@author Jose Guzman
*@version Jan-7-2022
*/


public class Bird{
   String name;
   int x;
   int y;
   int z;
   
   /**
   *This method constructs an empty
   *bird object with 1,1,1 location
   *and 'unknown' name.
   *
   */
   public Bird(){
      x=1;
      y=1;
      z=1;
      
      name = "unknown";
   }
   
   /**
   *Constructs a bird object with 
   *a given name and random location.
   *
   *@param String Is entered to replace name
   */
   public Bird(String nameN){
      Random rand = new Random();
      x = rand.nextInt(11)-5;
      y = rand.nextInt(11)-5;
      z = rand.nextInt(11)-5;
      
      name = nameN;
   }
   
   /**
   *Constructs a bird object with
   *given location and name.
   *
   *@param String new Name
   *@param New X coordinate
   *@param New Y coordinate
   *@param New Z coordinate
   */
   public Bird(String nameN, int x1, int y2, int z3){
      x=x1;
      y=y2;
      z=z3;
      
      name=nameN;
   }
   
   /**
   *Returns X coordinate 
   *when called.
   *
   *@return Int for X
   */
   public int getX(){
      return x;
   }
   
   /**
   *Returns Y coordinate
   *when called.
   *
   *@return Int for Y
   */
   public int getY(){
      return y;
   }
   
   /**
   *Returns Z coordinate 
   *when called.
   *
   *@return Int for Z
   */
   public int getZ(){
      return z;
   }
   
   /**
   *Returns String name
   *when called.
   *
   *@return String for Name
   */
   public String getName(){
      return name;
   }
   
   /**
   *Returns Bird object 
   *information formatted
   *as a string.
   *
   *@return String for Bird
   */
   public String toString(){
      return String.format("%s%n X:%d Y:%d Z:%d",name, x, y, z);
   }
   
   /**
   *Returns boolean value 
   *representing if given
   *Bird object shares location 
   *with this bird location.
   *
   *@param Bird class to compare
   *@return Boolean if birds are touching
   */
   public boolean touching(Bird other){
      return (this.x == other.getX() && this.y == other.getY() && this.z == other.getZ());
   }
   
   /**
   *Method goes through a loop
   *creating a random int to determine 
   *direction then in 'if' statments to
   *check if it is within parameters, finally 
   *determine length of movement and exiting loop.
   */
   public void move(){
      Random rand = new Random();
      int tester;
      boolean check = true;
      
      do{
         tester = rand.nextInt(6);
         if (tester == 0 && this.getX() < 4){
            x += (rand.nextInt(2)+1);
            check = false;
         }
      
         else if(tester == 1 && this.getX() > -4){
            x -= (rand.nextInt(2)+1);
            check = false;
         }
      
         else if(tester == 2 && this.getY() < 4){
            y += (rand.nextInt(2)+1);
            check = false;
         }
      
         else if(tester == 3 && this.getY() > -4){
            y -= (rand.nextInt(2)+1);
            check = false;
         }
      
         else if(tester == 4 && this.getZ() < 4){
            z += (rand.nextInt(2)+1);
            check = false;
         } 
      
         else if(tester == 5 && this.getZ() > -4){
            z -= (rand.nextInt(2)+1);
            check = false;
         }
      }while(check);
      
   }
}