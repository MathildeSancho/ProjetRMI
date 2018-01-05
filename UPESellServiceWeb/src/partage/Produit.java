package partage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Produit {
	
	//Attributs
	private String nom;
	
	// Il s'agit de l'etat 'EMPRUNTE' = false ou 'DISPONIBLE' = true
	private boolean disponibilite;
	
	// La liste des notes du produit (chaque note sur 10 ) 
	private List<Integer> notes;
	
	// La liste des commentaires du produit.
	private List<String> commentaires;
	
	// L'utilisateur qui a emprunté le produit si il est emprunté
	//private Utilisateur utilisateurEmprunt;
	
	// prix de l'objet 
	private double prix;
	
	//Date de création de l'objet
	private Date dateCrea;
	
	//Pour vérifier si il a déjà été emprunter au moins une fois
	private Boolean dejaEmprunter;
	
	
	//Constructeur
	
	
	public Produit() {
		
	}
	
	public Produit(String nom, double prix) {
		this.nom=nom;
		this.prix=prix;
		this.dejaEmprunter=false;
		this.dateCrea=new Date(System.currentTimeMillis());
		this.commentaires=new ArrayList<String>();
		this.notes=new ArrayList<Integer>();
		this.disponibilite=true;
	}
	
	
	// Getters et Setters

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Date getDateCrea() {
		return dateCrea;
	}

	public void setDateCrea(Date dateCrea) {
		this.dateCrea = dateCrea;
	}

	public Boolean getDejaEmprunter() {
		return dejaEmprunter;
	}

	public void setDejaEmprunter(Boolean dejaEmprunter) {
		this.dejaEmprunter = dejaEmprunter;
	}


	public boolean isDisponibilite() {
		return disponibilite;
	}



	public void setDisponibilite(boolean disponibilite) {
		this.disponibilite = disponibilite;
	}



	public int[] getNotes() {
		int[] n =new int[this.notes.size()];
		int i=0;
		for(int x :this.notes) {
			n[i]=x;
			i++;
		}
		return n;
	}



	public void addNote(int note) {
		this.notes.add(note);
	}



	public String[] getCommentaires() {
		if(!this.commentaires.isEmpty()) {
		String[] s =new String[this.commentaires.size()];
		int i=0;
		for(String x :this.commentaires) {
			s[i]=x;
			i++;
		}
		return s;
		} else 
			return null;
	}



	public void addCommentaires(String commentaire) {
		this.commentaires.add(commentaire);
	}


/*
	public Utilisateur getUtilisateurEmprunt() {
		return utilisateurEmprunt;
	}



	public void setUtilisateurEmprunt(Utilisateur utilisateurEmprunt) {
		this.utilisateurEmprunt = utilisateurEmprunt;
	}
	
*/
	@Override
	public String toString() {
		String str= "nom=" + nom + "\n prix=" + prix ;
		if (disponibilite == true) {
			str+="\n l'article est disponible";
		}else {
			str+="\n l'article n'est plus disponible";
		}
		return str;
	}
	


	
	
	
}
