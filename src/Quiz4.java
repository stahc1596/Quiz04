
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bettk6516
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //imports user imput scanner
        Scanner input = new Scanner(System.in);
        //prints out text to screen
        System.out.println("Welcome to Chip’s Fast Food Emporium ");
        System.out.println("Please enter a buger choice");
        //user input for the buger 
        int buger = input.nextInt();

        //user input for the side
        System.out.println("plaese enter a side order choice");
        int side = input.nextInt();

        //user input for the drink
        System.out.println("Please enter a drink choice");
        int drink = input.nextInt();

        //user input for the dessert
        System.out.println("Plaese enter a dessert choice");
        int dessert = input.nextInt();

        //sets value of buger based on the user choice to amount of calories for that choice
        if (buger == 1) {
            buger = 461;
        }
        if (buger == 2) {
            buger = 431;
        }
        if (buger == 3) {
            buger = 420;
        }
        if (buger == 4) {
            buger = 0;
        }

        //calories for corosponding side
        if (side == 1) {
            side = 100;
        }
        if (side == 2) {
            side = 57;
        }
        if (side == 3) {
            side = 70;
        }
        if (side == 4) {
            side = 0;
        }


        //calories for drink of that number
        if (drink == 1) {
            drink = 130;
        }
        if (drink == 2) {
            drink = 160;
        }
        if (drink == 3) {
            drink = 118;
        }
        if (drink == 4) {
            drink = 0;
        }
        //takes dessert number and sets it to the corospending choice of calories
        if (dessert == 1) {
            dessert = 167;
        }
        if (dessert == 2) {
            dessert = 266;
        }
        if (dessert == 3) {
            dessert = 75;
        }
        if (dessert == 4) {
            dessert = 0;
        }
        //adds add calories together 
        int finalC = buger + side + drink + dessert;
        System.out.println("Your total Calorie count is " + finalC);

    }
}
