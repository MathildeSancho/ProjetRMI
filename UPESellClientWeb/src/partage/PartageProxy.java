package partage;

public class PartageProxy implements partage.Partage {
  private String _endpoint = null;
  private partage.Partage partage = null;
  
  public PartageProxy() {
    _initPartageProxy();
  }
  
  public PartageProxy(String endpoint) {
    _endpoint = endpoint;
    _initPartageProxy();
  }
  
  private void _initPartageProxy() {
    try {
      partage = (new partage.PartageServiceLocator()).getPartage();
      if (partage != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)partage)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)partage)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (partage != null)
      ((javax.xml.rpc.Stub)partage)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public partage.Partage getPartage() {
    if (partage == null)
      _initPartageProxy();
    return partage;
  }
  
  public int getSize() throws java.rmi.RemoteException{
    if (partage == null)
      _initPartageProxy();
    return partage.getSize();
  }
  
  public partage.Produit[] getProductsToSell() throws java.rmi.RemoteException{
    if (partage == null)
      _initPartageProxy();
    return partage.getProductsToSell();
  }
  
  public boolean plusDeDeuxMois(partage.Produit p) throws java.rmi.RemoteException{
    if (partage == null)
      _initPartageProxy();
    return partage.plusDeDeuxMois(p);
  }
  
  public partage.Produit getProduitPanier(int i) throws java.rmi.RemoteException{
    if (partage == null)
      _initPartageProxy();
    return partage.getProduitPanier(i);
  }
  
  public java.lang.String affichePrixProduit(partage.Produit p) throws java.rmi.RemoteException{
    if (partage == null)
      _initPartageProxy();
    return partage.affichePrixProduit(p);
  }
  
  public void ajouterAuPanier(partage.Produit p) throws java.rmi.RemoteException{
    if (partage == null)
      _initPartageProxy();
    partage.ajouterAuPanier(p);
  }
  
  public void viderPanier() throws java.rmi.RemoteException{
    if (partage == null)
      _initPartageProxy();
    partage.viderPanier();
  }
  
  
}