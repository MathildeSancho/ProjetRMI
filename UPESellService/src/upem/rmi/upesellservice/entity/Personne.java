package upem.rmi.upesellservice.entity;

public class Personne {
	
	// Attributs
	
	private String nom;
	
	private String prenom;
	
	private String pseudo;
	
	/**
	 * Valeurs possibles de type :
	 * 0 Etudiant 
	 * 1 Enseignant
	 * 2 Personne exterieur
	 */
	private int type;
	
	
	//Constructeur
	
	public Personne(String nom , String prenom , String pseudo, int type) {
		this.nom =nom;
		this.prenom=prenom;
		this.type=type;
		this.pseudo=pseudo;
	}
	
	//Getters et Setters
	

	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getPseudo() {
		return pseudo;
	}


	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}
	
	//Méthodes
	
	@Override
	public String toString() {
		return nom + " " + prenom;
	}
}
