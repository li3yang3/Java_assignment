
/**
 * Finish all the assignments before next class. There is no standard answer for this assignment.
 * 
 * @author Jia
 */
/*
1. Write JUnitTest for all the problems in assignemnt3.*/

import static org.junit.Assert.*;

import org.junit.Test;

public class checkMessegeTest {

	@Test
	public void test() {
		checkMessege mes = new checkMessege();
		assertTrue(mes.checkMessage("SOSSUSSOP") == 2);
		assertTrue(mes.checkMessage("SABCDEFGS") == 7);
		assertTrue(mes.checkMessage("SOSSOSSOS") == 0);
	}

}

/*
2. Implement Class MusicAlbum which encapsulated a music Album, each album has a string variable albumTitle and a String variable singer representing the name of singer, double variable price representing the price of album, objects of this class are Initialized using all of its instance variables.
The class has accessor methods for all its Variables and a mutator method for price.*/


3. Write a class named GasTank containing:
An instance variable named amount of type double, initialized to 0.
A method named addGas that accepts a parameter of type double . The value of the amount instance variable is increased by the value of the parameter.
A method named useGas that accepts a parameter of type double . The value of the amount instance variable is decreased by the value of the parameter.
A method named getGasLevel that accepts no parameters. getGasLevel returns the value of the amount instance variable.


4. Design and implement a class called Car. You need to create necessary attributes for this class, and method if needed
Define the Car constructor to initialize these values (in that order). Include getter and setter methods for all instance data.


5. Combine with problem 3 and 4, define a class named Driver that contains methods like drive and addGas so that the driver can drive the car.


Bonus: 
Design a java class that encapsulate the data structure Stack (Last in First out). The class has 2 methods:
(push): method for adding items to stack, the push operation adds items to the top of the list
(pop): method for retrieving items from the stack. The pop operation removes an item from the top of the list, and returns its value to the caller.
In the case of overflow the user should be informed with a message
In the case of underflow, the user should be informed with a message & a value of zero is returned.

Assumptions: The stack will hold up to 10 integer values.
*/
