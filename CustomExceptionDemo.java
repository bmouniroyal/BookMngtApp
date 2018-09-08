package pack2;
public class CustomExceptionDemo
{
	public static void main(String args [])
	{
		try
		{
			Login.validate(args[0],args[1]);
		}
		catch(Exception e)
		{
			e.PrintStackTrace();
		}
	}
}