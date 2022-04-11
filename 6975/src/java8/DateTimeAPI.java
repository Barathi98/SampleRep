package java8;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeAPI {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		LocalTime time=LocalTime.now();
		System.out.println(date);
		System.out.println(time);
        int day=date.getDayOfMonth();
        int month=date.getMonthValue();
        int year=date.getYear();
        System.out.println(day+"/"+month+"/"+year);
	}

}
