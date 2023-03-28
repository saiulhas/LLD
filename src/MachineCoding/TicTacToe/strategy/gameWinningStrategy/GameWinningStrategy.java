package MachineCoding.TicTacToe.strategy.gameWinningStrategy;

import MachineCoding.TicTacToe.model.Board;
import MachineCoding.TicTacToe.model.Cell;
import MachineCoding.TicTacToe.model.Player;

public interface GameWinningStrategy {
    boolean checkWinner(Board board, Player lastMovePlayer, Cell lastMoveCell);
}
