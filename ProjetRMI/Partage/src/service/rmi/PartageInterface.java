package service.rmi;


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PartageInterface extends Remote {
	
	public boolean emprunterProduit(Produit p, Utilisateur u) throws RemoteException;
	
	public boolean retournerProduit(Produit p, Utilisateur u) throws RemoteException;
	
	public boolean ajouterProduit(String def, int note, String commentaire) throws RemoteException;
	
	public boolean ajouterUtilisateur(String type,String id) throws RemoteException;
	
	

}
