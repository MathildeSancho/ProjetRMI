import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;


public interface PartageInterface extends Remote {
	
	public boolean emprunterProduit(ProduitInterface p, UtilisateurInterface u) throws RemoteException;
	
	public boolean retournerProduit(ProduitInterface p, UtilisateurInterface u) throws RemoteException;
	
	public boolean ajouterProduit(String def) throws RemoteException;
	
	public boolean ajouterUtilisateur(String type,String id, String n, String p) throws RemoteException;
	
	public List<UtilisateurInterface> getUtilisateurs() throws RemoteException;
	
	public List<ProduitInterface> getProduits() throws RemoteException;
	

}