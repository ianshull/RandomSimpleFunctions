import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TextFunctionsTest {

	// --------------------testsFor reverse()-----------------------
	@Test
	void testReverse() {
		assertEquals("olleh", TextFunctions.reverseString("hello"));
	}

	@Test
	void testReverseWithSpaces() {
		assertEquals("nai si eman ym", TextFunctions.reverseString("my name is ian"));
	}

	@Test
	void testReverseEmpty() {
		assertEquals("", TextFunctions.reverseString(""));
	}

	// --------------------testsFor isAlpha()-----------------------
	@Test
	void testIsAlpha() {
		assertEquals(true, TextFunctions.isAlpha("helloooooo"));
		assertEquals(false, TextFunctions.isAlpha("123hi32.> <?{_"));
	}

	@Test
	void testIsAlphaEmpty() {
		assertEquals(false, TextFunctions.isAlpha(""));
	}

	// --------------------testsFor toPigLatin()-----------------------

	@Test
	void testWordToPigLatin() {
		assertEquals("ellohay", TextFunctions.wordToPigLatin("hello"));
	}

	@Test
	void testWordToPigLatinThrowsException() {
		try {
			TextFunctions.wordToPigLatin("123");
			fail("Should have thrown IllegalArgumentException");
		} catch (IllegalArgumentException e) {
		} catch (Exception e) {
			fail("Wrong type of exception");
		}
	}

}
