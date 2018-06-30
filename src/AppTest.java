
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {
	private static App 	app = new App();
	
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
	
	@Test
	public void testStrStr(){
		Assert.assertEquals(app.strStr("aaaabc", "ab"), 0);
	}
}
