package testLog4j;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 * Created by huangmao on 2016/10/25.
 */
public class TestLog4j {
    public static Logger logger=Logger.getLogger("myLogger");
    public static void main(String[] args){
        //BasicConfigurator.configure();
        //PropertyConfigurator.configure("./config/log4j.properties");
        DOMConfigurator.configure("./config/log4j.xml");
        logger.info("info message");
        logger.error("error message");
    }
}
