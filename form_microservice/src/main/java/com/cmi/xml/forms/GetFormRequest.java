//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.01.29 à 04:25:39 PM GMT 
//


package com.cmi.xml.forms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creditor_id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="categorie_id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "creditorId",
    "categorieId"
})
@XmlRootElement(name = "getFormRequest")
public class GetFormRequest {

    @XmlElement(name = "creditor_id")
    protected long creditorId;
    @XmlElement(name = "categorie_id")
    protected long categorieId;

    /**
     * Obtient la valeur de la propriété creditorId.
     * 
     */
    public long getCreditorId() {
        return creditorId;
    }

    /**
     * Définit la valeur de la propriété creditorId.
     * 
     */
    public void setCreditorId(long value) {
        this.creditorId = value;
    }

    /**
     * Obtient la valeur de la propriété categorieId.
     * 
     */
    public long getCategorieId() {
        return categorieId;
    }

    /**
     * Définit la valeur de la propriété categorieId.
     * 
     */
    public void setCategorieId(long value) {
        this.categorieId = value;
    }

}
