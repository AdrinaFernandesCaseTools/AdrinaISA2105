package Programs;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DogRBCA22105Test {

	public DogRBCA22105Test(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

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
	public void testDog() {
        // Create two instances of the Dog class
		DogRBCA22105Test dog1 = new DogRBCA22105Test ("Buddy", "Labrador");
		DogRBCA22105Test dog2 = new DogRBCA22105Test ("Max", "German Shepherd");

        // Modify the attributes using setter methods
        dog1.setName("Rocky");
        dog1.setBreed("Golden Retriever");

        dog2.setName("Bella");
        dog2.setBreed("Beagle");

       
        assertEquals("Rocky", dog1.getName());
        assertEquals("Golden Retriever", dog1.getBreed());

        assertEquals("Bella", dog2.getName());
        assertEquals("Beagle", dog2.getBreed());
    
	}

	private void setBreed(String string) {
		// TODO Auto-generated method stub
		
	}

	private void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	private Object getBreed() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
	
		
	

}
