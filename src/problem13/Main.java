package problem13;

import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		//Calls the method: TestLargesum(); into the Main.
		TestLargeSum();
		//Prints the Answer of "LargeSum"
		System.out.println("The answer is: " + TestLargeSum());
	}
	//Created the method: TestLargeSum 
	public static Object TestLargeSum() {
		/***
		 * Calls the method "LargeSum" from the LargeSum Class
		 * @return the LargeSum from: LargeSum.java
		 */
		//Declares LargeSum as Sum
		  LargeSum Sum = new LargeSum();
		 //BigInterger Answer is now equal to LargeSum
		  BigInteger Answer = Sum.LargeSum();
		  
		 //Returns Answer
			return Answer;

	}

}
