// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AzureTableParameterPatch model. */
@Fluent
public final class AzureTableParameterPatch {
    /*
     * The connection string of this Azure Table
     */
    @JsonProperty(value = "connectionString")
    private String connectionString;

    /*
     * A table name in this Azure Table
     */
    @JsonProperty(value = "table")
    private String table;

    /*
     * The statement to query this table. Please find syntax and details from Azure Table documents.
     */
    @JsonProperty(value = "query")
    private String query;

    /** Creates an instance of AzureTableParameterPatch class. */
    public AzureTableParameterPatch() {}

    /**
     * Get the connectionString property: The connection string of this Azure Table.
     *
     * @return the connectionString value.
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string of this Azure Table.
     *
     * @param connectionString the connectionString value to set.
     * @return the AzureTableParameterPatch object itself.
     */
    public AzureTableParameterPatch setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the table property: A table name in this Azure Table.
     *
     * @return the table value.
     */
    public String getTable() {
        return this.table;
    }

    /**
     * Set the table property: A table name in this Azure Table.
     *
     * @param table the table value to set.
     * @return the AzureTableParameterPatch object itself.
     */
    public AzureTableParameterPatch setTable(String table) {
        this.table = table;
        return this;
    }

    /**
     * Get the query property: The statement to query this table. Please find syntax and details from Azure Table
     * documents.
     *
     * @return the query value.
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * Set the query property: The statement to query this table. Please find syntax and details from Azure Table
     * documents.
     *
     * @param query the query value to set.
     * @return the AzureTableParameterPatch object itself.
     */
    public AzureTableParameterPatch setQuery(String query) {
        this.query = query;
        return this;
    }
}
