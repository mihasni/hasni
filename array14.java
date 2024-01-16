

import java.util.Scanner;
public class array14 {

    
    public static float binarySearch(float[] numbers, int key){
        
        int start=0,end=numbers.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if (numbers[mid]==key) {
                return mid;
                
            }
            if (numbers[mid]<key) {
                start=mid+1;
                
            }else{
                end=mid-1;
            }
            
        }
        return-1;
    }
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int key=s.nextInt();

        float numbers[]={2,4,6,8,10,278,78,45,12,14};
        System.out.print(key);
        
        System.out.println("index for key is:"+binarySearch(numbers, key));
        
    }
    
}
