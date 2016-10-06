
/**
 * Finish all the assignments before next class. There is no standard answer for this assignment.
 * 
 * @author Jia
 */
/*
1. Write JUnitTest for all the problems in assignemnt3.*/

import static org.junit.Assert.*;

import org.junit.Test;

public class findPowerTest {

	@Test
	public void test() {
		findPower test = new findPower();
		int[] res = {1,3,9,27,81};
		Assert.assertArrayEquals(test.findPowerOfThree(5),res);
		int[] res1 = {1};
		Assert.assertArrayEquals(test.findPowerOfThree(1),res1);
	}

}

public class countDigitsTest {

	@Test
	public void test() {
		countDigits test = new countDigits();
		Assert.assertTrue(test.countDigits(140) == 2);
		Assert.assertTrue(test.countDigits(1396) == 0);
		Assert.assertTrue(test.countDigits(100) == 1);
	}

}


public class pascalTest {

	@Test
	public void test() {
		pascal test = new pascal();
		int[][] res = {{1,0,0,0},{1,1,0,0},{1,2,1,0},{1,3,3,1}};
		Assert.assertArrayEquals(test.generate(4),res);
		
	}

}

public class reverseVowelsTest {

	@Test
	public void test() {
		reverseVowels test = new reverseVowels();
		Assert.assertEquals(test.reverseV("leetcode"), "leotcede");
		Assert.assertEquals(test.reverseV("AEIOUaeiou"), "uoieaUOIEA");
		Assert.assertEquals(test.reverseV("hello"), "holle");
		
	}

}

public class lengthOfLastWordTest {

	@Test
	public void test() {
		lengthOfLastWord test = new lengthOfLastWord();
		Assert.assertTrue(test.lengthOfLastWord("     abcd") == 4);
		Assert.assertTrue(test.lengthOfLastWord("     abcd    ") == 4);
		Assert.assertTrue(test.lengthOfLastWord("a    ") == 1);
		Assert.assertTrue(test.lengthOfLastWord("a b asdf  asdf abcd") == 4);
	}

}

public class reverseString2Test {

	@Test
	public void test() {
		reverseWords test = new reverseWords();
		String str = "I love to paly on sunday";
		String strrev = "sunday on paly to love I";
		Assert.assertEquals(test.reverseWord(str),strrev);
	}

}


public class checkMessegeTest {

	@Test
	public void test() {
		checkMessege mes = new checkMessege();
		Assert.assertTrue(mes.checkMessage("SOSSUSSOP") == 2);
		Assert.assertTrue(mes.checkMessage("SABCDEFGS") == 7);
		Assert.assertTrue(mes.checkMessage("SOSSOSSOS") == 0);
	}

}
