import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public abstract class Employee {
	static int id = 1;
	int empid;
	String name;
	int start_month;
	int start_year;
	double payrate;
	int month_total;
	int year_total;

	public Employee() {
		this.empid = id;
		id += 1;
	}
	
	public abstract double PayThisMonth();
	
	public void CalculateTenure() {
		Calendar cal = Calendar.getInstance();
		int today_month = cal.get(Calendar.MONTH) + 1;
		int today_year = cal.get(Calendar.YEAR);
		
		int partial_year = 0;
		
		if(today_month < start_month) {
			partial_year = 1;
		}
		
		int year_total = today_year - start_year - partial_year;
		int month_total = today_month - start_month + (12*partial_year);
		this.month_total = month_total;
		this.year_total = year_total;
		
	}
	
	public void PrintTenure() {
		System.out.println("Year total: " + year_total + "      Month total: " + month_total);
	}
	
	public static void main(String[] args) {
		
		Hourly mark = new Hourly("Mark Brunner", 5, 2015, 12.50, 40);
		Hourly john = new Hourly("John Kautzner", 9, 2015, 11, 15);
		Salaried craig = new Salaried("Craig Graves", 7, 2012, 30000);
		
		Employee[] bobs = new Employee[] {mark, john, craig};
		
		Manager bob = new Manager("Bob Bluedorn", 2, 2010, 40000, bobs, 5000);
		bob.PrintTenure();
		System.out.println(john.empid);
		System.out.println(bob.empid);
	}

}


/*
Employee Types:  Managers, Hourly, Salary

Managers
	id
	name
	date of hire
	underlings
	payrate
	
	method: calculate pay
	method: change underling hours/payrate?

Hourly/Salary
	id
	name
	date of hire
	payrate
	
	method: calculate pay

*/