//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.27 at 04:37:27 PM CEST 
//


package eu.europa.esig.jaxb.policy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptographicConstraint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CryptographicConstraint"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://dss.esig.europa.eu/validation/policy}LevelConstraint"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcceptableEncryptionAlgo" type="{http://dss.esig.europa.eu/validation/policy}ListAlgo" minOccurs="0"/&gt;
 *         &lt;element name="MiniPublicKeySize" type="{http://dss.esig.europa.eu/validation/policy}ListAlgo" minOccurs="0"/&gt;
 *         &lt;element name="AcceptableDigestAlgo" type="{http://dss.esig.europa.eu/validation/policy}ListAlgo" minOccurs="0"/&gt;
 *         &lt;element name="AlgoExpirationDate" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Algo" type="{http://dss.esig.europa.eu/validation/policy}Algo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Format" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptographicConstraint", propOrder = {
    "acceptableEncryptionAlgo",
    "miniPublicKeySize",
    "acceptableDigestAlgo",
    "algoExpirationDate"
})
public class CryptographicConstraint
    extends LevelConstraint
{

    @XmlElement(name = "AcceptableEncryptionAlgo")
    protected ListAlgo acceptableEncryptionAlgo;
    @XmlElement(name = "MiniPublicKeySize")
    protected ListAlgo miniPublicKeySize;
    @XmlElement(name = "AcceptableDigestAlgo")
    protected ListAlgo acceptableDigestAlgo;
    @XmlElement(name = "AlgoExpirationDate")
    protected AlgoExpirationDate algoExpirationDate;

    /**
     * Gets the value of the acceptableEncryptionAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link ListAlgo }
     *     
     */
    public ListAlgo getAcceptableEncryptionAlgo() {
        return acceptableEncryptionAlgo;
    }

    /**
     * Sets the value of the acceptableEncryptionAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListAlgo }
     *     
     */
    public void setAcceptableEncryptionAlgo(ListAlgo value) {
        this.acceptableEncryptionAlgo = value;
    }

    /**
     * Gets the value of the miniPublicKeySize property.
     * 
     * @return
     *     possible object is
     *     {@link ListAlgo }
     *     
     */
    public ListAlgo getMiniPublicKeySize() {
        return miniPublicKeySize;
    }

    /**
     * Sets the value of the miniPublicKeySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListAlgo }
     *     
     */
    public void setMiniPublicKeySize(ListAlgo value) {
        this.miniPublicKeySize = value;
    }

    /**
     * Gets the value of the acceptableDigestAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link ListAlgo }
     *     
     */
    public ListAlgo getAcceptableDigestAlgo() {
        return acceptableDigestAlgo;
    }

    /**
     * Sets the value of the acceptableDigestAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListAlgo }
     *     
     */
    public void setAcceptableDigestAlgo(ListAlgo value) {
        this.acceptableDigestAlgo = value;
    }

    /**
     * Gets the value of the algoExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link AlgoExpirationDate }
     *     
     */
    public AlgoExpirationDate getAlgoExpirationDate() {
        return algoExpirationDate;
    }

    /**
     * Sets the value of the algoExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgoExpirationDate }
     *     
     */
    public void setAlgoExpirationDate(AlgoExpirationDate value) {
        this.algoExpirationDate = value;
    }

}
