package ch.zhaw.gruppenssh;

import org.junit.Assert;
import org.junit.Test;

import ch.zhaw.gruppessh.IMdpJunitDemo;
import ch.zhaw.gruppessh.ImdpJunitDemoImpl;

public class IMdpJunitDemoTest {

	private IMdpJunitDemo demo = new ImdpJunitDemoImpl();
	
	@Test
	public void shouldReturnTrueForNull() {
		Assert.assertTrue(demo.isEmpty(null));
	}
	
	@Test
	public void shouldReturnTrueForEmptyString() {
		Assert.assertTrue(demo.isEmpty(""));
	}

	@Test
	public void shouldReturnFalseForNonEmptySting() {
		Assert.assertFalse(demo.isEmpty("asdf"));
	}
	
	@Test
	public void shouldReturnCapitalizedString() {
		Assert.assertEquals("Mdptest", demo.capitalize("mdptest"));
	}
	
	@Test
	public void shouldReturnCapitalizedCapsLock() {
		Assert.assertEquals("Test", demo.capitalize("TEST"));
	}
	
	@Test
	public void shouldReturnCapitalizedBegNumers() {
		Assert.assertEquals("123abc", demo.capitalize("123ABC"));
	}
	
	@Test
	public void shouldReturnReversedString() {
		Assert.assertEquals("test", demo.reverse("tset"));
	}
	
	@Test
	public void shouldReturnReverseError() {
		Assert.assertEquals("", demo.reverse(""));
	}
	
	@Test
	public void shouldReturnJoinedString() {
		Assert.assertEquals("a be ce", demo.join("a","be","ce"));
	}
	
	@Test
	public void shouldReturnOneJoinedString() {
		Assert.assertEquals("", demo.join(""));
	}
	
}
