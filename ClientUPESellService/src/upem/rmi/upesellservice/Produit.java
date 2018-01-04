/**
 * Produit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package upem.rmi.upesellservice;

public class Produit  implements java.io.Serializable {
    private java.lang.Object[] commentaires;

    private java.util.Calendar dateCrea;

    private java.lang.Boolean dejaEmprunter;

    private boolean disponibilite;

    private java.lang.Object[] listeAttente;

    private java.lang.String nom;

    private java.lang.Object[] notes;

    private double prix;

    private upem.rmi.upesellservice.Utilisateur utilisateurEmprunt;

    public Produit() {
    }

    public Produit(
           java.lang.Object[] commentaires,
           java.util.Calendar dateCrea,
           java.lang.Boolean dejaEmprunter,
           boolean disponibilite,
           java.lang.Object[] listeAttente,
           java.lang.String nom,
           java.lang.Object[] notes,
           double prix,
           upem.rmi.upesellservice.Utilisateur utilisateurEmprunt) {
           this.commentaires = commentaires;
           this.dateCrea = dateCrea;
           this.dejaEmprunter = dejaEmprunter;
           this.disponibilite = disponibilite;
           this.listeAttente = listeAttente;
           this.nom = nom;
           this.notes = notes;
           this.prix = prix;
           this.utilisateurEmprunt = utilisateurEmprunt;
    }


    /**
     * Gets the commentaires value for this Produit.
     * 
     * @return commentaires
     */
    public java.lang.Object[] getCommentaires() {
        return commentaires;
    }


    /**
     * Sets the commentaires value for this Produit.
     * 
     * @param commentaires
     */
    public void setCommentaires(java.lang.Object[] commentaires) {
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
     * Gets the listeAttente value for this Produit.
     * 
     * @return listeAttente
     */
    public java.lang.Object[] getListeAttente() {
        return listeAttente;
    }


    /**
     * Sets the listeAttente value for this Produit.
     * 
     * @param listeAttente
     */
    public void setListeAttente(java.lang.Object[] listeAttente) {
        this.listeAttente = listeAttente;
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
    public java.lang.Object[] getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this Produit.
     * 
     * @param notes
     */
    public void setNotes(java.lang.Object[] notes) {
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


    /**
     * Gets the utilisateurEmprunt value for this Produit.
     * 
     * @return utilisateurEmprunt
     */
    public upem.rmi.upesellservice.Utilisateur getUtilisateurEmprunt() {
        return utilisateurEmprunt;
    }


    /**
     * Sets the utilisateurEmprunt value for this Produit.
     * 
     * @param utilisateurEmprunt
     */
    public void setUtilisateurEmprunt(upem.rmi.upesellservice.Utilisateur utilisateurEmprunt) {
        this.utilisateurEmprunt = utilisateurEmprunt;
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
            ((this.listeAttente==null && other.getListeAttente()==null) || 
             (this.listeAttente!=null &&
              java.util.Arrays.equals(this.listeAttente, other.getListeAttente()))) &&
            ((this.nom==null && other.getNom()==null) || 
             (this.nom!=null &&
              this.nom.equals(other.getNom()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              java.util.Arrays.equals(this.notes, other.getNotes()))) &&
            this.prix == other.getPrix() &&
            ((this.utilisateurEmprunt==null && other.getUtilisateurEmprunt()==null) || 
             (this.utilisateurEmprunt!=null &&
              this.utilisateurEmprunt.equals(other.getUtilisateurEmprunt())));
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
        if (getListeAttente() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListeAttente());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListeAttente(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
        if (getUtilisateurEmprunt() != null) {
            _hashCode += getUtilisateurEmprunt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Produit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://upesellservice.rmi.upem", "Produit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentaires");
        elemField.setXmlName(new javax.xml.namespace.QName("http://upesellservice.rmi.upem", "commentaires"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://upesellservice.rmi.upem", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCrea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://upesellservice.rmi.upem", "dateCrea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dejaEmprunter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://upesellservice.rmi.upem", "dejaEmprunter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disponibilite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://upesellservice.rmi.upem", "disponibilite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listeAttente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://upesellservice.rmi.upem", "listeAttente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://upesellservice.rmi.upem", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://upesellservice.rmi.upem", "nom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://upesellservice.rmi.upem", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://upesellservice.rmi.upem", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://upesellservice.rmi.upem", "prix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utilisateurEmprunt");
        elemField.setXmlName(new javax.xml.namespace.QName("http://upesellservice.rmi.upem", "utilisateurEmprunt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://upesellservice.rmi.upem", "Utilisateur"));
        elemField.setNillable(true);
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
