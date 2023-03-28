package MachineCoding.TicTacToe.strategy.botPlayingStrategy;

import MachineCoding.TicTacToe.model.Board;
import MachineCoding.TicTacToe.model.Move;
import MachineCoding.TicTacToe.model.Player;

public interface BotPlayingStrategy {
    Move decideMove(Player player, Board board);
}
