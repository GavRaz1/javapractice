package javaprojects.tictactoe;
import java.util.Random;
import java.util.Scanner;

public class Backend {
    static Scanner input;
    static Random rnum;

    static String player1;
    static String player2;
    static int occupiedSpaces;
    static int coordX;
    static int coordY;
    static boolean isP1sTurn;

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
     * (game not 0-indexed, code 0-indexed)
    */

    public Backend() {
        input = new Scanner(System.in);
        occupiedSpaces = 0;
        player1 = "";
        player2 = "";
        coordX = 0;
        coordY = 0;
        isP1sTurn = true;
    }

    public void gatherPlayerInfo() {
        System.out.print("ENTER PLAYER1: ");
        player1 = input.nextLine();
        System.out.print("ENTER PLAYER2: ");
        player2 = input.nextLine();
    }

    public void turnLogic() {
        if (isP1sTurn == true) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("IT IS "+player1+"'S TURN");
            System.out.println("-------------------------------------------------------------");

            visualize();
            gatherCoords();

            if (gameLayout[coordY][coordX] == '-') {
                gameLayout[coordY][coordX] = 'X';
            } else {
                System.out.println("SPACE ALREADY TAKEN!");
                coordY = 0;
                coordX = 0;
                gatherCoords();
                gameLayout[coordY][coordX] = 'X';
            }

            occupiedSpaces++;
            isP1sTurn = false;
        } else {
            System.out.println("-------------------------------------------------------------");
            System.out.println("IT IS "+player2+"'S TURN");
            System.out.println("-------------------------------------------------------------");

            visualize();
            gatherCoords();

            if (gameLayout[coordY][coordX] == '-') {
                gameLayout[coordY][coordX] = 'O';
            } else {
                System.out.println("SPACE ALREADY TAKEN!");
                coordY = 0;
                coordX = 0;
                gatherCoords();
                gameLayout[coordY][coordX] = 'O';
            }

            winCheck();
            occupiedSpaces++;
            isP1sTurn = true;
        }
    }

    public void visualize() {
        System.out.println("    1   2   3  ");
        System.out.println("1 | "+gameLayout[0][0]+" | "+gameLayout[0][1]+" | "+gameLayout[0][2]+" |");
        System.out.println("2 | "+gameLayout[1][0]+" | "+gameLayout[1][1]+" | "+gameLayout[1][2]+" |");
        System.out.println("3 | "+gameLayout[2][0]+" | "+gameLayout[2][1]+" | "+gameLayout[2][2]+" |");
    }

    public void gatherCoords() {
        System.out.print("ENTER COORD1: ");
        coordY = input.nextInt()-1;
        System.out.print("ENTER COORD2: ");
        coordX = input.nextInt()-1;
    }

    public void winnerReset(String player) {
        System.out.println("-------------------------------------------------------------");
        System.out.println(player+" HAS WON!");
        System.out.println("-------------------------------------------------------------");

        for (int i=0;i>gameLayout.length;i++) {
            for (int j=0;j>gameLayout[i].length;j++) {
                gameLayout[i][j] = '-';
            }
        }

        coordY = 0;
        coordX = 0;
        isP1sTurn = true;
    }

    public void winCheck() {
        if (occupiedSpaces < 9 || occupiedSpaces == 9) {
            if (gameLayout[0][0] == gameLayout[1][0] && gameLayout[1][0] == gameLayout[2][0]) {             //c1 win
                if (gameLayout[0][0] == 'X' && gameLayout[1][0] == 'X' && gameLayout[2][0] == 'X') {
                    winnerReset(player1);
                } else if (gameLayout[0][0] == 'O' && gameLayout[1][0] == 'O' && gameLayout[2][0] == 'O') {
                    winnerReset(player2);
                }
            } else if (gameLayout[0][1] == gameLayout[1][1] && gameLayout[1][1] == gameLayout[2][1]) {      //c2 win
                if (gameLayout[0][1] == 'X' && gameLayout[1][1] == 'X' && gameLayout[2][1] == 'X') {
                    winnerReset(player1);
                } else if (gameLayout[0][1] == 'O' && gameLayout[1][1] == 'O' && gameLayout[2][1] == 'O') {
                    winnerReset(player2);
                }
            } else if (gameLayout[0][2] == gameLayout[1][2] && gameLayout[1][2] == gameLayout[2][2]) {      //c3 win
                if (gameLayout[0][2] == 'X' && gameLayout[1][2] == 'X' && gameLayout[2][2] == 'X') {
                    winnerReset(player1);
                } else if (gameLayout[0][0] == 'O' && gameLayout[1][0] == 'O' && gameLayout[2][0] == 'O') {
                    winnerReset(player2);
                }
            } else if (gameLayout[0][0] == gameLayout[0][1] && gameLayout[0][1] == gameLayout[0][2]) {      //r1 win
                if (gameLayout[0][0] == 'X' && gameLayout[0][1] == 'X' && gameLayout[0][2] == 'X') {
                    winnerReset(player1);
                } else if (gameLayout[0][0] == 'O' && gameLayout[0][1] == 'O' && gameLayout[0][2] == 'O') {
                    winnerReset(player2);
                }
            } else if (gameLayout[1][0] == gameLayout[1][1] && gameLayout[1][1] == gameLayout[1][2]) {      //r2 win
                if (gameLayout[1][0] == 'X' && gameLayout[1][1] == 'X' && gameLayout[1][2] == 'X') {
                    winnerReset(player1);
                } else if (gameLayout[1][0] == 'O' && gameLayout[1][1] == 'O' && gameLayout[1][2] == 'O') {
                    winnerReset(player2);
                }
            } else if (gameLayout[2][0] == gameLayout[2][1] && gameLayout[2][1] == gameLayout[2][2]) {      //r3 win
                if (gameLayout[2][0] == 'X' && gameLayout[2][1] == 'X' && gameLayout[2][2] == 'X') {
                    winnerReset(player1);
                } else if (gameLayout[2][0] == 'O' && gameLayout[2][1] == 'O' && gameLayout[2][2] == 'O') {
                    winnerReset(player2);
                }
            } else if (gameLayout[0][2] == gameLayout[1][1] && gameLayout[1][1] == gameLayout[2][0]) {      //13-31 win
                if (gameLayout[0][2] == 'X' && gameLayout[1][1] == 'X' && gameLayout[2][0] == 'X') {
                    winnerReset(player1);
                } else if (gameLayout[0][2] == 'O' && gameLayout[1][1] == 'O' && gameLayout[2][0] == 'O') {
                    winnerReset(player2);
                }
            } else if (gameLayout[0][0] == gameLayout[1][1] && gameLayout[1][1] == gameLayout[2][2]) {      //11-33 win
                if (gameLayout[2][0] == 'X' && gameLayout[2][1] == 'X' && gameLayout[2][2] == 'X') {
                    winnerReset(player1);
                } else if (gameLayout[2][0] == 'O' && gameLayout[2][1] == 'O' && gameLayout[2][2] == 'O') {
                    winnerReset(player2);
                }
            } else {
            }
        } else {
            System.out.println("how tf");
        }
    }

    public void play() {

    }
}
