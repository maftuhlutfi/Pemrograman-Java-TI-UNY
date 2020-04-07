import java.util.*;

class MyDate {
	int year;
	int month;
	int day;

	MyDate() {
		GregorianCalendar gcal = new GregorianCalendar();
		year = gcal.get(Calendar.YEAR);
		month = gcal.get(Calendar.MONTH);
		day = gcal.get(Calendar.DATE);
	}

	MyDate(long millis) {
		GregorianCalendar gcal = new GregorianCalendar();
		gcal.setTimeInMillis(millis);
		year = gcal.get(Calendar.YEAR);
		month = gcal.get(Calendar.MONTH);
		day = gcal.get(Calendar.DATE);
	}

	MyDate(int year, int month, int day) {
		GregorianCalendar gcal = new GregorianCalendar(year, month, day);
		year = gcal.get(Calendar.YEAR);
		month = gcal.get(Calendar.MONTH);
		day = gcal.get(Calendar.DATE);
	}

	int getYear() {
		return year;
	}

	int getMonth() {
		return month;
	}

	int getDay() {
		return day;
	}

	void setDate(long elapsedTime) {
		GregorianCalendar gcal = new GregorianCalendar();
		gcal.setTimeInMillis(elapsedTime);
		year = gcal.get(Calendar.YEAR);
		month = gcal.get(Calendar.MONTH);
		day = gcal.get(Calendar.DATE);
	}
}

public class soal_10_14 {
	public static void main(String[] args) {
		MyDate mydate1 = new MyDate();
		MyDate mydate2 = new MyDate(0);

		System.out.printf("mydate1 year: %d, month: %d, day: %d %n", mydate1.getYear(), mydate1.getMonth(), mydate1.getDay());
		System.out.printf("mydate2 year: %d, month: %d, day: %d %n", mydate2.getYear(), mydate2.getMonth(), mydate2.getDay());
	}
}

/*
======
OUTPUT
======
mydate1 year: 2020, month: 1, day: 24 
mydate2 year: 3058, month: 8, day: 8 
*/