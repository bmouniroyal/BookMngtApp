package pack1;
 class Bus
{
	private int busno;
	private String busname;
	private String bustype;
	private int capacity;
	private String source;
	private String dest;
	private int price;
	public Bus(int busno,String busname,String bustype,int capacity,String source,String dest,int price)
	{
		this.busno=busno;
		this.busname=busname;
		this.bustype=bustype;
		this.capacity=capacity;
		this.source=source;
		this.dest=dest;
		this.price=price;
	}
	public int getBusNo()
	{
		return busno;
	}
	public String getBusName()
	{
		return busName;
	}
	public String getBusType()
	{
		return bustype;
	}
	public int getCapacity()
	{
		return capacity;
	}
	public String getSource()
	{
		return source;
	}
	public String getDest()
	{
		return dest;
	}
	public int getPrice()
	{
		return price;
	}
public static void main(String args[]){
	Bus obj=new Bus(500,"kaveri","sleeper",60,"sreeee","rrrrtt",220);
	obj.getBusNo();
	obj.getBusName();
	obj.getBusType();
	obj.getCapacity();
	obj.getDest();
	obj.getSource();
	obj.getPrice();
	}
}