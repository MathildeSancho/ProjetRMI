package client;

import java.awt.Dimension;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.swing.*;
import javax.xml.rpc.ServiceException;

import partage.*;

public class main {
	
	private static Partage service;
	
	private static ListeProduits modeleListe;
	
	private static ListeProduits modelePanier;
	
	private static JFrame fenetre;
	
	private static JLabel totalPrix;

	public static void main(String[] args) throws ServiceException, RemoteException {

		service = new PartageServiceLocator().getPartage();

		fenetre = new JFrame();
		fenetre.setSize(900, 700);
		fenetre.setTitle("UPE Sell Service");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setLocationRelativeTo(null);
		
		Box monPanel = Box.createVerticalBox();
		
		initialiseListeProduits();
		affichageListe(monPanel);
		affichagePanier(monPanel);
		fenetre.getContentPane().add(monPanel);
		fenetre.setVisible(true);
	}

	public static void initialiseListeProduits() throws RemoteException {
		
		Produit[] produits = service.getProductsToSell();
		
		for(int i=0;i<produits.length;i++) {
			System.out.println("PR : "+produits[i].getNom());
		}
		
		modeleListe = new ListeProduits(produits);
		//modelePanier = new ListeProduits();
	}

	/*public static Produit[] arrayToTab() {
		Produit[] pr = null;
		try {
			int taille = service.getSize();
			pr = new Produit[taille];
			for(int i = 0;i<taille;i++) {
				pr[i] = service.getProductsToSell(i);
			}
		} catch (RemoteException e) {
			System.out.println("probleme de conversion");
		}
		return pr;
	}*/

	public static void affichageListe(Box monPanel) {
		JTable tab = new JTable(modeleListe);
		JPanel boutonsListe = new JPanel();
		JScrollPane jsp = new JScrollPane(tab);
		jsp.setPreferredSize(new Dimension(200, 700));
		monPanel.add(jsp);
		JButton btnAjout = new JButton("Ajouter au Panier");
		btnAjout.addActionListener(e -> {
			int[] selection = tab.getSelectedRows();
			for (int i = selection.length - 1; i >= 0; i--) {
				Produit tmp;
				try {
					
					//tmp = service.getProductsToSell(selection[i]);
					//service.ajoutePanier(tmp);
					
					//modelePanier.setProduits(service.getPanier());
					// produits.remove(tmp);
					//modeleListe.setProduits(service.getProductsToSell());
					totalPrix.setText(calculePrixPanier() + "Euros");
					monPanel.repaint();
				} catch (RemoteException e1) {
					e1.printStackTrace();
				}
			}
		});
		boutonsListe.add(btnAjout);
		monPanel.add(boutonsListe);

	}

	static void affichagePanier(Box monPanel) throws RemoteException {
		JTable tabPanier = new JTable(modelePanier);
		JPanel boutonsPanier = new JPanel();
		JScrollPane jsp = new JScrollPane(tabPanier);
		monPanel.add(jsp);
		JButton btnSupp = new JButton("Supprimer du Panier");
		JButton btnAchat = new JButton("Acheter");
		btnSupp.addActionListener(e -> {
			int[] selection = tabPanier.getSelectedRows();
			for (int i = selection.length - 1; i >= 0; i--) {
				Produit tmp;
				try {
				//	tmp = service.getProductsToSell()[selection[i]];

				//	service.ajouteProductToSell(tmp);
					//modeleListe.setProduits(service.getProductsToSell());
					// panier.remove(tmp);
				//	modeleListe.setProduits(service.getPanier());
					totalPrix.setText(calculePrixPanier() + "�");
					jsp.repaint();
				} catch (RemoteException e1) {
					e1.printStackTrace();
				}
			}
		});
		totalPrix = new JLabel(calculePrixPanier() + "�");
		monPanel.add(totalPrix);
		boutonsPanier.add(btnSupp);
		boutonsPanier.add(btnAchat);
		monPanel.add(boutonsPanier);

	}

	private static double calculePrixPanier() throws RemoteException {
		double res = 0;
		/*if (service.getPanier() != null) {
		//	for (Produit p : service.getPanier()) {
				res += p.getPrix();
			}
		}*/
		return res;
	}
}
