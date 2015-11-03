/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.27 at 03:31:23 PM GMT 
//


package org.apache.wss4j.binding.wssc13;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.apache.wss4j.binding.wssc13 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final String WSSC13_NS = "http://docs.oasis-open.org/ws-sx/ws-secureconversation/200512";
    private static final QName _Identifier_QNAME = new QName(WSSC13_NS, "Identifier");
    private static final QName _SecurityContextToken_QNAME = new QName(WSSC13_NS, "SecurityContextToken");
    private static final QName _Instance_QNAME = new QName(WSSC13_NS, "Instance");
    private static final QName _DerivedKeyToken_QNAME = new QName(WSSC13_NS, "DerivedKeyToken");
    private static final QName _Name_QNAME = new QName(WSSC13_NS, "Name");
    private static final QName _Label_QNAME = new QName(WSSC13_NS, "Label");
    private static final QName _Nonce_QNAME = new QName(WSSC13_NS, "Nonce");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.wss4j.binding.wssc13
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DerivedKeyTokenType }
     * 
     */
    public DerivedKeyTokenType createDerivedKeyTokenType() {
        return new DerivedKeyTokenType();
    }

    /**
     * Create an instance of {@link SecurityContextTokenType }
     * 
     */
    public SecurityContextTokenType createSecurityContextTokenType() {
        return new SecurityContextTokenType();
    }

    /**
     * Create an instance of {@link PropertiesType }
     * 
     */
    public PropertiesType createPropertiesType() {
        return new PropertiesType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = WSSC13_NS, name = "Identifier")
    public JAXBElement<String> createIdentifier(String value) {
        return new JAXBElement<String>(_Identifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityContextTokenType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = WSSC13_NS, name = "SecurityContextToken")
    public JAXBElement<SecurityContextTokenType> createSecurityContextToken(SecurityContextTokenType value) {
        return new JAXBElement<SecurityContextTokenType>(_SecurityContextToken_QNAME, SecurityContextTokenType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = WSSC13_NS, name = "Instance")
    public JAXBElement<String> createInstance(String value) {
        return new JAXBElement<String>(_Instance_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DerivedKeyTokenType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = WSSC13_NS, name = "DerivedKeyToken")
    public JAXBElement<DerivedKeyTokenType> createDerivedKeyToken(DerivedKeyTokenType value) {
        return new JAXBElement<DerivedKeyTokenType>(_DerivedKeyToken_QNAME, DerivedKeyTokenType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = WSSC13_NS, name = "Name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = WSSC13_NS, name = "Label")
    public JAXBElement<String> createLabel(String value) {
        return new JAXBElement<String>(_Label_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = WSSC13_NS, name = "Nonce")
    public JAXBElement<byte[]> createNonce(byte[] value) {
        return new JAXBElement<byte[]>(_Nonce_QNAME, byte[].class, null, ((byte[]) value));
    }

}