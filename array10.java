import java.util.Scanner;
public class array10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int raws=s.nextInt();
        int cols=s.nextInt();
        int [][] numbers=new int[raws][cols];
        for (int i = 0; i < raws; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j]=s.nextInt();
                
            }
            
        } 
        int x=s.nextInt();
        for (int i = 0; i < raws; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j]==x) {
                    
                
                System.out.print("x found at location("+i+","+j+")");
                
        
    }
        }}
    
}
}