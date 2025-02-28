// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.documentanalysis.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A table object consisting table cells arranged in a rectangular layout. */
@Fluent
public final class DocumentTable {
    /*
     * Number of rows in the table.
     */
    @JsonProperty(value = "rowCount", required = true)
    private int rowCount;

    /*
     * Number of columns in the table.
     */
    @JsonProperty(value = "columnCount", required = true)
    private int columnCount;

    /*
     * Cells contained within the table.
     */
    @JsonProperty(value = "cells", required = true)
    private List<DocumentTableCell> cells;

    /*
     * Bounding regions covering the table.
     */
    @JsonProperty(value = "boundingRegions")
    private List<BoundingRegion> boundingRegions;

    /*
     * Location of the table in the reading order concatenated content.
     */
    @JsonProperty(value = "spans", required = true)
    private List<DocumentSpan> spans;

    /**
     * Creates an instance of DocumentTable class.
     *
     * @param rowCount the rowCount value to set.
     * @param columnCount the columnCount value to set.
     * @param cells the cells value to set.
     * @param spans the spans value to set.
     */
    @JsonCreator
    public DocumentTable(
            @JsonProperty(value = "rowCount", required = true) int rowCount,
            @JsonProperty(value = "columnCount", required = true) int columnCount,
            @JsonProperty(value = "cells", required = true) List<DocumentTableCell> cells,
            @JsonProperty(value = "spans", required = true) List<DocumentSpan> spans) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.cells = cells;
        this.spans = spans;
    }

    /**
     * Get the rowCount property: Number of rows in the table.
     *
     * @return the rowCount value.
     */
    public int getRowCount() {
        return this.rowCount;
    }

    /**
     * Get the columnCount property: Number of columns in the table.
     *
     * @return the columnCount value.
     */
    public int getColumnCount() {
        return this.columnCount;
    }

    /**
     * Get the cells property: Cells contained within the table.
     *
     * @return the cells value.
     */
    public List<DocumentTableCell> getCells() {
        return this.cells;
    }

    /**
     * Get the boundingRegions property: Bounding regions covering the table.
     *
     * @return the boundingRegions value.
     */
    public List<BoundingRegion> getBoundingRegions() {
        return this.boundingRegions;
    }

    /**
     * Set the boundingRegions property: Bounding regions covering the table.
     *
     * @param boundingRegions the boundingRegions value to set.
     * @return the DocumentTable object itself.
     */
    public DocumentTable setBoundingRegions(List<BoundingRegion> boundingRegions) {
        this.boundingRegions = boundingRegions;
        return this;
    }

    /**
     * Get the spans property: Location of the table in the reading order concatenated content.
     *
     * @return the spans value.
     */
    public List<DocumentSpan> getSpans() {
        return this.spans;
    }
}
