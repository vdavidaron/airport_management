import airport.GateArea;
import airport.Gate;
import airport.AirportFactory;
import airport.Flight;

public class DerivedFieldsTest {

	public static void main(String[] args) {
        // Create a GateArea
        GateArea gateArea = AirportFactory.eINSTANCE.createGateArea();

        // Add Gates
        Gate gate1 = AirportFactory.eINSTANCE.createGate();
        Gate gate2 = AirportFactory.eINSTANCE.createGate();
        gateArea.getGates().add(gate1);
        gateArea.getGates().add(gate2);

        // Test derived field: totalGates
        System.out.println("Total Gates: " + gateArea.getTotalGates()); // Expected: 2

        // Create a Flight
        Flight flight = AirportFactory.eINSTANCE.createFlight();
        flight.setCity("InternationalCity");

        // Test derived field: isInternational
        System.out.println("Is International: " + flight.isIsInternational()); // Expected: true

        // Test with a local flight
        flight.setCity("LocalCity");
        System.out.println("Is International: " + flight.isIsInternational()); // Expected: false
    }
}
