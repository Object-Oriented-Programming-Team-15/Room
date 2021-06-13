

package Room;

import Person.*;
// import java.util.ArrayList;

public class MultiRoom extends Room implements RoomInterface {
	// ArrayList<Integer> assignedIDList = new ArrayList<Integer>();
	// ArrayList<Integer> usingIDList = new ArrayList<Integer>();
	
	private int UsingPeople = 0;
	private int numberOfPeople = 0;
	private boolean isBoard = true;

	public MultiRoom()
	{
		super();
	}

	public MultiRoom(int roomNumber, int capacity, int usageState, int assignedID, int usingID, boolean isBoard)
	{
		super(roomNumber, capacity, usageState, assignedID, usingID);
		// assignedIDList = assignedID;
		// usingIDList = usingID;
		this.isBoard = isBoard;
	}

	public void logOutUsing()
	{
		this.UsingPeople--;
	}
	
	public void isFull()
	{
		if(UsingPeople == MULTI_ROOM_CAPACITY) 
			this.setUsed(3);
		else
			this.setUsed(0);
	}
	
	public void setNumberOfPeople(int numberOfpeople)
	{
		this.numberOfPeople = numberOfpeople;
	}

	/*
	public ArrayList<Integer> getAssignedIDList() {
		return assignedIDList;
	}
	
	public ArrayList<Integer> getUsingIDList() {
		return usingIDList;
	}
	*/
	
	public int getNumberOfPeople()
	{
		return this.numberOfPeople;
	}

	@Override
	public void printRoom() {
		System.out.println("<Multi Room>");
		System.out.println("Room Number: " + this.getRoomNumber());
		System.out.println("# of People: " + this.getNumberOfPeople() + "/" + this.getCapacity());
		
		if(isBoard)
			System.out.println("Board: O");
		else
			System.out.println("Board: X");

		if(this.getUsed() == 1)
			System.out.println("Room State: Assigned");
		else if(this.getUsed() == 2)
			System.out.println("Room State: Used");
		else
			System.out.println("Room State: Empty");
	}

	@Override
	public void assignRoom(Person user) { // used method를 하나 더 만들어서 
		System.out.println();

		if(user instanceof Member) {
			Member member = (Member)user;
			
			
			this.isFull();
			
			
			if(this.getUsed() != 3)
			{
				System.out.println(member.getID() + " assign Multi Room");
				System.out.println("And Room number is " + this.getRoomNumber());
				System.out.println();
				this.setAssignedID(member.getID());
				this.UsingPeople++;
				/*
				this.numberOfPeople++;
				for(int i = 0; i < assignedIDList.size(); i++) {
					if(assignedIDList.get(i) == 0) {
						assignedIDList.remove(i);
						assignedIDList.add(i, member.getID());
					}
				}
				*/
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
			System.out.println("User " + ID + " can use Multi Room");
			this.setUsingPerson(ID);
			this.setUsed(2);
			this.numberOfPeople++;
			System.out.println("You can use the Room Right Now");
			this.UsingPeople++;
		}
		else if (this.getUsed() == 2) {
			System.out.println("Already used room");
		}
		else if(this.getUsed() == 1) {
			System.out.println("Already assigned room");
		}
		else
			System.out.println("Room is Full");

		System.out.println();
	}
}
