

package Room;

// import java.util.ArrayList;

import Person.*;

public class OpenRoom extends Room implements RoomInterface {
	// ArrayList<Integer> assignedIDList = new ArrayList<Integer>();
	// ArrayList<Integer> usingIDList = new ArrayList<Integer>();
	
	private int UsingPeople = 0;
	private int numberOfPeople;
	private boolean isMusic;
	
	public OpenRoom()
	{
		super();
	}
	
	public OpenRoom(int roomNumber, int capacity, int usageState, int assignedID, int usingID, boolean isMusic)
	{
		super(roomNumber, capacity, usageState, assignedID, usingID);
		// assignedIDList = assignedID;
		// usingIDList = usingID;
		this.isMusic = isMusic;
		this.UsingPeople = 0;
	}

	public void logOutUsing()
	{
		this.UsingPeople--;
	}
	
	public void isFull()
	{
		if(UsingPeople == OPEN_ROOM_CAPACITY) 
			this.setUsed(3);
		else
			this.setUsed(0);
	}
	
	public void setNumberOfPeople(int numberOfpeople)
	{
		this.numberOfPeople = numberOfpeople;
	}
	
	public int getNumberOfPeople()
	{
		return this.numberOfPeople;
	}
	
	@Override
	public void printRoom() {
		System.out.println("<Open Room>");
		System.out.println("Room Number: " + this.getRoomNumber());
		System.out.println("# of People: " + this.getNumberOfPeople() + "/" + this.getCapacity());
		
		if(isMusic)
			System.out.println("Music: O");
		else
			System.out.println("Music: X");
		
		if(this.getUsed() == 1)
			System.out.println("Room State: Assigned");
		else if(this.getUsed() == 2)
			System.out.println("Room State: Used");
		else
			System.out.println("Room State: Empty");
	}

	@Override
	public void assignRoom(Person user) {
		System.out.println();

		this.isFull();
		
		if(user instanceof Member) {
			Member member = (Member)user;
			
			if(this.getUsed() != 3)
			{
				System.out.println(member.getID() + " assign Open Room");
				System.out.println("And Room number is " + this.getRoomNumber());
				System.out.println();
				this.setAssignedID(member.getID());
				this.UsingPeople++;
			}
			else if (this.getUsed() == 1) {
				System.out.println("Room " + this.getRoomNumber() + " is already Assigned");
			}
			else {
				System.out.println("Room " + this.getRoomNumber() + " is already Used");
			}
			
			this.setUsedAssign();
		}
	}
	
	@Override
	public void roomUsing(int ID) {
		
		this.isFull();
		
		
		if (this.getUsed() != 3) {
			System.out.println("User " + ID + " can use Open Room");
			this.setUsingPerson(ID);
			this.setUsed(2);
			System.out.println("You can use the Room Right Now");
			this.UsingPeople++;
		}
		else if (this.getUsed() == 2) {
			System.out.println("Already used room");
		}
		else if(this.getUsed() == 1) {

		}
		else
			System.out.println("Room Full");
		System.out.println();
	}
}
