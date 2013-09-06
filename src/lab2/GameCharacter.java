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
   private String pieceDescription;
   private int gameSpace;
   
   public GameCharacter(String name,int playerNumber){
       this.name=name;
       this.playerNumber=playerNumber;
   }
   
   public void takeTurn(){};
   private void pickCard(){};
   private void rollDice(){};
   private void moveSpace(){};
}
