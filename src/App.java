
public class App {
	public App(){}
	public boolean isPalindrome(String s) {
		if (s == null){
			return false;
		}
		if (s.length() == 0){
			return true;
		}
		char[] charArr = s.toCharArray();
        for (int left = 0, right = s.length()-1; left < right;){
        	if (!Character.isDigit(charArr[left]) && !Character.isLetter(charArr[left])){
        		left ++;
        		continue;
        	}
        	if (!Character.isDigit(charArr[right]) && !Character.isLetter(charArr[right])){
        		right --;
        		continue;
        	}
        	if (Character.toLowerCase(charArr[left]) != Character.toLowerCase(charArr[right])){
        		return false;
        	}
        	left++;
        	right--;
        }
		return true;
    }
	
	/*
     * @param source: source string to be scanned.
     * @param target: target string containing the sequence of characters to match
     * @return: a index to the first occurrence of target in source, or -1  if target is not part of source.
     */
    public int strStr(String source, String target) {
       return 0;
    }
}
