   import java.util.Scanner;
public class tree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the tree: ");
        int height = scanner.nextInt();

        // Draw the tree
        drawTree(height);

        scanner.close();
    }

    static void drawTree(int height) {
        for (int i = 0; i < height; i++) {
            // Print spaces before the stars
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        // Draw the trunk
        drawTrunk(height);
    }

    static void drawTrunk(int height) {
        // Print spaces before the trunk
        for (int i = 0; i < height - 1; i++) {
            System.out.print(" ");
        }

        // Print trunk
        System.out.println("|");
    }

}
