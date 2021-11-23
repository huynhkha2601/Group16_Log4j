
/*
    19127055 - Lê Vũ Minh Nhật
    19127166 - Huỳnh Tuấn Kha
    19127565 - Nguyễn Quốc Thông
    19127600 - Lê Quốc Trọng
 */
package group16_log4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.Level;
import org.apache.log4j.PropertyConfigurator;

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

    // demo
    public void DemoFile() {
        logger.debug("debug log");
        logger.error("error log");
        logger.info("info log");
    }

    // check level of log
    public void check_logger_Lv() {
        if (logger.getLevel() == null) {
            System.out.println("NULL");
        } else {
            System.out.println("The level of logger is: " + logger.getLevel());
        }
    }

    // using to check level with specific level log.
    public void try_Lv_log4j(Group16_Log4j log) {
        logger.setLevel(Level.DEBUG);
        log.check_logger_Lv();
        log.getLoggerMessage("Hello world!");
        log.DemoFile();

        logger.trace("trace: ");
        logger.warn("warn: now we change from DEBUG to ERROR");
        logger.fatal("fatal: ");

        logger.setLevel(Level.ERROR);
        log.check_logger_Lv();
        log.getLoggerMessage("Hello world!");
        log.DemoFile();
    }

    // log file with error (Exception)
    public void checkLogWithException() {
        try {
            double a = 5 / 0;
            System.out.println("a = " + a);
        } catch (ArithmeticException e) {
            logger.debug("This is debug with exception: ", e);
            logger.warn("This is debug with exception: ", e);
            logger.info("This is debug with exception: ", e);
            logger.fatal("This is debug with exception: ", e);
            logger.error("This is debug with exception: ", e);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("src/log4j.properties"));
        PropertyConfigurator.configure(props);

        Group16_Log4j log = new Group16_Log4j();
//        log.getLoggerMessage("Hello world!");
        //log.DemoFile();

//        log.try_Lv_log4j(log);

        log.checkLogWithException();
    }

}
