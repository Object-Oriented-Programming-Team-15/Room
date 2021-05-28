
public class test {

	public static void main(String[] args) {
		MemberRoom a = new MemberRoom(5,3);
		SingleRoom a2 = new SingleRoom(7,4);
		
		a.printRoom();
		
		Member m = new Member("Kim",1, 123, 1000);
		Member m2 = new Member("Lim",3,456,2000);
		
		a.assignRoom(m);
		
		a.printRoom();
		a.assignRoom(m);
		
		a2.RoomUsing(m2.getID());
		a2.RoomUsing(m2.getID());
		a2.printRoom();
		
		a2.logoutRoom(m2.getID());
		a2.RoomUsing(m2.getID());
		a2.logoutRoom(m2.getID());
		a2.logoutRoom(m2.getID());
		a2.printRoom();
		
	}

}
