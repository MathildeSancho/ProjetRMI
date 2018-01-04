package upem.rmi.upesellservice.IHM;

import java.util.ArrayList;

import upem.rmi.upesellservice.Produit;

public class test {

	public static void main(String[] args) {
		/*****************************************RMI************************/
		ArrayList<upem.rmi.upesellservice.Produit> p=new ArrayList<Produit>();
	/*	p.add(new Produit("Nom1",12.55));
		p.add(new Produit("Nom1",12.55));
		p.add(new Produit("Nom1",12.55));
		p.add(new Produit("Nom1",12.55));
		p.add(new Produit("Nom1",12.55));
		p.add(new Produit("Nom1",12.55));
		p.add(new Produit("Nom1",12.55));
		p.add(new Produit("Nom1",12.55));
		p.add(new Produit("Nom1",12.55));
		p.add(new Produit("Nom1",12.55));
		p.add(new Produit("Nom1",12.55));
		p.add(new Produit("Nom1",12.55));
		p.add(new Produit("Nom1",12.55));
		p.add(new Produit("Nom1",12.55));
		p.add(new Produit("Nom1",12.55));
		p.add(new Produit("Nom1",12.55));*/
		// Emprunterihm(p);
		
		/*****************************************WebService************************/
		Upesellserviceihm ihm = new Upesellserviceihm(p);
		ihm.setVisible(true);

	}

}
