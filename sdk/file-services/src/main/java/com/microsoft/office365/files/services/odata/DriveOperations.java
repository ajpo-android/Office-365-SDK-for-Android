/*******************************************************************************
 * Copyright (c) Microsoft Open Technologies, Inc.
 * All Rights Reserved
 * See License.txt in the project root for license information.
 ******************************************************************************/
package com.microsoft.office365.files.services.odata;

import com.google.common.util.concurrent.*;
import com.microsoft.office365.odata.interfaces.*;
import com.microsoft.office365.files.services.*;
import static com.microsoft.office365.odata.Helpers.serializeToJsonByteArray;
import static com.microsoft.office365.odata.EntityFetcherHelper.addEntityResultCallback;

public class DriveOperations extends ODataOperations {

	 public DriveOperations(String urlComponent, ODataExecutable parent) {
        super(urlComponent, parent);
    }

	public DriveOperations addParameter(String name, Object value) {
		addCustomParameter(name, value);
		return this;
	}
}