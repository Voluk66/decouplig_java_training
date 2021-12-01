package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("Simulation");
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
        boolean lowerOrgreater = false;
        //Scanner scanner = new Scanner(System.in);

        long PlayerNumber = player.askNextGuess();
        if (PlayerNumber == this.numberToGuess){
            logger.log(String.valueOf(PlayerNumber));
            logger.log("GG tu as trouvé le nombre etait:" + this.numberToGuess);
            return true;
        }
        if (PlayerNumber < this.numberToGuess){
            logger.log("le nombre entré est plus petit que celui a deviné");
            player.respond(true);
        }
        else{
            logger.log("le nombre entré est plus grand que celui a deviné");
            player.respond(false);

        }
        return false;


    }

    public void loopUntilPlayerSucceed(long p_pv) {
        //TODO implement me
        long depart = System.currentTimeMillis();
        long fin = 0;
        long PV = p_pv;
        logger.log("Debut de la partie");
        while (!this.nextRound()){
            PV--;
            if (PV == 0){
                fin = System.currentTimeMillis();
                logger.log("Le joueur n'as plus de tentative\nLe nombre etait "+String.valueOf(this.numberToGuess));
                break;
            }
        }
        if (PV > 0){
            String SPV = String.valueOf(PV);
            logger.log("Le joueur a trouvé le nombre il lui reste "+SPV+" tentatives");
            fin = System.currentTimeMillis();
        }
        long Duree = fin - depart;
        int ms = (int) (Duree % 1000);
        int s = (int)(Duree - ms)/1000;
        int min = (int)(Duree - s - ms)/60000;
        String Sms = String.valueOf(ms);
        String Ss = String.valueOf(s);
        String Smin = String.valueOf(min);
        logger.log("Le jeux a duree "+Smin+":"+Ss+":"+Sms);
    }
}
