package service.rmi;

import java.util.ArrayList;
import java.util.List;

// Classe pour definir les produits qui vont être empruntés

public class Produit {
	
	// Le type de produit peut être un livre, un vetement ; il s'agit de la definition du produit
	private String definitionType;
	
	// Il s'agit de l'etat 'EMPRUNTE' = false ou 'DISPONIBLE' = true
	private boolean disponibilite;
	
	// La liste des notes du produit (chaque note sur 10 ) 
	private List<Integer> listeNotes;
	
	// La liste des commentaires du produit.
	private List<String> listeCommentaires;
	
	// L'utilisateur qui a emprunté le produit si il est emprunté
	private Utilisateur utilisateurEmprunt;
	
	// Liste d'attente si le produit est deja emprunté
	private List<Utilisateur> listeAttente;
	
	public Produit(String t) {
		
		this.definitionType=t;
		this.disponibilite=true;
		this.listeNotes=new ArrayList<>();
		this.listeCommentaires=new ArrayList<>();
		
	}
	
	public Produit(String t, int n, String c) {
		this.definitionType=t;
		this.disponibilite=true;
		this.listeNotes=new ArrayList<>();
		this.listeCommentaires=new ArrayList<>();
		this.ajouterUneNote(n);
		this.ajouterUnCommentaire(c);
	}
	
	public void ajouterEnListeAttente(Utilisateur u) {
		this.listeAttente.add(u);
	}
	
	public boolean getDisponibilite() {
		return disponibilite;
	}
	
	public void setDisponibilite(boolean b) {
		this.disponibilite=b;
	}
	
	public Utilisateur getUtilisateurEmprunt() {
		return utilisateurEmprunt;
	}
	public void setUtilisateurEmprunt(Utilisateur u) {
		this.utilisateurEmprunt=u;
	}
	
	public void ajouterUneNote(int x) {
		this.listeNotes.add(x);
	}
	
	public void ajouterUnCommentaire(String c) {
		this.listeCommentaires.add(c);
	}
	
	public String getDefinition() {
		return definitionType;
	}
	
	

}
