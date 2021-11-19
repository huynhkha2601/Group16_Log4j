
/*
    19127055 - Lê Vũ Minh Nhật
    19127166 - Huỳnh Tuấn Kha
    19127565 - Nguyễn Quốc Thông
    19127600 - Lê Quốc Trọng
*/


package group16_log4j;

import org.apache.log4j.Logger;
/**
 *
 * @author huynh
 */
public class Group16_Log4j {

       // create a logger with main class
    final static Logger logger = Logger.getLogger(Group16_Log4j.class);

    // using a simple function to run some level logger with a message string
    // whether occur if we run the proj;
    public void getLoggerMessage(String message) {
        logger.debug("This is DEBUG level: " + message);
        logger.info("This is INFO level: " + message);
        logger.warn("This is WARN level: " + message);
        logger.error("This is ERROR level: " + message);
        logger.fatal("This is FATAL level: " + message);
        logger.trace("This is TRACE level: " + message);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Group16_Log4j log = new Group16_Log4j();
        log.getLoggerMessage("Hello world!");
    }

}
