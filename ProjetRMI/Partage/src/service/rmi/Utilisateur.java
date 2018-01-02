package service.rmi;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
	
	// Le type de l'utilisateur : Enseignant ou Etudiant
	private String typeUtilisateur;
	
	private String identifiantPseudo;
	
	private List<Produit> listeProduitsEmpruntes;
	
	
	public Utilisateur(String i,String t) {
		this.typeUtilisateur=t;
		this.identifiantPseudo=i;
		this.listeProduitsEmpruntes=new ArrayList<>();
		
	}
	
	public void supprimeEmprunt(Produit p) {
		this.listeProduitsEmpruntes.remove(p);
	}
	
	public void ajouterEmprunt(Produit p) {
		this.listeProduitsEmpruntes.add(p);
	}
	
	public int retourneNbLivresEmpruntes() {
		return this.listeProduitsEmpruntes.size();
	}
	
	public String getTypeUtilisateur() {
		return typeUtilisateur;
	}

	public String getIdentifiantPseudo() {
		return identifiantPseudo;
	}
	


}
