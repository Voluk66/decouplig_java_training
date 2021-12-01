package fr.lernojo.logger;

public class LoggerFactory implements Logger{
    @Override
    public void log(String message) {

    }
    public static Logger getLogger(String name){
        Logger logger = new Logger() {
            @Override
            public void log(String message) {

            }
        };
        return  logger;
    }
}
