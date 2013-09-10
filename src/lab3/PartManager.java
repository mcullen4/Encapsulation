/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Michele
 */
public class PartManager {
    private String[] partNum = new String[10];
    private String[] partDesc = new String[10];
    private double[] partPrice = new double[10];
    private String searchNumber;
    private String foundIndex="Not_Found";
    

    public String[] getPartNum() {
        return partNum;
    }
    
    public int getPartNumLength(){
    int arrayLength=partNum.length;
    return arrayLength;
    }
    
    public String searchPartNumber(String searchNumber){
                
        if (searchNumber != null && searchNumber.length() > 0) {
            for (int i = 0; i < partNum.length; i++) {
                if (searchNumber.equalsIgnoreCase(partNum[i])) {
                    foundIndex = i;
                    
                }  
    return foundIndex;
    }

    public void setPartNum(int position, String partNum) {
        this.partNum[position] = partNum;
    }

    public String[] getPartDesc() {
        return partDesc;
    }

    public void setPartDesc(int position, String partDesc) {
        this.partDesc[position] = partDesc;
    }

    public double[] getPartPrice() {
        return partPrice;
    }

    public void setPartPrice(int position, double partPrice) {
        this.partPrice[position] = partPrice;
    }

    

    
    
     
}
