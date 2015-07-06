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



/**
 * The type Tenant Detail.
*/
public class TenantDetail extends DirectoryObject {

    public TenantDetail(){
        setODataType("#Microsoft.Graph.TenantDetail");
    }


    private java.util.List<AssignedPlan> assignedPlans = null;



    /**
    * Gets the assigned Plans.
    *
    * @return the java.util.List<AssignedPlan>
    */
    public java.util.List<AssignedPlan> getAssignedPlans() {
        return this.assignedPlans;
    }

    /**
    * Sets the assigned Plans.
    *
    * @param value the java.util.List<AssignedPlan>
    */
    public void setAssignedPlans(java.util.List<AssignedPlan> value) {
        this.assignedPlans = value;
        valueChanged("assignedPlans", value);

    }

    private String city;

    /**
    * Gets the city.
    *
    * @return the String
    */
    public String getCity() {
        return this.city;
    }

    /**
    * Sets the city.
    *
    * @param value the String
    */
    public void setCity(String value) {
        this.city = value;
        valueChanged("city", value);

    }

    private java.util.Calendar companyLastDirSyncTime;

    /**
    * Gets the company Last Dir Sync Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getCompanyLastDirSyncTime() {
        return this.companyLastDirSyncTime;
    }

    /**
    * Sets the company Last Dir Sync Time.
    *
    * @param value the java.util.Calendar
    */
    public void setCompanyLastDirSyncTime(java.util.Calendar value) {
        this.companyLastDirSyncTime = value;
        valueChanged("companyLastDirSyncTime", value);

    }

    private String country;

    /**
    * Gets the country.
    *
    * @return the String
    */
    public String getCountry() {
        return this.country;
    }

    /**
    * Sets the country.
    *
    * @param value the String
    */
    public void setCountry(String value) {
        this.country = value;
        valueChanged("country", value);

    }

    private String countryLetterCode;

    /**
    * Gets the country Letter Code.
    *
    * @return the String
    */
    public String getCountryLetterCode() {
        return this.countryLetterCode;
    }

    /**
    * Sets the country Letter Code.
    *
    * @param value the String
    */
    public void setCountryLetterCode(String value) {
        this.countryLetterCode = value;
        valueChanged("countryLetterCode", value);

    }

    private Boolean dirSyncEnabled;

    /**
    * Gets the dir Sync Enabled.
    *
    * @return the Boolean
    */
    public Boolean getDirSyncEnabled() {
        return this.dirSyncEnabled;
    }

    /**
    * Sets the dir Sync Enabled.
    *
    * @param value the Boolean
    */
    public void setDirSyncEnabled(Boolean value) {
        this.dirSyncEnabled = value;
        valueChanged("dirSyncEnabled", value);

    }

    private String displayName;

    /**
    * Gets the display Name.
    *
    * @return the String
    */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
    * Sets the display Name.
    *
    * @param value the String
    */
    public void setDisplayName(String value) {
        this.displayName = value;
        valueChanged("displayName", value);

    }


    private java.util.List<String> marketingNotificationEmails = null;



    /**
    * Gets the marketing Notification Emails.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getMarketingNotificationEmails() {
        return this.marketingNotificationEmails;
    }

    /**
    * Sets the marketing Notification Emails.
    *
    * @param value the java.util.List<String>
    */
    public void setMarketingNotificationEmails(java.util.List<String> value) {
        this.marketingNotificationEmails = value;
        valueChanged("marketingNotificationEmails", value);

    }

    private String postalCode;

    /**
    * Gets the postal Code.
    *
    * @return the String
    */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
    * Sets the postal Code.
    *
    * @param value the String
    */
    public void setPostalCode(String value) {
        this.postalCode = value;
        valueChanged("postalCode", value);

    }

    private String preferredLanguage;

    /**
    * Gets the preferred Language.
    *
    * @return the String
    */
    public String getPreferredLanguage() {
        return this.preferredLanguage;
    }

    /**
    * Sets the preferred Language.
    *
    * @param value the String
    */
    public void setPreferredLanguage(String value) {
        this.preferredLanguage = value;
        valueChanged("preferredLanguage", value);

    }


    private java.util.List<ProvisionedPlan> provisionedPlans = null;



    /**
    * Gets the provisioned Plans.
    *
    * @return the java.util.List<ProvisionedPlan>
    */
    public java.util.List<ProvisionedPlan> getProvisionedPlans() {
        return this.provisionedPlans;
    }

    /**
    * Sets the provisioned Plans.
    *
    * @param value the java.util.List<ProvisionedPlan>
    */
    public void setProvisionedPlans(java.util.List<ProvisionedPlan> value) {
        this.provisionedPlans = value;
        valueChanged("provisionedPlans", value);

    }


    private java.util.List<ProvisioningError> provisioningErrors = null;



    /**
    * Gets the provisioning Errors.
    *
    * @return the java.util.List<ProvisioningError>
    */
    public java.util.List<ProvisioningError> getProvisioningErrors() {
        return this.provisioningErrors;
    }

    /**
    * Sets the provisioning Errors.
    *
    * @param value the java.util.List<ProvisioningError>
    */
    public void setProvisioningErrors(java.util.List<ProvisioningError> value) {
        this.provisioningErrors = value;
        valueChanged("provisioningErrors", value);

    }


    private java.util.List<String> securityComplianceNotificationMails = null;



    /**
    * Gets the security Compliance Notification Mails.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getSecurityComplianceNotificationMails() {
        return this.securityComplianceNotificationMails;
    }

    /**
    * Sets the security Compliance Notification Mails.
    *
    * @param value the java.util.List<String>
    */
    public void setSecurityComplianceNotificationMails(java.util.List<String> value) {
        this.securityComplianceNotificationMails = value;
        valueChanged("securityComplianceNotificationMails", value);

    }


    private java.util.List<String> securityComplianceNotificationPhones = null;



    /**
    * Gets the security Compliance Notification Phones.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getSecurityComplianceNotificationPhones() {
        return this.securityComplianceNotificationPhones;
    }

    /**
    * Sets the security Compliance Notification Phones.
    *
    * @param value the java.util.List<String>
    */
    public void setSecurityComplianceNotificationPhones(java.util.List<String> value) {
        this.securityComplianceNotificationPhones = value;
        valueChanged("securityComplianceNotificationPhones", value);

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

    private String street;

    /**
    * Gets the street.
    *
    * @return the String
    */
    public String getStreet() {
        return this.street;
    }

    /**
    * Sets the street.
    *
    * @param value the String
    */
    public void setStreet(String value) {
        this.street = value;
        valueChanged("street", value);

    }


    private java.util.List<String> technicalNotificationMails = null;



    /**
    * Gets the technical Notification Mails.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getTechnicalNotificationMails() {
        return this.technicalNotificationMails;
    }

    /**
    * Sets the technical Notification Mails.
    *
    * @param value the java.util.List<String>
    */
    public void setTechnicalNotificationMails(java.util.List<String> value) {
        this.technicalNotificationMails = value;
        valueChanged("technicalNotificationMails", value);

    }

    private String telephoneNumber;

    /**
    * Gets the telephone Number.
    *
    * @return the String
    */
    public String getTelephoneNumber() {
        return this.telephoneNumber;
    }

    /**
    * Sets the telephone Number.
    *
    * @param value the String
    */
    public void setTelephoneNumber(String value) {
        this.telephoneNumber = value;
        valueChanged("telephoneNumber", value);

    }


    private java.util.List<VerifiedDomain> verifiedDomains = null;



    /**
    * Gets the verified Domains.
    *
    * @return the java.util.List<VerifiedDomain>
    */
    public java.util.List<VerifiedDomain> getVerifiedDomains() {
        return this.verifiedDomains;
    }

    /**
    * Sets the verified Domains.
    *
    * @param value the java.util.List<VerifiedDomain>
    */
    public void setVerifiedDomains(java.util.List<VerifiedDomain> value) {
        this.verifiedDomains = value;
        valueChanged("verifiedDomains", value);

    }
}

