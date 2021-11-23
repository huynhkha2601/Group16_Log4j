
/*
    19127055 - Lê Vũ Minh Nhật
    19127166 - Huỳnh Tuấn Kha
    19127565 - Nguyễn Quốc Thông
    19127600 - Lê Quốc Trọng
 */
package group16_log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.Level;

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
    public void DemoFile(){
        logger.debug("debug log");
        logger.error("error log");
        logger.info("info log");
    }
    
    public void check_logger_Lv(){
        if (logger.getLevel() == null) System.out.println("NULL");
        else System.out.println("The level of logger is: " + logger.getLevel());
    }
    
    public void try_Lv_log4j(Group16_Log4j log){
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
    
    public static void main(String[] args) {
        Group16_Log4j log = new Group16_Log4j();
        //log.getLoggerMessage("Hello world!");
        //log.DemoFile();
        
        log.try_Lv_log4j(log);
    }

}
