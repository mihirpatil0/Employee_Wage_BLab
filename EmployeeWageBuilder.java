package empwage;

import java.util.Random;

public class EmployeeWageBuilder 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Employee Wage Computation Program");
		int isPresent = 1;
		int isPartTime = 2;
		int wagePerHr = 20;
		int fullDayHr = 8;
		int partTimeHr = 4;
		int finalWage;
		
		Random rmd = new Random();
		int empCheck = rmd.nextInt(3);
		//generate random number is a range syntax Math.Random()*(max-min+1)+min
		//the min value is inclusive while the max value is exclusive.
		//double empCheck = Math.floor(Math.random()*(3-0+1)+0*10)%2;
		//System.out.println("Random number generated is" + " " + empCheck );
		if (empCheck == isPresent)
		{
			finalWage = (wagePerHr * fullDayHr );
			System.out.println("Employee is Full Time Present!");
			System.out.println("Daily wage of an Full timer employee is" + " " + finalWage);
		}
		else if (empCheck == isPartTime) 
		{
			finalWage = (wagePerHr * partTimeHr );
			System.out.println("Employee is part time present!");
			System.out.println("Daily wage of an part timer employee is" + " " + finalWage);
		}
		else
		{
			System.out.println("Employee is Absent!");
		}
	}
}