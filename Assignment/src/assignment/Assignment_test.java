package assignment;

public class Assignment_test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		User u1=new User(20000);
		User u2=new User();
		u1.calc();
		u1.leavesTaken(5);
		u1.countLeaves();
		u2.calc();
		u2.leavesTaken(16);
		u2.countLeaves();
		

	}

}
