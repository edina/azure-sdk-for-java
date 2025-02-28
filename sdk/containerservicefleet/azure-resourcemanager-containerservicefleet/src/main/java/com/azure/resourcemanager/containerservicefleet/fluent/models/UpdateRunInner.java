// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.containerservicefleet.models.ManagedClusterUpdate;
import com.azure.resourcemanager.containerservicefleet.models.UpdateRunProvisioningState;
import com.azure.resourcemanager.containerservicefleet.models.UpdateRunStatus;
import com.azure.resourcemanager.containerservicefleet.models.UpdateRunStrategy;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An UpdateRun is a multi-stage process to perform update operations across members of a Fleet. */
@Fluent
public final class UpdateRunInner extends ProxyResource {
    /*
     * The resource-specific properties for this resource.
     */
    @JsonProperty(value = "properties")
    private UpdateRunProperties innerProperties;

    /*
     * If eTag is provided in the response body, it may also be provided as a header per the normal etag convention.
     * Entity tags are used for comparing two or more entities from the same requested resource. HTTP/1.1 uses entity
     * tags in the etag (section 14.19), If-Match (section 14.24), If-None-Match (section 14.26), and If-Range (section
     * 14.27) header fields.
     */
    @JsonProperty(value = "eTag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of UpdateRunInner class. */
    public UpdateRunInner() {
    }

    /**
     * Get the innerProperties property: The resource-specific properties for this resource.
     *
     * @return the innerProperties value.
     */
    private UpdateRunProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: If eTag is provided in the response body, it may also be provided as a header per the
     * normal etag convention. Entity tags are used for comparing two or more entities from the same requested resource.
     * HTTP/1.1 uses entity tags in the etag (section 14.19), If-Match (section 14.24), If-None-Match (section 14.26),
     * and If-Range (section 14.27) header fields.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the provisioningState property: The provisioning state of the UpdateRun resource.
     *
     * @return the provisioningState value.
     */
    public UpdateRunProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the strategy property: The strategy defines the order in which the clusters will be updated. If not set, all
     * members will be updated sequentially. The UpdateRun status will show a single UpdateStage and a single
     * UpdateGroup targeting all members. The strategy of the UpdateRun can be modified until the run is started.
     *
     * @return the strategy value.
     */
    public UpdateRunStrategy strategy() {
        return this.innerProperties() == null ? null : this.innerProperties().strategy();
    }

    /**
     * Set the strategy property: The strategy defines the order in which the clusters will be updated. If not set, all
     * members will be updated sequentially. The UpdateRun status will show a single UpdateStage and a single
     * UpdateGroup targeting all members. The strategy of the UpdateRun can be modified until the run is started.
     *
     * @param strategy the strategy value to set.
     * @return the UpdateRunInner object itself.
     */
    public UpdateRunInner withStrategy(UpdateRunStrategy strategy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateRunProperties();
        }
        this.innerProperties().withStrategy(strategy);
        return this;
    }

    /**
     * Get the managedClusterUpdate property: The update to be applied to all clusters in the UpdateRun. The
     * managedClusterUpdate can be modified until the run is started.
     *
     * @return the managedClusterUpdate value.
     */
    public ManagedClusterUpdate managedClusterUpdate() {
        return this.innerProperties() == null ? null : this.innerProperties().managedClusterUpdate();
    }

    /**
     * Set the managedClusterUpdate property: The update to be applied to all clusters in the UpdateRun. The
     * managedClusterUpdate can be modified until the run is started.
     *
     * @param managedClusterUpdate the managedClusterUpdate value to set.
     * @return the UpdateRunInner object itself.
     */
    public UpdateRunInner withManagedClusterUpdate(ManagedClusterUpdate managedClusterUpdate) {
        if (this.innerProperties() == null) {
            this.innerProperties = new UpdateRunProperties();
        }
        this.innerProperties().withManagedClusterUpdate(managedClusterUpdate);
        return this;
    }

    /**
     * Get the status property: The status of the UpdateRun.
     *
     * @return the status value.
     */
    public UpdateRunStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
