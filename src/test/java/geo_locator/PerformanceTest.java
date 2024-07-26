package geo_locator;

import java.io.IOException;
import java.util.Random;

import countryLocator.CountryFinder;

public class PerformanceTest {
	  private static final int NUM_TESTS = 100000;

	    public static void main(String[] args) {
	        Random random = new Random();
	        long startTime = System.currentTimeMillis();

	        for (int i = 0; i < NUM_TESTS; i++) {
	            double latitude = -90 + (90 - (-90)) * random.nextDouble();
	            double longitude = -180 + (180 - (-180)) * random.nextDouble();
	            try {
	                CountryFinder.findCountry(latitude, longitude);
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }

	        long endTime = System.currentTimeMillis();
	        long duration = endTime - startTime;
	        System.out.println("Time taken for " + NUM_TESTS + " tests: " + duration + " ms");
	    }
	}