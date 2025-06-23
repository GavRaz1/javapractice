package slotmachine;
import java.util.Random;
import java.util.Scanner;

public class Gamble {

    static final String[] slotSet = {"o","c","t","Y","X"};
    static char[] activeSlots = {'d','i','h'};

    static Random rnum;
    static Scanner input;
    static String result;
    static double balance;
    static double bid;
    
    public Gamble() {
        rnum = new Random();
        input = new Scanner(System.in);
        result = "";
        balance = balance + rnum.nextInt(100,1000);
        bid = 0.0;
    }

    void check() {
        if (bid > balance) {
            bid = 0.0;
            System.out.println("BID HIGHER THAN BALANCE, RESTART PROGRAM");
        }
    }

    void bet() {
        System.out.println("HOW MUCH WOULD YOU LIKE TO BID?");
        System.out.println(balance);
        bid += input.nextDouble();
    }

    void gamble() {
        balance -= bid;
        System.out.println("-------------------------------------------------------------");
        result = result+"\r|"+slotSet[rnum.nextInt(0,5)]+"|"+slotSet[rnum.nextInt(0,5)]+"|"+slotSet[rnum.nextInt(0,5)]+"|";
        System.out.println(result);
        activeSlots[0] = result.charAt(2);
        activeSlots[1] = result.charAt(4);
        activeSlots[2] = result.charAt(6);

        if (activeSlots[0] == activeSlots[1] && activeSlots[1] == activeSlots[2]) {
            if (activeSlots[1] == 'o') {
                balance = balance + (bid*0.5);
                System.out.println("\nYOU WON 0.5X MULTIPLIER!");
                System.out.println("-------------------------------------------------------------");
                bid -= bid;
            } else if (activeSlots[1] == 'c') {
                balance = balance + bid;
                System.out.println("\nYOU WON 1.0X MULTIPLIER!");
                System.out.println("-------------------------------------------------------------");
                bid = 0.0;
            } else if (activeSlots[1] == 't') {
                balance = balance + (bid*2);
                System.out.println("\nYOU WON 2.0X MULTIPLIER!");
                System.out.println("-------------------------------------------------------------");
                bid -= bid;
            } else if (activeSlots[1] == 'Y') {
                balance = balance + (bid*4);
                System.out.println("\nYOU WON 4.0X MULTIPLIER!!");
                System.out.println("-------------------------------------------------------------");
                bid -= bid;
            } else if (activeSlots[1] == 'X') {
                balance = balance + (bid*10);
                System.out.println("\nYOU WON 10.0X MULTIPLIER!!!");
                System.out.println("-------------------------------------------------------------");
                bid -= bid;
            }
        } else {
            System.out.println("\nBUST!");
            System.out.println("-------------------------------------------------------------");
            bid -= bid;
        }
    }

    void play() {
        bet();
        check();
        gamble();
    }
}