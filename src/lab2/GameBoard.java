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
   private static final int PENALTY_SPACE = 27;
   private static final int WINNING_SPACE = 50;
   public boolean playerWin;
   private int space;
   
   
   public void checkGameBoard(int space){
       this.space=space;
       checkIfOnPenaltySpace(space);
   }
   
   
   public void checkIfOnPenaltySpace(int score){
       if(score==PENALTY_SPACE){
           score-=10;
           }else{
           checkIfWinner(space);
       }
       }

    private boolean checkIfWinner(int space) {
        this.space=space;
        if(space > WINNING_SPACE){
            playerWin=true;
        }
        
        return playerWin;
        
    }
}

 