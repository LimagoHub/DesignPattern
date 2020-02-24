package de.math;

import de.common.LoggerProxy;

public class CalculatorFactory {
	
	private static boolean logger = true;
	private static boolean secure = true;
	public static Calculator createInstance() {
		Calculator retval = new CalculatorImpl();
		if(logger)
			//retval = new CalculatorLogger(retval);
			retval = (Calculator) LoggerProxy.newInstance(retval);
		
		if(secure)
			retval = new CalculatorSecure(retval);
		return retval;
	}

}
