package fr.lernejo.logger;

import java.util.function.Predicate;

public class FilteredLogger implements Logger{
    Logger delagate;
    Predicate<String> condition;
    @Override
    public void log(String message) {
        if (condition.test(message)){
            delagate.log(message);
        }
    }
    public FilteredLogger(Logger delegate, Predicate<String> condition){
        //todo
        this.delagate = delegate;
        this.condition = condition;
    }
}
