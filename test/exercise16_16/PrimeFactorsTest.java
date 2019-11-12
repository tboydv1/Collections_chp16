package exercise16_16;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PrimeFactorsTest {

	PrimeFactors obj;
	@BeforeEach
	void setUp() throws Exception {
		
		obj = new PrimeFactors();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void numberIsPrimeTest() {
		
		assertFalse(obj.isPrime(4));
		
		assertTrue(obj.isPrime(7));
		
		
	}
	
	@Test
	void findPrimeFactorsTest() {
		
		System.out.println(obj.findPrimeFactors(54));
		
		Integer[] factors = {2,3,3,3};
		List<Integer> result = new ArrayList<>(Arrays.asList(factors));
		
		assertEquals(obj.findPrimeFactors(54), result);
		
		
		System.out.println(obj.findPrimeFactors(14));
		Integer[] fact = {2,7};
		result = Arrays.asList(fact);
		
		assertEquals(obj.findPrimeFactors(14), result);
		
		System.out.println(obj.findPrimeFactors(128));
		Integer[] fact2 = {2,2,2,2,2,2,2};
		result = Arrays.asList(fact2);
		
		assertEquals(obj.findPrimeFactors(128), result);
		
		System.out.println(obj.findPrimeFactors(97));
		Integer[] fact3 = {97};
		result = Arrays.asList(fact3);
		
		assertEquals(obj.findPrimeFactors(97), result);
		
		System.out.println(obj.findPrimeFactors(23));
		Integer[] fact4 = {23};
		result = Arrays.asList(fact4);
		
		assertEquals(obj.findPrimeFactors(23), result);
		
		
	}
	
	@Test
	void generatePrimeNumbersTest() {
		
		
		
		List<Integer> primeList = obj.getPrimeDivisors(54);
		
		
		System.out.println(primeList);
		
		
		System.out.println(obj.getPrimeDivisors(14));
		
		System.out.println(obj.getPrimeDivisors(97));
		
		
		

		
	}
	
	@Test
	void getUniquePrimeFactorsTest() {
		
		System.out.println(obj.findPrimeFactors(54));
		
		Integer[] factors = {2,3,3,3};
		List<Integer> result = new ArrayList<>(Arrays.asList(factors));
		
		assertEquals(obj.findPrimeFactors(54), result);
		
		Set<Integer> unique = Set.of(2,3);
		assertEquals(obj.getUniquePrimeFactors(obj.findPrimeFactors(54)), unique);
		
		
		System.out.println(obj.findPrimeFactors(14));
		Integer[] fact = {2,7};
		result = Arrays.asList(fact);
		
		assertEquals(obj.findPrimeFactors(14), result);
		
		Set<Integer> unique2 = Set.of(2,7);
		assertEquals(obj.getUniquePrimeFactors(obj.findPrimeFactors(14)), unique2);
		
		System.out.println(obj.findPrimeFactors(128));
		Integer[] fact2 = {2,2,2,2,2,2,2};
		result = Arrays.asList(fact2);
		Set<Integer> unique3 = Set.of(2);
		assertEquals(obj.getUniquePrimeFactors(obj.findPrimeFactors(128)), unique3);
		
		assertEquals(obj.findPrimeFactors(128), result);
		
		System.out.println(obj.findPrimeFactors(97));
		Integer[] fact3 = {97};
		result = Arrays.asList(fact3);
		
		assertEquals(obj.findPrimeFactors(97), result);
		
		System.out.println(obj.findPrimeFactors(23));
		Integer[] fact4 = {23};
		result = Arrays.asList(fact4);
		
		assertEquals(obj.findPrimeFactors(23), result);
		
		
	}

}
