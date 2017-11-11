import org.apache.logging.log4j.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Krishna");
        Logger log = LogManager.getLogger(Main.class);
        log.fatal("Fatal");
        log.error("Error");
        log.info("Info");
        log.debug("Debug");
        log.trace("Trace");
    }
}
