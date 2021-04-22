package assignment;

import java.util.Scanner;

public class EmpWage {
	
	public void employeeclass() {
		
			Scanner sc= new Scanner(System.in); 
			System.out.println("Wage per hr = ");
			int Wage_per_hr= sc.nextInt();
			
			 
			System.out.println("Full_day_hr = ");
			int Full_day_hr= sc.nextInt();
			
			System.out.println("Part_time_hr = ");
			int Part_time_hr= sc.nextInt();
			
			System.out.println("Total_w_days = ");
			int Total_w_days= sc.nextInt();
			
			System.out.println("Enter the things you want to check or calculate  : ");
			System.out.println("Enter 1 to check employee status");
			System.out.println("Enter 2 for calculating daily wage");
			System.out.println("Enter 3 for calculating daily monthly wage");
			
			System.out.println("Enter 4 Calculating Wages till a condition of total working hours or days is reached for a month - like 100 hours and 20 days");
			
			int option =  sc.nextInt();
			switch(option)
			{
			case 1:

				int attendence = (int) Math.round(Math.random());
				if (attendence==0) {
					System.out.println("Employee is absent");
				}else {
					System.out.println("employee is absent");
				}
			
			case 2:
				int Total_daily_wage = Wage_per_hr * Full_day_hr;
				System.out.println("Total Daily Wage are = " + Total_daily_wage);
				break;
				
			case 3:
				int Total_monthly_wages = ( Total_w_days * Full_day_hr + Part_time_hr ) * Wage_per_hr;
				System.out.println("Total montly wages is = " + Total_monthly_wages);
				break;
				
			case 4:
				
				System.out.println("enter fixed hrs and days");
				System.out.println("enter hrs");
				int fixed_hrs = sc.nextInt();
				System.out.println("enter fixed days");
				int fixed_day = sc.nextInt();
				int total_hrs  = fixed_hrs + (8*fixed_day);
				int Wage  = total_hrs * Wage_per_hr;
				System.out.println("Total wage for a fixed hours and days is =" + Wage );
				break;
				
			default:
				System.out.println("Invalid input enter again ");
				employeeclass();
			
			
			}
			
			
			
			
			
		sc.close();	
		}
	
		

}
