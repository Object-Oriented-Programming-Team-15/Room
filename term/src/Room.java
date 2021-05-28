
public class Room{
	private int roomNumber;
	private int capacity; //최대 인원
	private int isUsed; //0> 사용x  1 > 예약 2 > 사용중 
	private int assignPeople;
	private int usingPeople;
	
	public Room()
	{
		this.roomNumber = 0;
		this.capacity = 0;
		this.isUsed = 0;
		this.assignPeople = 0;
		this.usingPeople = 0;
	}
	
	public Room(int roomNumber, int capacity)
	{
		this.roomNumber = roomNumber;
		this.capacity = capacity;
		this.isUsed = isUsed;
		this.assignPeople = 0;
		this.usingPeople = 0;
	}
	
	public void setAssignPeople(int id)
	{
		this.assignPeople = id;
	}
	public int getAssignPeople()
	{
		return this.assignPeople;
	}
	
	public void setRoom(int roomNumber, int capacity, int isUsed)
	{
		this.roomNumber = roomNumber;
		this.capacity = capacity;
		this.isUsed = isUsed;
	}
	
	
public void setUsedassign()
	{
		this.isUsed = 1;
	}

public void setUsed(int num)
{
	this.isUsed = num;
}
	
	public int getroomNumber()
	{
		return 	this.roomNumber;
	}
	
	public int getcapacity()
	{
		return 	capacity;
	}
	
	public int getUsed()
	{
		return this.isUsed;
	}
	
	public int getUsedPolple()
	{
		return this.usingPeople;
	}
	
	public void setUsedPolple(int num)
	{
		this.usingPeople = num;
	}
	
	public void logoutRoom(int id) {
		if(this.getUsedPolple() == id)
		{
			System.out.println("User " + id + " is Logout.");
			this.setUsedPolple(0);
			this.setUsed(0);
		}
		else
			System.out.println("User " + id + " is not Using this Room!");
		System.out.println();
		
	}
}

