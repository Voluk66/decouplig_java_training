package fr.lernojo.guessgame;

import fr.lernojo.logger.Logger;
import fr.lernojo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player{
    Logger logger = LoggerFactory.getLogger("player");
    Scanner scanner = new Scanner(System.in);
    @Override
    public long askNextGuess() {
        return 0;
    }

    @Override
    public void respond(boolean lowerOrGreater) {

    }
}
