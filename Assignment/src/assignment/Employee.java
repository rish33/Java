package assignment;

public abstract class Employee {
	abstract void countLeaves();

	static int da = 5000;
	static int hra = 1000;

}

class User extends Employee implements Salary {
	final int max = 15;
	int leaves;
	double basic;

	User() {
		this.leaves = 0;
		this.basic = 10000;
	}

	User(double basic) {

		this.basic = basic;
	}

	@Override
	public void calc() {
		// TODO Auto-generated method stub
		System.out.println(this.basic + this.da + this.hra);

	}

	void leavesTaken(int leaves) throws Exception {
		if (leaves > 15) {
			throw new Exception("Max leaves limit reached");
		}
		this.leaves = leaves;
	}

	@Override
	void countLeaves() {
		// TODO Auto-generated method stub
		System.out.println("Leaves left :" + (this.max - this.leaves));

	}

}
