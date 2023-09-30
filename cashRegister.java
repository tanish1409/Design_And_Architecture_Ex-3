import java.io.File;
import java.util.Objects;
import java.util.Scanner;

public class cashRegister {
    public static void main(String[] args) {
        String productName = " ";
        String productPrice = " ";
        int flag=0;
        keyboard keyboardInput = new keyboard();
        int productID = keyboardInput.getInput();
        try {
            File file = new File("data.txt");
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] split = line.split(" ");
                String productReadId = split[0];
                if (Objects.equals(productReadId, Integer.toString(productID))) {
                    flag = 1;
                    productName = split[1];
                    productPrice = split[2];
                }
            }
            input.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        if(flag==0){
            System.out.println("Could not find the productID in the Database");
        }
        else {
            // create a new display object
            display d = new display();
            // display the input
            d.displayText(productName, productPrice);
        }
    }
}
