package client;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import partage.Produit;

public class ListeProduits extends AbstractTableModel {
	
	private List<Produit> produits = new ArrayList<Produit>();

	private final String [] entetes = {"Description","Prix","Disponible"};
	
	public ListeProduits(Produit[] produits) {
		for (int i=0;i<produits.length;i++) {
			
			this.produits.add(produits[i]);
		}
		
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
	
	public void setProduits(Produit[] produits2) {
		for (Produit p : produits) {
			this.produits.add(p);
		}
		
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
				return "En stock";
			}else return "Indisponible";
		default :
			return null; 
		}
		
	}
	

}
