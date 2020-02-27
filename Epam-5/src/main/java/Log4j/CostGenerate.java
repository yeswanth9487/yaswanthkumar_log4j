package Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class CostGenerate {
	private static final Logger LOGGER = LogManager . getLogger(CostGenerate. class);
	public double Cost(String name,double Sqrfoot)
	{
		Factory planFactory = new Factory();
		Cal p = planFactory.getPlan(name);  
		p.getRate();
		double d=p.calculateBill(Sqrfoot);
		LOGGER . debug("THE COST IS :"+d );
		return d;
	}

}