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
 * The type Recipient.
*/
public class Recipient extends ODataBaseEntity {

    public Recipient(){
        setODataType("#Microsoft.Graph.Recipient");
    }

    private EmailAddress EmailAddress;

    /**
    * Gets the Email Address.
    *
    * @return the EmailAddress
    */
    public EmailAddress getEmailAddress() {
        return this.EmailAddress;
    }

    /**
    * Sets the Email Address.
    *
    * @param value the EmailAddress
    */
    public void setEmailAddress(EmailAddress value) {
        this.EmailAddress = value;
        valueChanged("EmailAddress", value);

    }
}
