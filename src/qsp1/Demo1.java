package qsp1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
	
	    @Test(dependsOnMethods="test2")
		public void Test1()
		{
			Reporter.log("n", true);
		}
	    @Test
	    public void test2()
	    {
	    	Reporter.log("t", true);
	    }
	    
		
	}


