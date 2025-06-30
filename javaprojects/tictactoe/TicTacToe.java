package javaprojects.tictactoe;
import java.util.Scanner;

public class TicTacToe {
    static Scanner input;
    static Backend game;
    static boolean active;
    public static void main(String[] args) throws InterruptedException {
        game = new Backend();
        input = new Scanner(System.in);
        active = false;

        System.out.println("WELCOME TO TIC-TAC-TOE: HORRENDOUS EDITION (YOU KNOW THE RULES OF THE GAME CMON)");
        game.gatherInfo();
    }
}
