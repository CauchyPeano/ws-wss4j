/**
 * Copyright 2010, 2011 Marc Giger
 *
 * This file is part of the streaming-webservice-security-framework (swssf).
 *
 * The streaming-webservice-security-framework is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The streaming-webservice-security-framework is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with the streaming-webservice-security-framework.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.oasis_open.docs.wss._2004._01.oasis_200401_wss_wssecurity_secext_1_0;

import org.swssf.ext.Constants;
import org.swssf.ext.ParseException;
import org.swssf.ext.Parseable;
import org.swssf.ext.Utils;
import org.w3._2000._09.xmldsig_.X509DataType;
import org.w3c.dom.Element;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.util.*;


/**
 * This type is used reference a security token.
 * <p/>
 * <p>Java class for SecurityTokenReferenceType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="SecurityTokenReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;any processContents='lax'/>
 *       &lt;/choice>
 *       &lt;attribute ref="{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd}Id"/>
 *       &lt;attribute ref="{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}Usage"/>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityTokenReferenceType", propOrder = {
        "any"
})
public class SecurityTokenReferenceType implements Parseable {

    private Parseable currentParseable;

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlElement(name = "Reference")
    protected ReferenceType referenceType;
    @XmlElement(name = "KeyIdentifier")
    protected KeyIdentifierType keyIdentifierType;
    @XmlElement(name = "X509Data", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected X509DataType x509DataType;
    @XmlAttribute(name = "Id", namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "Usage", namespace = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd")
    protected List<String> usage;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    public SecurityTokenReferenceType() {
    }

    public SecurityTokenReferenceType(StartElement startElement) {
        @SuppressWarnings("unchecked")
        Iterator<Attribute> attributeIterator = startElement.getAttributes();
        while (attributeIterator.hasNext()) {
            Attribute attribute = attributeIterator.next();
            if (attribute.getName().equals(Constants.ATT_wsu_Id)) {
                CollapsedStringAdapter collapsedStringAdapter = new CollapsedStringAdapter();
                this.id = collapsedStringAdapter.unmarshal(attribute.getValue());
            } else if (attribute.getName().equals(Constants.ATT_wsse_Usage)) {
                this.getUsage().add(attribute.getValue());
            }
        }
    }

    public boolean parseXMLEvent(XMLEvent xmlEvent) throws ParseException {
        if (currentParseable != null) {
            boolean finished = currentParseable.parseXMLEvent(xmlEvent);
            if (finished) {
                currentParseable.validate();
                currentParseable = null;
            }
            return false;
        }

        switch (xmlEvent.getEventType()) {
            case XMLStreamConstants.START_ELEMENT:
                StartElement startElement = xmlEvent.asStartElement();

                if (startElement.getName().equals(Constants.TAG_wsse_Reference)) {
                    currentParseable = this.referenceType = new ReferenceType(startElement);
                } else if (startElement.getName().equals(Constants.TAG_wsse_KeyIdentifier)) {
                    currentParseable = this.keyIdentifierType = new KeyIdentifierType(startElement);
                } else if (startElement.getName().equals(Constants.TAG_dsig_X509Data)) {
                    currentParseable = this.x509DataType = new X509DataType(startElement);
                } else {
                    throw new ParseException("Unexpected Element: " + startElement.getName());
                }

                break;
            case XMLStreamConstants.END_ELEMENT:
                currentParseable = null;
                EndElement endElement = xmlEvent.asEndElement();
                if (endElement.getName().equals(Constants.TAG_wsse_SecurityTokenReference)) {
                    return true;
                }
                break;
            //possible ignorable withespace and comments
            case XMLStreamConstants.CHARACTERS:
            case XMLStreamConstants.COMMENT:
                break;
            default:
                throw new ParseException("Unexpected event received " + Utils.getXMLEventAsString(xmlEvent));
        }
        return false;
    }

    public void validate() throws ParseException {
        if (referenceType == null && keyIdentifierType == null && x509DataType == null) {
            throw new ParseException("Element \"Reference\"|\"KeyIdentifier\"|\"x509DataType\" is missing");
        }
    }

    /**
     * Gets the value of the any property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the usage property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usage property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsage().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     */
    public List<String> getUsage() {
        if (usage == null) {
            usage = new ArrayList<String>();
        }
        return this.usage;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * <p/>
     * <p/>
     * the map is keyed by the name of the attribute and
     * the value is the string value of the attribute.
     * <p/>
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     *
     * @return always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

    public ReferenceType getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(ReferenceType referenceType) {
        this.referenceType = referenceType;
    }

    public KeyIdentifierType getKeyIdentifierType() {
        return keyIdentifierType;
    }

    public void setKeyIdentifierType(KeyIdentifierType keyIdentifierType) {
        this.keyIdentifierType = keyIdentifierType;
    }

    public X509DataType getX509DataType() {
        return x509DataType;
    }

    public void setX509DataType(X509DataType x509DataType) {
        this.x509DataType = x509DataType;
    }
}
