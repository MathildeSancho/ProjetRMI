

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class Utilisateur extends UnicastRemoteObject implements UtilisateurInterface {
	
	// Le type de l'utilisateur : Enseignant ou Etudiant
	private String typeUtilisateur;
	
	private String identifiantPseudo;
	private String nom;
	private String prenom;
	
	private List<ProduitInterface> listeProduitsEmpruntes;
	
	
	public Utilisateur(String n, String p, String i,String t) throws RemoteException{
		super();
		this.nom=n;
		this.prenom=p;
		this.typeUtilisateur=t;
		this.identifiantPseudo=i;
		this.listeProduitsEmpruntes=new ArrayList<>();
		
	}
	
	public void supprimeEmprunt(ProduitInterface p) {
		this.listeProduitsEmpruntes.remove(p);
	}
	
	public void ajouterEmprunt(ProduitInterface p) {
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
