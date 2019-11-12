package exercise16_16;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrimeFactors {

	
	public boolean isPrime(int number) {
		
		if(number == 2) {
			
		}
		for(int i = 2; i <= number/2; i++) {
			
			if(number % i == 0) {
				
				return false;
			}
		}
		return true;
		
	}
	
	/*
	 * get prime factors	
	 */
	public List<Integer> findPrimeFactors(int number) {
		
		List<Integer> factors = new ArrayList<>();
		
		List<Integer> primeDivisors = getPrimeDivisors(number);
		
		int count = 0;
		
		while(number > 1) {
			
			if(number % primeDivisors.get(count) == 0) {
				
				while(true) {
					System.out.println(primeDivisors.get(count));
					number = number/primeDivisors.get(count);
					
					System.out.println(number);
					factors.add(primeDivisors.get(count));
					
					if(number % primeDivisors.get(count) != 0) {
						System.out.println("True");
						break;
					}
				}
				
			}
			
			count++;
		
		}
		
		return factors;
	}
	/*
	 * get the prime number at a particular position
	 */
	public List<Integer> getPrimeDivisors(int value) {
		
		List<Integer> primeNumbers = new ArrayList<>();
			
			for(int i = 2; i < value-(value/3); i++) {
					
				if(isPrime(i) == true) {
					
					
					primeNumbers.add(i);
				}
				
		
			}
			
		primeNumbers.add(value);
			
		
		return primeNumbers;
	} 
	
	public Set<Integer> getUniquePrimeFactors(List<Integer> factors) {
		
		Set<Integer> uniqueFactors = new TreeSet<>(factors);
		
		return uniqueFactors;
	}
}
