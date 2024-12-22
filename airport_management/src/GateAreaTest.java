import airport.GateArea;
import airport.Gate;
import airport.AirportFactory;


public class GateAreaTest {

	public static void main(String[] args) {
		// Step 1: Create a GateArea instance
        GateArea gateArea = AirportFactory.eINSTANCE.createGateArea();

        // Step 2: Create Gate instances
        Gate gate1 = AirportFactory.eINSTANCE.createGate();
        Gate gate2 = AirportFactory.eINSTANCE.createGate();
        
        // and set their names
        gate1.setName("Gate A");
        gate2.setName("Gate B");

        // Step 3: Add Gates to the GateArea
        gateArea.getGates().add(gate1);
        gateArea.getGates().add(gate2);
        
        

        // Step 4: Invoke the operation
        int totalGates = gateArea.calculateTotalGates();

        // Step 5: Print the results
        System.out.println("Total gates in GateArea: " + totalGates); // Expected: 2
        

        // Step 6: Invoke the findGateByName operation
        Gate foundGate = gateArea.findGateByName("Gate A");

        // Step 7: Print the result
        if (foundGate != null) {
            System.out.println("Found gate: " + foundGate.getName()); // Expected: Gate A
        } else {
            System.out.println("Gate not found!");
        }

        // Test with a non-existent name
        Gate notFoundGate = gateArea.findGateByName("Gate C");
        if (notFoundGate == null) {
            System.out.println("Gate not found for name: Gate C"); // Expected: Not found
        }

	}

}
