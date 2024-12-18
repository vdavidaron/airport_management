package airport_management_plugin;


import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import airport.AirportFactory;
import airport.AirportPackage;
import airport.Terminal;

public class ModelUtils {
	public static Terminal create() {
		Terminal tm = AirportFactory.eINSTANCE.createTerminal();
		
		return tm;
	}

	public final static String FILENAME = "testLiveMDE.xmi";

	public static Diagnostic validate(Terminal wm) {
		return Diagnostician.INSTANCE.validate(wm);
	}

	public static void main(String[] args) {
		Terminal app = create();
		serializeModel(app, FILENAME);
		Terminal libl = load(FILENAME);

		Diagnostic d = validate(libl);
		if (d.getSeverity() != Diagnostic.ERROR)
			System.out.println("the model is valid");
		else
			System.out.println("The model is not invalid");
	}

	public static Terminal load(String fileName) {
		EPackage.Registry.INSTANCE.put(AirportPackage.eNS_URI, AirportPackage.eINSTANCE);
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createFileURI(fileName), true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		Terminal myWeb = (Terminal) resource.getContents().get(0);
		System.out.println(myWeb);
		return myWeb;
	}

	public static void serializeModel(Terminal wm, String fileName) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// create a resource
		Resource resource = resSet.createResource(URI.createURI(fileName));
		resource.getContents().add(wm);

		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}