package premchand;

import java.io.Serializable;

public class cust implements Serializable 
{
/**
 * 
 */
	private static final long serialversionUID=1L;
	public int id;
	public String name;
	public String city;
	public transient int pin;
}
