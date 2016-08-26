
public class Salaried extends Employee {

	public Salaried(String name, int start_month, int start_year, int payrate) {
		this.name = name;
		this.start_month = start_month;
		this.start_year = start_year;
		this.payrate = payrate;
		
		CalculateTenure();
	}

	@Override
	public double PayThisMonth() {
		return this.payrate/12;
	}

}
