/*1.Longest Palindrome*/
public class Palindrome {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0){
             return 0;
        }
        int len = 0;
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i = 0; i < s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i)) + 1 );
            }else{
                hm.put(s.charAt(i),1);
            }
            if(hm.get(s.charAt(i)) == 2){
                len += hm.get(s.charAt(i));
                hm.remove(s.charAt(i));
            }
        }
        return !hm.isEmpty() ? len + 1 : len;
    }
}

/*2.stock profit*/
public class stockprofit {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length ==0){
            return 0;
        }
        int sum = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i - 1]){
                sum += prices[i] - prices[i - 1];
            }
        }
        return sum;
    }
}


/*3.colum title to number*/
public class titiletonumber {
    public int titleToNumber(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int sum = 0;
        int curr = 1;
        for(int i = s.length() - 1; i >= 0 ;i--){
            sum = sum + (s.charAt(i) - 'A' + 1) * curr;
            curr *= 26;
        }
        return sum;
    }
}

/*4.two sum*/
public class twoSum{
public int twoSum(int[] nums, int target) {
       if(nums == null || nums.length == 0){
                    return 0;
       }
       int count = 0;
       HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
       for(int i = 0; i < nums.length; i++){
             if(hm.containsKey(nums[i])){
                    count++;
              }
            hm.put(target - nums[i],i);
        }
       return count;
}
}
