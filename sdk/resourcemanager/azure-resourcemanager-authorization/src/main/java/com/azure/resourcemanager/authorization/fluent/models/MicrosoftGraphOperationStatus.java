// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** operationStatus. */
public final class MicrosoftGraphOperationStatus extends ExpandableStringEnum<MicrosoftGraphOperationStatus> {
    /** Static value NotStarted for MicrosoftGraphOperationStatus. */
    public static final MicrosoftGraphOperationStatus NOT_STARTED = fromString("NotStarted");

    /** Static value Running for MicrosoftGraphOperationStatus. */
    public static final MicrosoftGraphOperationStatus RUNNING = fromString("Running");

    /** Static value Completed for MicrosoftGraphOperationStatus. */
    public static final MicrosoftGraphOperationStatus COMPLETED = fromString("Completed");

    /** Static value Failed for MicrosoftGraphOperationStatus. */
    public static final MicrosoftGraphOperationStatus FAILED = fromString("Failed");

    /**
     * Creates or finds a MicrosoftGraphOperationStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphOperationStatus.
     */
    @JsonCreator
    public static MicrosoftGraphOperationStatus fromString(String name) {
        return fromString(name, MicrosoftGraphOperationStatus.class);
    }

    /**
     * Gets known MicrosoftGraphOperationStatus values.
     *
     * @return known MicrosoftGraphOperationStatus values.
     */
    public static Collection<MicrosoftGraphOperationStatus> values() {
        return values(MicrosoftGraphOperationStatus.class);
    }
}
