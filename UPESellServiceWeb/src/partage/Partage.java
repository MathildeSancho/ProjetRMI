package partage;

import java.util.*;

public class Partage {

	private List<Produit> tousProduits;
	private List<Produit> productsToSell;
	private List<Produit> panier;

	public Partage() {
		tousProduits = new ArrayList<>();
		productsToSell = new ArrayList<>();
		panier =new ArrayList<>();
		
		initialisationListeProduits();
		
	}
	
	private void initialisationListeProduits() {
			
			// INITIALISATION LISTE DES PRODUITS
			// INITIALISATION EN DUR
			
			Produit p = new Produit("Casque Audio",12.5);
			Produit p1 = new Produit("Tablette",16.0);
			Produit p2 = new Produit("Tel",500.99);
			
			Date date=new Date(System.currentTimeMillis());
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(date);
			gc.add(GregorianCalendar.MONTH, -6);
			p.setDateCrea(gc.getTime());
			gc.add(GregorianCalendar.MONTH, -4);
			p1.setDateCrea(gc.getTime());
			gc.add(GregorianCalendar.MONTH, -1);
			p2.setDateCrea(gc.getTime());
			
			tousProduits.add(p);
			tousProduits.add(p1);
			tousProduits.add(p2);

			for(Produit produit : tousProduits) {
				//if (produit.getDejaEmprunter() && plusDeDeuxMois(produit)) {
					productsToSell.add(produit);
				//}
			}
	}

	public int getSize() {
		return this.productsToSell.size();
	}

	
	public Produit[] getProductsToSell() {
		
		Produit[] liste = new Produit[this.productsToSell.size()];
		for(int i=0;i<liste.length;i++) {
			liste[i]=this.productsToSell.get(i);
		}
		return liste;
		
	}

	public Produit getProduitPanier(int i) {
		return this.panier.get(i);
	}

	public static Boolean plusDeDeuxMois(Produit p) {
		Date dateJ = new Date(System.currentTimeMillis());
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(dateJ);
		gc.add(GregorianCalendar.MONTH, -2);
		
		//System.out.println(gc.getTime().toString());
		
		int comparaison = p.getDateCrea().compareTo(gc.getTime());
		if (comparaison <= 0) {
			System.out.println(comparaison + " je suis le resultat");
			return true;
		} else
			return false;
	}

	public static String affichePrixProduit(Produit p) {
		return p.getPrix() + "Euros";
	}

	public void ajouterAuPanier(Produit p) {
		if (p.isDisponibilite()) {
			panier.add(p);
			p.setDisponibilite(false);
			
		}

	}

	public void viderPanier() {
		panier.removeAll(panier);
		panier.clear();
	}
	
	/*public void supprimerProduitPanierByIndex(int i) {
		this.panier.remove(i);
	}*/
}
