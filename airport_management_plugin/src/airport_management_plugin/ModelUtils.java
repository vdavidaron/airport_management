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

import EntityRelationship.Attribute;
import EntityRelationship.DataBase;
import EntityRelationship.Entity;
import EntityRelationship.EntityRelationshipFactory;
import EntityRelationship.EntityRelationshipPackage;
import airport.Terminal;

public class ModelUtils {
	public static Terminal create() {
		DataBase db = EntityRelationshipFactory.eINSTANCE.createDataBase();
		db.setName("Commerce");
		Entity entity1 = EntityRelationshipFactory.eINSTANCE.createEntity();
		entity1.setName("Client");
		
		Entity entity2 = EntityRelationshipFactory.eINSTANCE.createEntity();
		entity2.setName("Product");
		

		Attribute m1 = EntityRelationshipFactory.eINSTANCE.createAttribute();
		m1.setName("productName");
		Attribute m2 = EntityRelationshipFactory.eINSTANCE.createAttribute();
		m2.setName("clientName");
		
		entity1.getAttributes().add(m1);
		entity2.getAttributes().add(m2);
		db.getEntities().add(entity1);
		db.getEntities().add(entity2);
		return db;
	}

	public final static String FILENAME = "testLiveMDE.xmi";

	public static Diagnostic validate(DataBase wm) {
		return Diagnostician.INSTANCE.validate(wm);
	}

	public static void main(String[] args) {
		DataBase app = create();
		serializeModel(app, FILENAME);
		DataBase libl = load(FILENAME);

		Diagnostic d = validate(libl);
		if (d.getSeverity() != Diagnostic.ERROR)
			System.out.println("the model is valid");
		else
			System.out.println("The model is not invalid");
		System.out.println(app.getEntities().size());
		app.getEntities().forEach(z -> System.out.println(z.getName()));
	}

	public static DataBase load(String fileName) {
		EPackage.Registry.INSTANCE.put(EntityRelationshipPackage.eNS_URI, EntityRelationshipPackage.eINSTANCE);
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createFileURI(fileName), true);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		DataBase myWeb = (DataBase) resource.getContents().get(0);
		System.out.println(myWeb);
		return myWeb;
	}

	public static void serializeModel(DataBase wm, String fileName) {
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