package upem.rmi.clientupesellservice.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import upem.rmi.upesellservice.Produit;
import upem.rmi.upesellservice.Utilisateur;

public class ListeProduits extends AbstractTableModel {
	
	private List<Produit> produits = new ArrayList<Produit>();

	private final String [] entetes = {"Description","Prix","Disponibilité"};
	
	public ListeProduits(List<Produit> produits) {
		this.produits=produits;
		
	}

	@Override
	public int getColumnCount() {
		return entetes.length;
	}

	@Override
	public int getRowCount() {
		return produits.size();
		
	}
	
	public String getColumnName(int index) {
		return entetes[index];
	}

	public List<Produit> getProduits() {
		return produits;
	}
	
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}


	@Override
	public Object getValueAt(int rowIndex, int colonneIndex) {
		switch(colonneIndex) {
		case 0:
			return produits.get(rowIndex).getNom();
		case 1: 
			return produits.get(rowIndex).getPrix();
		case 2:
			if(produits.get(rowIndex).isDisponibilite()) {
				return "Disponible";
			}else return "Indisponible";
		default :
			return null; 
		}
		
	}
	

}
