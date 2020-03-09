package pattern.creationalprotype;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
	public static final Logger LOGGER=LogManager.getLogger(Main.class);
	public static void main(String[] args) 
    { 
         Test ob1 = new Test(); 
  
         LOGGER.info(ob1.x + " " + ob1.y); 
  
         // Creating a new reference variable ob2 
         // pointing to same address as ob1 
         Test ob2 = ob1; 
  
         // Any change made in ob2 will be reflected 
         // in ob1 
         ob2.x = 100; 
  
         LOGGER.info(ob1.x+" "+ob1.y); 
         LOGGER.info(ob2.x+" "+ob2.y); 
    } 

}
