import java.util.Scanner;

public class Game{
   private Human tester;
   private Computer cpu;
   private boolean whoseTurn;
   private String name;
   
public Game(){
   tester = new Human();
   cpu = new Computer();
}
   
public void play(){
   while(tester.getHealth()>0 && cpu.getHealth()>0){
      tester.chooseAvatar(); 
     whoseTurn = tester.getSpeed() <cpu.getSpeed();
      if (whoseTurn == true){
         cpu.move(tester.getAvatar());
         tester.move();
      }
      if(whoseTurn == false){
         tester.move();
         cpu.move(tester.getAvatar());
      }
      
      System.out.println("Human Player: " + "\n" + tester.getStats() + "Computer: " + cpu.getStats());
   }
   
   if(tester.getHealth() < cpu.getHealth()){
      System.out.println("You lost the game. See you next time.");
   }
   else if(tester.getHealth() > cpu.getHealth()){
      System.out.println("You won the game. Congratulations!");
   }
   else if(tester.getHealth() == cpu.getHealth()){
      System.out.println("Dragon is killed because of your sacrifice. Tie.");
   }
       
  }
}
   



   

  
 

 