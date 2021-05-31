package empwage;

import java.util.Random;

public class EmployeeWageBuilder 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Employee Wage Computation Program");
		//int isPresent = 1;
		//int isPartTime = 2;
		int wagePerHr = 20;
		int fullDayHr = 8;
		int partDayHr = 4;
		int dayInMonth = 20;
		int dayWage;
		int monthlyWage=0;
		int workHr=0;
		
		Random rmd = new Random();
		//int empCheck = rmd.nextInt(3);
		//generate random number is a range syntax Math.Random()*(max-min+1)+min
		//the min value is inclusive while the max value is exclusive.
		//double empCheck = Math.floor(Math.random()*(3-0+1)+0*10)%2;
		//System.out.println("Random number generated is" + " " + empCheck );
		/*if (empCheck == isPresent)
		{
			dayWage = (wagePerHr * fullDayHr );
			System.out.println("Employee is Full Time Present!");
			System.out.println("Daily wage of an Full timer employee is" + " " + dayWage);
		}
		else if (empCheck == isPartTime) 
		{
			dayWage = (wagePerHr * partDayHr );
			System.out.println("Employee is part time present!");
			System.out.println("Daily wage of an part timer employee is" + " " + dayWage);
		}
		else
		{
			System.out.println("Employee is Absent!");
		}*/
		/*switch (empCheck) 
		{
			case 2: 
			{	
				dayWage = (wagePerHr * partDayHr );
				monthlyWage = (dayInMonth * dayWage);
				System.out.println("Employee is part time present!");
				System.out.println("Daily wage of an part timer employee is" + " " + dayWage + " " + "Rs");
				System.out.println("Monthly wage of an part timer employee is" + " " + monthlyWage + " " + "Rs");
				break;
			}
			case 1:
			{
				dayWage = (wagePerHr * fullDayHr );
				monthlyWage = (dayInMonth * dayWage);
				System.out.println("Employee is Full Time Present!");
				System.out.println("Daily wage of an full timer employee is" + " " + dayWage + " " + "Rs");
				System.out.println("Monthly wage of an full timer employee is" + " " + monthlyWage + " " + "Rs");
				break;
			}
			case 0:
			{
				System.out.println("Employee is Absent!");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + empCheck);
		}*/
		 int i;
		 for (i=1; i<=dayInMonth; i++)
		 {
			 if (workHr < 100)
			 {
				 int empCheck = rmd.nextInt(3);
				 switch (empCheck) 
				 {
				 	case 2: 
				 	{
				 		dayWage = (wagePerHr * partDayHr );
						monthlyWage = (dayInMonth * dayWage);
						workHr = (workHr + partDayHr);
						break;
					}
				 	case 1: 
				 	{
				 		dayWage = (wagePerHr * fullDayHr );
						monthlyWage = (dayInMonth * dayWage);
						workHr = (workHr + fullDayHr);
						break;
					}
				 	case 0: 
				 	{
				 		break;
					}
				 	default:
					throw new IllegalArgumentException("Unexpected value: " + empCheck);
				}
			 }
			 else
			 {
				 break;
			 }
		 }
		 System.out.println("The employee monthly wage is" + " " + monthlyWage + " " + "Rs for" + " " + workHr + " " + "Hr in" + " " + (i-1) + " " + "days");
		 
	}
}