
package javaSeleniumPractical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

public class GenerateRandomNumbersTest2  {

	@Test
	public static void randomNumbers() {
		//int[] numEben= new int[500];
		Random randNum = new Random();
		
        // Random numbers count up to 500 
		for (int iCount = 0; iCount < 500; iCount++) {
			
			// Obtain a number between [0 - 1000]
			int randomNum = randNum.nextInt(1000);
			//Integer randomNum = rand.nextInt();
			
			//assign the random numbers to the array
			
			
			//int ArrayLen = numEben.length;
			
			System.out.println(randomNum);
			
			
			
			//List<Integer> randomNumbers = Arrays.asList();

			//int smallestRandomNumber = Collections.min(mySetofRandomNumbers);
			//int smallestRandomNumber = randomNumber.min;
			//System.out.println(randomNumbers);
			
		}

	}
	
	public static void leastRandomNumber() {
		List<Integer> myNumList = new ArrayList<Integer>();
		
		myNumList.toArray();
		
	}
	
}