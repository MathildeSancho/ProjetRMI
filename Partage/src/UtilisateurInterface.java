

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UtilisateurInterface extends Remote {
	
	public void supprimeEmprunt(ProduitInterface p) throws RemoteException ;
	public void ajouterEmprunt(ProduitInterface p) throws RemoteException ;
	public int retourneNbLivresEmpruntes() throws RemoteException ;
	public String getTypeUtilisateur() throws RemoteException ;
	public String getIdentifiantPseudo() throws RemoteException ;

}
