package empwage;

public class EmployeeWageBuilder 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Employee Wage Computation Program");
		int isPresent = 1;
		double empCheck = Math.floor(Math.random()*10)%2;
		//System.out.println("Random number generated is" + " " + empCheck );
		if (empCheck == isPresent)
			System.out.println("Employee is Full Time Present!");
		else
			System.out.println("Employee is Absent!");
	}
}
