package service.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class PartageImplementation extends UnicastRemoteObject implements PartageInterface {
	
	private List<Produit> produits;
	private List<Utilisateur> utilisateurs;
	
	public PartageImplementation() throws RemoteException {
		super();
		produits = new ArrayList<>();
		utilisateurs = new ArrayList<>();
	}

	@Override
	public boolean emprunterProduit(Produit p, Utilisateur u) throws RemoteException {
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
				
				p.ajouterEnListeAttente(u);
				
				return false;
			}
		
	}

	@Override
	public boolean retournerProduit(Produit p, Utilisateur u) throws RemoteException {
		
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
	public boolean ajouterProduit(String def, int note, String commentaire) throws RemoteException {
		
		int v=0;
		for(Produit pt : produits) {
			if(pt.getDefinition().equals(def)) {
				v++;
			}
		}
		if(v==0) {
			Produit p = new Produit(def,note,commentaire);
			produits.add(p);
			return true;
		}
		else return false;
	}

	@Override
	public boolean ajouterUtilisateur(String type, String id) throws RemoteException {
		
		// Verifier TYPE : 
		if(type.equals("Etudiant") || type.equals("Enseignant")) {
			int i=0;
			// Verifier ID: 
			for(Utilisateur us : utilisateurs) {
				if(us.getIdentifiantPseudo().equals(id)) {
					i++;
				}
			}
			
			if(i==0) {
				Utilisateur u = new Utilisateur(id,type);
				utilisateurs.add(u);
				return true;
			}
			else return false;
			
		}
		else return false;	
		
	}
	
	
	
	
	
	

}
