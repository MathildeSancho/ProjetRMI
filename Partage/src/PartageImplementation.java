
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class PartageImplementation extends UnicastRemoteObject implements PartageInterface {
	
	private List<ProduitInterface> produits;
	private List<UtilisateurInterface> utilisateurs;
	
	public PartageImplementation() throws RemoteException {
		super();
		produits = new ArrayList<>();
		utilisateurs = new ArrayList<>();
	}

	@Override
	public boolean emprunterProduit(ProduitInterface p, UtilisateurInterface u) throws RemoteException {
		// Emprunter le produit : 
		//  TRUE si l'emprunt est possible 
		// 	FALSE et on ajoute l'utilisateur en liste d'attente.
			
			// Si il est disponibile
			if(p.getDisponibilite()) {
				
				p.setUtilisateurEmprunt(u);
				p.setDisponibilite(false);
				
				u.ajouterEmprunt(p);
				
				return true;
			}
			// il est deja emprunté
			else {
				return false;
				//p.ajouterEnListeAttente(u);
			}
		
	}

	@Override
	public boolean retournerProduit(ProduitInterface p, UtilisateurInterface u) throws RemoteException {
		
		//Verifications que le produit est bien emprunté par cet utilisateur
		if(!p.getDisponibilite() && p.getUtilisateurEmprunt().equals(u)) {
			
			u.supprimeEmprunt(p);
			
			p.setDisponibilite(true);
			p.setUtilisateurEmprunt(null);
			// NOTIF A FAIRE
			return true;
		}
		else  return false;
		
		
	}
	
	@Override
	public boolean ajouterProduit(String def) throws RemoteException {
		
		int v=0;
		for(ProduitInterface pt : produits) {
			if(pt.getDefinition().equals(def)) {
				v++;
			}
		}
		if(v==0) {
			ProduitInterface p = new Produit(def);
			produits.add(p);
			return true;
		}
		else return false;
	}

	@Override
	public boolean ajouterUtilisateur(String type, String id, String nom, String prenom) throws RemoteException {
		
		// Verifier TYPE : 
		if(type.equals("Etudiant") || type.equals("Enseignant")) {
			int i=0;
			// Verifier ID: 
			for(UtilisateurInterface us : utilisateurs) {
				if(us.getIdentifiantPseudo().equals(id)) {
					i++;
				}
			}
			
			if(i==0) {
				Utilisateur u = new Utilisateur(id,type,nom,prenom);
				utilisateurs.add(u);
				return true;
			}
			else return false;
			
		}
		else return false;	
		
	}

	@Override
	public List<UtilisateurInterface> getUtilisateurs() throws RemoteException {
		return utilisateurs;
	}

	@Override
	public List<ProduitInterface> getProduits() throws RemoteException {
		return produits;
	}
	
	
	
	
	
	
	
	

}
