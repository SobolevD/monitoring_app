package org.example.model.entity.powershell;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class DAClientExperienceConfigurationInfo {
    public static final String[] COLUMN_NAMES = {"ForceTunneling", "Caption", "Description", "ElementName", "InstanceID", "CorporateResources", "CustomCommands", "FriendlyName", "GslbFqdn", "IPsecTunnelEndpoints", "ManualEntryPointSelectionAllowed", "PassiveMode", "PolicyStore", "PreferLocalNamesAllowed", "SupportEmail", "UserInterface", "PSComputerName"};



    @JsonProperty("ForceTunneling")
    private String forceTunneling;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("CorporateResources")
    private String corporateResources;

    @JsonProperty("CustomCommands")
    private String customCommands;

    @JsonProperty("FriendlyName")
    private String friendlyName;

    @JsonProperty("GslbFqdn")
    private String gslbFqdn;

    @JsonProperty("IPsecTunnelEndpoints")
    private String iPsecTunnelEndpoints;

    @JsonProperty("ManualEntryPointSelectionAllowed")
    private String manualEntryPointSelectionAllowed;

    @JsonProperty("PassiveMode")
    private String passiveMode;

    @JsonProperty("PolicyStore")
    private String policyStore;

    @JsonProperty("PreferLocalNamesAllowed")
    private String preferLocalNamesAllowed;

    @JsonProperty("SupportEmail")
    private String supportEmail;

    @JsonProperty("UserInterface")
    private String userInterface;

    @JsonProperty("PSComputerName")
    private String pSComputerName;

}
