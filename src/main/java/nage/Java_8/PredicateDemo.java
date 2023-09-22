package nage.Java_8;

import java.util.function.Predicate;

public class PredicateDemo {
	
	/*
	 * predicate is the function interface predicate will check the condition and
	 * return true or false predicate interface contains only one abstract method
	 * that is Test(test t)
	 * 
	 * interface predicate{ boolean Test(T t) }
	 */
	
	public static void main(String[] args) {
		
		Predicate<Integer> p =i->i>10;
		System.out.println(p.test(5));
		System.out.println(p.test(15));
		
		
	}
			

	
	
	
}
