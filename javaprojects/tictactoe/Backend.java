package javaprojects.tictactoe;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Backend {
    static Scanner input;
    static Random rnum;

    static String player1;
    static String player2;
    static String winner;
    static int occupiedSpaces;
    static int firstPlayType;
    static int coordX;
    static int coordY;

    static char[][] gameLayout = { //for debug purposes blanks will be dashes
        {'-','-','-'},
        {'-','-','-'},
        {'-','-','-'}
    };

    /* VISUALS GUIDE
     *     1   2   3
     * 1 | O |   | X |
     * 2 |   | X | O |
     * 3 | X |   | O |
    */

    public Backend() {
        input = new Scanner(System.in);
        occupiedSpaces = 0;
        firstPlayType = 0;
        player1 = "";
        player2 = "";
        winner = "";
        coordX = 0;
        coordY = 0;
    }

    public void gatherInfo() {
        System.out.print("ENTER PLAYER1: ");
        player1 = input.nextLine();
        System.out.print("ENTER PLAYER2: ");
        player2 = input.nextLine();
    }

    public void winCheck() {

    }

    public void play() throws InterruptedException {

    }
}
