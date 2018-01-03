import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RetournerProduitIHM  extends JFrame {
	
	private JLabel pseudoLabel = new JLabel("Pseudo : ");
	private JLabel designationLabel = new JLabel("Designation : ");
	private JLabel noteLabel = new JLabel("Note sur 10 :");
	private JLabel commentaireLabel = new JLabel("Commentaire : ");
	
	private JTextField pseudo = new JTextField();
	private JTextField designation = new JTextField();
	private JTextField note = new JTextField();
	private JTextField commentaire = new JTextField();
	
	private JButton valider = new JButton("Enregistrer");
	private JButton annuler = new JButton("Annuler");
	
	private PartageInterface partage;
	
	public RetournerProduitIHM (PartageInterface partage) {
		super("Retourner un produit");
		
		this.partage=partage;
		
		initialisation();
		annuler();
		valider();
	}
	
	private void valider(){
		this.valider.addActionListener(
			new ActionListener() {
	           @Override
	           public void actionPerformed(ActionEvent ae) {
	        	   		try{
	        	   		
	        	   			String ps = pseudo.getText();
	        	   			
		        	   		String des = designation.getText();
		        	   		String n=note.getText();
		        	   		int note =Integer.parseInt(n);
		        	   		String comment = commentaire.getText();
	        	   			
		        	   		// RETROUVE L'UTILISATEUR
		        	   		UtilisateurInterface utilisateur=null;
    	   					List<UtilisateurInterface> liste = partage.getUtilisateurs();
    	   					for(UtilisateurInterface u : liste) {
    	   						if(u.getIdentifiantPseudo().equals(ps)) {
    	   							utilisateur=u;
    	   						}
    	   					}
    	   					
    	   					if(utilisateur != null) {
    	   						
    	   						//RETROUVE LE PRODUIT
    	   						ProduitInterface p=null;
	        	   				for(ProduitInterface pr : partage.getProduits()) {
	        	   					if(pr.getDefinition().equals(des)) {
	        	   						p=pr;
	        	   					}
	        	   				}
		        	   		
			        	   		if(partage.retournerProduit(p, utilisateur)){
			        	   			
			        	   			p.ajouterUneNote(note);
			        	   			p.ajouterUnCommentaire(comment);
			        	   		
			        	   			JOptionPane jop = new JOptionPane();
				        	   		jop.showMessageDialog(null, "Le produit est bien retourné.","Information",JOptionPane.INFORMATION_MESSAGE);
			        	   			RetournerProduitIHM.this.dispose();
			        	   		}
			        	   		else {
			        	   		
			        	   			JOptionPane jop = new JOptionPane();
				        	   		jop.showMessageDialog(null, "Une erreur s'est produite.", "Erreur", JOptionPane.ERROR_MESSAGE);;
			        	   		}
    	   					}
    	   					else {
    	   						JOptionPane jop = new JOptionPane();
			        	   		jop.showMessageDialog(null, "Vous n'est pas enregistré.", "Erreur", JOptionPane.ERROR_MESSAGE);;
		        	   		
    	   					}
	        	   		} catch(Exception e){}
	        	   		
	           }
		   });
			
	}
	
	private void annuler(){
		this.annuler.addActionListener(
		   new ActionListener() {
	           @Override
	           public void actionPerformed(ActionEvent ae) {
	        	   		RetournerProduitIHM.this.dispose();
	           }
		   });
	}
	
	private void initialisation() {
		 this.setSize(500, 400);
		 this.setLocationRelativeTo(null);
	     this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	     this.setLayout(null);
	     
	     this.getContentPane().add(this.pseudoLabel);
	     this.getContentPane().add(this.pseudo);
	     this.getContentPane().add(this.designationLabel);
	     this.getContentPane().add(this.designation);
	     this.getContentPane().add(this.noteLabel);
	     this.getContentPane().add(this.note);
	     this.getContentPane().add(this.commentaireLabel);
	     this.getContentPane().add(this.commentaire);
	     this.getContentPane().add(this.valider);
	     this.getContentPane().add(this.annuler);
	     
	     this.pseudoLabel.setBounds(20, 20, 150, 35);
	     this.pseudo.setBounds(150,20,150,35);
	     this.designationLabel.setBounds(20, 60, 150, 35);
	     this.designation.setBounds(150, 60, 150, 35);
	     this.noteLabel.setBounds(20, 100, 150, 35);
	     this.note.setBounds(150, 100, 150, 35);
	     this.commentaireLabel.setBounds(20, 160, 150, 35);
	     this.commentaire.setBounds(150,160,150,65);
	     this.valider.setBounds(70, 300, 100, 40);
	     this.annuler.setBounds(200, 300, 100, 40);
	     
	     
	     this.setVisible(true);
	     
	}

}