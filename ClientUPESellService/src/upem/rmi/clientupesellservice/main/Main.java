package upem.rmi.clientupesellservice.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.xml.rpc.ServiceException;

import upem.rmi.upesellservice.Produit;
import upem.rmi.upesellservice.UPESellService;
import upem.rmi.upesellservice.UPESellServiceService;
import upem.rmi.upesellservice.UPESellServiceServiceLocator;
import upem.rmi.upesellservice.UPESellServiceSoapBindingStub;

public class Main {
	private static UPESellService service;
	private static ListeProduits modeleListe;
	private static ListeProduits modelePanier;
	private static JFrame fenetre;
	private static List<Produit> panier;
	private static List<Produit> produits;
	 
	public static void main(String[] args) throws ServiceException, RemoteException {
		service = new UPESellServiceServiceLocator().getUPESellService();
		((UPESellServiceSoapBindingStub) service).setMaintainSession(true);
		fenetre = new JFrame();
		fenetre.setSize(900, 700);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setLocationRelativeTo(null);
		Box monPanel= Box.createVerticalBox();
		//monPanel.setLayout(new BoxLayout(monPanel,BoxLayout.PAGE_AXIS));
		panier = new ArrayList<Produit>();
		produits = new ArrayList<Produit>();
		initialiseListeProduits();
		modeleListe = new ListeProduits(produits);
		modelePanier = new ListeProduits(panier);
		affichageListe(monPanel);
		affichagePanier(monPanel);
		fenetre.getContentPane().add(monPanel);
		fenetre.setVisible(true);
	}

	public static void initialiseListeProduits() {
		// code en dur pour l'instant
		Produit p = new Produit();
		p.setNom("Casque Audio");
		p.setPrix(12.5);
		p.setDisponibilite(true);
		Produit p1 = new Produit();
		p1.setNom("Tablette");
		p1.setPrix(16);
		p1.setDisponibilite(false);
		produits.add(p);
		produits.add(p1);
		produits.add(p);
		produits.add(p1);
		produits.add(p1);
	}

	public static void affichageListe(Box monPanel) {
		JTable tab = new JTable(modeleListe);
		JPanel boutonsListe = new JPanel();
		JScrollPane jsp = new JScrollPane(tab);
		jsp.setPreferredSize(new Dimension(200,700));
		monPanel.add(jsp);
		JButton btnAjout = new JButton("Ajouter au Panier");
		btnAjout.addActionListener(e -> {
			int[] selection = tab.getSelectedRows();
			for (int i = selection.length - 1; i >= 0; i--) {
				Produit tmp = produits.get(selection[i]);
				panier.add(tmp);
				modelePanier.setProduits(panier);
				produits.remove(tmp);
				modeleListe.setProduits(produits);
				monPanel.repaint();
			}
		});
		boutonsListe.add(btnAjout);
		monPanel.add(boutonsListe);

	}

	static void affichagePanier(Box monPanel) {
		JTable tabPanier = new JTable(modelePanier);
		JPanel boutonsPanier = new JPanel();
		JScrollPane jsp = new JScrollPane(tabPanier);
		monPanel.add(jsp);
		JButton btnSupp = new JButton("Supprimer du Panier");
		JButton btnAchat = new JButton("Acheter");
		btnSupp.addActionListener(e -> {
			int[] selection = tabPanier.getSelectedRows();
			for (int i = selection.length - 1; i >= 0; i--) {
				Produit tmp = panier.get(selection[i]);
				produits.add(tmp);
				modeleListe.setProduits(produits);
				panier.remove(tmp);
				modeleListe.setProduits(panier);
				jsp.repaint();
			}
		});
		boutonsPanier.add(btnSupp);
		boutonsPanier.add(btnAchat);
		monPanel.add(boutonsPanier);

	}
}
