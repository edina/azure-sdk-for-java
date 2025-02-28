// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.frontdoor.models.RouteConfiguration;

public final class RouteConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RouteConfiguration model =
            BinaryData.fromString("{\"@odata.type\":\"RouteConfiguration\"}").toObject(RouteConfiguration.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RouteConfiguration model = new RouteConfiguration();
        model = BinaryData.fromObject(model).toObject(RouteConfiguration.class);
    }
}
