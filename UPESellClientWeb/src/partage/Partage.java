/**
 * Partage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package partage;

public interface Partage extends java.rmi.Remote {
    public int getSize() throws java.rmi.RemoteException;
    public partage.Produit[] getProductsToSell() throws java.rmi.RemoteException;
    public boolean plusDeDeuxMois(partage.Produit p) throws java.rmi.RemoteException;
    public partage.Produit getProduitPanier(int i) throws java.rmi.RemoteException;
    public java.lang.String affichePrixProduit(partage.Produit p) throws java.rmi.RemoteException;
    public void ajouterAuPanier(partage.Produit p) throws java.rmi.RemoteException;
    public void viderPanier() throws java.rmi.RemoteException;
}
