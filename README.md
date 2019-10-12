# Simple RPG

## Background
Create a very lightwright program that simulates a battle that might take place in a fantasy role playing game. There are two players – a human player and a computer player. The human player battles the computer player via the command line. Here are the rules:



### Human Player
* The human player starts off with three **Avatars** : a wizard, a fighter, and an archer.  
    * If it helps, imagine the human player as an actual person sitting at a table with three small figurines (or pawns) on a game board placed atop a kitchen table.


### Computer Player
* The computer only has one **Avatar** : a dragon
    * If it helps, imagine the computer player as some weirdo "human" sitting across the table from you, but behind a curtain so you can't interact with them directly. The player only has own figurine/pawn in the shape of a dragon.


### The Avatars
* As mentioned, there are four main types of Avatars (figureines/pawns) : wizard, fighter, archer, and dragon.
* Each Avatar has three main **attributes** and three **actions**.
    * Attributes are: health points (HP), defense, and speed
    * There ar two types of actions: damage-dealing actions (attacks) and passive actions (buffs)
* Attributes and attacks are unique to each Avatar as listed at the bottom of this page.


### The Game
A single game consists of R-many rounds. During each round, the Human player gets to take one action and then the Computer player gets to take one action. Who goes first during the round is determined by the speed of the two Avatars the Human and Computer players choose to play respectively during that round. A game is won at the Rth round when either player has no more **Avatars**. That is, either the Computer Player's dragon died or all three of the Human Player's Avatars (the heroes) died. Here's an example of a game played:

 1. Game starts and game setup begins:
    * Human player gets fresh set of heroes (a wizard, a fighter, and an archer)
    * Computer player a dragon Avatar
2. First round begins:
    * Human Player gets prompted to choose a hero to play
    * Human Player is prompted to choose an action for that hero
    * Hero and Dragon speeds are compared to determine first move
    * First Avatar attacks - results printed to screen
        * For every attack from any Avatar:
            * Damage received is reduced by Avatar.Defense/100
            * Damage inflicted has Avatar.Speed/100 chance to inflict a critical hit and do 1.5x damage
    * Second Avatar attacks - results printed to screen
    * If winning condition is met, go to 3, else repeat 2
3. Winning condition has been met, print out winner (either human Player or computer Player)


### Avatar Actions and Attributes
* **Dragon**
    * HP: 2000
    * Defense: 100
    * Speed: 100
    * Actions:
        * Fire Breath: Deals 100 damage, burns 30 for 3 tunrs
        * Wing Flap: Deals 20 damage, reduces Avatar speed
        * Fly: Blocks 50% of damage from next attack, heals 20 HP
* **Wizard**
    * HP: 500
    * Defense: 80
    * Speed: 40
    * Actions:
        * Fireball: Deals 70 damage, burns 10 for 3 turns
        * Shield: Cast on any Avatar, raises defense by 20 for 3 turns
        * Heal: Cast on any Avatar, heals 20 HP, removes all debuffs
* **Fighter**
    * HP: 650
    * Defense: 50
    * Speed: 60
    * Actions:
        * Slash: Deals 120 damage
        * Parry: Blcoks 30% of damage from next attack, deals 30 damage in return
        * Roar: Lowers opponent defense by 5
* **Archer**
    * HP: 575
    * Defense: 35
    * Speed: 80
    * Actions:
        * Shoot Arrow: Deals 40 damage, 25% chance to deal tripple damage
        * Poison Arrow: Deals 50 damage, lowers opponent speed by 10
        * Doge: Evades next attack

