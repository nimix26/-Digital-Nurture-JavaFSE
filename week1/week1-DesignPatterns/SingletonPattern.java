class Logger {

    
    private static Logger instance = new Logger();

    
    private Logger() {
        System.out.println("Logger instance created.");
    }

  
    public static Logger getInstance() {
        return instance;
    }

    
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}

public class SingletonPatternExample {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("Application Started");

        Logger logger2 = Logger.getInstance();
        logger2.log("User Logged In");

        if (logger1 == logger2) {
            System.out.println("Only one Logger instance is created.");
        } else {
            System.out.println("Multiple Logger instances are created.");
        }
    }
}
