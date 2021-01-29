//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.7 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.01.29 à 05:13:40 PM GMT 
//


package com.cmi.xml.payment;

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
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="account_number" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="creditor_id" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "amount",
    "accountNumber",
    "creditorId"
})
@XmlRootElement(name = "paymentRequest")
public class PaymentRequest {

    protected double amount;
    @XmlElement(name = "account_number")
    protected long accountNumber;
    @XmlElement(name = "creditor_id")
    protected long creditorId;

    /**
     * Obtient la valeur de la propriété amount.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Définit la valeur de la propriété amount.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * Obtient la valeur de la propriété accountNumber.
     * 
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * Définit la valeur de la propriété accountNumber.
     * 
     */
    public void setAccountNumber(long value) {
        this.accountNumber = value;
    }

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

}
