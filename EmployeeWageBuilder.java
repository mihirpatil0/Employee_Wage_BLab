package empwage;

public class EmployeeWageBuilder 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Employee Wage Computation Program");
		int isPresent = 1;
		int wagePerHr = 20;
		int fullDayHr = 8;
		int finalWage;
		double empCheck = Math.floor(Math.random()*10)%2;
		//System.out.println("Random number generated is" + " " + empCheck );
		if (empCheck == isPresent)
		{
			finalWage = (wagePerHr * fullDayHr );
			System.out.println("Employee is Full Time Present!");
			System.out.println("Daily wage of an Full timer employee is" + " " + finalWage);
		}
		else
		{
			System.out.println("Employee is Absent!");
	
		}
	}
}
