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
import org.w3._2000._09.xmldsig_.CanonicalizationMethodType;
import org.w3c.dom.Element;

import javax.xml.bind.annotation.*;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * This complexType defines a container for elements to be specified from any namespace as properties/parameters of a DSIG transformation.
 * <p/>
 * <p>Java class for TransformationParametersType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="TransformationParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransformationParametersType", propOrder = {
        "any"
})
public class TransformationParametersType implements Parseable {

    @XmlAnyElement(lax = true)
    protected List<Object> any;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    private CanonicalizationMethodType canonicalizationMethodType;

    private Parseable currentParseable;

    public TransformationParametersType(StartElement startElement) {
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
                if (startElement.getName().equals(Constants.TAG_dsig_CanonicalizationMethod)) {
                    currentParseable = canonicalizationMethodType = new CanonicalizationMethodType(startElement);
                } else {
                    throw new ParseException("Unsupported Element: " + startElement.getName());
                }
                break;
            case XMLStreamConstants.END_ELEMENT:
                currentParseable = null;
                EndElement endElement = xmlEvent.asEndElement();
                if (endElement.getName().equals(Constants.TAG_wsse_TransformationParameters)) {
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
        if (canonicalizationMethodType == null) {
            throw new ParseException("Element \"CanonicalizationMethodType\" is missing");
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

    public CanonicalizationMethodType getCanonicalizationMethodType() {
        return canonicalizationMethodType;
    }
}
