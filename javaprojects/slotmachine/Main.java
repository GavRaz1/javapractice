import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static String[] slotSet = {"o", "o", "o", "o", "o", "o", "o", "o", "o", "o", "o", "o", "o", "o", "o", "o", "o", "o", "o", "o", 
    "c", "c", "c", "c", "c", "c", "c", "c", "c", "c", "t", "t", "t", "t", "t", "Y", "Y", "Y", "X", "X"};

    public double bid = 0.0;

    public static void main(String[] args) {
        Random rnum = new Random();
        Scanner input = new Scanner(System.in);
        String machine = "";
        boolean gambling = false;
        char a = ' ';
        char b = ' ';
        char c = ' ';
        double balance = rnum.nextInt(100, 1000);
        double bid = 0.0;
        
        info();
        while (true) {
            if (gambling == false) {
                bet(input, balance, bid);
                gambling = true;
            } else {
                gamble(rnum, machine, a, b, c, balance, bid);
                gambling = false;
            }
        }
    }

    public static void info() {
        System.out.println("SLOT MACHINE YOU WILL GAMBLE BY GAVVLE THE RAZZLE\nYOU WILL GET A RANDOM AMOUNT OF MONEY AND YOU MUST GET THREE IN A ROW TO GET YOUR MONEY MULTIPLIED OR LOSE IT ALL");
        System.out.println("ooo = 0.5x\nccc = 1x\nttt = 2x\nYYY = 4x\nXXX = 10x");
        System.out.println("-------------------------------------------------------------");
    }

    public static void bet(Scanner input, double money, double bid) {
        System.out.println("BALANCE: "+money);
        System.out.println("HOW MUCH WOULD YOU LIKE TO BID?");
        bid = bid + input.nextDouble();
    }

    public static void gamble(Random num, String result, char a, char b, char c, double money, double bid) {
        System.out.println(money);
        System.out.println(bid);
        System.out.println(money - bid);
        System.out.println(money);
        System.out.println("-------------------------------------------------------------");
        System.out.print("Rolling...");

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        result = result+"\r|"+slotSet[num.nextInt(0,40)]+"|"+slotSet[num.nextInt(0,40)]+"|"+slotSet[num.nextInt(0,40)]+"|   ";
        System.out.print(result);
        a = result.charAt(2);
        b = result.charAt(4);
        c = result.charAt(6);

        if (a == b && b == c) {
           if (b == 'o') {
            money = money + (bid*0.5);
            bid = 0.0;
            System.out.println("\nYOU WON 0.5X MULTIPLIER!");
            System.out.println("-------------------------------------------------------------");
            
           } else if (b == 'c') {
            money = money + bid;
            System.out.println("\nYOU WON 1.0X MULTIPLIER!");
            System.out.println("-------------------------------------------------------------");
            
           } else if (b == 't') {
            money = money + (bid*2);
            bid = 0.0;
            System.out.println("\nYOU WON 2.0X MULTIPLIER!");
            System.out.println("-------------------------------------------------------------");
            
           } else if (b == 'Y') {
            money = money + (bid*4);
            bid = 0.0;
            System.out.println("\nYOU WON 4.0X MULTIPLIER!");
            System.out.println("-------------------------------------------------------------");
            
           } else if (b == 'X') {
            money = money + (bid*10);
            bid = 0.0;
            System.out.println("\nYOU WON 10.0X MULTIPLIER!");
            System.out.println("-------------------------------------------------------------");
            
           }
        } else {
            System.out.println("\nBUST!");
            System.out.println("-------------------------------------------------------------");
            
        }
    }
}