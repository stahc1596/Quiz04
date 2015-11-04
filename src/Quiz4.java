
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stahc1596
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        //The program welcomes the user and starts asking what the user is ordering.
        System.out.println("Welcome to Chip's Fast Food Emporium!");
        System.out.print("Please enter a burger choice: ");

        //All of the calories will be in these variables
        int burger = input.nextInt();
        int drink = input.nextInt();
        int side = input.nextInt();
        int dess = input.nextInt();

        //The program takes the users first choice which is a burger and finds the calories it has. If the user doesn't
        //enter a valid order, the program will ask the user again what he/she chose.
        while (true) {
            if (burger != 1 && burger != 2 && burger != 3 && burger != 4) {
                System.out.println("Please try again.");
                burger = input.nextInt();
            }
            if (burger == 1) {
                burger = burger + 460;
                break;
            } else if (burger == 2) {
                burger = burger + 429;
                break;
            } else if (burger == 3) {
                burger = burger + 417;
                break;
            } else if (burger == 4) {
                burger = burger - 4;
                break;
            }
        }

        //The program takes the users second choice which is a drink and finds the calories it has. If the user doesn't
        //enter a valid order, the program will ask the user again what he/she chose.
        System.out.print("Please enter a drink choice: ");
        while (true) {
            if (drink != 1 && drink != 2 && drink != 3 && drink != 4) {
                System.out.println("Please try again.");
                drink = input.nextInt();
            }
            if (drink == 1) {
                drink = drink + 129;
                break;
            } else if (drink == 2) {
                drink = drink + 158;
                break;
            } else if (drink == 3) {
                drink = drink + 115;
                break;
            } else if (drink == 4) {
                drink = drink - 4;
                break;
            }
        }

        //The program takes the users third choice which is a side order and finds the calories it has. If the user doesn't
        //enter a valid order, the program will ask the user again what he/she chose.
        System.out.print("please enter a side order choice: ");
        while (true) {
            if (side != 1 && side != 2 && side != 3 && side != 4) {
                System.out.println("Please try again.");
                side = input.nextInt();
            }
            if (side == 1) {
                side = side + 99;
                break;
            } else if (side == 2) {
                side = side + 55;
                break;
            } else if (side == 3) {
                side = side + 67;
                break;
            } else if (side == 4) {
                side = side - 4;
                break;
            }
        }

        //The program takes the users fourth choice which is a dessert and finds the calories it has. If the user doesn't
        //enter a valid order, the program will ask the user again what he/she chose.
        System.out.print("Please enter a dessert choice: ");
        while (true) {
            if (dess != 1 && dess != 2 && dess != 3 && dess != 4) {
                System.out.println("Please try again.");
                dess = input.nextInt();
            }
            if (dess == 1) {
                dess = dess + 166;
                break;
            } else if (dess == 2) {
                dess = dess + 264;
                break;
            } else if (dess == 3) {
                dess = dess + 75;
                break;
            } else if (dess == 4) {
                dess = dess - 4;
                break;
            }
        }

        //The program then adds up all the calories in the users order and spits it out.
        System.out.println("Your total calorie count is " + burger + drink + side + dess);
    }
}
