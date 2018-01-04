/**
 * UPESellServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package upem.rmi.upesellservice;

public class UPESellServiceServiceLocator extends org.apache.axis.client.Service implements upem.rmi.upesellservice.UPESellServiceService {

    public UPESellServiceServiceLocator() {
    }


    public UPESellServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UPESellServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UPESellService
    private java.lang.String UPESellService_address = "http://localhost:8040/UPESellService/services/UPESellService";

    public java.lang.String getUPESellServiceAddress() {
        return UPESellService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UPESellServiceWSDDServiceName = "UPESellService";

    public java.lang.String getUPESellServiceWSDDServiceName() {
        return UPESellServiceWSDDServiceName;
    }

    public void setUPESellServiceWSDDServiceName(java.lang.String name) {
        UPESellServiceWSDDServiceName = name;
    }

    public upem.rmi.upesellservice.UPESellService getUPESellService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UPESellService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUPESellService(endpoint);
    }

    public upem.rmi.upesellservice.UPESellService getUPESellService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            upem.rmi.upesellservice.UPESellServiceSoapBindingStub _stub = new upem.rmi.upesellservice.UPESellServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getUPESellServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUPESellServiceEndpointAddress(java.lang.String address) {
        UPESellService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (upem.rmi.upesellservice.UPESellService.class.isAssignableFrom(serviceEndpointInterface)) {
                upem.rmi.upesellservice.UPESellServiceSoapBindingStub _stub = new upem.rmi.upesellservice.UPESellServiceSoapBindingStub(new java.net.URL(UPESellService_address), this);
                _stub.setPortName(getUPESellServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("UPESellService".equals(inputPortName)) {
            return getUPESellService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://upesellservice.rmi.upem", "UPESellServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://upesellservice.rmi.upem", "UPESellService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UPESellService".equals(portName)) {
            setUPESellServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
