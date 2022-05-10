package Homework5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalcTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testBiggestTrue() {
		int[] numbers = {5, 6, 8, -5, 1, 2, 3, 4, 1, 1};
		Calc calc = new Calc(numbers);
		assertTrue(calc.getBiggest() == 8);
	}
		
	@Test
	void testBiggestEqual() {
		int[] numbers = {5, 6, 8, -5, 1, 2, 3, 4, 1, 1};
		Calc calc = new Calc(numbers);
		assertEquals(calc.getBiggest(), 8);
	}

	
	@Test
	void testBiggestEmptyArrayExeption() {
		int[] numbers = {};
		Calc calc = new Calc(numbers);
		// як в Eclipse швидко побачити список всіх assert + всіх типів Exception ? 
		Exception thrown = Assertions.assertThrows(Exception.class, () -> {
					calc.getBiggest();
				}, "Exception was expected if array is empty");
			
	} 


}
