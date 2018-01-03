

import java.rmi.Naming;

public class PartageServeur {
	
	public static void main(String[] args) {
		try {
			
			PartageInterface p = new PartageImplementation();
			Naming.rebind("PartageApplication", p);
		} 
		catch(Exception e) {
			System.out.println("Erreur : "+e);
		}
	}

}
