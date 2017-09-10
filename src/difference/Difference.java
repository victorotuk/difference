package difference;

import java.util.Arrays;

class Difference {

    private int[] elements;
    public int maximumDifference;

   
    
    /*void*/  Difference (int [] a){
    
        this.elements = a;
        
        //sort this array it makes the program run faster and clears a lot of clutter
        
    }
    
    public void computeDifference(){
    /*   
    int max = 0;
    
        for (int i = 0; i < elements.length; i++){
            for (int j = 0; j < elements.length; j++){
                   int abs = Math.abs(elements[j] - elements[i]);
                   if (abs > max) max = abs;
            }
        }
        
        maximumDifference = max;*/
    
    
    // the method below is more concise and more reasonable
    Arrays.sort(elements);
    this.maximumDifference = Math.abs(elements[0] - elements[elements.length - 1]);
        
 }
     
     
}
    
    
        

    
    

