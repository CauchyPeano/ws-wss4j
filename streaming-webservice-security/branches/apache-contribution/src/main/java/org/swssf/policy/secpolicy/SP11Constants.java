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
package org.swssf.policy.secpolicy;

import javax.xml.namespace.QName;

/**
 * class lent from apache cxf
 */
public final class SP11Constants extends SPConstants {

    private SP11Constants() {
        //utility class
    }

    public static final SP11Constants INSTANCE = new SP11Constants();

    public final static String SP_NS = "http://schemas.xmlsoap.org/ws/2005/07/securitypolicy";

    public final static String SP_PREFIX = "sp";

    //all attributes are unqualified!!
    public static final QName INCLUDE_TOKEN = new QName(SPConstants.ATTR_INCLUDE_TOKEN);

    public final static String INCLUDE_NEVER = SP11Constants.SP_NS +
            SPConstants.INCLUDE_TOKEN_NEVER_SUFFIX;

    public final static String INCLUDE_ONCE = SP11Constants.SP_NS +
            SPConstants.INCLUDE_TOKEN_ONCE_SUFFIX;

    public final static String INCLUDE_ALWAYS_TO_RECIPIENT = SP11Constants.SP_NS
            + SPConstants.INCLUDE_TOEKN_ALWAYS_TO_RECIPIENT_SUFFIX;

    public final static String INCLUDE_ALWAYS = SP11Constants.SP_NS
            + SPConstants.INCLUDE_TOEKN_ALWAYS_SUFFIX;

    // /////////////////////////////////////////////////////////////////////

    public static final QName ATTR_XPATH_VERSION = new QName(SP_NS, SPConstants.XPATH_VERSION, SP11Constants.SP_PREFIX);

    ////////////////////////////////////////////////////////////////////////


    public static final QName TRANSPORT_BINDING = new QName(SP_NS,
            SPConstants.TRANSPORT_BINDING, SP11Constants.SP_PREFIX);

    public static final QName ALGORITHM_SUITE = new QName(SP_NS,
            SPConstants.ALGO_SUITE, SP11Constants.SP_PREFIX);

    public static final QName LAYOUT = new QName(SP_NS, SPConstants.LAYOUT, SP_PREFIX);


    public static final QName STRICT = new QName(SP11Constants.SP_NS, SPConstants.LAYOUT_STRICT,
            SP11Constants.SP_PREFIX);

    public static final QName LAX = new QName(SP11Constants.SP_NS, SPConstants.LAYOUT_LAX,
            SP11Constants.SP_PREFIX);

    public static final QName LAXTSFIRST = new QName(SP11Constants.SP_NS,
            SPConstants.LAYOUT_LAX_TIMESTAMP_FIRST, SP11Constants.SP_PREFIX);

    public static final QName LAXTSLAST = new QName(SP11Constants.SP_NS,
            SPConstants.LAYOUT_LAX_TIMESTAMP_LAST, SP11Constants.SP_PREFIX);

    // ////////////////

    public static final QName INCLUDE_TIMESTAMP = new QName(SP_NS,
            SPConstants.INCLUDE_TIMESTAMP, SP11Constants.SP_PREFIX);

    public static final QName TRANSPORT_TOKEN = new QName(SP_NS,
            SPConstants.TRANSPORT_TOKEN, SP11Constants.SP_PREFIX);

    public static final QName HTTPS_TOKEN = new QName(SP11Constants.SP_NS,
            SPConstants.HTTPS_TOKEN, SP11Constants.SP_PREFIX);

    public static final QName SECURITY_CONTEXT_TOKEN = new QName(
            SP11Constants.SP_NS, SPConstants.SECURITY_CONTEXT_TOKEN, SP11Constants.SP_PREFIX);

    public static final QName SECURE_CONVERSATION_TOKEN = new QName(
            SP11Constants.SP_NS, SPConstants.SECURE_CONVERSATION_TOKEN, SP11Constants.SP_PREFIX);

    public static final QName SIGNATURE_TOKEN = new QName(SP11Constants.SP_NS,
            SPConstants.SIGNATURE_TOKEN, SP11Constants.SP_PREFIX);

    public static final QName SIGNED_PARTS = new QName(SP11Constants.SP_NS,
            SPConstants.SIGNED_PARTS, SP11Constants.SP_PREFIX);

    public static final QName ENCRYPTED_PARTS = new QName(SP11Constants.SP_NS,
            SPConstants.ENCRYPTED_PARTS, SP11Constants.SP_PREFIX);

    public static final QName SIGNED_ELEMENTS = new QName(SP11Constants.SP_NS,
            SPConstants.SIGNED_ELEMENTS, SP11Constants.SP_PREFIX);

    public static final QName ENCRYPTED_ELEMENTS = new QName(SP11Constants.SP_NS,
            SPConstants.ENCRYPTED_ELEMENTS, SP11Constants.SP_PREFIX);

    public static final QName REQUIRED_ELEMENTS = new QName(SP11Constants.SP_NS,
            SPConstants.REQUIRED_ELEMENTS, SP11Constants.SP_PREFIX);

    public static final QName USERNAME_TOKEN = new QName(SP11Constants.SP_NS,
            SPConstants.USERNAME_TOKEN, SP11Constants.SP_PREFIX);

    public static final QName SAML_TOKEN = new QName(SP11Constants.SP_NS,
            SPConstants.SAML_TOKEN, SP11Constants.SP_PREFIX);

    public static final QName WSS_USERNAME_TOKEN10 = new QName(SP11Constants.SP_NS,
            SPConstants.USERNAME_TOKEN10, SP11Constants.SP_PREFIX);

    public static final QName WSS_USERNAME_TOKEN11 = new QName(SP11Constants.SP_NS,
            SPConstants.USERNAME_TOKEN11, SP11Constants.SP_PREFIX);

    public static final QName ENCRYPTION_TOKEN = new QName(SP11Constants.SP_NS,
            SPConstants.ENCRYPTION_TOKEN, SP11Constants.SP_PREFIX);

    public static final QName X509_TOKEN = new QName(SP11Constants.SP_NS,
            SPConstants.X509_TOKEN, SP11Constants.SP_PREFIX);

    public static final QName WSS_X509_V1_TOKEN_10 = new QName(SP11Constants.SP_NS,
            SPConstants.WSS_X509_V1_TOKEN10, SP11Constants.SP_PREFIX);

    public static final QName WSS_X509_V3_TOKEN_10 = new QName(SP11Constants.SP_NS,
            SPConstants.WSS_X509_V3_TOKEN10, SP11Constants.SP_PREFIX);

    public static final QName WSS_X509_PKCS7_TOKEN_10 = new QName(
            SP11Constants.SP_NS, SPConstants.WSS_X509_PKCS7_TOKEN10, SP11Constants.SP_PREFIX);

    public static final QName WSS_X509_PKI_PATH_V1_TOKEN_10 = new QName(
            SP11Constants.SP_NS, SPConstants.WSS_X509_PKI_PATH_V1_TOKEN10, SP11Constants.SP_PREFIX);

    public static final QName WSS_X509_V1_TOKEN_11 = new QName(SP11Constants.SP_NS,
            SPConstants.WSS_X509_V1_TOKEN11, SP11Constants.SP_PREFIX);

    public static final QName WSS_X509_V3_TOKEN_11 = new QName(SP11Constants.SP_NS,
            SPConstants.WSS_X509_V3_TOKEN11, SP11Constants.SP_PREFIX);

    public static final QName WSS_X509_PKCS7_TOKEN_11 = new QName(
            SP11Constants.SP_NS, SPConstants.WSS_X509_PKCS7_TOKEN11, SP11Constants.SP_PREFIX);

    public static final QName WSS_X509_PKI_PATH_V1_TOKEN_11 = new QName(
            SP11Constants.SP_NS, SPConstants.WSS_X509_PKI_PATH_V1_TOKEN11, SP11Constants.SP_PREFIX);

    public static final QName ISSUED_TOKEN = new QName(SP11Constants.SP_NS,
            SPConstants.ISSUED_TOKEN, SP11Constants.SP_PREFIX);

    public static final QName SUPPORTING_TOKENS = new QName(SP11Constants.SP_NS,
            SPConstants.SUPPORTING_TOKENS, SP11Constants.SP_PREFIX);

    public static final QName SIGNED_SUPPORTING_TOKENS = new QName(
            SP11Constants.SP_NS, SPConstants.SIGNED_SUPPORTING_TOKENS, SP11Constants.SP_PREFIX);

    public static final QName ENDORSING_SUPPORTING_TOKENS = new QName(
            SP11Constants.SP_NS, SPConstants.ENDORSING_SUPPORTING_TOKENS, SP11Constants.SP_PREFIX);

    public static final QName SIGNED_ENDORSING_SUPPORTING_TOKENS = new QName(
            SP11Constants.SP_NS, SPConstants.SIGNED_ENDORSING_SUPPORTING_TOKENS,
            SP11Constants.SP_PREFIX);

    public static final QName PROTECTION_TOKEN = new QName(SP11Constants.SP_NS,
            SPConstants.PROTECTION_TOKEN, SP11Constants.SP_PREFIX);

    public static final QName ASYMMETRIC_BINDING = new QName(SP11Constants.SP_NS,
            SPConstants.ASYMMETRIC_BINDING, SP11Constants.SP_PREFIX);

    public static final QName SYMMETRIC_BINDING = new QName(SP11Constants.SP_NS,
            SPConstants.SYMMETRIC_BINDING, SP11Constants.SP_PREFIX);

    public static final QName INITIATOR_TOKEN = new QName(SP11Constants.SP_NS,
            SPConstants.INITIATOR_TOKEN, SP11Constants.SP_PREFIX);

    public static final QName RECIPIENT_TOKEN = new QName(SP11Constants.SP_NS,
            SPConstants.RECIPIENT_TOKEN, SP11Constants.SP_PREFIX);

    public static final QName ENCRYPT_SIGNATURE = new QName(SP11Constants.SP_NS,
            SPConstants.ENCRYPT_SIGNATURE, SP11Constants.SP_PREFIX);

    public static final QName PROTECT_TOKENS = new QName(SP11Constants.SP_NS,
            SPConstants.PROTECT_TOKENS, SP11Constants.SP_PREFIX);

    public static final QName REQUIRE_KEY_IDENTIFIRE_REFERENCE = new QName(
            SP11Constants.SP_NS, SPConstants.REQUIRE_KEY_IDENTIFIRE_REFERENCE,
            SP11Constants.SP_PREFIX);

    public static final QName REQUIRE_ISSUER_SERIAL_REFERENCE = new QName(
            SP11Constants.SP_NS, SPConstants.REQUIRE_ISSUER_SERIAL_REFERENCE,
            SP11Constants.SP_PREFIX);

    public static final QName REQUIRE_EMBEDDED_TOKEN_REFERENCE = new QName(
            SP11Constants.SP_NS, SPConstants.REQUIRE_EMBEDDED_TOKEN_REFERENCE,
            SP11Constants.SP_PREFIX);

    public static final QName REQUIRE_THUMBPRINT_REFERENCE = new QName(
            SP11Constants.SP_NS, SPConstants.REQUIRE_THUMBPRINT_REFERENCE, SP11Constants.SP_PREFIX);


    public static final QName MUST_SUPPORT_REF_KEY_IDENTIFIER = new QName(
            SP11Constants.SP_NS, SPConstants.MUST_SUPPORT_REF_KEY_IDENTIFIER, SP11Constants.SP_PREFIX);

    public static final QName MUST_SUPPORT_REF_ISSUER_SERIAL = new QName(
            SP11Constants.SP_NS, SPConstants.MUST_SUPPORT_REF_ISSUER_SERIAL, SP11Constants.SP_PREFIX);

    public static final QName MUST_SUPPORT_REF_EXTERNAL_URI = new QName(
            SP11Constants.SP_NS, SPConstants.MUST_SUPPORT_REF_EXTERNAL_URI, SP11Constants.SP_PREFIX);

    public static final QName MUST_SUPPORT_REF_EMBEDDED_TOKEN = new QName(
            SP11Constants.SP_NS, SPConstants.MUST_SUPPORT_REF_EMBEDDED_TOKEN, SP11Constants.SP_PREFIX);

    public static final QName MUST_SUPPORT_REF_THUMBPRINT = new QName(
            SP11Constants.SP_NS, SPConstants.MUST_SUPPORT_REF_THUMBPRINT, SP11Constants.SP_PREFIX);

    public static final QName MUST_SUPPORT_REF_ENCRYPTED_KEY = new QName(
            SP11Constants.SP_NS, SPConstants.MUST_SUPPORT_REF_ENCRYPTED_KEY, SP11Constants.SP_PREFIX);

    public static final QName WSS10 = new QName(SP11Constants.SP_NS, SPConstants.WSS10,
            SP11Constants.SP_PREFIX);

    public static final QName WSS11 = new QName(SP11Constants.SP_NS, SPConstants.WSS11,
            SP11Constants.SP_PREFIX);

    public static final QName TRUST_10 = new QName(SP11Constants.SP_NS, SPConstants.TRUST_10,
            SP11Constants.SP_PREFIX);

    public static final QName REQUIRE_SIGNATURE_CONFIRMATION = new QName(
            SP11Constants.SP_NS, SPConstants.REQUIRE_SIGNATURE_CONFIRMATION,
            SP11Constants.SP_PREFIX);

    public static final QName MUST_SUPPORT_CLIENT_CHALLENGE = new QName(
            SP11Constants.SP_NS, SPConstants.MUST_SUPPORT_CLIENT_CHALLENGE, SP11Constants.SP_PREFIX);

    public static final QName MUST_SUPPORT_SERVER_CHALLENGE = new QName(
            SP11Constants.SP_NS, SPConstants.MUST_SUPPORT_SERVER_CHALLENGE, SP11Constants.SP_PREFIX);

    public static final QName REQUIRE_CLIENT_ENTROPY = new QName(
            SP11Constants.SP_NS, SPConstants.REQUIRE_CLIENT_ENTROPY, SP11Constants.SP_PREFIX);

    public static final QName REQUIRE_SERVER_ENTROPY = new QName(
            SP11Constants.SP_NS, SPConstants.REQUIRE_SERVER_ENTROPY, SP11Constants.SP_PREFIX);

    public static final QName MUST_SUPPORT_ISSUED_TOKENS = new QName(
            SP11Constants.SP_NS, SPConstants.MUST_SUPPORT_ISSUED_TOKENS, SP11Constants.SP_PREFIX);

    public static final QName ISSUER = new QName(SP11Constants.SP_NS, SPConstants.ISSUER,
            SP11Constants.SP_PREFIX);

    public static final QName ISSUER_NAME = new QName(SP11Constants.SP_NS, SPConstants.ISSUER_NAME,
            SP11Constants.SP_PREFIX);

    public static final QName REQUIRE_DERIVED_KEYS = new QName(SP11Constants.SP_NS,
            SPConstants.REQUIRE_DERIVED_KEYS, SP11Constants.SP_PREFIX);

    public static final QName REQUIRE_EXTERNAL_URI_REFERNCE = new QName(
            SP11Constants.SP_NS, SPConstants.REQUIRE_EXTERNAL_URI_REFERNCE, SP11Constants.SP_PREFIX);

    public static final QName REQUIRE_EXTERNAL_REFERNCE = new QName(
            SP11Constants.SP_NS, SPConstants.REQUIRE_EXTERNAL_REFERNCE, SP11Constants.SP_PREFIX);

    public static final QName REQUIRE_INTERNAL_REFERNCE = new QName(
            SP11Constants.SP_NS, SPConstants.REQUIRE_INTERNAL_REFERNCE, SP11Constants.SP_PREFIX);

    public static final QName REQUIRE_CLIENT_CERTIFICATE = new QName(
            SP11Constants.SP_NS, SPConstants.REQUIRE_CLIENT_CERTIFICATE, SP11Constants.SP_PREFIX);

    public static final QName HTTP_BASIC_AUTHENTICATION = new QName(
            SP11Constants.SP_NS, SPConstants.HTTP_BASIC_AUTHENTICATION, SP11Constants.SP_PREFIX);

    public static final QName HTTP_DIGEST_AUTHENTICATION = new QName(
            SP11Constants.SP_NS, SPConstants.HTTP_DIGEST_AUTHENTICATION, SP11Constants.SP_PREFIX);

    public static final QName REQUEST_SECURITY_TOKEN_TEMPLATE = new QName(
            SP11Constants.SP_NS, SPConstants.REQUEST_SECURITY_TOKEN_TEMPLATE,
            SP11Constants.SP_PREFIX);

    public static final QName SC10_SECURITY_CONTEXT_TOKEN = new QName(
            SP11Constants.SP_NS, SPConstants.SC10_SECURITY_CONTEXT_TOKEN, SP11Constants.SP_PREFIX);

    public static final QName BOOTSTRAP_POLICY = new QName(SP11Constants.SP_NS,
            SPConstants.BOOTSTRAP_POLICY, SP11Constants.SP_PREFIX);

    public final static QName XPATH = new QName(SP11Constants.SP_NS, SPConstants.XPATH_EXPR,
            SP11Constants.SP_PREFIX);

    public static final QName HEADER = new QName(SP11Constants.SP_NS, "Header");

    public static final QName BODY = new QName(SP11Constants.SP_NS, "Body");

    public IncludeTokenType getInclusionFromAttributeValue(String value) {

        if (INCLUDE_ALWAYS.equals(value)) {
            return IncludeTokenType.INCLUDE_TOKEN_ALWAYS;
        } else if (INCLUDE_ALWAYS_TO_RECIPIENT.equals(value)) {
            return IncludeTokenType.INCLUDE_TOKEN_ALWAYS_TO_RECIPIENT;
        } else if (INCLUDE_NEVER.equals(value)) {
            return IncludeTokenType.INCLUDE_TOKEN_NEVER;
        } else if (INCLUDE_ONCE.equals(value)) {
            return IncludeTokenType.INCLUDE_TOKEN_ONCE;
        }
        return value == null || value.equals("") ? IncludeTokenType.INCLUDE_TOKEN_ALWAYS : null;
    }

    public String getAttributeValueFromInclusion(IncludeTokenType value) {

        switch (value) {
            case INCLUDE_TOKEN_ALWAYS:
                return SP11Constants.INCLUDE_ALWAYS;
            case INCLUDE_TOKEN_ALWAYS_TO_RECIPIENT:
                return SP11Constants.INCLUDE_ALWAYS_TO_RECIPIENT;
            case INCLUDE_TOKEN_NEVER:
                return SP11Constants.INCLUDE_NEVER;
            case INCLUDE_TOKEN_ONCE:
                return SP11Constants.INCLUDE_ONCE;
            default:
                return null;
        }

    }

    public Version getVersion() {
        return Version.SP_V11;
    }

    public String getNamespace() {
        return SP_NS;
    }

    public QName getAttrXpathVersion() {
        return ATTR_XPATH_VERSION;
    }

    public QName getXpath() {
        return XPATH;
    }

    public QName getHeader() {
        return HEADER;
    }

    public QName getBody() {
        return BODY;
    }

    public QName getAttachments() {
        return EMPTY;
    }

    public QName getIssuer() {
        return ISSUER;
    }

    public QName getIssuerName() {
        return ISSUER_NAME;
    }

    public QName getRequestSecurityTokenTemplate() {
        return REQUEST_SECURITY_TOKEN_TEMPLATE;
    }

    public QName getRequireExternalRefernce() {
        return REQUIRE_EXTERNAL_REFERNCE;
    }

    public QName getRequireInternalRefernce() {
        return REQUIRE_INTERNAL_REFERNCE;
    }

    public QName getRequireClientCertificate() {
        return REQUIRE_CLIENT_CERTIFICATE;
    }

    public QName getHttpBasicAuthentication() {
        return HTTP_BASIC_AUTHENTICATION;
    }

    public QName getHttpDigestAuthentication() {
        return HTTP_DIGEST_AUTHENTICATION;
    }

    public QName getRequireExternalUriRefernce() {
        return REQUIRE_EXTERNAL_URI_REFERNCE;
    }

    public QName getRequireExplicitDerivedKeys() {
        return EMPTY;
    }

    public QName getRequireImpliedDerivedKeys() {
        return EMPTY;
    }

    public QName getRequireDerivedKeys() {
        return REQUIRE_DERIVED_KEYS;
    }

    public QName getRequireAppliesTo() {
        return EMPTY;
    }

    public QName getRequireRequestSecurityTokenCollection() {
        return EMPTY;
    }

    public QName getSc10SecurityContextToken() {
        return SC10_SECURITY_CONTEXT_TOKEN;
    }

    public QName getBootstrapPolicy() {
        return BOOTSTRAP_POLICY;
    }

    public QName getLax() {
        return LAX;
    }

    public QName getStrict() {
        return STRICT;
    }

    public QName getLaxtsfirst() {
        return LAXTSFIRST;
    }

    public QName getLaxtslast() {
        return LAXTSLAST;
    }

    public QName getWSS10() {
        return WSS10;
    }

    public QName getWSS11() {
        return WSS11;
    }

    public QName getAlgorithmSuite() {
        return ALGORITHM_SUITE;
    }

    public QName getAsymmetricBinding() {
        return ASYMMETRIC_BINDING;
    }

    public QName getEncryptionToken() {
        return ENCRYPTION_TOKEN;
    }

    public QName getHttpsToken() {
        return HTTPS_TOKEN;
    }

    public QName getInitiatorToken() {
        return INITIATOR_TOKEN;
    }

    public QName getIssuedToken() {
        return ISSUED_TOKEN;
    }

    public QName getLayout() {
        return LAYOUT;
    }

    public QName getProtectionToken() {
        return PROTECTION_TOKEN;
    }

    public QName getRecipientToken() {
        return RECIPIENT_TOKEN;
    }

    public QName getRequiredElements() {
        return REQUIRED_ELEMENTS;
    }

    public QName getSecureConversationToken() {
        return SECURE_CONVERSATION_TOKEN;
    }

    public QName getSecurityContextToken() {
        return SECURITY_CONTEXT_TOKEN;
    }

    public QName getSignatureToken() {
        return SIGNATURE_TOKEN;
    }

    public QName getSignedElements() {
        return SIGNED_ELEMENTS;
    }

    public QName getEncryptedElements() {
        return ENCRYPTED_ELEMENTS;
    }

    public QName getSignedParts() {
        return SIGNED_PARTS;
    }

    public QName getEncryptedParts() {
        return ENCRYPTED_PARTS;
    }

    public QName getOnlySignEntireHeadersAndBody() {
        return EMPTY;
    }

    public QName getSymmetricBinding() {
        return SYMMETRIC_BINDING;
    }

    public QName getTransportBinding() {
        return TRANSPORT_BINDING;
    }

    public QName getTransportToken() {
        return TRANSPORT_TOKEN;
    }

    public QName getUserNameToken() {
        return USERNAME_TOKEN;
    }

    public QName getKeyValueToken() {
        return EMPTY;
    }

    public QName getX509Token() {
        return X509_TOKEN;
    }

    public QName getSamlToken() {
        return SAML_TOKEN;
    }

    public QName getSupportingTokens() {
        return SUPPORTING_TOKENS;
    }

    public QName getSignedSupportingTokens() {
        return SIGNED_SUPPORTING_TOKENS;
    }

    public QName getEndorsingSupportingTokens() {
        return ENDORSING_SUPPORTING_TOKENS;
    }

    public QName getSignedEndorsingSupportingTokens() {
        return SIGNED_ENDORSING_SUPPORTING_TOKENS;
    }

    public QName getEncryptedSupportingTokens() {
        return EMPTY;
    }

    public QName getSignedEncryptedSupportingTokens() {
        return EMPTY;
    }

    public QName getEndorsingEncryptedSupportingTokens() {
        return EMPTY;
    }

    public QName getSignedEndorsingEncryptedSupportingTokens() {
        return EMPTY;
    }

    public QName getIncludeToken() {
        return INCLUDE_TOKEN;
    }

    public QName getRequiredDerivedKeys() {
        return REQUIRE_DERIVED_KEYS;
    }

    public QName getIncludeTimestamp() {
        return INCLUDE_TIMESTAMP;
    }

    public QName getMustSupportClientChallenge() {
        return MUST_SUPPORT_CLIENT_CHALLENGE;
    }

    public QName getMustSupportServerChallenge() {
        return MUST_SUPPORT_SERVER_CHALLENGE;
    }

    public QName getRequireClientEntropy() {
        return REQUIRE_CLIENT_ENTROPY;
    }

    public QName getRequireServerEntropy() {
        return REQUIRE_SERVER_ENTROPY;
    }

    public QName getMustSupportIssuedTokens() {
        return MUST_SUPPORT_ISSUED_TOKENS;
    }

    public QName getWssUsernameToken10() {
        return WSS_USERNAME_TOKEN10;
    }

    public QName getWssUsernameToken11() {
        return WSS_USERNAME_TOKEN11;
    }

    public QName getNoPassword() {
        return EMPTY;
    }

    public QName getHashPassword() {
        return EMPTY;
    }

    public QName getCreated() {
        return EMPTY;
    }

    public QName getNonce() {
        return EMPTY;
    }

    public QName getMustSupportRefKeyIdentifier() {
        return MUST_SUPPORT_REF_KEY_IDENTIFIER;
    }

    public QName getMustSupportRefIssuerSerial() {
        return MUST_SUPPORT_REF_ISSUER_SERIAL;
    }

    public QName getMustSupportRefExternalUri() {
        return MUST_SUPPORT_REF_EXTERNAL_URI;
    }

    public QName getMustSupportRefEmbeddedToken() {
        return MUST_SUPPORT_REF_EMBEDDED_TOKEN;
    }

    public QName getMustSupportRefThumbprint() {
        return MUST_SUPPORT_REF_THUMBPRINT;
    }

    public QName getMustSupportRefEncryptedKey() {
        return MUST_SUPPORT_REF_ENCRYPTED_KEY;
    }

    public QName getRequireSignatureConfirmation() {
        return REQUIRE_SIGNATURE_CONFIRMATION;
    }

    public QName getWssX509V1Token10() {
        return WSS_X509_V1_TOKEN_10;
    }

    public QName getWssX509V3Token10() {
        return WSS_X509_V3_TOKEN_10;
    }

    public QName getWssX509Pkcs7Token10() {
        return WSS_X509_PKCS7_TOKEN_10;
    }

    public QName getWssX509PkiPathV1Token10() {
        return WSS_X509_PKI_PATH_V1_TOKEN_10;
    }

    public QName getWssX509V1Token11() {
        return WSS_X509_V1_TOKEN_11;
    }

    public QName getWssX509V3Token11() {
        return WSS_X509_V3_TOKEN_11;
    }

    public QName getWssX509Pkcs7Token11() {
        return WSS_X509_PKCS7_TOKEN_11;
    }

    public QName getWssX509PkiPathV1Token11() {
        return WSS_X509_PKI_PATH_V1_TOKEN_11;
    }

    public QName getRequireKeyIdentifireReference() {
        return REQUIRE_KEY_IDENTIFIRE_REFERENCE;
    }

    public QName getRequireIssuerSerialReference() {
        return REQUIRE_ISSUER_SERIAL_REFERENCE;
    }

    public QName getRequireEmbeddedTokenReference() {
        return REQUIRE_EMBEDDED_TOKEN_REFERENCE;
    }

    public QName getRequireThumbprintReference() {
        return REQUIRE_THUMBPRINT_REFERENCE;
    }

    public QName getEncryptBeforeSigning() {
        return EMPTY;
    }

    public QName getSignBeforeEncrypting() {
        return EMPTY;
    }

    public QName getEncryptSignature() {
        return ENCRYPT_SIGNATURE;
    }

    public QName getProtectTokens() {
        return PROTECT_TOKENS;
    }

    public QName getTrust10() {
        return TRUST_10;
    }

    public QName getTrust13() {
        return EMPTY;
    }
}
