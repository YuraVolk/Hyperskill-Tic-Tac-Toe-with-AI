package tictactoe;

import tictactoe.controllers.EasyComputerPlayer;
import tictactoe.controllers.HumanPlayer;
import tictactoe.controllers.MediumComputerPlayer;
import tictactoe.controllers.Player;

public class GameController {
    private final Player playerOne;
    private final Player playerTwo;
    private final TicTacToeBoard board;

    public GameController(String playerOne, String playerTwo) {
        this.playerOne = getClassByName(playerOne);
        this.playerTwo = getClassByName(playerTwo);
        this.board = new TicTacToeBoard();
    }

    private Player getClassByName(String name) {
        switch (name) {
            case "user":
                return new HumanPlayer();
            case "easy":
                return new EasyComputerPlayer();
            case "medium":
                return new MediumComputerPlayer();
        }

        return null;
    }

    public void startGame() {
        board.printBoard();
        while (true) {
            playerOne.makeMove(board);
            board.printBoard();
            if (board.checkForWin()) {
                System.out.printf("%s wins\n\n", board.getCurrentPlayerMark());
                break;
            } else if (board.isBoardFull()) {
                System.out.println("Draw\n");
                break;
            }
            board.changePlayer();

            playerTwo.makeMove(board);
            board.printBoard();
            if (board.checkForWin()) {
                System.out.printf("%s wins\n\n", board.getCurrentPlayerMark());
                break;
            } else if (board.isBoardFull()) {
                System.out.println("Draw\n");
                break;
            }
            board.changePlayer();
        }
    }
}
