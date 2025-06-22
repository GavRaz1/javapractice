package slotmachine;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Gamble {

    static final String[] slotSet = {"o", "o", "o", "o", "o", "o", "o", "o", "o", "o", "o", "o", "o", "o", "o", "o", "o", "o", "o", "o", "c", "c", "c", "c", "c", "c", "c", "c", "c", "c", "t", "t", "t", "t", "t", "Y", "Y", "Y", "X", "X"};
    static Random rnum;
    static Scanner input;
    static String result;
    static double balance;
    static double bid;
    static char a;
    static char b;
    static char c;
    static boolean gambling;
    static boolean checkFail;
    
    
    public Gamble() {
        rnum = new Random();
        input = new Scanner(System.in);
        result = "";
        balance = rnum.nextInt(100,1000);
        bid = 0.0;
        a = ' ';
        b = ' ';
        c = ' ';
        gambling = false;
        checkFail = false;
    }

    void check() {
        if (bid > balance) {
            bid = 0.0;
            System.out.println("BID HIGHER THAN BALANCE, PLEASE REBID");
            checkFail = true;
        }
    }

    void bet() {
        System.out.println("HOW MUCH WOULD YOU LIKE TO BID?");
        bid = bid + input.nextDouble();
    }

    void gamble() {
        balance = balance - bid;
        System.out.println("-------------------------------------------------------------");
        System.out.println("Rolling...");

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        result = result+"\r|"+slotSet[rnum.nextInt(0,40)]+"|"+slotSet[rnum.nextInt(0,40)]+"|"+slotSet[rnum.nextInt(0,40)]+"|   ";
        a = result.charAt(2);
        b = result.charAt(4);
        c = result.charAt(6);

        if (a == b && b == c) {
            if (b == 'o') {
                balance = balance + (bid*0.5);
                System.out.println("\nYOU WON 0.5X MULTIPLIER!");
                System.out.println("-------------------------------------------------------------");
                bid = 0.0;
            } else if (b == 'c') {
                balance = balance + bid;
                System.out.println("\nYOU WON 1.0X MULTIPLIER!");
                System.out.println("-------------------------------------------------------------");
                bid = 0.0;
            } else if (b == 't') {
                balance = balance + (bid*2);
                System.out.println("\nYOU WON 2.0X MULTIPLIER!");
                System.out.println("-------------------------------------------------------------");
                bid = 0.0;
            } else if (b == 'Y') {
                balance = balance + (bid*4);
                System.out.println("\nYOU WON 4.0X MULTIPLIER!");
                System.out.println("-------------------------------------------------------------");
                bid = 0.0;
            } else if (b == 'X') {
                balance = balance + (bid*10);
                System.out.println("\nYOU WON 10.0X MULTIPLIER!");
                System.out.println("-------------------------------------------------------------");
                bid = 0.0;
            } else {
                System.out.println("\nBUST!");
                System.out.println("-------------------------------------------------------------");
                bid = 0.0;
            }
        }
    }

    void play() {
        while (true) {
            if (gambling == false) {
                bet();
                check();
                if (checkFail == true) {
                    continue;
                }
                gambling = true;
            } else {
                gamble();
            }
        }
    }
}