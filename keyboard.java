import java.util.Scanner;

public class keyboard {
    public int getInput() {
        // get input from keyboard
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a product ID: ");
        int productID = input.nextInt();
        input.close();
        return productID;
    }
}