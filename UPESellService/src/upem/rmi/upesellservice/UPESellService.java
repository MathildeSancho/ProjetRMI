package upem.rmi.upesellservice;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class UPESellService {
	private List<Produit> productsToSell;
	private List<Produit> panier;
	
	public UPESellService() {
		
	}
	

	public List<Produit> getProductsToSell() {
		return productsToSell;
	}

	public void setProductsToSell(List<Produit> productsToSell) {
		this.productsToSell = productsToSell;
	}

	public List<Produit> getPanier() {
		return panier;
	}

	public void setPanier(List<Produit> panier) {
		this.panier = panier;
	}
	

	public void initialisationListProduits(List<Produit> produits) {
		for (Produit p : produits) {
			if (p.getDejaEmprunter()) {
				if (plusDeDeuxMois(p)) {
					productsToSell.add(p);
				}
			}
		}
	}
	

	public static Boolean plusDeDeuxMois(Produit p) {
		Date dateJ = new Date(System.currentTimeMillis());
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(dateJ);
		gc.add(GregorianCalendar.MONTH, -2);
		System.out.println(gc.getTime().toString());
		int comparaison = p.getDateCrea().compareTo(gc.getTime());
		if (comparaison <= 0) {
			System.out.println(comparaison + " je suis le résultat");
			return true;
		} else
			return false;
	}

	public static String affichePrixProduits(List<Produit> lp) {
		StringBuilder sb = new StringBuilder();
		for (Produit p : lp) {
			sb.append(p.getNom()+" : "+p.getPrix()+"€");
		}
		return sb.toString();
	}
	
	public static Boolean estDisponible (Produit p) {
		return p.isDisponibilite();
		
	}
	
	public void ajouterAuPanier(Produit p) {
		if(estDisponible(p)) {
			panier.add(p);
			p.setDisponibilite(false);
			//p.setUtilisateurEmprunt();
		} 	
		
	}
	
	
	public void viderPanier() {
		panier.removeAll(panier);
		panier.clear();
	}
	

	public void modifierPanier(Produit p) {
		panier.remove(p);
	}

	/*
	 * * * Test de la fonction plusDeDeuxMois *
	 * 
	 * public static void main(String[] args) { Produit p = new Produit("Gâteau",
	 * 10, 2); Date dateJ = new Date(System.currentTimeMillis()); GregorianCalendar
	 * gc = new GregorianCalendar(); gc.setTime(dateJ);
	 * gc.add(GregorianCalendar.MONTH, -4); p.setDateCrea(gc.getTime());
	 * System.out.println(p.getDateCrea().toString()); plusDeDeuxMois(p);
	 * 
	 * }
	 */

}
