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
   private int continuePlay = 1;
   private int score;
   
   public void checkIfOnPenaltySpace(int score){
       if(score==PENALTY_SPACE){
           score-=10;
           checkIfWinner();
       }else{
           checkIfWinner();
       }
       }

    private void checkIfWinner() {
        
        if(score >= WINNING_SPACE){
           endGame(); 
        }
    }
}

 