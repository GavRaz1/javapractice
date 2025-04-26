package javaprojects;
import java.util.Scanner;

public final class consoleCalc {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        //TEMPORARY TEST OF SCANNER
        System.out.println("Input username: ");
        String user = userInput.nextLine();
        System.out.println("Username is "+ user);
    }
}