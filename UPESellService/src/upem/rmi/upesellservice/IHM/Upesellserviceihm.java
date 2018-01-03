package upem.view.rmi;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class Upesellserviceihm extends JFrame{
	
	private final JLabel rechercherLabel = new JLabel("Rechercher ");
	 private final JTextField rechercherField = new JTextField();
	 private final JLabel emprunterLabel = new JLabel("Panier ");
	 private final JButton ajouter = new JButton("Ajouter un produit");
	 private final JButton rechercher = new JButton("Rechercher");
	 private final JButton valider = new JButton("Valider le panier");
	 private final JButton annuler = new JButton("Annuler");
	 private final JButton vider= new JButton("Vider le panier");
	 
	 private final String[] option = {"USD", "GBP","INR","CAD"};
	 private final JComboBox devise= new JComboBox(option);
	 
	 private   DefaultListModel produitName;
	 private  JList produitList;
	 private JScrollPane produitListScrollPane;
	 
	 private   DefaultListModel panierproduitName;
	 private  JList panierproduitList;
	 private JScrollPane panierproduitListScrollPane;
	 
	 private ArrayList<Produit> arrayproduit;
	 
	public Upesellserviceihm(ArrayList<Produit> loproduit) {
		
		super("UPESellService");
		
		arrayproduit=loproduit;
		
		produitName = new DefaultListModel();
		
		for (Produit produit : loproduit) {
			produitName.addElement(produit.toString());
		}
		this.produitList = new JList(produitName);
		
		this.produitList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.produitList.setSelectedIndex(0);
		this.produitList.setVisibleRowCount(3); 
		this.produitListScrollPane = new JScrollPane(produitList);
		
		
		this.panierproduitList = new JList();
		
		this.panierproduitList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.panierproduitList.setSelectedIndex(0);
		this.panierproduitList.setVisibleRowCount(3); 
		
		panierproduitListScrollPane=new JScrollPane(panierproduitList);
		initialise();
		rechercher() ;
		valider();
		annuler();
		ajouter();
		
		
		
	}
	
	 private void initialise() {
	        this.setSize(800, 600);
	        this.setLocationRelativeTo(null);
	        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        this.setLayout(null);
	      
	        this.getContentPane().add(this.emprunterLabel);
	        this.getContentPane().add(this.rechercherLabel);
	        this.getContentPane().add(this.rechercherField);
	        this.getContentPane().add(this.rechercher);
	        this.getContentPane().add(this.ajouter);
	        this.getContentPane().add(this.annuler);
	        this.getContentPane().add(this.valider);
	        this.getContentPane().add(this.vider);
	        
	        this.getContentPane().add(this.devise);
	        this.getContentPane().add(this.produitListScrollPane);
	        this.getContentPane().add(this.panierproduitListScrollPane);
	        
	        this.ajouter.setBounds(486, 288, 170, 25);
	        this.valider.setBounds(486, 349, 170, 25);	       
	        this.vider.setBounds(486, 319, 170, 25);
	        this.annuler.setBounds(495, 112, 125, 25);
	        this.rechercherLabel.setBounds(90, 33, 81, 33);
	        this.emprunterLabel.setBounds(64,262, 81, 33);
	        this.rechercherField.setBounds(192, 31, 262, 25);
	        this.rechercher.setBounds(495, 65, 125, 25);
	        this.devise.setBounds(495, 31, 125, 25);     
	        
	        this.produitListScrollPane.setBounds(193,58, 262, 200);
	        this.panierproduitListScrollPane.setBounds(193,269, 262, 200);
	        
	        this.setVisible(true);
	    }
	 
	 private void rechercher() {
	        this.rechercher.addActionListener(new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent ae) {
	                dispose();
	            }
	        });
	    }

	    private void ajouter() {
	        this.ajouter.addActionListener(new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent ae) {
	               /* */

	              
	                dispose();
	            }
	        });
	    }

	    private void valider() {
	        this.valider.addActionListener(new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent ae) {
	               /* */

	              
	                dispose();
	            }
	        });
	    }
	    
	    private void annuler() {
	        this.annuler.addActionListener(new ActionListener() {

	            @Override
	            public void actionPerformed(ActionEvent ae) {
	                dispose();
	            }
	        });
	    }
    
      
     
     
	


}
