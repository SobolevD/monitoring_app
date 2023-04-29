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

    public static final String[] COLUMN_NAMES = {"PSComputerName", "Description", "FriendlyName", "SupportEmail", "GslbFqdn", "PassiveMode", "UserInterface", "CorporateResources", "Caption", "ManualEntryPointSelectionAllowed", "ForceTunneling", "IPsecTunnelEndpoints", "ElementName", "PreferLocalNamesAllowed", "InstanceID", "PolicyStore", "CustomCommands"};

    @JsonProperty("PSComputerName")
    private String pSComputerName;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("FriendlyName")
    private String friendlyName;

    @JsonProperty("SupportEmail")
    private String supportEmail;

    @JsonProperty("GslbFqdn")
    private String gslbFqdn;

    @JsonProperty("PassiveMode")
    private String passiveMode;

    @JsonProperty("UserInterface")
    private String userInterface;

    @JsonProperty("CorporateResources")
    private String corporateResources;

    @JsonProperty("Caption")
    private String caption;

    @JsonProperty("ManualEntryPointSelectionAllowed")
    private String manualEntryPointSelectionAllowed;

    @JsonProperty("ForceTunneling")
    private String forceTunneling;

    @JsonProperty("IPsecTunnelEndpoints")
    private String iPsecTunnelEndpoints;

    @JsonProperty("ElementName")
    private String elementName;

    @JsonProperty("PreferLocalNamesAllowed")
    private String preferLocalNamesAllowed;

    @JsonProperty("InstanceID")
    private String instanceID;

    @JsonProperty("PolicyStore")
    private String policyStore;

    @JsonProperty("CustomCommands")
    private String customCommands;

}
