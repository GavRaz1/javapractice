import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public final String[] slotTypes = {"o", "c", "t", "Y", "X"};

    public static void main(String[] args) {
        Random rnum = new Random();
        Scanner input = new Scanner(System.in);
        double balance = rnum.nextInt(100, 1000);
        double bid;

        System.out.println("SLOT MACHINE YOU WILL GAMBLE BY GAVVLE THE RAZZLE\nYOU WILL GET A RANDOM AMOUNT OF MONEY AND YOU MUST GET THREE IN A ROW TO GET YOUR MONEY MULTIPLIED OR LOSE IT ALL");
        System.out.println("ooo = 0.5x\nccc = 1x\nttt = 2x\nYYY = 4x\nXXX = 10x");
        System.out.println("-------------------------------------------------------------");
        System.out.println("BALANCE: "+balance);
        System.out.println("HOW MUCH WOULD YOU LIKE TO BID?");
        bid = input.nextDouble();
        
        if (bid > balance) {
            //work on this tmrw big guy
        } else {
            System.out.println("-------------------------------------------------------------");
        }
    }
}