package com.sreeja.tddjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveAinFirst2CharactersTest {
	/* TODO list for the feature
	 *  1. empty string => ""
	 *  2. A => ""
	 *  3. AA => ""
	 *  4. AB => B
	 *  5. BA => B
	 *  6. AABD => BD
	 *  7. ABDA => BDA
	 *  8. BBAA => BBAA
	 *  9. AABAA => BAA
	 *  10. B => B
	 */
	RemoveAinFirst2Characters removeFirst2Characters;
	@BeforeEach
	void setup() {
		removeFirst2Characters=new RemoveAinFirst2Characters();
	}
	@Test
	void testEmptyString() {
		assertEquals("",removeFirst2Characters.remove(""));
	}
	@Test
	void test1A() {
		assertEquals("", removeFirst2Characters.remove("A"));
	}
	@Test
	void test1AWithOthers() {
		assertEquals("G", removeFirst2Characters.remove("AG"));
	}
	@Test
	void test2As() {
		assertEquals("", removeFirst2Characters.remove("AA"));
	}
	@Test
	void test2AsWithOthers() {
		assertEquals("BBBA", removeFirst2Characters.remove("AABBBA"));
	}
	@Test
	void testStringWithANotInFirstTwoChars() {
		assertEquals("WQAAGE", removeFirst2Characters.remove("WQAAGE"));
	}
	@Test
	void test2CharsWithOneA() {
		assertEquals("S", removeFirst2Characters.remove("SA"));
	}
	@Test
	void testStringWithNoA() {
		assertEquals("SSS", removeFirst2Characters.remove("SSS"));
	}

}
