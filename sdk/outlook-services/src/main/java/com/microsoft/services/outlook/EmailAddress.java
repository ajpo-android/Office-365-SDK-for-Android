/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.outlook;

import com.microsoft.services.orc.core.ODataBaseEntity;


/**
 * The type Email Address.
*/
public class EmailAddress extends ODataBaseEntity {

    public EmailAddress(){
        setODataType("#Microsoft.OutlookServices.EmailAddress");
    }

    private String Name;

    /**
    * Gets the Name.
    *
    * @return the String
    */
    public String getName() {
        return this.Name; 
    }

    /**
    * Sets the Name.
    *
    * @param value the String
    */
    public void setName(String value) { 
        this.Name = value;
        valueChanged("Name", value);

    }

    private String Address;

    /**
    * Gets the Address.
    *
    * @return the String
    */
    public String getAddress() {
        return this.Address; 
    }

    /**
    * Sets the Address.
    *
    * @param value the String
    */
    public void setAddress(String value) { 
        this.Address = value;
        valueChanged("Address", value);

    }
}