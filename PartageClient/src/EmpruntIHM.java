
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.*;
import javax.swing.*;

public class EmpruntIHM extends JFrame {
	
	private JLabel pseudo = new JLabel("Entrez votre pseudo :");
	private JTextField pseudoField = new JTextField();
	
	private JLabel produitsLabel = new JLabel("Nos produits : ");
	
	private DefaultListModel<ProduitInterface> produitName = new DefaultListModel<ProduitInterface>();
	private JList<ProduitInterface> produitListe;
	private JScrollPane produitListScrollPane;
	
	private JButton emprunter = new JButton("Emprunter");
	private JButton annuler = new JButton("Annuler");
	
	private PartageInterface partage;
	
	public EmpruntIHM(PartageInterface partage){
		super("Emprunter un produit");
		
		this.partage=partage;
		
		initialisation();
		valider();
	}
	
	private void valider() {
	 	   this.emprunter.addActionListener(
			   new ActionListener() {
		           @Override
		           public void actionPerformed(ActionEvent ae){
		        	   		// VERIFIER PSEUDO
		        	   		try {
		        	   			String pseudoSaisie = pseudoField.getText();
		        	   			
		        	   			UtilisateurInterface connexion=null;
		        	   					List<UtilisateurInterface> liste = partage.getUtilisateurs();
		        	   					for(UtilisateurInterface u : liste) {
		        	   						if(u.getIdentifiantPseudo().equals(pseudoSaisie)) {
		        	   							connexion=u;
		        	   						}
		        	   					}
		        	   	
		        	   			if(connexion!=null) {
		        	   	
		        	   				ProduitInterface p = EmpruntIHM.this.produitListe.getSelectedValue();
		        	   				if(partage.emprunterProduit(p, connexion)) {
		        	   					JOptionPane jop = new JOptionPane();
		        	   					jop.showMessageDialog(null, "Le produit est emprunté."+p.toString(),"Information",JOptionPane.INFORMATION_MESSAGE);
		        	   					EmpruntIHM.this.dispose();
		        	   				}
		        	   				else {
		        	   					JOptionPane jop = new JOptionPane();
		        	   					jop.showMessageDialog(null, "Ce produit n'est pas disponible", "Attention", JOptionPane.WARNING_MESSAGE);
			        			
		        	   				}
		        	   	
		        	   			}
		        	   			else {
		        	   				JOptionPane jop = new JOptionPane();
		        	   				jop.showMessageDialog(null, "Inscrivez-vous pour emprunter un produit.", "Erreur", JOptionPane.ERROR_MESSAGE);
		        	   				EmpruntIHM.this.dispose();
		        	   			}
		        	   		}
		        	   		catch(Exception e) {}
		           }
			   });
	}
	
	
	private void initialisation() {
		
		 this.setSize(800, 600);
		 this.setLocationRelativeTo(null);
		 this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 this.setLayout(null);
		 
		 try {
			 for(ProduitInterface p : partage.getProduits() ){
				 produitName.addElement(p);
			 }
		 }
		 catch(Exception e) {}
		 this.produitListe = new JList<ProduitInterface>(produitName);
		 this.produitListe.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	     this.produitListe.setSelectedIndex(0);
		 //this.produitListe.setVisibleRowCount(3); 
		 this.produitListScrollPane = new JScrollPane(produitListe); 
		 
		
		 
		 this.getContentPane().add(this.pseudo);
		 this.getContentPane().add(this.pseudoField);
		 
		 this.getContentPane().add(this.produitsLabel);
		 this.getContentPane().add(this.produitListScrollPane);
		 
		 
		 
		 this.getContentPane().add(this.emprunter);
		 this.getContentPane().add(this.annuler);
		 
		 
		 this.pseudo.setBounds(60, 30, 150, 35);
		 this.pseudoField.setBounds(230,30,150,35);
		 
		 this.produitsLabel.setBounds(60, 90, 180, 35);
		 this.produitListScrollPane.setBounds(60, 130, 250, 100);
		 
		 this.emprunter.setBounds(200,450,100,40);
		 this.annuler.setBounds(350, 450, 100, 40);
		 
		 
		 this.setVisible(true);
	}

}
