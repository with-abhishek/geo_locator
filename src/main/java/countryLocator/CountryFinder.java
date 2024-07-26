package countryLocator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountryFinder {
    private static final String CSV_FILE_PATH = "src/main/resources/countries.csv";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter latitude: ");
        double latitude = scanner.nextDouble();
        System.out.print("Enter longitude: ");
        double longitude = scanner.nextDouble();
        scanner.close();

        try {
            String country = findCountry(latitude, longitude);
            if (country != null) {
                System.out.println(country);
            } else {
                System.out.println("No country found for the given co-ordinates.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String findCountry(double latitude, double longitude) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(CSV_FILE_PATH));
        String line;
        while ((line = br.readLine()) != null) {
            // Skip the header row
            if (line.startsWith("country_name")) {
                continue;
            }
            
            String[] data = line.split(",");
            String countryName = data[0];
            double latMin = Double.parseDouble(data[1]);
            double latMax = Double.parseDouble(data[2]);
            double lonMin = Double.parseDouble(data[3]);
            double lonMax = Double.parseDouble(data[4]);
            
            if (latitude >= latMin && latitude <= latMax && longitude >= lonMin && longitude <= lonMax) {
                br.close();

                return countryName;
            }
        }
        br.close();
        return null;
    }
}
