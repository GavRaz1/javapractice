package javaprojects.consolecalculator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class calcFunctions {
    public Scanner in;
    public int a;
    public int b;
    public int c;
    public int type;

    public void greet() {
        System.out.println("--CONSOLE CALCULATOR v1 BY GAVRAZ--");
        System.out.println("MODES: 0-EXIT, 1-ADDITION, 2-SUBTRACTION, 3-MULTIPLICATION, 4-DIVISION");
        System.out.println("NOTE: THIS PROGRAM IS IN VERY EARLY STAGES AND YOU \nCAN ONLY DO ONE CALCULATION BEFORE RESTARTING");
        System.out.println("SELECT MODE: ");
    }

    public int gather(int type, Scanner in) {
        try {
            greet();
            type = type+in.nextInt(4);
        } catch(InputMismatchException exception) {
            System.out.println("-----------------------------------");
            System.out.println("ERROR: INVALID MODE");
            System.out.println("-----------------------------------");
            System.exit(0);
        }
        return type;
    }

    public void add(int a, int b, int c) {
        c = c+(a+b);
        System.out.println("-----------------------------------");
        System.out.println("RESULT: "+c);
    }

    public void sub(int a, int b, int c) {
        c = c+(a-b);
        System.out.println("-----------------------------------");
        System.out.println("RESULT: "+c);
    }


    public void mul(int a, int b, int c) {
        c = c+(a*b);
        System.out.println("-----------------------------------");
        System.out.println("RESULT: "+c);
    }

    public void div(int a, int b, int c) {
        c = c+(a/b);
        System.out.println("-----------------------------------");
        System.out.println("RESULT: "+c);
    }
}
