package org.mycomp;

public class Company {

	private void test() throws EmployeeNotFound {
		throw new EmployeeNotFound();
	}
	
	public static void main(String[] args) throws EmployeeNotFound {
		Company c = new Company();
		c.test();
	}
}
