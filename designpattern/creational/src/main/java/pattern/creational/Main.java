package pattern.creational;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main extends Teacher{
	   String mainSubject = "Physics";
	   public static final Logger LOGGER=LogManager.getLogger(Main.class);
	   public static void main(String args[]){
		Main obj = new Main();
		LOGGER.info(obj.collegeName);
		LOGGER.info(obj.designation);
		LOGGER.info(obj.mainSubject);
		obj.does();
	   }
	}