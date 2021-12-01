package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class ComputerPlayer implements Player{
    Logger logger = LoggerFactory.getLogger("Player");
    boolean Starting = true;
    boolean lowerOrGreater = false;
    long nextGuess = 50;
    long up  = 100;
    long down = 0;
    @Override
    public long askNextGuess() {
        logger.log(String.valueOf(this.nextGuess));
        if (this.Starting){
            this.Starting = false;
            return this.nextGuess;
        }
        else{
            if (this.lowerOrGreater){
                this.down = (int) this.nextGuess;

            }
            else{
                this.up = this.nextGuess;

            }
            this.nextGuess = (this.down + this.up) / 2;
            return  this.nextGuess;
        }

    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if (lowerOrGreater){
            this.lowerOrGreater = true;
        }
        else{
            this.lowerOrGreater = false;
        }
    }
}
