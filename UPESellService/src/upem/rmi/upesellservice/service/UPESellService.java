package upem.rmi.upesellservice.service;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import upem.rmi.upesellservice.entity.Produit;

public class UPESellService {
	private List<Produit> productsToSell;

	public UPESellService(List<Produit> produits) {
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

	/*
	 * *
	 * * Test de la fonction plusDeDeuxMois
	 * *
	 * 
	 * public static void main(String[] args) {
		Produit p = new Produit("Gâteau", 10, 2);
		Date dateJ = new Date(System.currentTimeMillis());
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(dateJ);
		gc.add(GregorianCalendar.MONTH, -4);
		p.setDateCrea(gc.getTime());
		System.out.println(p.getDateCrea().toString());
		plusDeDeuxMois(p);

	}*/

}
