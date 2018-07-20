import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        Exercise 1
        System.out.println("It’s a great day today");

        System.out.print("What is your name?: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Hello "+name);

//       Exercise 2
        System.out.print("Enter a number: ");
        Scanner scanIn = new Scanner(System.in);
        int number1 = scanIn.nextInt();
        System.out.print("Enter a number: ");
        int number2 = scanIn.nextInt();


        System.out.println(number1+number2);
        System.out.println(number1-number2);

//       Exercise 3
        System.out.println("Hello: "+name+".");
        System.out.println("What is your current Balance?: ");
        Scanner bankBalance = new Scanner(System.in);
        int balance = bankBalance.nextInt();
        System.out.print("I’ve granted you $1.50 more!. Your new balance is: ");
        System.out.print(balance+1.50);

    }
}
