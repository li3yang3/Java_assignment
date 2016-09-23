/**
 * Assignment for your lecture 2. Please finish all the questions under
 * 'Assignment'. Please try the two questions under 'Bonus'. Please write some
 * tests as practice. When you are writing tests, you should think about what
 * situations might cause error? like 0,-1... The deadline of this assignment is
 * 09/22/2016 23:59. Please feel free to contact me for any questions.
 * 
 * @author Jia
 */

class Person {
	int age;
	boolean gender;// false --> male, true --> female

	Person(int age, boolean gender) {
		this.age = age;
		this.gender = gender;
	}
}

public class Assignment2 {
	// Assignment
	/**
	 * Write a Computer program to find the type of a person and print the type.
	 * Infant : If the age is less than 1 year Toddler : If the age is less than
	 * 3 and greater than 1 Pre Schooler : If the age is less than 5 and greater
	 * than 3 KG Girl : If the age is greater than 5 and less than 6 and the
	 * gender is female KG Boy : If the age is greater than 5 and less than 6
	 * and the gender is male
	 */
	public void personType(Person person) {
    		if (person.age < 1) 
    		System.out.println("Infant");
    		if (person.age < 3 && person.age >= 1)
    		System.out.println("Toddler");
    		if (person.age < 5 && person.age >= 3)
    		System.out.println("Pre Schooler");
    		if (person.age < 6 && person.age >= 5 &&  person.gender == true)
    		System.out.println("KG Girl");
    		if (person.age < 6 && person.age >= 5 &&  person.gender == false)
    		System.out.println("KG Boy");
    }
    

	/**
	 * Given an integer N as input, check the following: If N is odd, print
	 * "Weird". If N is even and, in between the range of 2 and 5(inclusive),
	 * print "Not Weird". If N is even and, in between the range of 6 and
	 * 20(inclusive), print "Weird". If N is even and N>20, print "Not Weird".
	 */
	public void weirdNumber(int n) {
    		if (n%2 != 0) 
		System.out.println("Weird");
		if (n%2 == 0 && n >= 2 && n <= 5)
		System.out.println("Not Weird");
		if (n%2 == 0 && n >= 6 && n <= 20)
		System.out.println("Weird");
		if (n%2 == 0 && n > 20 )
		System.out.println("Not Weird");
	}

	/**
	 * Write a method to determine whether a number is prime
	 */
	public void isPrime(int n) {
                boolean Prime = true;
    		if (n < 2) {
    		System.out.println("This is not a Prime Number");
    		}
    		else if(n == 2) {
    		System.out.println("This is a Prime Number");
    		}
    		else{
    		for(int i = 2; i <= n/2; i++){  	       //n只要能被从2到n/2的任意一个数整除，则n就不是Prime Number
    			if(n%i == 0) {
    			Prime = false;
    			break;
    			}
    		}
    		if(Prime == true){
	    	System.out.println("This is a Prime Number");
    		}
    		else{
    		System.out.println("This is not a Prime Number");
    		}
  	    }
	}
	

	/**
	 * Find N fibonacci numbers Fibonacci Number: f(N) = f(N-1)+f(N-2).
	 * Typically, f(0)=f(1)=1.
	 */
	public int[] fibonacciNumber(int n) {
		if (n < 0) {
			System.out.println("the input number should be positive!");
			return null;
		}
		int[] fib = new int[n+2];
		if (n == 0) {
			fib[0] = 1;
		}
		if (n == 1) {
			fib[0] = 1;
			fib[1] = 1;
		}
		fib[0] = 1;
		fib[1] = 1;
		for(int i = 2; i < n;i++) {
			fib[i] = fib[i-1] + fib[i-2];
		}
		
		return fib;
	}

	/**
	 * Write a function that takes a string as input and returns the string
	 * reversed. Given s = "hello", return "olleh".
	 */
	public String reverseString(String s) {
		char[] rs = s.toCharArray();               //将String类型转换为Char类型
		char[] newrs = new char[rs.length];        //定义一个长度为s长度的新char数组
		int l = rs.length-1;
		for(int i = 0 ; i < rs.length; i++) {      //将rs数组里的字符从尾到头添加入新数组newrs
		      newrs[l] = rs[i];
		      l--;
		}
		String res = String.valueOf(newrs);        //将char类型转换回String
		System.out.println(res);
		return res;
	}

	/**
	 * Given an array of nums, write a function to find the largest two integer.
	 */
	public int[] findTheLargestTwo(int[] nums) {
 		int maxNum = 0;
		int smaxNum = 0;
		for(int i = 0; i < nums.length; i++) {
			maxNum = Math.max(maxNum,nums[i]);             //第一次循环找出最大值，并储存入maxNum
		}
		for(int j = 0; j < nums.length; j++) {                 //第二次循环找出次最大值
			if (nums[j] == maxNum){                        //当遇到之前最大值时，将当前数组value置为int_min
				nums[j] = Integer.MIN_VALUE;
			}
			smaxNum = Math.max(smaxNum,nums[j]);           //将次最大值存入smaxNum
		}
		int[]  largeTwo = {maxNum,smaxNum};
		return largeTwo;
	}


	/**
	 * Given an array nums, write a function to move all 0's to the end of it
	 * while maintaining the relative order of the non-zero elements. For
	 * example, given nums = [0, 1, 0, 3, 12], after calling your function, nums
	 * should be [1, 3, 12, 0, 0].
	 */
	public void moveZeroes(int[] nums) {
	   
            int countZero = 0;
	    int j = 0;
	    for(int i = 0; i < nums.length; i++){           //数出数组中有多少个0，若当前值不为0，就将其顺序挪动到数组前部。
	        if(nums[i]==0){
	        	countZero++;
	        }
	        else{
	            nums[j]=nums[i];
	            j++;
	        }
	    }
	    
	    for(int n = j; n < nums.length; n++){            //将所有的0补到数组的末尾
	        nums[n] = 0;
	    }
	    
	}

	// Bonus
	/**
	 * Given a non-negative integer n, repeatedly add all its digits until the
	 * result has only one digit. For example: Given n = 38, the process is
	 * like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
	 */
	public int addDigits(int n) {
		if (n < 10) {                               //若n<10,则直接返回n
        	return n;
    		}  
    		while(n >= 10) {                            //若n>=10,则将n的每一位求出存入数组，并全部依次相加得到新n,直到n<10才返回n
      		int digit = 0;
      		int x = 1;
      		int sum = 0;
      		String m = String.valueOf(n);
      		int[] nums = new int[m.length()];
      		
        	for(int i = 0; i < nums.length; i++) {
	            digit = (n/x)%10;
            	    nums[i] = digit;
            	    sum += nums[i];
            	    x = x * 10;
                  }
                  
                  n = sum;
               }
               return n;
	}

	/**
	 * Write a program to check whether a given number is an ugly number. Ugly
	 * numbers are positive numbers whose prime factors only include 2, 3, 5.
	 * For example, 6, 8 are ugly, while 14 is not ugly since it includes
	 * another prime factor 7. Note that 1 is typically treated as an ugly
	 * number.
	 */
	public boolean isUgly(int n) {
		if (n <= 0) {return false;}
    		if (n == 1) {return true;}
    		if (n % 2 == 0) {                            //如果能被2连续整除，则说明只包含素数因子2
        		return isUgly(n/2);
    		}
    		if (n % 3 == 0) {                            //如果能被3连续整除，则说明只包含素数因子3
        		return isUgly(n/3);
    		}
    		if (n % 5 == 0) {                            //如果能被5连续整除，则说明只包含素数因子5
        		return isUgly(n/5);
    		}
    			return false;                        //否则的话说明该数还有其他素数因子
		}
	
