// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** A single Amazon Simple Storage Service (S3) object or a set of S3 objects. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AmazonS3Object")
@JsonFlatten
@Fluent
public class AmazonS3Dataset extends Dataset {
    /*
     * The name of the Amazon S3 bucket. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.bucketName", required = true)
    private Object bucketName;

    /*
     * The key of the Amazon S3 object. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.key")
    private Object key;

    /*
     * The prefix filter for the S3 object name. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.prefix")
    private Object prefix;

    /*
     * The version for the S3 object. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.version")
    private Object version;

    /*
     * The start of S3 object's modified datetime. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.modifiedDatetimeStart")
    private Object modifiedDatetimeStart;

    /*
     * The end of S3 object's modified datetime. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.modifiedDatetimeEnd")
    private Object modifiedDatetimeEnd;

    /*
     * The format of files.
     */
    @JsonProperty(value = "typeProperties.format")
    private DatasetStorageFormat format;

    /*
     * The data compression method used for the Amazon S3 object.
     */
    @JsonProperty(value = "typeProperties.compression")
    private DatasetCompression compression;

    /** Creates an instance of AmazonS3Dataset class. */
    public AmazonS3Dataset() {}

    /**
     * Get the bucketName property: The name of the Amazon S3 bucket. Type: string (or Expression with resultType
     * string).
     *
     * @return the bucketName value.
     */
    public Object getBucketName() {
        return this.bucketName;
    }

    /**
     * Set the bucketName property: The name of the Amazon S3 bucket. Type: string (or Expression with resultType
     * string).
     *
     * @param bucketName the bucketName value to set.
     * @return the AmazonS3Dataset object itself.
     */
    public AmazonS3Dataset setBucketName(Object bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * Get the key property: The key of the Amazon S3 object. Type: string (or Expression with resultType string).
     *
     * @return the key value.
     */
    public Object getKey() {
        return this.key;
    }

    /**
     * Set the key property: The key of the Amazon S3 object. Type: string (or Expression with resultType string).
     *
     * @param key the key value to set.
     * @return the AmazonS3Dataset object itself.
     */
    public AmazonS3Dataset setKey(Object key) {
        this.key = key;
        return this;
    }

    /**
     * Get the prefix property: The prefix filter for the S3 object name. Type: string (or Expression with resultType
     * string).
     *
     * @return the prefix value.
     */
    public Object getPrefix() {
        return this.prefix;
    }

    /**
     * Set the prefix property: The prefix filter for the S3 object name. Type: string (or Expression with resultType
     * string).
     *
     * @param prefix the prefix value to set.
     * @return the AmazonS3Dataset object itself.
     */
    public AmazonS3Dataset setPrefix(Object prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Get the version property: The version for the S3 object. Type: string (or Expression with resultType string).
     *
     * @return the version value.
     */
    public Object getVersion() {
        return this.version;
    }

    /**
     * Set the version property: The version for the S3 object. Type: string (or Expression with resultType string).
     *
     * @param version the version value to set.
     * @return the AmazonS3Dataset object itself.
     */
    public AmazonS3Dataset setVersion(Object version) {
        this.version = version;
        return this;
    }

    /**
     * Get the modifiedDatetimeStart property: The start of S3 object's modified datetime. Type: string (or Expression
     * with resultType string).
     *
     * @return the modifiedDatetimeStart value.
     */
    public Object getModifiedDatetimeStart() {
        return this.modifiedDatetimeStart;
    }

    /**
     * Set the modifiedDatetimeStart property: The start of S3 object's modified datetime. Type: string (or Expression
     * with resultType string).
     *
     * @param modifiedDatetimeStart the modifiedDatetimeStart value to set.
     * @return the AmazonS3Dataset object itself.
     */
    public AmazonS3Dataset setModifiedDatetimeStart(Object modifiedDatetimeStart) {
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        return this;
    }

    /**
     * Get the modifiedDatetimeEnd property: The end of S3 object's modified datetime. Type: string (or Expression with
     * resultType string).
     *
     * @return the modifiedDatetimeEnd value.
     */
    public Object getModifiedDatetimeEnd() {
        return this.modifiedDatetimeEnd;
    }

    /**
     * Set the modifiedDatetimeEnd property: The end of S3 object's modified datetime. Type: string (or Expression with
     * resultType string).
     *
     * @param modifiedDatetimeEnd the modifiedDatetimeEnd value to set.
     * @return the AmazonS3Dataset object itself.
     */
    public AmazonS3Dataset setModifiedDatetimeEnd(Object modifiedDatetimeEnd) {
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        return this;
    }

    /**
     * Get the format property: The format of files.
     *
     * @return the format value.
     */
    public DatasetStorageFormat getFormat() {
        return this.format;
    }

    /**
     * Set the format property: The format of files.
     *
     * @param format the format value to set.
     * @return the AmazonS3Dataset object itself.
     */
    public AmazonS3Dataset setFormat(DatasetStorageFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get the compression property: The data compression method used for the Amazon S3 object.
     *
     * @return the compression value.
     */
    public DatasetCompression getCompression() {
        return this.compression;
    }

    /**
     * Set the compression property: The data compression method used for the Amazon S3 object.
     *
     * @param compression the compression value to set.
     * @return the AmazonS3Dataset object itself.
     */
    public AmazonS3Dataset setCompression(DatasetCompression compression) {
        this.compression = compression;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonS3Dataset setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonS3Dataset setStructure(Object structure) {
        super.setStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonS3Dataset setSchema(Object schema) {
        super.setSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonS3Dataset setLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.setLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonS3Dataset setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonS3Dataset setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AmazonS3Dataset setFolder(DatasetFolder folder) {
        super.setFolder(folder);
        return this;
    }
}
