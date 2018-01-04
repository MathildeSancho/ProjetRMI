package upem.rmi.upesellservice;

public class UPESellServiceProxy implements upem.rmi.upesellservice.UPESellService {
  private String _endpoint = null;
  private upem.rmi.upesellservice.UPESellService uPESellService = null;
  
  public UPESellServiceProxy() {
    _initUPESellServiceProxy();
  }
  
  public UPESellServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initUPESellServiceProxy();
  }
  
  private void _initUPESellServiceProxy() {
    try {
      uPESellService = (new upem.rmi.upesellservice.UPESellServiceServiceLocator()).getUPESellService();
      if (uPESellService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)uPESellService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)uPESellService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (uPESellService != null)
      ((javax.xml.rpc.Stub)uPESellService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public upem.rmi.upesellservice.UPESellService getUPESellService() {
    if (uPESellService == null)
      _initUPESellServiceProxy();
    return uPESellService;
  }
  
  public void setProductsToSell(java.lang.Object[] productsToSell) throws java.rmi.RemoteException{
    if (uPESellService == null)
      _initUPESellServiceProxy();
    uPESellService.setProductsToSell(productsToSell);
  }
  
  public java.lang.String affichePrixProduits(java.lang.Object[] lp) throws java.rmi.RemoteException{
    if (uPESellService == null)
      _initUPESellServiceProxy();
    return uPESellService.affichePrixProduits(lp);
  }
  
  public void ajouterAuPanier(upem.rmi.upesellservice.Produit p) throws java.rmi.RemoteException{
    if (uPESellService == null)
      _initUPESellServiceProxy();
    uPESellService.ajouterAuPanier(p);
  }
  
  public java.lang.Object[] getProductsToSell() throws java.rmi.RemoteException{
    if (uPESellService == null)
      _initUPESellServiceProxy();
    return uPESellService.getProductsToSell();
  }
  
  public void setPanier(java.lang.Object[] panier) throws java.rmi.RemoteException{
    if (uPESellService == null)
      _initUPESellServiceProxy();
    uPESellService.setPanier(panier);
  }
  
  public boolean plusDeDeuxMois(upem.rmi.upesellservice.Produit p) throws java.rmi.RemoteException{
    if (uPESellService == null)
      _initUPESellServiceProxy();
    return uPESellService.plusDeDeuxMois(p);
  }
  
  public java.lang.Object[] getPanier() throws java.rmi.RemoteException{
    if (uPESellService == null)
      _initUPESellServiceProxy();
    return uPESellService.getPanier();
  }
  
  public void viderPanier() throws java.rmi.RemoteException{
    if (uPESellService == null)
      _initUPESellServiceProxy();
    uPESellService.viderPanier();
  }
  
  public void modifierPanier(upem.rmi.upesellservice.Produit p) throws java.rmi.RemoteException{
    if (uPESellService == null)
      _initUPESellServiceProxy();
    uPESellService.modifierPanier(p);
  }
  
  public boolean estDisponible(upem.rmi.upesellservice.Produit p) throws java.rmi.RemoteException{
    if (uPESellService == null)
      _initUPESellServiceProxy();
    return uPESellService.estDisponible(p);
  }
  
  public void initialisationListProduits(java.lang.Object[] produits) throws java.rmi.RemoteException{
    if (uPESellService == null)
      _initUPESellServiceProxy();
    uPESellService.initialisationListProduits(produits);
  }
  
  
}