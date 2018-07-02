
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
	private static App app ;
	
	@Before
	public void setup() {
		app = new App();
	}
	
	@Test(timeout=1000)
	public void testLongestPalindrome() {
		Assert.assertEquals(app.longestPalindrome(null), 0);
		Assert.assertEquals(app.longestPalindrome(""), 0);
		Assert.assertEquals(app.longestPalindrome("a"), 1);
		Assert.assertEquals(app.longestPalindrome("ab"), 1);
		Assert.assertEquals(app.longestPalindrome("abbbbb"), 5);
	}
	
	@Test(timeout=1000)
	public void testIsPalindrome() {
		String[] validIns = {
			"", "a", "aba", "abacaba", " ", "	", "1a1"
		};
		for(String in: validIns){
			Assert.assertTrue(app.isPalindrome(in));
		}
		String[] invalidIns = {
			null, "abacabac", "ab", "abc", "aab", "	ab", "	1ab1", ".ab.,"
		};
		for(String in: invalidIns){
			Assert.assertFalse(app.isPalindrome(in));
		}
	}

	@Test(timeout=1000)
	public void testStrStr(){
		Assert.assertEquals(app.strStr(null, "ab"), -1);
		Assert.assertEquals(app.strStr("", "ab"), -1);
		Assert.assertEquals(app.strStr("aaabc", "ab"), 2);
		Assert.assertEquals(app.strStr("abababc", "ababc"), 2);
		Assert.assertEquals(app.strStr("source", "rced"), -1);
		Assert.assertEquals(app.strStr("", ""), 0);
	}
	
	@Test(timeout=1000)
	public void testLongestPalindromeString() {
		Assert.assertEquals(null, app.longestPalindromeString(null));
		Assert.assertEquals("", app.longestPalindromeString(""));
		Assert.assertEquals("a", app.longestPalindromeString("abc"));
		Assert.assertEquals("a", app.longestPalindromeString("a"));
		Assert.assertEquals("aba", app.longestPalindromeString("aba"));
		Assert.assertEquals("bab", app.longestPalindromeString("baba"));
		Assert.assertEquals("3bdffdb3", app.longestPalindromeString("c3bdffdb3aaaa"));
	}
	
	@Test(timeout = 1000)
	public void testBinarySearch() {
		Assert.assertEquals(-1, app.binarySearch(null, 0));
		Assert.assertEquals(-1, app.binarySearch(new int[]{}, 0));
		Assert.assertEquals(0, app.binarySearch(new int[]{0}, 0));
		Assert.assertEquals(1, app.binarySearch(new int[]{0, 1}, 1));
	}

	@Test(timeout = 1000)
	public void testLastPosition() {
		Assert.assertEquals(-1, app.lastPosition(null, 0));
		Assert.assertEquals(-1, app.lastPosition(new int[]{}, 0));
		Assert.assertEquals(0, app.lastPosition(new int[]{0}, 0));
		Assert.assertEquals(1, app.lastPosition(new int[]{0, 1}, 1));
		Assert.assertEquals(2, app.lastPosition(new int[]{0, 1, 1}, 1));
		Assert.assertEquals(3, app.lastPosition(new int[]{0, 1, 1, 1, 2}, 1));
	}

	@Test(timeout = 1000)
	public void testmountainSequence() {
		Assert.assertEquals(-1, app.mountainSequence(null));
		Assert.assertEquals(-1, app.mountainSequence(new int[] {}));
		Assert.assertEquals(2, app.mountainSequence(new int[] {1, 2, 1}));
		Assert.assertEquals(2, app.mountainSequence(new int[] {1, 2, 1}));
		Assert.assertEquals(2, app.mountainSequence(new int[] {0, 1, 2, 1}));
		Assert.assertEquals(2, app.mountainSequence(new int[] {2, 1}));
		Assert.assertEquals(12, app.mountainSequence(new int[] {1, 12}));
		Assert.assertEquals(12, app.mountainSequence(new int[] {12, 1}));
		Assert.assertEquals(12, app.mountainSequence(new int[] {1, 2, 3, 12, 3, 1}));
	}
}
