import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.*;

public class InscriptionIHM extends JFrame {
	
	private final JLabel pseudo = new JLabel("Pseudo :");
	private final JTextField pseudoField = new JTextField();
	
    private final JLabel nomLabel = new JLabel("Nom :");
    private final JTextField nomField = new JTextField();
    
    private final JLabel prenomLabel = new JLabel("Prenom :");
    private final JTextField prenomField = new JTextField();
    
    private final JLabel typeLabel = new JLabel("Type :");
    private final String[] option1 = {"Enseignant", "Etudiant"};
    private final JComboBox typeCombox = new JComboBox(option1);
	    
    private final JButton ajouter = new JButton("Ajouter");
    private final JButton annuler = new JButton("Annuler");
    
    private PartageInterface partage;
	
	public InscriptionIHM(PartageInterface p) {
		super("Inscription d'un nouvel utilisateur");
		
		this.partage=p;
		
		initialisation();
		valider();
		annuler();
	}
	
	private void valider() {
		this.ajouter.addActionListener(
		   new ActionListener() {
	           @Override
	           public void actionPerformed(ActionEvent ae) {
	        	   		try {
		        	   
		        	   		String nomU = nomField.getText();
		        	   		String prenomU = prenomField.getText();
		        	   		String pseudoU = pseudoField.getText();
		        	   		String typeU = typeCombox.getSelectedItem().toString();
		        	   		
		        	   		UtilisateurInterface u=null;
		        	   		List<UtilisateurInterface> liste = partage.getUtilisateurs();
		        	   		for(UtilisateurInterface ui:liste) {
		        	   			if(ui.getIdentifiantPseudo().equals(pseudoU)) {
		        	   				System.out.println("Voici les id : "+ui.getIdentifiantPseudo());
		        	   				u=ui;
		        	   			}
		        	   		}
		        	   		if(u==null) {
		        	   		partage.ajouterUtilisateur(typeU,pseudoU,nomU,prenomU);
		        	   		
		        	   		JOptionPane jop = new JOptionPane();
		        	   		jop.showMessageDialog(null, "L'utilisateur est enregistré.","Information",JOptionPane.INFORMATION_MESSAGE);
		        	   		InscriptionIHM.this.dispose();
		        	   		}
		        	   		else {
		        	   			JOptionPane jop = new JOptionPane();
		        	   			jop.showMessageDialog(null, "Ce pseudo est deja utilisé.", "Erreur", JOptionPane.ERROR_MESSAGE);			        	   		
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
	        	   		InscriptionIHM.this.dispose();
	           }
		   });
	}
	
	private void initialisation() {
		 this.setSize(500, 400);
		 this.setLocationRelativeTo(null);
	     this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	     this.setLayout(null);
	     
	     this.getContentPane().add(this.pseudo);
	     this.getContentPane().add(this.pseudoField);
	     
	     this.getContentPane().add(this.nomLabel);
	     this.getContentPane().add(this.nomField);
	     
	     this.getContentPane().add(this.prenomLabel);
	     this.getContentPane().add(this.prenomField);
	     
	     this.getContentPane().add(this.typeLabel);
	     this.getContentPane().add(this.typeCombox);
	     
	     this.getContentPane().add(this.ajouter);
	     this.getContentPane().add(this.annuler);
	     
	     
	     this.typeLabel.setBounds(20, 20, 80, 35);
	     this.typeCombox.setBounds(100, 20, 150, 35);
	     
	     this.nomLabel.setBounds(20, 80, 80, 35);
	     this.nomField.setBounds(100, 80, 150, 35);
	     
	     this.prenomLabel.setBounds(20, 140, 80, 35);
	     this.prenomField.setBounds(100, 140, 150, 35);
	     
	     this.pseudo.setBounds(20, 200, 80, 35);
	     this.pseudoField.setBounds(100, 200, 150, 35);
	     
	     this.ajouter.setBounds(70, 300, 100, 40);
	     this.annuler.setBounds(200, 300, 100, 40);
	    
	     
	     
	     this.setVisible(true);
		 
	}

}
