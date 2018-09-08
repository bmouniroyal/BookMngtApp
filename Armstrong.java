public class Armstrong
{
	public static void main(String args[])
		{
			int n=143,rev,temp,c=0;
			while(n>0)
			{
				rev=n%10;
				n=n/10;
				c=(rev*rev*rev)+c;
			}
			if(temp==c)
			{
			System.out.println("the given Number is Armstrong ");
			}
		}
}