package geo_locator;

import org.junit.jupiter.api.Test;

import countryLocator.CountryFinder;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

public class CountryLocatorTest {

	private final CountryFinder locator = new CountryFinder();

	@Test
	public void testfindCountry_US() {
		try {
			assertEquals("US", locator.findCountry(37.7749, -122.4194));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
    public void testfindCountry_IN() {
        try {
			assertEquals("IN", locator.findCountry(17.46296, 80.25098));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testfindCountry_CN() {
		try {
			assertEquals("CN", locator.findCountry(33.153,122.557));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
        public void testfindCountry_ES() {
        	try {
        		assertEquals("ES", locator.findCountry(41.676,-14.0));
        	} catch (IOException e) {
        		// TODO Auto-generated catch block
        		e.printStackTrace();
        	}
	}

	@Test
	public void testfindCountry_FR() {
		try {
			assertEquals("FR", locator.findCountry(43.79,5.0));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

			@Test
        	public void testfindCountry_AO() {
        		try {
        			assertEquals("AO", locator.findCountry(-5.635,12.759));
        		} catch (IOException e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
			}

	@Test
	public void testfindCountry_NP() {
		try {
			assertEquals("NP", locator.findCountry(26.347,85.058));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testfindCountry_CU() {
		try {
			assertEquals("CU", locator.findCountry(20.885,-80.229));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}