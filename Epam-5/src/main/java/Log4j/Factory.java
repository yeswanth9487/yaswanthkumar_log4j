package Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Factory {
	private static final Logger LOGGER = LogManager.getLogger(Factory. class);
	public static Cal getPlan(String planType){  

      if(planType.equalsIgnoreCase("standard")) {  
             return new Standards();  
           }   
       else if(planType.equalsIgnoreCase("Abovestandard")){  
            return new AStandard();  
        }   
      else if(planType.equalsIgnoreCase("Highstandard")) {  
            return new Highstandard();  
      }
      else if(planType.equalsIgnoreCase("HighstandardFullautomatic")) {  
    	  return new StandardFullautomatic();
      }
  return null;  
}  
}