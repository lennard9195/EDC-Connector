/*
 *  Copyright (c) 2022 Bayerische Motoren Werke Aktiengesellschaft (BMW AG)
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 *
 *  Contributors:
 *       Bayerische Motoren Werke Aktiengesellschaft (BMW AG) - initial API and implementation
 *       Fraunhofer Institute for Software and Systems Engineering - expending Event classes
 *
 */

package org.eclipse.edc.spi.event.contractdefinition;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

/**
 * Describe a ContractDefinition deletion, after this has emitted, the ContractDefinition represented by the id won't be available anymore.
 */
@JsonDeserialize(builder = ContractDefinitionDeleted.Builder.class)
public class ContractDefinitionDeleted extends ContractDefinitionEvent {

    private ContractDefinitionDeleted() {
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static class Builder extends ContractDefinitionEvent.Builder<ContractDefinitionDeleted, Builder> {

        @JsonCreator
        public static Builder newInstance() {
            return new Builder();
        }

        private Builder() {
            super(new ContractDefinitionDeleted());
        }


        @Override
        public Builder self() {
            return this;
        }

    }

}
