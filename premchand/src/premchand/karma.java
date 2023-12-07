package premchand;

import java.io.File;
import java.io.FileOutputStream;

public class karma
{
	public static void main(String args[])throws Exception
	{
		File file=new File("src/simple.txt");
		FileOutputStream fos=new FileOutputStream(file);
				String msg="Hi this is karma operation using byte stream";
				fos.write(msg.getBytes());
		System.out.println("done.");
	}

}
