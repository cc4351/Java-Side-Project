import java.util.Scanner;

public class Human{
  
   private Avatar[] avt = {new Wizard(), new Fighter(), new Archer(),new Dragon()};
   private String choices, stats;
   private Scanner in;
   private int health, act;
   private Avatar avt_in_action;
  
      
   public Human(){
      in = new Scanner(System.in);
   }
    
   public int getHealth(){
      for(int i=0; i<avt.length-1;i++){
         health +=avt[i].getHP();
      }
      return health;
   }
   
   public String getStats(){
      stats = "";
      for(int i = 0; i< avt.length-1;i++){
         if(avt[i].getHP()>0){
            stats += avt[i].getStats() + "\n";
         }
      }
      return stats;
   }
    
   
    public void chooseAvatar(){
       choices = "";
        for(int i = 0; i<avt.length-1;i++){
         if(avt[i].getHP()>0){
            choices += " "+ (i+1) + ") "+ avt[i];
         }
      }
       System.out.println("Please choose from: " + choices);
       int name = in.nextInt();
       //1 = Wizard; 2 = Fighter; 3 = Archer;
       if(name != 4)
          avt_in_action = avt[name-1];
          
    }
   
   public Avatar getAvatar(){
      return avt_in_action;
   }
   
   public int getSpeed(){
      return avt_in_action.getSpeed();
   }
   
   public void move(){
      System.out.println("Please choose an action: " + avt_in_action.showActions());
      int act = in.nextInt();
      avt_in_action.doAction(act,avt[3]);
   }    
}