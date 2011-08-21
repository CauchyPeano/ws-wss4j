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
package org.swssf.impl.processor.output;

import org.swssf.ext.*;

import javax.xml.stream.XMLStreamException;

/**
 * Processor buffers encrypted XMLEvents and forwards them when final is called
 *
 * @author $Author$
 * @version $Revision$ $Date$
 */
public class EncryptEndingOutputProcessor extends AbstractBufferingOutputProcessor {

    public EncryptEndingOutputProcessor(SecurityProperties securityProperties, Constants.Action action) throws WSSecurityException {
        super(securityProperties, action);
        this.getAfterProcessors().add(EncryptOutputProcessor.class.getName());
        this.getAfterProcessors().add(UsernameTokenOutputProcessor.class.getName());
    }

    @Override
    protected void processHeaderEvent(OutputProcessorChain outputProcessorChain) throws XMLStreamException, WSSecurityException {
        OutputProcessorChain subOutputProcessorChain = outputProcessorChain.createSubChain(this);
        if (getAction() == Constants.Action.ENCRYPT_WITH_DERIVED_KEY) {
            createReferenceListStructure(subOutputProcessorChain);
        }
    }
}
