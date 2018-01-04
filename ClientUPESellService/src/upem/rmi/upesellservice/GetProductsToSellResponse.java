/**
 * GetProductsToSellResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package upem.rmi.upesellservice;

public class GetProductsToSellResponse  implements java.io.Serializable {
    private java.lang.Object[] getProductsToSellReturn;

    public GetProductsToSellResponse() {
    }

    public GetProductsToSellResponse(
           java.lang.Object[] getProductsToSellReturn) {
           this.getProductsToSellReturn = getProductsToSellReturn;
    }


    /**
     * Gets the getProductsToSellReturn value for this GetProductsToSellResponse.
     * 
     * @return getProductsToSellReturn
     */
    public java.lang.Object[] getGetProductsToSellReturn() {
        return getProductsToSellReturn;
    }


    /**
     * Sets the getProductsToSellReturn value for this GetProductsToSellResponse.
     * 
     * @param getProductsToSellReturn
     */
    public void setGetProductsToSellReturn(java.lang.Object[] getProductsToSellReturn) {
        this.getProductsToSellReturn = getProductsToSellReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetProductsToSellResponse)) return false;
        GetProductsToSellResponse other = (GetProductsToSellResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getProductsToSellReturn==null && other.getGetProductsToSellReturn()==null) || 
             (this.getProductsToSellReturn!=null &&
              java.util.Arrays.equals(this.getProductsToSellReturn, other.getGetProductsToSellReturn())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetProductsToSellReturn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetProductsToSellReturn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetProductsToSellReturn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetProductsToSellResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://upesellservice.rmi.upem", ">getProductsToSellResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getProductsToSellReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://upesellservice.rmi.upem", "getProductsToSellReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://upesellservice.rmi.upem", "item"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
