package fr.lernojo.logger;

public class LoggerFactory implements Logger{

    public static Logger getLogger(String name){
        return new ConsoleLogger();
    }

    @Override
    public void log(String message) {

    }
}
