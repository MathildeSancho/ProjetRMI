/**
 * SetPanier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package upem.rmi.upesellservice;

public class SetPanier  implements java.io.Serializable {
    private java.lang.Object[] panier;

    public SetPanier() {
    }

    public SetPanier(
           java.lang.Object[] panier) {
           this.panier = panier;
    }


    /**
     * Gets the panier value for this SetPanier.
     * 
     * @return panier
     */
    public java.lang.Object[] getPanier() {
        return panier;
    }


    /**
     * Sets the panier value for this SetPanier.
     * 
     * @param panier
     */
    public void setPanier(java.lang.Object[] panier) {
        this.panier = panier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetPanier)) return false;
        SetPanier other = (SetPanier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.panier==null && other.getPanier()==null) || 
             (this.panier!=null &&
              java.util.Arrays.equals(this.panier, other.getPanier())));
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
        if (getPanier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPanier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPanier(), i);
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
        new org.apache.axis.description.TypeDesc(SetPanier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://upesellservice.rmi.upem", ">setPanier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("panier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://upesellservice.rmi.upem", "panier"));
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
