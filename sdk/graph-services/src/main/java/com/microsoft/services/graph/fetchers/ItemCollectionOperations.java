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
package com.microsoft.services.graph.fetchers;

import com.microsoft.services.graph.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.orc.core.*;
import com.microsoft.services.orc.http.*;
import com.microsoft.services.orc.serialization.*;

import static com.microsoft.services.orc.core.Helpers.*;


/**
 * The type ItemCollectionOperations
 */
public class ItemCollectionOperations extends OrcOperations{

    /**
     * Instantiates a new ItemCollectionOperations.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
    public ItemCollectionOperations(String urlComponent, OrcExecutable parent) {
        super(urlComponent, parent);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the collection operations
     */
    public ItemCollectionOperations addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the collection operations
     */
    public ItemCollectionOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }


    /**
     * add listenable future.
     * @param path the path @param nameConflict the nameConflict @param type the type @param content the content
     * @return the listenable future
     */
    public ListenableFuture<Item> add(String path, String nameConflict, String type, byte[] content) {

        JsonSerializer serializer = getResolver().getJsonSerializer();
        String serializedpath = serializer.serialize(path);
		String serializednameConflict = serializer.serialize(nameConflict);
		String serializedtype = serializer.serialize(type);
		String serializedcontent = serializer.serialize(content);


        ListenableFuture<String> future = addRaw(serializedpath, serializednameConflict, serializedtype, serializedcontent);
        return transformToEntityListenableFuture(future, Item.class, getResolver());

    }

     /**
     * addRaw listenable future.
     * @param path the path @param nameConflict the nameConflict @param type the type @param content the content
     * @return the listenable future
     */
    public ListenableFuture<String> addRaw(String path, String nameConflict, String type, String content){

        java.util.Map<String, String> map = new java.util.HashMap<String, String>();

        map.put("path", path);
		map.put("nameConflict", nameConflict);
		map.put("type", type);
		map.put("content", content);

        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);

        request.setContent(getResolver().getJsonSerializer()
                                        .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));


        request.getUrl().appendPathComponent("add");
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }





     /**
     * getByPath listenable future.
     * @param path the path
     * @return the listenable future
     */
    public ListenableFuture<Item> getByPath(String path) {

        java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
        map.put("path", path);

        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.GET);
        request.setContent(serializeToJsonByteArray(map, getResolver()));

        String parameters = getFunctionParameters(map);
        request.getUrl().appendPathComponent("getByPath(" + parameters + ")");
        ListenableFuture<OrcResponse> future = oDataExecute(request);

        return transformToEntityListenableFuture(transformToStringListenableFuture(future), Item.class, getResolver());


   }


}
