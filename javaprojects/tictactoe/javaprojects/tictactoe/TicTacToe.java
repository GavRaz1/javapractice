package javaprojects.tictactoe;

public class TicTacToe {
    static Backend game;
    static boolean active;
    public static void main(String[] args) {
        game = new Backend();
        active = false;

        System.out.println("WELCOME TO TIC-TAC-TOE: HORRENDOUS EDITION (YOU KNOW THE RULES OF THE GAME CMON)");
        game.gatherPlayerInfo();
        while (true) {
            if (active == false) {
                active = true;
                game.turnLogic();
                active = false;
            }
        }
    }
}
