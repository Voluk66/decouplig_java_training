package fr.lernejo.guessgame;

import java.security.SecureRandom;

public class Launcher {
    public static void main(String[] args) {
        if (args[1].equals("-interactive")){
            int MaxValue = 20;
            HumanPlayer Hplayer = new HumanPlayer();
            Simulation simulation = new Simulation(Hplayer);
            SecureRandom random = new SecureRandom();
            long randomNumber = random.nextInt(100);
            simulation.initialize(randomNumber);
            simulation.loopUntilPlayerSucceed(MaxValue);
        }
        if (args[1].equals("-auto")){
            try {
                long Lnum = Long.valueOf(args[2]);
                
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

    }
}
