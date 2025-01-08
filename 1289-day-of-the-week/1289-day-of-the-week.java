import java.time.Year;
import java.time.Month;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] weeks = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
	int weekOfDay = Year.of(year).atMonth(Month.of(month)).atDay(day).getDayOfWeek().getValue() - 1;
	return weeks[weekOfDay];

        
    }
}