
public class Hourly extends Employee {
	int hours;

	public Hourly(String name, int start_month, int start_year, double payrate, int hours) {
		this.name = name;
		this.start_month = start_month;
		this.start_year = start_year;
		this.payrate = payrate;
		this.hours = hours;
		
		CalculateTenure();
	}

	@Override
	public double PayThisMonth() {
		return this.payrate * this.hours;
	}

}
