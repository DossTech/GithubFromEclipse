package org.mycomp;

public class EmployeeNotFound extends Exception {
	
	@Override
	public String getMessage() {
		
		String mss = "Invalid Employee Id";
		return mss;
		
	}

	

}
