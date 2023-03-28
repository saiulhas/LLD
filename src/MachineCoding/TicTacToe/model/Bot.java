package MachineCoding.TicTacToe.model;

import MachineCoding.TicTacToe.factory.BotPlayingStrategyFactory;
import MachineCoding.TicTacToe.strategy.botPlayingStrategy.BotPlayingStrategy;

public class Bot extends Player{
    private BotDifficultyLevel level;
    private BotPlayingStrategy strategy;

    public Bot(char symbol, String name, BotDifficultyLevel level) {
        super(symbol, name, PlayerType.BOT);
        this.level = level;
        this.strategy = BotPlayingStrategyFactory.getBotPlayingStrategy(level);
    }

    public BotDifficultyLevel getLevel() {
        return level;
    }

    public void setLevel(BotDifficultyLevel level) {
        this.level = level;
    }
    @Override
    public Move decideMove(Board board){
        return strategy.decideMove(this, board);
    }
}
