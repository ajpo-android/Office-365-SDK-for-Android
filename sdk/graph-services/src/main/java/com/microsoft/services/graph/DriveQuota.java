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
 * The type Drive Quota.
*/
public class DriveQuota extends ODataBaseEntity {

    public DriveQuota(){
        setODataType("#Microsoft.Graph.DriveQuota");
    }

    private Long deleted;

    /**
    * Gets the deleted.
    *
    * @return the Long
    */
    public Long getDeleted() {
        return this.deleted;
    }

    /**
    * Sets the deleted.
    *
    * @param value the Long
    */
    public void setDeleted(Long value) {
        this.deleted = value;
        valueChanged("deleted", value);

    }

    private Long remaining;

    /**
    * Gets the remaining.
    *
    * @return the Long
    */
    public Long getRemaining() {
        return this.remaining;
    }

    /**
    * Sets the remaining.
    *
    * @param value the Long
    */
    public void setRemaining(Long value) {
        this.remaining = value;
        valueChanged("remaining", value);

    }

    private String state;

    /**
    * Gets the state.
    *
    * @return the String
    */
    public String getState() {
        return this.state;
    }

    /**
    * Sets the state.
    *
    * @param value the String
    */
    public void setState(String value) {
        this.state = value;
        valueChanged("state", value);

    }

    private Long total;

    /**
    * Gets the total.
    *
    * @return the Long
    */
    public Long getTotal() {
        return this.total;
    }

    /**
    * Sets the total.
    *
    * @param value the Long
    */
    public void setTotal(Long value) {
        this.total = value;
        valueChanged("total", value);

    }
}
