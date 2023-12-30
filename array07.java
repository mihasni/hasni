
public class array07 {
    
    
   

    public static int minimum_element(int[] arr){
		int minElement = Integer.MAX_VALUE;
        for(int i = 0;i<arr.length;i++){
            minElement = Math.min(minElement, arr[i]);
        }
       

        return minElement;
        
    }
     
}

