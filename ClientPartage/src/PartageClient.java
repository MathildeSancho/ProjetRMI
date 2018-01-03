

import java.rmi.Naming;

public class PartageClient {
	
	public static void main(String[] args) {
		
		try {
			PartageInterface partage = (PartageInterface) Naming.lookup("PartageApplication");
			
			new MenuIHM(partage);
			
			
		}
		
		catch(Exception e) {
			System.out.println("Erreur : "+e);
		}
	}

}
