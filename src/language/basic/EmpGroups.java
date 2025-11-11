package language.basic;

public class EmpGroups {

	public static void main(String[] args) {
		
		Employees obj = new Employees();
		
		
		String [] empNames = new String[3];
		int [] empId = new int[3];
		
		empNames[0] = obj.emp1;
		empNames[1] = obj.emp2;
		empNames[2] = obj.emp3;
		
		empId[0] = obj.id1;
		empId[1] = obj.id2;
		empId[2] = obj.id3;
		
		
		System.out.println("Employee Name: " + empNames[0] + ", Employee ID: " + empId[0]);
        System.out.println("Employee Name: " + empNames[1] + ", Employee ID: " + empId[1]);
        System.out.println("Employee Name: " + empNames[2] + ", Employee ID: " + empId[2]);		
		
	}

}
