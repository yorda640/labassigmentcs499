package Exercise5pro3;

public class EarthData {

     public void displayInfo(EarthInfo info) {
            System.out.println("Earth Information:");
            System.out.println("Radius: " + info.getRadius() + " km");
            System.out.println("Gravity: " + info.getGravity() + " m/s^2");
            System.out.println("Atmosphere Composition: " + info.getAtmosphereComposition());
            // Display additional information using other methods from EarthInfo
        }

        public static void main(String[] args) {
            EarthData earthData = new EarthData();

            // Using anonymous inner class to represent Earth information
            EarthInfo earthInfo = new EarthInfo() {
                @Override
                public double getRadius() {
                    return 6371.0; // Earth's approximate radius in kilometers
                }

                @Override
                public double getGravity() {
                    return 9.81; // Earth's gravity in m/s^2
                }

                @Override
                public String getAtmosphereComposition() {
                    return "Nitrogen 78.08%, Oxygen 20.95%, Other gases 0.97%"; // Earth's atmosphere composition
                }
                // Implement other methods for Earth information
            };

            // Display Earth information
            earthData.displayInfo(earthInfo);
        }
    }

