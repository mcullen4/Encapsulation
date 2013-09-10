/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UpdatedLab3.lab3;

/**
 *
 * @author Michele
 */
public class PartManager {
    private String[] partNum = new String [10];
    private String[] partDesc=new String [10];
    private double[] partPrice = new double[10];
    private String searchNumber;
    private int foundIndex=0;
    private int emptyRow=0;
    
    public String updateList(int emptyRow,)
    
    
    
    
    
    //search array for partNum and return the index of the partNum
    public int searchPartNumber(String searchNumber){
        
        if (searchNumber !=null && searchNumber.length()>0){
            for (int i = 0; i < partNum.length; i++){
                if (searchNumber.equalsIgnoreCase(partNum[i])){
                    foundIndex=i;
                }
                
            }
        }
        return foundIndex;
    }
    
    public void sortList(int emptyRow){
    
        // Bubble sort routine adapted from sample in text book...
        // Make sure the operations are peformed on all 3 arrays!
            for(int passNum = 1; passNum < emptyRow; passNum++) {
                for(int i = 1; i <= emptyRow-passNum; i++) {
                    String temp = "";
                    temp += partPrice[i-1];
                    partPrice[i-1] = partPrice[i];
                    partPrice[i] = Double.parseDouble(temp);

                    temp = partNum[i-1];
                    partNum[i-1] = partNum[i];
                    partNum[i] = temp;

                    temp = partDesc[i-1];
                    partDesc[i-1] = partDesc[i];
                    partDesc[i] = temp;
                }
            }
    }
    
    
    
    
    
    }  

