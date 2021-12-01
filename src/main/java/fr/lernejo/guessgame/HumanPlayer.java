package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player{
    Logger logger = LoggerFactory.getLogger("Player");
    Scanner scanner = new Scanner(System.in);
    @Override
    public long askNextGuess() {
        long result = this.scanner.nextLong();
        return result;
    }

    @Override
    public void respond(boolean lowerOrGreater) {

    }
}
