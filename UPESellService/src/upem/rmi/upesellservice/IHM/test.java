package upem.view.rmi;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		/*****************************************RMI************************/
		ArrayList<Produit> p=new ArrayList<Produit>();
		p.add(new Produit("Nom1",12.55, 1));
		p.add(new Produit("Nom1",12.55, 1));
		p.add(new Produit("Nom1",12.55, 1));
		p.add(new Produit("Nom1",12.55, 1));
		p.add(new Produit("Nom1",12.55, 1));
		p.add(new Produit("Nom1",12.55, 1));
		p.add(new Produit("Nom1",12.55, 1));
		p.add(new Produit("Nom1",12.55, 1));
		p.add(new Produit("Nom1",12.55, 1));
		p.add(new Produit("Nom1",12.55, 1));
		p.add(new Produit("Nom1",12.55, 1));
		p.add(new Produit("Nom1",12.55, 1));
		p.add(new Produit("Nom1",12.55, 1));
		p.add(new Produit("Nom1",12.55, 1));
		p.add(new Produit("Nom1",12.55, 1));
		p.add(new Produit("Nom1",12.55, 1));
		// Emprunterihm(p);
		
		/*****************************************WebService************************/
		new Upesellserviceihm(p);

	}

}
