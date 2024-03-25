package Programs;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AdditionTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test

		public void testAddition_PositiveNumbers() {
	        int x = 5;
	        int y = 3;
	        int expectedSum = 8;
	        int actualSum = Addition.add(x, y);
	        assertEquals(expectedSum, actualSum);
	    }

	    @Test
	    public void testAddition_NegativeNumbers() {
	        int x = -5;
	        int y = -3;
	        int expectedSum = -8;
	        int actualSum = Addition.add(x, y);
	        assertEquals(expectedSum, actualSum);
	    }

	}


