package premchand;
class student
{
	int no;
	void getstudent (int a)
	{
		no=a;
	}
	void kiran ()
	{
System.out.println("no="+no);
	}
}
class test extends student
{
	int m1,m2; 
	void accept (int x,int y)
	{
	m1=x;
	m2=y;
	}
	void display ()
	{
		System.out.println(m1+"----"+m2);
	}
}
class result extends test
{
	int total;
	void putresult ()
	{
		System.out.println(total);
	}
}
	public class h5
	{
		public static void main (String args [])
		{
			result r=new result();
			r.getstudent(100);
			r.kiran();
			r.accept(8, 6);
			r.putresult();
		
	}
	}