

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Classe pour definir les produits qui vont être empruntés

public class Produit extends UnicastRemoteObject implements ProduitInterface {
	
	// Le type de produit peut être un livre, un vetement ; il s'agit de la definition du produit
	private String definitionType;
	
	// Il s'agit de l'etat 'EMPRUNTE' = false ou 'DISPONIBLE' = true
	private boolean disponibilite;
	
	// La liste des notes du produit (chaque note sur 10 ) 
	private List<Integer> listeNotes;
	
	// La liste des commentaires du produit.
	private List<String> listeCommentaires;
	
	// L'utilisateur qui a emprunté le produit si il est emprunté
	private UtilisateurInterface utilisateurEmprunt;
	
	// Liste d'attente si le produit est deja emprunté
	private List<UtilisateurInterface> listeAttente;
	
	private Date dateCrea;
	//Emprunté au moins 1 fois
	private boolean emprunte;
	
	public Produit(String t) throws RemoteException{
		super();
		
		this.emprunte=false;
		this.definitionType=t;
		this.disponibilite=true;
		this.listeNotes=new ArrayList<>();
		this.listeCommentaires=new ArrayList<>();
		this.dateCrea=new Date(System.currentTimeMillis());
		
	}
	
	public Date getDateCreation() {
		return dateCrea;
	}
	
	public boolean getEmprunte() throws RemoteException{
		return emprunte;
	}
	
	public void setEmprunte() throws RemoteException{
		this.emprunte=true;
	}
	
	public void ajouterEnListeAttente(UtilisateurInterface u) throws RemoteException {
		this.listeAttente.add(u);
	}
	
	public boolean getDisponibilite() throws RemoteException {
		return disponibilite;
	}
	
	public void setDisponibilite(boolean b) throws RemoteException{
		this.disponibilite=b;
	}
	
	public UtilisateurInterface getUtilisateurEmprunt() throws RemoteException {
		return utilisateurEmprunt;
	}
	public void setUtilisateurEmprunt(UtilisateurInterface u) throws RemoteException {
		this.utilisateurEmprunt=u;
	}
	
	public void ajouterUneNote(int x) throws RemoteException {
		this.listeNotes.add(x);
	}
	
	public void ajouterUnCommentaire(String c) throws RemoteException {
		this.listeCommentaires.add(c);
	}
	
	public String getDefinition() throws RemoteException {
		return definitionType;
	}
	
	public String toString() {
		return this.definitionType;
	}
	
	

}
