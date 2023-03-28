package MachineCoding.TicTacToe.factory;

import MachineCoding.TicTacToe.model.BotDifficultyLevel;
import MachineCoding.TicTacToe.strategy.botPlayingStrategy.BotPlayingStrategy;
import MachineCoding.TicTacToe.strategy.botPlayingStrategy.LinearBotPlayingStrategy;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel level){
        //TODO Depending on difficulty level return bot strategy
        return new LinearBotPlayingStrategy();
    }
}
