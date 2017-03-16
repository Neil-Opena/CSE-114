/*
 * Neil Opena
 * 110878452
 * CSE 114 - Homework #4 Esmaili
 */

import java.util.*;
public class TestMyInteger {

	public static void main(String[] args){
		
		//this is the test program
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter an int to create a MyInteger object:");
		MyInteger a = new MyInteger(stdin.nextInt());
		System.out.println("a = new MyInteger(" + a.getValue() + ")");
		System.out.println("a.getValue() = " + a.getValue()); 
		System.out.println("a.isEven() = " + a.isEven());
		System.out.println("a.isOdd() = " + a.isOdd());
		System.out.println("a.isPrime() = " + a.isPrime());
		
		System.out.println("Enter an int:");
		int b = stdin.nextInt();
		System.out.println("int b = " + b);
		System.out.println("MyInteger.isEven(" + b + ") = " + MyInteger.isEven(b));
		System.out.println("MyInteger.isOdd(" + b + ") = " + MyInteger.isOdd(b));
		System.out.println("MyInteger.isPrime(" + b + ") = " + MyInteger.isPrime(b));

		System.out.println("Enter an int to create another MyInteger object:");
		MyInteger c = new MyInteger(stdin.nextInt());
		System.out.println("MyInteger.isEven(c) = " + MyInteger.isEven(c));
		System.out.println("MyInteger.isOdd(c) = " + MyInteger.isOdd(c));
		System.out.println("MyInteger.isPrime(c) = " + MyInteger.isPrime(c));
		System.out.println();
		System.out.println("a.equals(b) = " + a.equals(b)); 
		System.out.println("a.equals(c) = " + a.equals(c));
		
		System.out.println("Enter a (number) as a String:");
		String d = stdin.next();
		System.out.println("String d = \"" + d + "\"");
		System.out.println(d + " + 10 = " + (MyInteger.parseInt(d) + 10));
	}
	
}
