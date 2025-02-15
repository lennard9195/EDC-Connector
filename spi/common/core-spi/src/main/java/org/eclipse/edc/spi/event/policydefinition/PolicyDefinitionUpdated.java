/*
 *  Copyright (c) 2023 T-Systems International GmbH
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 *
 *  Contributors:
 *       T-Systems International GmbH
 *
 */

package org.eclipse.edc.spi.event.policydefinition;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

/**
 * Describe a PolicyDefinition update, after this has emitted, a PolicyDefinition with a certain id will be available/updated.
 */
@JsonDeserialize(builder = PolicyDefinitionUpdated.Builder.class)
public class PolicyDefinitionUpdated extends PolicyDefinitionEvent {

    private PolicyDefinitionUpdated() {
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static class Builder extends PolicyDefinitionEvent.Builder<PolicyDefinitionUpdated, Builder> {

        @JsonCreator
        public static Builder newInstance() {
            return new Builder();
        }

        private Builder() {
            super(new PolicyDefinitionUpdated());
        }

        @Override
        public Builder self() {
            return this;
        }
    }

}
