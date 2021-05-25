public class test {

	public static void main(String[] args) {
		MemberRoom a = new MemberRoom(5,3);
		
		a.printRoom();
		
		Member m = new Member();
		
		a.assignRoom(m);
		
		a.printRoom();
		a.assignRoom(m);
	}

}

