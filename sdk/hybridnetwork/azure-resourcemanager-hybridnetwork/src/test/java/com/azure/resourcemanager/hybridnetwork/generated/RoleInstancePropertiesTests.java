// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridnetwork.fluent.models.RoleInstanceProperties;
import com.azure.resourcemanager.hybridnetwork.models.OperationalState;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class RoleInstancePropertiesTests {
    @Test
    public void testDeserialize() {
        RoleInstanceProperties model =
            BinaryData
                .fromString("{\"provisioningState\":\"Failed\",\"operationalState\":\"Running\"}")
                .toObject(RoleInstanceProperties.class);
        Assertions.assertEquals(OperationalState.RUNNING, model.operationalState());
    }

    @Test
    public void testSerialize() {
        RoleInstanceProperties model = new RoleInstanceProperties().withOperationalState(OperationalState.RUNNING);
        model = BinaryData.fromObject(model).toObject(RoleInstanceProperties.class);
        Assertions.assertEquals(OperationalState.RUNNING, model.operationalState());
    }
}
