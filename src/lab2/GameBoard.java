/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

   
   
   
   
/**
 *
 * @author Michele
 */
public class GameBoard {
   
   private static final int WINNING_SPACE = 50;
   public boolean playerWin;
   private int space;
   
   
   public boolean checkGameBoard(int space){
       this.space=space;
       checkIfWinner();
       return playerWin;
       
   }
   
   


    private void checkIfWinner() {
        
        if(space > WINNING_SPACE){
            playerWin=true;
        }
        
        
    }
}

 