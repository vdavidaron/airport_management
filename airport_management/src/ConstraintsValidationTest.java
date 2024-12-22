import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import airport.*;

public class ConstraintsValidationTest {
    public static void main(String[] args) {
        // Create factory
        AirportFactory factory = AirportFactory.eINSTANCE;

        // Create model objects
        Terminal terminal = factory.createTerminal();
        Airside airside = factory.createAirside();
        GateArea gateArea = factory.createGateArea();
        Flight flight = factory.createFlight();
        Gate gate = factory.createGate();

        // Set attributes
        terminal.setName("Main Terminal");
        gateArea.setName("Gate Area A");
        flight.setName("Flight123");
        flight.setTime("10:30");
        flight.setCity("LocalCity");

        // Add references
        terminal.getAirside().add(airside);
        airside.getGateArea().add(gateArea);
        gateArea.getGates().add(gate);

        // Validate objects
        validateObject(terminal);
        validateObject(airside);
        validateObject(gateArea);
        validateObject(flight);
        validateObject(gate);
    }

    private static void validateObject(Object obj) {
        System.out.println("Validating: " + obj.getClass().getSimpleName());
        Diagnostic diagnostic = Diagnostician.INSTANCE.validate((org.eclipse.emf.ecore.EObject) obj);
        printDiagnostic(diagnostic);
    }

    private static void printDiagnostic(Diagnostic diagnostic) {
        if (diagnostic.getSeverity() == Diagnostic.OK) {
            System.out.println("Validation passed.");
        } else {
            System.out.println("Validation failed: " + diagnostic.getMessage());
            for (Diagnostic child : diagnostic.getChildren()) {
                System.out.println(" - " + child.getMessage());
            }
        }
    }
}