package fr.lernojo.guessgame;

import fr.lernojo.logger.Logger;
import fr.lernojo.logger.LoggerFactory;

import java.util.Scanner;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player  player;  //TODO add variable type
    private long numberToGuess; //TODO add variable type

    public Simulation(Player player) {
        //TODO implement me
        this.player = player;
    }

    public void initialize(long numberToGuess) {
        //TODO implement me
        this.numberToGuess = numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        //TODO implement me
        Scanner scanner = new Scanner(System.in);
        long PlayerNumber = scanner.nextLong();
        if (PlayerNumber == this.numberToGuess){
            logger.log("GG tu as trouvé le nombre etait:" + this.numberToGuess);
            return true;
        }
        if (PlayerNumber < this.numberToGuess){
            logger.log("le nombre entré est plus petit que celui a deviné");
        }
        else{
            logger.log("le nombre entré est plus grand que celui a deviné");
        }
        return false;


    }

    public void loopUntilPlayerSucceed() {
        //TODO implement me
        logger.log("Debut de la partie");
        while (!this.nextRound());
    }
}
