

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MenuIHM  extends JFrame {
	
	private JButton emprunt  = new JButton("Emprunter un produit");
	private JButton inscription = new JButton("S'inscrire");
	private JButton ajout = new JButton("Ajouter un nouveau produit");
	private JButton retourner = new JButton("Retourner un produit");
	
	private PartageInterface partage;
	
	public MenuIHM(PartageInterface partage) {
		super("Partageons !");
		
		this.partage=partage;
		
		initialisation();
		ajouterUtilisateur();
		emprunterProduit();
	}
	
	private void emprunterProduit() {
		this.emprunt.addActionListener(
		   new ActionListener() {
	           @Override
	           public void actionPerformed(ActionEvent ae) {
	        	   	new EmpruntIHM(partage);
	        	   		
	           }
		   });
	}
	
	private void ajouterUtilisateur() {
 	   this.inscription.addActionListener(
		   new ActionListener() {
	           @Override
	           public void actionPerformed(ActionEvent ae) {
	        	   		new InscriptionIHM(partage);
	           }
		   });
	}
	
	private void initialisation() {
		 this.setSize(800, 600);
		 this.setLocationRelativeTo(null);
	     this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	     this.setLayout(null);
	     
	     this.getContentPane().add(this.emprunt);
	     this.getContentPane().add(this.inscription);
	     this.getContentPane().add(this.ajout);
	     this.getContentPane().add(this.retourner);
	     
	     this.emprunt.setBounds(300, 200, 200, 70);
	     this.ajout.setBounds(300, 300, 200, 70);
	     this.inscription.setBounds(650, 30, 100, 40);
	     this.retourner.setBounds(300, 400, 200, 70);
	     
	     this.setVisible(true);
		 
	}

}
