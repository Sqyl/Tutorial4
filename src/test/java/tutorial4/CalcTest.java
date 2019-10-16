package tutorial4;

import junit.framework.Assert;
import junit.framework.TestCase;

public class CalcTest  extends TestCase{

		public void testAdd () {
			int a = 1;
			int b = 2;
			Assert.assertEquals(Calc.add(a , b ) , a + b);
			
			
		}
		public void testSubtract() {
			int a = 1;
			int b = 2;
			Assert.assertEquals(Calc.subtract(a, b) , a + b);
			
		}
		
	}


