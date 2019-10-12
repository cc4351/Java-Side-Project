//returns the avatar information to the player


public class Avatar{
   protected int hp, defense, speed, cycle, damage, attack;
   protected String[] actions;
   protected String type;
   
   
   public Avatar(){
      
   }
   
   public int getHP(){
      return hp;
   }
   
   public int getDefense(){
      return defense;
   }
   
   public int getSpeed(){
      return speed;
   }
   
   public int getCycle(){
      return cycle;
   }   
   
   public String getActions(){
      for(int i=0; i<actions.length; i++){
         getActions = (i+1)+". " + actions[i]+ " ";
      }
      return getActions;
   }
   
   public String getSpec(){
      getSpec = "Avatar: " + avatar + "|HP: " + hp + "|Defense: " + defense + "|Speed: "+ speed+ ".";
      return getSpec;
   }
   
   public void doAction(int act, Avatar avt){
      
   }
   
   public void updateHP(int amt){
      hp += amt;
   }
   
   public void updateSpeed(int sp){
      speed +=sp;
   }
   
   public void updateDefense(int def){
     defense += def;
   }
   
   
   
   //extended classes here
   
   class Dragon extends Avatar{
        
      public Dragon(){
         super();
         hp = 2000;
         defense = 100;
         speed = 100;
         type = "Dragon";
         actions[] = {"Fire Breath","Wing Flap","Fly"};
         
      }
      
      @Override
      public void doAction(int act, Avatar avt){
         boolean success = false;
         
         if(act == 1){
            //firebreath
            attack = 100;
            cycle = 3;
            damage = some kind of math here*-1;
            avt.updateHP(damage);
            success = true;
         }
         else if(act == 2){
            //Wing Flap
            attack = 20;
            cycle = 1;
            damage = some kind of math here *-1;
            avt.updateHP(damage);
            avt.updateSpeed(-5); 
            success = true;
         }
         else if(act ==3){
            cycle = 1;
            hp +=20;
            block damage??!!
            success = true;
         }
         
         if(success){
            System.out.println(type + "did" + actions[act-1] + ".");
         }
         
      }   
   }
   
   class Wizard extends Avatar{
      public Wizard(){
         super();
         hp = 500;
         defense = 80;
         speed = 40;
         type = "Wizard";
         actions[] = {"Fireball", "Shield", "Heal"};
      }
      
      @Override
      public void doAction(int act, Avatar avt){
         boolean success = false;
         if(act ==1){
            attack = 70;
            damage = some kind of math *-1;
            cycle = 3;
            avt.updateHP(damage);
            success = true;
         }
         else if(act ==2){
            cycle = 3;
            avt.updateDefense(20);
            success = true;
         }
         else if(act ==3){
            cycle = 1;
            avt.updateHP(20);
            ****remove all debuff??!!
            success = true;
         }
         
         if(success){
            System.out.println(type + "did" + actions[act-1] + "." );
         } 
      }
   }
   
   
   class Fighter extends Avatar{
      public Fighter(){
         super();
         hp = 650;
         defense = 50;
         speed = 60;
         type = "Fighter";
         actions[] = {"Slash", "Parry", "Roar"};
      }
      
      @override
      public void doAction(int act, Avatar avt){
         boolean success = false;
         if(act == 1){
            //slash
            attack = 120;
            damage = some kind of math *-1;
            avt.updateHP(damage);
            success = true;
         }
         else if(act == 2){
            //parry
            
            *****Blocks 30% of damage from next attack
            deals 30 damage in return
            
         }
      }
   }
   
   
   
   
  


}
  
   
