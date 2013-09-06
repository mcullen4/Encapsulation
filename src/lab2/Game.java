/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Michele
 */
public class Game {
   private int startingPlayer;
   private GameBoard gameBoard;
   private GameCharacter[]gameCharacter;
   
 public void startGame(String playerOne,String playerTwo,String playerThree,
         String playerFour){
     //This would need verification for null values
     
     
     gameCharacter[1]=new GameCharacter (playerOne,1);
     gameCharacter[2]=new GameCharacter (playerTwo,2);
     gameCharacter[3]=new GameCharacter (playerThree,3);
     gameCharacter[4]=new GameCharacter (playerFour,4);
     
     chooseStartingPlayer();
     playGame();
     
 }  
   
private int chooseStartingPlayer(){
    //select random player to start game
    return startingPlayer;
}



private void playGame(){
do{
    gameCharacter[]
}
while(gameBoard.playerWin=false);





}
}

