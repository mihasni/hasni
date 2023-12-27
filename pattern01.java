import java.util.Scanner;
public class pattern01 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while (j<=n) {
                char jthChar=(char)('a'+j-1);
                System.out.print(jthChar);
                j=j+1;
                
            }
            System.out.println();
            i=i+1;

        }

    }

    
}