
/**
 * Finish assignments, try bonus. Deadline: Before the next class.
 * 
 * @author Jia
 */
public class Assignment3 {
	// assignments
	/**
	 * Write a method to find N numbers which are power of three. e.g. n=4,
	 * return {1,3,9,27}
	 */
	public int[] findPowerOfThree(int n) {
		return null;
	}

	/**
	 * Given a integer 'n', return n%count, count is the number of digits of n
	 * For example, n = 100, return 1
	 */
	public int countDigits(int n) {
		return -1;
	}

	/**
	 * Given a integer 'n', if n is odd, print n odd numbers, if n is even,
	 * print n even numbers. For example, n = 3, print 1 3 5 n = 4, print 0 2 4
	 * 6
	 */
	public void printNumbers(int n) {

	}

	/**
	 * Given numRows, generate the first numRows of Pascal's triangle. For
	 * example, given numRows = 5, return: [1] [1,1] [1,2,1] [1,3,3,1]
	 * [1,4,6,4,1]
	 */
	public int[][] generatePascalsTriangle(int n) {
		return null;
	}

	/**
	 * Write a function that takes a string as input and reverse only the vowels
	 * of a string. For example: Given s = "hello", return "holle".
	 */
	public String reverseVowels(String s) {
		char res[] = s.toCharArray();
  		int len = res.length;
        	String vowel = "AEIOUaeiou";
        	ArrayList<Character> arr = new ArrayList<Character>();
        	ArrayList<Integer> arridx = new ArrayList<Integer>();
    
           for(int i = 0; i < len; i++) {
              if(vowel.contains(res[i]+"")) {
              		arr.add(res[i]);
              		arridx.add(i);
             		}
            }
        	int m = 0;
            for(int j = arridx.size()-1; j >= 0; j--) {
               res[arridx.get(j)] = arr.get(m++);
            }
               String ans = String.valueOf(res);
               return ans;    
	    }

	/**
	 * Given a string s consists of upper/lower-case alphabets and empty space
	 * characters ' ', return the length of last word in the string. If the last
	 * word does not exist, return 0. Note: A word is defined as a character
	 * sequence consists of non-space characters only.
	 */
	public int lengthOfLastWord(String str) {
		return -1;
	}

	/**
	 * Reverse a string by words. Do not use 'split' function. e.g. "I like
	 * soccer" --> "soccer like I"
	 */
	public String reverseString2(String str) {
		return null;
	}

	// Bonus
	/**
	 * A robot from Mars send a long message to Earth which only contains many
	 * "SOS", like "SOSSOS", "SOSSOSSOSSOSSOS" But the radiation from universe
	 * changed some characters of the massage. Write a method to count how many
	 * characters were changed. For example, "SOSSOSSOS" might be changed to
	 * "SOSSUSSOP", then your method should return 2. The message was consisted
	 * by "SOS" so its length will be multiple of 3. You could assume the
	 * message only contains upper letter.
	 */
	public int checkMessage(String message) {
		return -1;
	}
}
