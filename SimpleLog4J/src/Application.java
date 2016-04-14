import org.apache.log4j.Logger;

public class Application {

    // Create a Logger
    static Logger LOG = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {
        LOG.info("This is test INFO level log");
        LOG.error("This is test ERROR level log");
        LOG.debug("This is test DEBUG level log");
        // TRYME: Change severity level in log4j config
    }

}
