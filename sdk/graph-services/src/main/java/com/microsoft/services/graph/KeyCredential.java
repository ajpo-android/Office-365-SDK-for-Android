/*******************************************************************************
 Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
 Licensed under the MIT or Apache License; see LICENSE in the source repository
 root for authoritative license information.﻿

 **NOTE** This code was generated by a tool and will occasionally be
 overwritten. We welcome comments and issues regarding this code; they will be
 addressed in the generation tool. If you wish to submit pull requests, please
 do so for the templates in that tool.

 This code was generated by Vipr (https://github.com/microsoft/vipr) using
 the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).
 ******************************************************************************/
package com.microsoft.services.graph;

import com.microsoft.services.orc.core.ODataBaseEntity;


/**
 * The type Key Credential.
*/
public class KeyCredential extends ODataBaseEntity {

    public KeyCredential(){
        setODataType("#Microsoft.Graph.KeyCredential");
    }

    private byte[] customKeyIdentifier;

    /**
    * Gets the custom Key Identifier.
    *
    * @return the byte[]
    */
    public byte[] getCustomKeyIdentifier() {
        return this.customKeyIdentifier;
    }

    /**
    * Sets the custom Key Identifier.
    *
    * @param value the byte[]
    */
    public void setCustomKeyIdentifier(byte[] value) {
        this.customKeyIdentifier = value;
        valueChanged("customKeyIdentifier", value);

    }

    private java.util.Calendar endDate;

    /**
    * Gets the end Date.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getEndDate() {
        return this.endDate;
    }

    /**
    * Sets the end Date.
    *
    * @param value the java.util.Calendar
    */
    public void setEndDate(java.util.Calendar value) {
        this.endDate = value;
        valueChanged("endDate", value);

    }

    private java.util.UUID keyId;

    /**
    * Gets the key Id.
    *
    * @return the java.util.UUID
    */
    public java.util.UUID getKeyId() {
        return this.keyId;
    }

    /**
    * Sets the key Id.
    *
    * @param value the java.util.UUID
    */
    public void setKeyId(java.util.UUID value) {
        this.keyId = value;
        valueChanged("keyId", value);

    }

    private java.util.Calendar startDate;

    /**
    * Gets the start Date.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getStartDate() {
        return this.startDate;
    }

    /**
    * Sets the start Date.
    *
    * @param value the java.util.Calendar
    */
    public void setStartDate(java.util.Calendar value) {
        this.startDate = value;
        valueChanged("startDate", value);

    }

    private String type;

    /**
    * Gets the type.
    *
    * @return the String
    */
    public String getType() {
        return this.type;
    }

    /**
    * Sets the type.
    *
    * @param value the String
    */
    public void setType(String value) {
        this.type = value;
        valueChanged("type", value);

    }

    private String usage;

    /**
    * Gets the usage.
    *
    * @return the String
    */
    public String getUsage() {
        return this.usage;
    }

    /**
    * Sets the usage.
    *
    * @param value the String
    */
    public void setUsage(String value) {
        this.usage = value;
        valueChanged("usage", value);

    }

    private byte[] value;

    /**
    * Gets the value.
    *
    * @return the byte[]
    */
    public byte[] getValue() {
        return this.value;
    }

    /**
    * Sets the value.
    *
    * @param value the byte[]
    */
    public void setValue(byte[] value) {
        this.value = value;
        valueChanged("value", value);

    }
}
