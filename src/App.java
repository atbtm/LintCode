
public class App {
	public int longestPalindrome(String s) {
		if (s == null || s.length() == 0){
			return 0;
		}
		int[] lut = new int['z' - 'A' + 1];
		for (char c: s.toCharArray()){
			lut[c - 'A']++;
		}
		boolean isOdd = false;
		int res = 0;
		for (int cnt: lut){
			res += cnt / 2 * 2;
			isOdd = cnt % 2 == 1 ? true : isOdd;
		}
		return res + (isOdd ? 1 : 0);
	}

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
		if (source == null || target == null) {
			return -1;
		}
		if (source.length() < target.length()) {
			return -1;
		}
		if (target.length() == 0) {
			return 0;
		}
		for (int i = 0; i <= source.length() - target.length(); i++) {
			int j = 0;
			for (j = 0; j < target.length(); j++) {
				if (source.charAt(i+j) != target.charAt(j)) {
					break;
				}
			}
			if (j == target.length()) { 
				return i;
			}
		}
		return -1;
	}
	
	public String longestPalindromeString(String s) {
		if (s == null) {
			return null;
		}
		int startIdx = 0;
		int longestLen = 0;
		char[] charArr = s.toCharArray();
		for (int symAxis = 0; symAxis < s.length(); symAxis++) {
			int offset = 0;
			while (symAxis - offset >= 0 && symAxis + offset < s.length()
				&& charArr[symAxis - offset] == charArr[symAxis + offset]) {
				int len = offset * 2 + 1;
				if (len > longestLen) {
					longestLen = len;
					startIdx = symAxis - offset;
				}
				offset++;
			}
			offset = 0;
			while (symAxis - offset >= 0 && symAxis + offset + 1 < s.length()
				&& charArr[symAxis - offset] == charArr[symAxis + offset + 1]) {
				int len = offset * 2 + 2;
				if (len > longestLen) {
					longestLen = len;
					startIdx = symAxis - offset;
				}
				offset++;
			}
		}
		return s.substring(startIdx, startIdx + longestLen);
    }
	
	public int binarySearch(int[] nums, int target) {
		if (nums == null) {
			return -1;
		}
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}
	
    public int lastPosition(int[] nums, int target) {
    	if (nums == null || nums.length == 0) {
    		return -1;
    	}
    	int left = 0;
    	int right = nums.length - 1;
    	while (left + 1 < right) {
    		int mid = left + (right - left) / 2;
    		if (nums[mid] <= target) {
    			left = mid;
    		} else {
    			right = mid - 1;
    		}
    	}
    	return nums[right] == target ? right : nums[left] == target ? left : -1;
    }
    
    /**
     * @param nums: a mountain sequence which increase firstly and then decrease
     * @return: then mountain top
     */
    public int mountainSequence(int[] nums) {
    	if (nums == null || nums.length == 0) {
    		return -1;
    	}
    	if (nums.length == 1) {
    		return nums[0];
    	}
    	int left = 0;
    	int right = nums.length - 1;
    	while (left + 1 < right) {
    		int mid = left + (right - left) / 2;
    		if (nums[mid] > nums[mid + 1]) {
    			right = mid;
    		} else if (nums[mid] < nums[mid + 1]) {
    			left = mid + 1;
    		} else {
    			return nums[mid];
    		}
    	}
    	return Math.max(nums[left], nums[right]);
    }
    
    /**
     * @param A: an integer array
     * @param target: An integer
     * @param k: An integer
     * @return: an integer array
     * 
     * Given A = [1, 2, 3], target = 2 and k = 3, return [2, 1, 3].
	 * Given A = [1, 4, 6, 8], target = 3 and k = 3, return [4, 1, 6].
     */
    public int[] kClosestNumbers(int[] A, int target, int k) {
        if (A == null || A.length == 0) {
        	return null;
        }
        int left = 0;
        int right = A.length - 1;
        int targetIdx = -1;
        while (left < right) {
        	int mid = left + (right - left) / 2;
        	if (A[mid] < target) {
        		left = mid + 1;
        	}else if(A[mid] > target){
        		right = mid - 1;
        	}else {
                left = mid;
                right = mid + 1;
        	}
        }
        int [] res = new int[k];
        
    }
}
