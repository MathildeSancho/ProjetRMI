
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class EmpruntIHM extends JFrame {
	
	private JLabel pseudo = new JLabel("Entrez votre pseudo :");
	private JTextField pseudoField = new JTextField();
	
	private JLabel produitsLabel = new JLabel("Nos produits : ");
	
	private DefaultListModel<String> produitName = new DefaultListModel<String>();
	private JList<String> produitListe;
	private JScrollPane produitListScrollPane;
	
	private JButton emprunter = new JButton("Emprunter");
	private JButton annuler = new JButton("Annuler");
	
	private PartageInterface partage;
	
	public EmpruntIHM(PartageInterface partage){
		super("Emprunter un produit");
		
		this.partage=partage;
		
		initialisation();
		valider();
		annuler();
	}
	
	private void valider() {
	 	   this.emprunter.addActionListener(
			   new ActionListener() {
		           @Override
		           public void actionPerformed(ActionEvent ae){
		        	   		// VERIFIER PSEUDO
		        	   
		        	   		
		        	   		try {
		        	   			
		        	   			System.out.println("Taille prd = "+partage.getProduits().size());
		        	   			
		        	   			String pseudoSaisie = pseudoField.getText();
		        	   			
		        	   			UtilisateurInterface connexion=null;
        	   					List<UtilisateurInterface> liste = partage.getUtilisateurs();
        	   					for(UtilisateurInterface u : liste) {
        	   						if(u.getIdentifiantPseudo().equals(pseudoSaisie)) {
        	   							connexion=u;
        	   						}
        	   					}
		        	   	
		        	   			if(connexion!=null) {
		        	   	
		        	   				ProduitInterface p=null;
		        	   				for(ProduitInterface pi : partage.getProduits()) {
		        	   					if(pi.getDefinition().equals(EmpruntIHM.this.produitListe.getSelectedValue())) {
		        	   						p=pi;
		        	   					}
		        	   				}
		        	   				boolean verif = partage.emprunterProduit(p, connexion);
		        	   				
		        	   				if(!verif) {
		        	   					JOptionPane jop = new JOptionPane();
		        	   					jop.showMessageDialog(null, "Ce produit n'est pas disponible", "Attention", JOptionPane.WARNING_MESSAGE);
			        			
		        	   				}
		        	   				
		        	   				else {
		        	   					JOptionPane jop = new JOptionPane();
		        	   					jop.showMessageDialog(null, "Le produit "+p.getDefinition()+" est emprunté.","Information",JOptionPane.INFORMATION_MESSAGE);
		        	   					EmpruntIHM.this.dispose();
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
	
	private void annuler() {
		this.annuler.addActionListener(
				   new ActionListener() {
			           @Override
			           public void actionPerformed(ActionEvent ae) {
			        	   		EmpruntIHM.this.dispose();
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
				 
				 produitName.addElement(p.getDefinition());
			 }
		 }
		 catch(Exception e) {}
		 this.produitListe = new JList<String>(produitName);
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
