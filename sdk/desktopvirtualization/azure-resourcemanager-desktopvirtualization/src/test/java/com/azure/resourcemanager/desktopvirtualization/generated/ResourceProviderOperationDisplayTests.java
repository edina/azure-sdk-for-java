// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.models.ResourceProviderOperationDisplay;
import org.junit.jupiter.api.Assertions;

public final class ResourceProviderOperationDisplayTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceProviderOperationDisplay model =
            BinaryData
                .fromString(
                    "{\"provider\":\"mparcryuanzw\",\"resource\":\"zdxtayrlhmwhf\",\"operation\":\"rqobmtuk\",\"description\":\"ryrtihfxtijbpzv\"}")
                .toObject(ResourceProviderOperationDisplay.class);
        Assertions.assertEquals("mparcryuanzw", model.provider());
        Assertions.assertEquals("zdxtayrlhmwhf", model.resource());
        Assertions.assertEquals("rqobmtuk", model.operation());
        Assertions.assertEquals("ryrtihfxtijbpzv", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceProviderOperationDisplay model =
            new ResourceProviderOperationDisplay()
                .withProvider("mparcryuanzw")
                .withResource("zdxtayrlhmwhf")
                .withOperation("rqobmtuk")
                .withDescription("ryrtihfxtijbpzv");
        model = BinaryData.fromObject(model).toObject(ResourceProviderOperationDisplay.class);
        Assertions.assertEquals("mparcryuanzw", model.provider());
        Assertions.assertEquals("zdxtayrlhmwhf", model.resource());
        Assertions.assertEquals("rqobmtuk", model.operation());
        Assertions.assertEquals("ryrtihfxtijbpzv", model.description());
    }
}
