package nage.Java_8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Predicate;

public class PredicateDemo_1 {
	
//Declare the name in the array and print the names which are starting with letter "A" using the lambda expression

public static void main(String[] args) {

String[] names = {"Anushka","Anasuya","Bharathi","Bhavani","Baby"};
/*
 * printing the names in the string
 * we should loop or we should use arrays.toString method
 * 1)for (String name : names) { System.out.println(name); }
 * 2)System.out.println(Arrays.toString(names));
 * 
 */

Predicate<String> p= name->name.charAt(0)=='A';

System.out.println("printing the names that starts with the letter A");
for (String name : names) {
	
	if (p.test(name)) {
		System.out.println(name);
		
	}
	
}


}
}
