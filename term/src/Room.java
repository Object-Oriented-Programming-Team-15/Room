
public class Room{
	private int roomNumber;
	private int capacity; //최대 인원
	private int isUsed;
	private int assignPeople;
	
	public Room()
	{
		this.roomNumber = 0;
		this.capacity = 0;
		this.isUsed = 0;
		this.assignPeople = 0;
	}
	
	public Room(int roomNumber, int capacity)
	{
		this.roomNumber = roomNumber;
		this.capacity = capacity;
		this.isUsed = isUsed;
		this.assignPeople = 0;
	}
	
	public void setAssignPeople(int id)
	{
		this.assignPeople = id;
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

public void setUsed()
{
	this.isUsed = 2;
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
}
