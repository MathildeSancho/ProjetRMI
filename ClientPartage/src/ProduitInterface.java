

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

public interface ProduitInterface extends Remote {
	
	public void ajouterEnListeAttente(UtilisateurInterface u) throws RemoteException;
	
	public Date getDateCreation() throws RemoteException;
	
	public boolean getEmprunte() throws RemoteException;
	
	public void setEmprunte() throws RemoteException;
	
	public boolean getDisponibilite() throws RemoteException;
	public UtilisateurInterface getUtilisateurEmprunt() throws RemoteException;
	public String getDefinition() throws RemoteException ;
	
	public void setUtilisateurEmprunt(UtilisateurInterface u) throws RemoteException;
	public void setDisponibilite(boolean b) throws RemoteException ;
	
	public void ajouterUneNote(int x) throws RemoteException ;
	public void ajouterUnCommentaire(String c) throws RemoteException;
	

}
