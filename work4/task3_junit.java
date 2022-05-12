package work4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class task3_junit {

	@Test
	void testPositionOfPosNum() {
		int[] arr= {-1,1,-2,2,6};
		int start = 1;
		assertTrue(task3.PositionOfPosNum(arr, start)== 1);
		assertEquals(task3.PositionOfPosNum(arr, task3.PositionOfPosNum(arr, start)+1), 3);
		
		start = 6;
		assertEquals(task3.PositionOfPosNum(arr, start), -1);
		
		start = 0;
		int[] arr1= {0,0,0,0,0};
		assertEquals(task3.PositionOfPosNum(arr1, start), -1);
		
	}

}
