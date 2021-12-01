package fr.lernejo.logger;

public class CompositeLogger implements Logger{
    Logger log1;
    Logger log2;
    @Override
    public void log(String message) {
        this.log1.log(message);
        this.log2.log(message);
    }
    public CompositeLogger(Logger p_logger_1, Logger p_logger_2){
        this.log1 = p_logger_1;
        this.log2 = p_logger_2;
    }
}
