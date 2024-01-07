import java.util.Scanner;
public class array09 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int raws=s.nextInt();
        int cols=s.nextInt();
        int [][] numbers=new int[raws][cols];
        for (int i = 0; i < raws; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j]=s.nextInt();
                
            }
            
        } for (int i = 0; i < raws; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j]+" ");
                
            }               

             System.out.println();
        }
    }

    
}
