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
   
   private void takeTurn(int player){
   rollDice();
   moveSpace();
   GameBoard.checkGameBoard(gameSpace);
   
   
   };
   
   private int rollDice(){
   //random generation of dice roll
   return diceRoll;    
   
   };
   private void moveSpace(){};
}
