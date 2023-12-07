package premchand;

import java.io.FileWriter;

public class sreeram
{
public static void main(String args[])throws Exception
{
	FileWriter sr=new FileWriter ("src/write.text");
	String msg="this is char stream sreeram operation";
	sr.write(msg);
	sr.flush();
	System.out.println("done.");
}
}
