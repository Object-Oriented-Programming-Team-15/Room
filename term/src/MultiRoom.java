

public class MultiRoom extends Room implements Roominter{
	private int numberOfpeople;
	private boolean isBoard;
	
	public MultiRoom()
	{
		super();
	}
	
	public MultiRoom(int a, int b)
	{
		super(a,b);
	}

	public void setNumberOfPeople(int numberOfpeople)
	{
		this.numberOfpeople = numberOfpeople;
	}
	
	public int getNumberOfPeople()
	{
		return this.numberOfpeople;
	}
	
	@Override
	public void printRoom() {
		System.out.println("This Room is Multi Room");
		System.out.println("Room Number : " + this.getroomNumber());
		System.out.println("Capacity : " + this.getcapacity());
		if(this.getUsed() == 1)
			System.out.println("This room is Assigned");
		else if(this.getUsed() == 2)
			System.out.println("This room is Used");
		else
			System.out.println("This room is Empty");
	}

	@Override
	public void assignRoom(Member m) {
		System.out.println();
		
		if(this.getUsed() == 0)
		{
			System.out.println(m.getID() + " assign Multi Room");
			System.out.println("And Room number is "+this.getroomNumber());
			System.out.println();
			this.setAssignPeople(m.getID());
		}
		else if (this.getUsed() == 1)
			System.out.println("Room " +this.getroomNumber()+ " is already Assigned");
		else
			System.out.println("Room " +this.getroomNumber()+ " is already Used");
		this.setUsedassign();
	}
	
	@Override
	public void RoomUsing(int id) {
		if(this.getUsedPolple() == id)
			System.out.println("User" + id + " is already Using Room!");
		else if(this.getAssignPeople() == id)
			System.out.println("User" + id + " is already assigng Room!");
		else
		{
			System.out.println("User" + id + " is can Use Multi Room");
			this.setUsedPolple(id);
			this.setUsed(2);
		}
		System.out.println();
	}
}
