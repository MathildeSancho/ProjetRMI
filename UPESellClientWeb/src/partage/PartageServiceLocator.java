/**
 * PartageServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package partage;

public class PartageServiceLocator extends org.apache.axis.client.Service implements partage.PartageService {

    public PartageServiceLocator() {
    }


    public PartageServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PartageServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Partage
    private java.lang.String Partage_address = "http://localhost:8080/UPESellServiceWeb/services/Partage";

    public java.lang.String getPartageAddress() {
        return Partage_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PartageWSDDServiceName = "Partage";

    public java.lang.String getPartageWSDDServiceName() {
        return PartageWSDDServiceName;
    }

    public void setPartageWSDDServiceName(java.lang.String name) {
        PartageWSDDServiceName = name;
    }

    public partage.Partage getPartage() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Partage_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPartage(endpoint);
    }

    public partage.Partage getPartage(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            partage.PartageSoapBindingStub _stub = new partage.PartageSoapBindingStub(portAddress, this);
            _stub.setPortName(getPartageWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPartageEndpointAddress(java.lang.String address) {
        Partage_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (partage.Partage.class.isAssignableFrom(serviceEndpointInterface)) {
                partage.PartageSoapBindingStub _stub = new partage.PartageSoapBindingStub(new java.net.URL(Partage_address), this);
                _stub.setPortName(getPartageWSDDServiceName());
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
        if ("Partage".equals(inputPortName)) {
            return getPartage();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://partage", "PartageService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://partage", "Partage"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Partage".equals(portName)) {
            setPartageEndpointAddress(address);
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
