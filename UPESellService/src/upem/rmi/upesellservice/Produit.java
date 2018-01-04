package upem.rmi.upesellservice;

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
	private Utilisateur utilisateurEmprunt;
	
	// Liste d'attente si le produit est deja emprunté
	private List<Utilisateur> listeAttente;
	
	// prix de l'objet 
	private double prix;
	
	//Date de création de l'objet
	private Date dateCrea;
	
	//Pour vérifier si il a déjà été emprunter au moins une fois
	private Boolean dejaEmprunter;
	
	
	//Constructeur
	
	
	public Produit() {
		
	}
	public Produit(String nom,boolean disponibilite, List<Integer> notes, List<String> commentaires,Utilisateur u, List<Utilisateur> lu, double prix, Date dateCrea, Boolean dejaE) {
		this.nom=nom;
		this.prix=prix;
		this.dejaEmprunter=dejaE;
		this.dateCrea=dateCrea;
		this.commentaires=commentaires;
		this.notes=notes;
		this.disponibilite=disponibilite;
		this.utilisateurEmprunt=u;
		this.listeAttente= lu;
	}
	
	public Produit(String nom, double prix) {
		this.nom=nom;
		this.prix=prix;
		this.dejaEmprunter=false;
		this.dateCrea=new Date(System.currentTimeMillis());
		this.commentaires=new ArrayList<String>();
		this.notes=new ArrayList<Integer>();
		this.disponibilite=true;
		this.utilisateurEmprunt=null;
		this.listeAttente= new ArrayList<Utilisateur>();
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



	public List<Integer> getNotes() {
		return notes;
	}



	public void setNotes(List<Integer> notes) {
		this.notes = notes;
	}



	public List<String> getCommentaires() {
		return commentaires;
	}



	public void setCommentaires(List<String> commentaires) {
		this.commentaires = commentaires;
	}



	public Utilisateur getUtilisateurEmprunt() {
		return utilisateurEmprunt;
	}



	public void setUtilisateurEmprunt(Utilisateur utilisateurEmprunt) {
		this.utilisateurEmprunt = utilisateurEmprunt;
	}



	public List<Utilisateur> getListeAttente() {
		return listeAttente;
	}



	public void setListeAttente(List<Utilisateur> listeAttente) {
		this.listeAttente = listeAttente;
	}
	
	

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
