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
import com.microsoft.services.orc.core.*;

/**
 * The type GraphServiceClient.
 */
public class GraphServiceClient extends BaseOrcContainer {

     /**
     * Instantiates a new GraphServiceClient.
     *
     * @param url the url
     * @param resolver the resolver
     */
    public GraphServiceClient(String url, DependencyResolver resolver) {
        super(url, resolver);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the client
     */
    public GraphServiceClient addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the client
     */
    public GraphServiceClient addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

     /**
     * Gets DirectoryObject.
     *
     * @return the DirectoryObject
     */
    public OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations> getDirectoryObjects() {
        return new OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("directoryObjects", this, DirectoryObject.class,DirectoryObjectCollectionOperations.class);
    }
     /**
     * Gets Application.
     *
     * @return the Application
     */
    public OrcCollectionFetcher<Application, ApplicationFetcher, ApplicationCollectionOperations> getApplications() {
        return new OrcCollectionFetcher<Application, ApplicationFetcher, ApplicationCollectionOperations>("applications", this, Application.class,ApplicationCollectionOperations.class);
    }
     /**
     * Gets Contact.
     *
     * @return the Contact
     */
    public OrcCollectionFetcher<Contact, ContactFetcher, ContactCollectionOperations> getContacts() {
        return new OrcCollectionFetcher<Contact, ContactFetcher, ContactCollectionOperations>("contacts", this, Contact.class,ContactCollectionOperations.class);
    }
     /**
     * Gets DeviceConfiguration.
     *
     * @return the DeviceConfiguration
     */
    public OrcCollectionFetcher<DeviceConfiguration, DeviceConfigurationFetcher, DeviceConfigurationCollectionOperations> getDeviceConfiguration() {
        return new OrcCollectionFetcher<DeviceConfiguration, DeviceConfigurationFetcher, DeviceConfigurationCollectionOperations>("deviceConfiguration", this, DeviceConfiguration.class,DeviceConfigurationCollectionOperations.class);
    }
     /**
     * Gets Device.
     *
     * @return the Device
     */
    public OrcCollectionFetcher<Device, DeviceFetcher, DeviceCollectionOperations> getDevices() {
        return new OrcCollectionFetcher<Device, DeviceFetcher, DeviceCollectionOperations>("devices", this, Device.class,DeviceCollectionOperations.class);
    }
     /**
     * Gets Group.
     *
     * @return the Group
     */
    public OrcCollectionFetcher<Group, GroupFetcher, GroupCollectionOperations> getGroups() {
        return new OrcCollectionFetcher<Group, GroupFetcher, GroupCollectionOperations>("groups", this, Group.class,GroupCollectionOperations.class);
    }
     /**
     * Gets DirectoryRole.
     *
     * @return the DirectoryRole
     */
    public OrcCollectionFetcher<DirectoryRole, DirectoryRoleFetcher, DirectoryRoleCollectionOperations> getDirectoryRoles() {
        return new OrcCollectionFetcher<DirectoryRole, DirectoryRoleFetcher, DirectoryRoleCollectionOperations>("directoryRoles", this, DirectoryRole.class,DirectoryRoleCollectionOperations.class);
    }
     /**
     * Gets DirectoryRoleTemplate.
     *
     * @return the DirectoryRoleTemplate
     */
    public OrcCollectionFetcher<DirectoryRoleTemplate, DirectoryRoleTemplateFetcher, DirectoryRoleTemplateCollectionOperations> getDirectoryRoleTemplates() {
        return new OrcCollectionFetcher<DirectoryRoleTemplate, DirectoryRoleTemplateFetcher, DirectoryRoleTemplateCollectionOperations>("directoryRoleTemplates", this, DirectoryRoleTemplate.class,DirectoryRoleTemplateCollectionOperations.class);
    }
     /**
     * Gets ServicePrincipal.
     *
     * @return the ServicePrincipal
     */
    public OrcCollectionFetcher<ServicePrincipal, ServicePrincipalFetcher, ServicePrincipalCollectionOperations> getServicePrincipals() {
        return new OrcCollectionFetcher<ServicePrincipal, ServicePrincipalFetcher, ServicePrincipalCollectionOperations>("servicePrincipals", this, ServicePrincipal.class,ServicePrincipalCollectionOperations.class);
    }
     /**
     * Gets TenantDetail.
     *
     * @return the TenantDetail
     */
    public OrcCollectionFetcher<TenantDetail, TenantDetailFetcher, TenantDetailCollectionOperations> getTenantDetails() {
        return new OrcCollectionFetcher<TenantDetail, TenantDetailFetcher, TenantDetailCollectionOperations>("tenantDetails", this, TenantDetail.class,TenantDetailCollectionOperations.class);
    }
     /**
     * Gets User.
     *
     * @return the User
     */
    public OrcCollectionFetcher<User, UserFetcher, UserCollectionOperations> getUsers() {
        return new OrcCollectionFetcher<User, UserFetcher, UserCollectionOperations>("users", this, User.class,UserCollectionOperations.class);
    }
     /**
     * Gets OAuth2PermissionGrant.
     *
     * @return the OAuth2PermissionGrant
     */
    public OrcCollectionFetcher<OAuth2PermissionGrant, OAuth2PermissionGrantFetcher, OAuth2PermissionGrantCollectionOperations> getOauth2PermissionGrants() {
        return new OrcCollectionFetcher<OAuth2PermissionGrant, OAuth2PermissionGrantFetcher, OAuth2PermissionGrantCollectionOperations>("oauth2PermissionGrants", this, OAuth2PermissionGrant.class,OAuth2PermissionGrantCollectionOperations.class);
    }
     /**
     * Gets SubscribedSku.
     *
     * @return the SubscribedSku
     */
    public OrcCollectionFetcher<SubscribedSku, SubscribedSkuFetcher, SubscribedSkuCollectionOperations> getSubscribedSkus() {
        return new OrcCollectionFetcher<SubscribedSku, SubscribedSkuFetcher, SubscribedSkuCollectionOperations>("subscribedSkus", this, SubscribedSku.class,SubscribedSkuCollectionOperations.class);
    }
}
