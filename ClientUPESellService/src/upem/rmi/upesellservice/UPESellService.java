/**
 * UPESellService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package upem.rmi.upesellservice;

public interface UPESellService extends java.rmi.Remote {
    public void setProductsToSell(java.lang.Object[] productsToSell) throws java.rmi.RemoteException;
    public java.lang.String affichePrixProduits(java.lang.Object[] lp) throws java.rmi.RemoteException;
    public void ajouterAuPanier(upem.rmi.upesellservice.Produit p) throws java.rmi.RemoteException;
    public java.lang.Object[] getProductsToSell() throws java.rmi.RemoteException;
    public void setPanier(java.lang.Object[] panier) throws java.rmi.RemoteException;
    public boolean plusDeDeuxMois(upem.rmi.upesellservice.Produit p) throws java.rmi.RemoteException;
    public java.lang.Object[] getPanier() throws java.rmi.RemoteException;
    public void viderPanier() throws java.rmi.RemoteException;
    public void modifierPanier(upem.rmi.upesellservice.Produit p) throws java.rmi.RemoteException;
    public boolean estDisponible(upem.rmi.upesellservice.Produit p) throws java.rmi.RemoteException;
    public void initialisationListProduits(java.lang.Object[] produits) throws java.rmi.RemoteException;
}
