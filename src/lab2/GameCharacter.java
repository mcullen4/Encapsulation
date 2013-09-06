/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Michele
 */
public class GameCharacter {
   
   private String name;
   private int playerNumber;
   private int gameSpace;
   private int diceRoll;
   
   public GameCharacter(String name,int playerNumber){
       this.name=name;
       this.playerNumber=playerNumber;
   }
   
   public int takeTurn(){
   rollDice();
   moveSpace();
   return gameSpace;
   
   
   
   };
   
   private void rollDice(){
   //random generation of dice roll
     
   
   };
   private void moveSpace(){
   //calculate new gameSpace 
     
     
   
   };
}
