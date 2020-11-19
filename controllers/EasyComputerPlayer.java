package tictactoe.controllers;

import tictactoe.TicTacToeBoard;

import java.util.List;
import java.util.Random;

public class EasyComputerPlayer implements Player {
    @Override
    public void makeMove(TicTacToeBoard board) {
        System.out.println("Making move level \"easy\"");
        List<String> moves = board.getAvailableCells();
        String move = moves.get(new Random().nextInt(moves.size()));
        board.placeMark(Character.getNumericValue(move.charAt(0)),
                        Character.getNumericValue(move.charAt(2)));
    }
}
