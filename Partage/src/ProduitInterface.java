

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ProduitInterface extends Remote {
	
	public void ajouterEnListeAttente(UtilisateurInterface u) throws RemoteException;
	
	public boolean getDisponibilite() throws RemoteException;
	public UtilisateurInterface getUtilisateurEmprunt() throws RemoteException;
	public String getDefinition() throws RemoteException ;
	
	public void setUtilisateurEmprunt(UtilisateurInterface u);
	public void setDisponibilite(boolean b) throws RemoteException ;
	
	public void ajouterUneNote(int x) throws RemoteException ;
	public void ajouterUnCommentaire(String c) throws RemoteException;
	

}
