import java.util.Scanner;

/**
 * InputOutput
 */
public class InputOutput {

    public static void main(String[] args) {

        // System.out.println("Enter Your Age");
        Scanner input = new Scanner(System.in);
        // take input a integer value
        // int age = input.nextInt();
        // System.out.println("Your age is " + age);
        // take input a string value
        // System.out.println("Enter your name");
        // String name=input.nextLine();
        // System.out.println("Your name is " + name);
        // System.out.print("Enter Your Price : ");
        // float price = input.nextFloat();
        // System.out.println("Your Price is " + price);
        System.out.println("enter your double price");

        double price = input.nextDouble();
        System.out.println("Enter your double price  " + price);

    }
}