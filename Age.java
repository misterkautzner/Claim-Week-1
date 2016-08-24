import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Age {
	int birth_day;
	int birth_month;
	int birth_year;
	
	Calendar cal = Calendar.getInstance();
	int today_day = cal.get(Calendar.DAY_OF_MONTH);
	int today_month = cal.get(Calendar.MONTH) + 1;
	int today_year = cal.get(Calendar.YEAR);

	public Age(int day, int month, int year) {
		this.birth_day = day;
		this.birth_month = month;
		this.birth_year = year;
	}
	
	private int Calculate() {
		System.out.println("Today's date: " + today_month + "/" + today_day + "/" + today_year);
		System.out.println();
		
		int birthdayThisYear = 1;
		if(today_month > birth_month) {
			birthdayThisYear = 0;
		}
		if(today_month == birth_month && today_day >= birth_day) {
			birthdayThisYear = 0;
		}
		int age = today_year - birth_year - birthdayThisYear;;
		return age;
	}
	
	public void Display() {
		System.out.println("You are " + Calculate() + " years old.");
		
	}

}
