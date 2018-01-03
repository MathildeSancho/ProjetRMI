package upem.rmi.upesellservice.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Produit {
	
	//Attributs

	private String nom;
	
	private List<Integer> commentaires;
	
	private double prix;
	
	private Date dateCrea;
	
	private Boolean dejaEmprunter;
	
	private int quantite;
	
	//Constructeur
	
	public Produit(String nom, double prix, int quantite) {
		this.nom=nom;
		this.prix=prix;
		this.quantite=quantite;
		this.dejaEmprunter=false;
		this.dateCrea=new Date(System.currentTimeMillis());
		this.commentaires=new ArrayList<Integer>();
		
	}
	
	
	
	// Getters et Setters

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Integer> getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(List<Integer> commentaires) {
		this.commentaires = commentaires;
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

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "[nom=" + nom + ", prix=" + prix + ", quantite=" + quantite + "]";
	}
	
	
	
	
	
	
}
