
public class SingleRoom extends Room implements Roominter{
	
	public SingleRoom()
	{
		super();
	}
	
	public SingleRoom(int a, int b)
	{
		super(a,b);
	}
	
	@Override
	public void printRoom() {
		System.out.println("This Room is Single Room");
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
			System.out.println(m.getID() + " assign single Room");
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
}
