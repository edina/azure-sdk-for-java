// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.fluent.models.SnapshotInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Collection of snapshots which can be used to revert an app to a previous time. */
@Fluent
public final class SnapshotCollection {
    /*
     * Collection of resources.
     */
    @JsonProperty(value = "value", required = true)
    private List<SnapshotInner> value;

    /*
     * Link to next page of resources.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /** Creates an instance of SnapshotCollection class. */
    public SnapshotCollection() {
    }

    /**
     * Get the value property: Collection of resources.
     *
     * @return the value value.
     */
    public List<SnapshotInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of resources.
     *
     * @param value the value value to set.
     * @return the SnapshotCollection object itself.
     */
    public SnapshotCollection withValue(List<SnapshotInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to next page of resources.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model SnapshotCollection"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SnapshotCollection.class);
}
