package exercise16_14;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RandomIntegersTest {


	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

//	@Test
	void  insertElementTest(){
		
		Random randomNumber = new Random();
	
		List<Integer> values = new LinkedList<>();
		
		Integer sum = 0;
		
		for(int i = 0; i < 25; i++) {
			
			values.add(randomNumber.nextInt(100));
			
			sum += values.get(i);
		}
		
		Collections.sort(values);
		printlist(values);
		System.out.println(sum);
		
	
	}
	
	void printlist(List<Integer> list) {
		
		ListIterator<Integer> iterator = list.listIterator();
		
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
	}
	@Test
	void exercise16_15() {
		
		Character[] list = {'A','B','C', 'D','E','F','G','T'};
		List<Character> elements = new LinkedList<>(Arrays.asList(list));
		
		int count = 0;
		
		
		System.out.println("This is count" + " " + count);
		
		ListIterator<Character> run = elements.listIterator(elements.size());
		
		List<Character> arr = new LinkedList<>();
		
		while(run.hasPrevious()) {
			arr.add(run.previous());
		}
		
		
		
	}

}
