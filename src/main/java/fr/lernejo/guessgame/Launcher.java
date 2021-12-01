package fr.lernejo.guessgame;

import fr.lernejo.logger.ConsoleLogger;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.security.SecureRandom;

public class Launcher {
    public static void main(String[] args) {
        final int Max = 100;
        ConsoleLogger Clogger = (ConsoleLogger) LoggerFactory.getLogger("launche");
        SecureRandom random = new SecureRandom();
        long randomNumber = random.nextInt(Max);
        if (args[0].equals("-interactive")){
            int MaxValue = 20;
            HumanPlayer Hplayer = new HumanPlayer();
            Simulation simulation = new Simulation(Hplayer);
            simulation.initialize(randomNumber);
            simulation.loopUntilPlayerSucceed(MaxValue);
        }
        if (args[0].equals("-auto")){
            try {
                long Lnum = Long.valueOf(args[1]);
                ComputerPlayer Cplayer = new ComputerPlayer();
                Simulation simulation = new Simulation(Cplayer);
                simulation.initialize(randomNumber);
                simulation.loopUntilPlayerSucceed(Lnum);
            } catch (NumberFormatException e) {
                Clogger.log("Erreur: "+e+"\nVeuillez en deuxieme argument un nombre d'essai");

            }
        }
        else{
            Clogger.log("Les deux seul option sont : -interactive et -auto <int>\nVeuillez entrez une des ces options");
        }

    }
}
