package javaprojects;
import java.util.Scanner;

public final class consoleCalc {
    public int a;
    public int b;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String modeName = "";

        System.out.println("--CONSOLE CALCULATOR v1 BY GAVRAZ--");
        System.out.println("MODES: 1-ADDITION, 2-SUBTRACTION, 3-MULTIPLICATION, 4-DIVISION");
        System.out.println("SELECT MODE: ");
        int mode = input.nextInt();

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
                modeName = "INVALID MODE SELECTION";
                break;
        }

        System.out.println("MODE SELECTED: "+modeName);

        if (modeName == "INVALID MODE SELECTION") {
            
        }
    }
}