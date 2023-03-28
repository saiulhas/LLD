package DesignPatterns._01Singleton;

public class Logger {
    private static  Logger log;

    private Logger(){

    }

    public static Logger getLogObj(){
        if(log==null) log = new Logger();

        return log;
    }
}
