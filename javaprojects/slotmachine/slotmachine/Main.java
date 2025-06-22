package slotmachine;

// import slotmachine.Gamble;

public class Main {
    static Gamble mechanics;
    public static void main(String[] args) {
        mechanics = new Gamble();
        System.out.println("SLOT MACHINE YOU WILL GAMBLE BY GAVVLE THE RAZZLE\nYOU WILL GET A RANDOM AMOUNT OF MONEY AND YOU MUST GET THREE IN A ROW TO GET YOUR MONEY MULTIPLIED OR LOSE IT ALL");
        System.out.println("ooo = 0.5x\nccc = 1x\nttt = 2x\nYYY = 4x\nXXX = 10x");
        System.out.println("-------------------------------------------------------------");

        mechanics.play();
    }
}
