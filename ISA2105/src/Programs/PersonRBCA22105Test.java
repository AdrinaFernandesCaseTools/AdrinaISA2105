package Programs;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonRBCA22105Test {

	

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
	 public void testPersonConstructorAndGetterMethods() {
        String name = "John";
        int age = 30;
        PersonRBCA22105 person = new PersonRBCA22105(name, age);
        
        assertEquals(name, person.getName());
        assertEquals(age, person.getAge());
    }
}