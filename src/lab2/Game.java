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
   private int player; //player whose turn it is
   private GameBoard gameBoard;
   private GameCharacter[]gameCharacter;
   private int score;
   private boolean playerWin;
   
   
 public void startGame(String playerOne,String playerTwo,String playerThree,
         String playerFour){
     //This would need verification for null values
     
     
     gameCharacter[1]=new GameCharacter (playerOne,1);
     gameCharacter[2]=new GameCharacter (playerTwo,2);
     gameCharacter[3]=new GameCharacter (playerThree,3);
     gameCharacter[4]=new GameCharacter (playerFour,4);
     gameBoard = new GameBoard();
     
     choosePlayer();
     playGame();
     
 }  
   
private int choosePlayer(){
    //select random player to start game
    return player;
}



private void playGame(){
    
do{
    
    score=gameCharacter[player].takeTurn();
    playerWin = gameBoard.checkGameBoard(score);
    incrementPlayer();
     
}
while(playerWin=false);





}
private void incrementPlayer(){
    if(player==1||player==2||player==3)
    {
        player++;
                }else{
        player=1;}
}
}

