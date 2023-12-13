package Exercise;

public class GeographyProblem {

    private static String[] countries = {
            "United States", "Canada", "United Kingdom",
            "France", "Germany", "Japan", "India", "China", "Brazil"
    };

    private static String[] capitals = {
            "Washington, D.C.", "Ottawa", "London",
            "Paris", "Berlin", "Tokyo", "New Delhi", "Beijing", "Brasília"
    };

    public static String matchCountryWithCapital(String countryName) {
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].trim().equalsIgnoreCase(countryName.trim())) {
                return capitals[i];
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        // Example usage
        String country = "Germany";
        String capital = matchCountryWithCapital(country);
        System.out.println("The capital of " + country + " is: " + capital);

        country = "Australia";
        capital = matchCountryWithCapital(country);
        System.out.println("The capital of " + country + " is: " + capital);
    }
}

