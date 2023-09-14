//NAME - Harrison Velasco
//DATE - 9/14/23
//PURPOSE - Learn how to define, input, and print some variables and their values.

import java.util.Scanner;
public class InputPractice2
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        String firstName;
        String lastName;
        System.out.println("Enter your first name :: ");
        firstName = keyboard.next();
        System.out.println("Enter your last name ::");
        lastName = keyboard.next();

        System.out.println("####################\n####################");
        System.out.println(firstName + " " + lastName);
        System.out.println("####################\n####################");
        System.out.println(lastName + ", " + firstName);
    }
}