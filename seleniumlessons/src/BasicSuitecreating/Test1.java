package BasicSuitecreating;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

public class Test1 {
	String message = "Shailesh";
	Message messageUtil = new MessageUtil(message);
	@Test
	public void testPrintMessage()
	{
	System.out.println("Inside testPrintMessage()");
	Assert.assertEquals(message, messageUtil.printMessage());
	}
	}
	