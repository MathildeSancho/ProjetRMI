import java.awt.event.*;
import javax.swing.*;

public class AjoutProduitIHM  extends JFrame {
	
	private JLabel designationLabel = new JLabel("Designation : ");
	
	private JTextField designation = new JTextField();
	
	private JButton valider = new JButton("Enregistrer");
	private JButton annuler = new JButton("Annuler");
	
	private PartageInterface partage;
	
	public AjoutProduitIHM(PartageInterface partage) {
		super("Ajouter un nouveau produit");
		
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
	        	   		
		        	   		String des = designation.getText();
	        	   			
		        	   		if(partage.ajouterProduit(des)){
		        	   		
		        	   			JOptionPane jop = new JOptionPane();
			        	   		jop.showMessageDialog(null, "Le produit est enregistré.","Information",JOptionPane.INFORMATION_MESSAGE);
		        	   			AjoutProduitIHM.this.dispose();
		        	   		}
		        	   		else {
		        	   		
		        	   			JOptionPane jop = new JOptionPane();
			        	   		jop.showMessageDialog(null, "Une erreur s'est produite.", "Erreur", JOptionPane.ERROR_MESSAGE);;
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
	        	   		AjoutProduitIHM.this.dispose();
	           }
		   });
	}
	
	private void initialisation() {
		this.setSize(500, 400);
		 this.setLocationRelativeTo(null);
	     this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	     this.setLayout(null);
	     
	     this.getContentPane().add(this.designationLabel);
	     this.getContentPane().add(this.designation);

	     this.getContentPane().add(this.valider);
	     this.getContentPane().add(this.annuler);
	     
	     this.designationLabel.setBounds(20, 100, 150, 35);
	     this.designation.setBounds(150, 100, 150, 100);

	     this.valider.setBounds(70, 300, 100, 40);
	     this.annuler.setBounds(200, 300, 100, 40);
	     
	     
	     this.setVisible(true);
	     
	}

}
