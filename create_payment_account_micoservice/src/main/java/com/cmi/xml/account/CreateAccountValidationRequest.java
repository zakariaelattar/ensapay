//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.01.31 à 03:28:10 PM GMT 
//


package com.cmi.xml.account;

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
 *         &lt;element name="cin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bank_id" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "cin",
    "bankId"
})
@XmlRootElement(name = "createAccountValidationRequest")
public class CreateAccountValidationRequest {

    @XmlElement(required = true)
    protected String cin;
    @XmlElement(name = "bank_id")
    protected long bankId;

    /**
     * Obtient la valeur de la propriété cin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCin() {
        return cin;
    }

    /**
     * Définit la valeur de la propriété cin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCin(String value) {
        this.cin = value;
    }

    /**
     * Obtient la valeur de la propriété bankId.
     * 
     */
    public long getBankId() {
        return bankId;
    }

    /**
     * Définit la valeur de la propriété bankId.
     * 
     */
    public void setBankId(long value) {
        this.bankId = value;
    }

}
