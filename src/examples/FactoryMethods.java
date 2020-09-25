/**
 * 
 */
package examples;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author oluwatobi
 *
 */
public class FactoryMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a List
		List<String> colorList = List.of("red", "orange", "yellow",
				"green", "blue", "indigo", "violet");
		
		System.out.printf("colorList: %s%n%n", colorList);
		
		//create a Set
		Set<String> colorSet = Set.of("red", "orange", "yellow");
		
		System.out.printf("colorSet: %s%n%n", colorSet);
		
		//create a Map using method "of"
		Map<String, Integer> dayMap = Map.of("Monday", 1, "Tuesday", 2, 
				"Wednesday", 3, "Thurday ", 4, "Friday", 5, "Saturday", 6, "Sunday", 7);
		
		
		System.out.printf("dayMap: %s%n%n", dayMap);
		
		Map<String, Integer> daysPerMonthMap = Map.ofEntries(
				Map.entry("January", 31),
				Map.entry("Febuary", 28),
				Map.entry("March", 31),
				Map.entry("April", 30),
				Map.entry("May", 31),
				Map.entry("June", 30),
				Map.entry("July", 31),
				Map.entry("Auguest", 31),
				Map.entry("September", 30),
				Map.entry("October", 31),
				Map.entry("November", 30),
				Map.entry("December", 31)
				);
		
		System.out.printf("monthMap: %s%n", daysPerMonthMap);
		
		
		
	}

}
