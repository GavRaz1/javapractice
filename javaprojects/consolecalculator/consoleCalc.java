package javaprojects.consolecalculator;
import java.util.Scanner;
import javaprojects.consolecalculator.calcFunctions;

public class consoleCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        calcFunctions functions = new calcFunctions();
        String modeName = "";
        int mode;
        int val1;
        int val2;
        int val3 = 0;

        System.out.println("--CONSOLE CALCULATOR v1 BY GAVRAZ--");
        System.out.println("MODES: 1-ADDITION, 2-SUBTRACTION, 3-MULTIPLICATION, 4-DIVISION");
        System.out.println("NOTE: THIS PROGRAM IS IN VERY EARLY STAGES AND YOU \nCAN ONLY DO ONE CALCULATION BEFORE RESTARTING");
        System.out.println("SELECT MODE: ");
        mode = input.nextInt();

        switch (mode) {
            case 1:
                modeName = "ADDITION";
                break;
            case 2:
                modeName = "SUBTRACTION";
                break;
            case 3:
                modeName = "MULTIPLICATION";
                break;
            case 4:
                modeName = "DIVISION";
                break;
            default:
                modeName = "INVALID MODE SELECTION; RESTART PROGRAM";
                break;
        }

        System.out.println("MODE SELECTED: "+modeName);
        System.out.println("-----------------------------------");
        System.out.println("TYPE VALUE A:");
        val1 = input.nextInt();
        System.out.println("TYPE VALUE B:");
        val2 = input.nextInt();

        switch (mode) {
            case 1:
                functions.add(val1, val2, val3);
                break;
            case 2:
                functions.sub(val1, val2, val3);
                break;
            case 3:
                functions.mul(val1, val2, val3);
                break;
            case 4:
                functions.div(val1, val2, val3);
                break;
            default:
                System.out.println("-----------------------------------");
                System.out.println("INVALID MODE SELECTION; RESTART PROGRAM");
                break;
        }
        System.out.println("-----------------------------------");
        System.out.println("PROGRAM END, THANK YOU FOR USING THIS SHITTY SET OF CODE");
    }
}