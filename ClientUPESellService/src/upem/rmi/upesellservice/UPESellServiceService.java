/**
 * UPESellServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package upem.rmi.upesellservice;

public interface UPESellServiceService extends javax.xml.rpc.Service {
    public java.lang.String getUPESellServiceAddress();

    public upem.rmi.upesellservice.UPESellService getUPESellService() throws javax.xml.rpc.ServiceException;

    public upem.rmi.upesellservice.UPESellService getUPESellService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
