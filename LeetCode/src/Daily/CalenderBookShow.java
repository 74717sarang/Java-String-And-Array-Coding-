package Daily;

import java.util.ArrayList;
import java.util.List;

public class CalenderBookShow {

	List<int[]> list;

	public CalenderBookShow() {
		list = new ArrayList<>();
	}

	public boolean book(int start, int end) {

		for (int[] event : list) {
			int bookedSloatStart = event[0];
			int bookedSloatEnd = event[1];

			if (start < bookedSloatEnd && end > bookedSloatStart) {
				return false;
			}

		}
		list.add(new int[] { start, end });
		return true;

	}
	
	public static void main(String[] args) {
	  
	   CalenderBookShow myCalendar = new CalenderBookShow();
	  boolean param_1 = myCalendar.book(10, 20); // returns true
	  boolean param_2 = myCalendar.book(15, 25); // returns false
	  boolean param_3 = myCalendar.book(20, 30); // returns true
	
	  System.out.println(param_1+"  " +param_2+" "+param_3);
	}
}
