package pg_ex01_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumTest {
	@Test
	public void testAddCharacter() {
		assertEquals("XII", RomanNum.addCharacter("X", "I", 2));
	}
	@Test
	public void testConvertRomanNum2() {
		assertEquals("II", RomanNum.convertRomanNum(2));
	}
	@Test
	public void testConvertRomanNum5() {
		assertEquals("V", RomanNum.convertRomanNum(5));
	}
	@Test
	public void testConvertRomanNum7() {
		assertEquals("VII", RomanNum.convertRomanNum(7));
	}
	@Test
	public void testConvertRomanNum12() {
		assertEquals("XII", RomanNum.convertRomanNum(12));
	}
	@Test
	public void testConvertRomanNumAll() {
		String[] rnum = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
				"XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX" };
		for (int i = 0; i < 20;  i++){
			assertEquals(rnum[i], RomanNum.convertRomanNum(i + 1));
		}
	}
}
