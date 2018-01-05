/**
 * Produit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package partage;

public class Produit  implements java.io.Serializable {
    private java.lang.String[] commentaires;

    private java.util.Calendar dateCrea;

    private java.lang.Boolean dejaEmprunter;

    private boolean disponibilite;

    private java.lang.String nom;

    private int[] notes;

    private double prix;

    public Produit() {
    }

    public Produit(
           java.lang.String[] commentaires,
           java.util.Calendar dateCrea,
           java.lang.Boolean dejaEmprunter,
           boolean disponibilite,
           java.lang.String nom,
           int[] notes,
           double prix) {
           this.commentaires = commentaires;
           this.dateCrea = dateCrea;
           this.dejaEmprunter = dejaEmprunter;
           this.disponibilite = disponibilite;
           this.nom = nom;
           this.notes = notes;
           this.prix = prix;
    }


    /**
     * Gets the commentaires value for this Produit.
     * 
     * @return commentaires
     */
    public java.lang.String[] getCommentaires() {
        return commentaires;
    }


    /**
     * Sets the commentaires value for this Produit.
     * 
     * @param commentaires
     */
    public void setCommentaires(java.lang.String[] commentaires) {
        this.commentaires = commentaires;
    }


    /**
     * Gets the dateCrea value for this Produit.
     * 
     * @return dateCrea
     */
    public java.util.Calendar getDateCrea() {
        return dateCrea;
    }


    /**
     * Sets the dateCrea value for this Produit.
     * 
     * @param dateCrea
     */
    public void setDateCrea(java.util.Calendar dateCrea) {
        this.dateCrea = dateCrea;
    }


    /**
     * Gets the dejaEmprunter value for this Produit.
     * 
     * @return dejaEmprunter
     */
    public java.lang.Boolean getDejaEmprunter() {
        return dejaEmprunter;
    }


    /**
     * Sets the dejaEmprunter value for this Produit.
     * 
     * @param dejaEmprunter
     */
    public void setDejaEmprunter(java.lang.Boolean dejaEmprunter) {
        this.dejaEmprunter = dejaEmprunter;
    }


    /**
     * Gets the disponibilite value for this Produit.
     * 
     * @return disponibilite
     */
    public boolean isDisponibilite() {
        return disponibilite;
    }


    /**
     * Sets the disponibilite value for this Produit.
     * 
     * @param disponibilite
     */
    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }


    /**
     * Gets the nom value for this Produit.
     * 
     * @return nom
     */
    public java.lang.String getNom() {
        return nom;
    }


    /**
     * Sets the nom value for this Produit.
     * 
     * @param nom
     */
    public void setNom(java.lang.String nom) {
        this.nom = nom;
    }


    /**
     * Gets the notes value for this Produit.
     * 
     * @return notes
     */
    public int[] getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Produit.
     * 
     * @param notes
     */
    public void setNotes(int[] notes) {
        this.notes = notes;
    }


    /**
     * Gets the prix value for this Produit.
     * 
     * @return prix
     */
    public double getPrix() {
        return prix;
    }


    /**
     * Sets the prix value for this Produit.
     * 
     * @param prix
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Produit)) return false;
        Produit other = (Produit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.commentaires==null && other.getCommentaires()==null) || 
             (this.commentaires!=null &&
              java.util.Arrays.equals(this.commentaires, other.getCommentaires()))) &&
            ((this.dateCrea==null && other.getDateCrea()==null) || 
             (this.dateCrea!=null &&
              this.dateCrea.equals(other.getDateCrea()))) &&
            ((this.dejaEmprunter==null && other.getDejaEmprunter()==null) || 
             (this.dejaEmprunter!=null &&
              this.dejaEmprunter.equals(other.getDejaEmprunter()))) &&
            this.disponibilite == other.isDisponibilite() &&
            ((this.nom==null && other.getNom()==null) || 
             (this.nom!=null &&
              this.nom.equals(other.getNom()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              java.util.Arrays.equals(this.notes, other.getNotes()))) &&
            this.prix == other.getPrix();
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
        if (getCommentaires() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommentaires());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommentaires(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDateCrea() != null) {
            _hashCode += getDateCrea().hashCode();
        }
        if (getDejaEmprunter() != null) {
            _hashCode += getDejaEmprunter().hashCode();
        }
        _hashCode += (isDisponibilite() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNom() != null) {
            _hashCode += getNom().hashCode();
        }
        if (getNotes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Double(getPrix()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Produit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://partage", "Produit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentaires");
        elemField.setXmlName(new javax.xml.namespace.QName("http://partage", "commentaires"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://partage", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCrea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://partage", "dateCrea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dejaEmprunter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://partage", "dejaEmprunter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disponibilite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://partage", "disponibilite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://partage", "nom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://partage", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://partage", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://partage", "prix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
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
