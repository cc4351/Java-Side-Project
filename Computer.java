public class Computer {
   Avatar avt_comp;
   int act;
   
   public Computer(){
      avt_comp = new Dragon();
   }
   
   public void move(Avatar avt){
      act = (int)(Math.random()*3)+1;
      avt_comp.doAction(act,avt);
   }
   
   public int getSpeed(){
      return avt_comp.getSpeed();
   }
   
   public int getHealth(){
      return avt_comp.getHP();
   }
   
   public String getStats(){
      return avt_comp.getStats();
   }

  
}
