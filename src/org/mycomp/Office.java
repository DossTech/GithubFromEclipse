package org.mycomp;

public class Office {

	private void entry() throws EmployeeNotFound {
		
		//String id = "12345T9009";
		String id = "12345D900";
		
		if (id.contains("12345T9009")) {
			
			System.out.println("Access Granted");
			
		} else {

			throw new EmployeeNotFound();
			
		}
	}
	
	public static void main(String[] args) throws EmployeeNotFound {
		Office o = new Office();
		o.entry();
	}
}
