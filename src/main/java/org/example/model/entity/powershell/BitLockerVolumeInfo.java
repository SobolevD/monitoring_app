package org.example.model.entity.powershell;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.*;

@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class BitLockerVolumeInfo {

    public static final String[] COLUMN_NAMES = {"EncryptionPercentage", "CapacityGB", "AutoUnlockKeyStored", "AutoUnlockEnabled", "LockStatus", "VolumeStatus", "EncryptionMethod", "WipePercentage", "MountPoint", "MetadataVersion", "VolumeType", "KeyProtector", "ComputerName", "ProtectionStatus"};

    @JsonProperty("EncryptionPercentage")
    private String encryptionPercentage;

    @JsonProperty("CapacityGB")
    private String capacityGB;

    @JsonProperty("AutoUnlockKeyStored")
    private String autoUnlockKeyStored;

    @JsonProperty("AutoUnlockEnabled")
    private String autoUnlockEnabled;

    @JsonProperty("LockStatus")
    private String lockStatus;

    @JsonProperty("VolumeStatus")
    private String volumeStatus;

    @JsonProperty("EncryptionMethod")
    private String encryptionMethod;

    @JsonProperty("WipePercentage")
    private String wipePercentage;

    @JsonProperty("MountPoint")
    private String mountPoint;

    @JsonProperty("MetadataVersion")
    private String metadataVersion;

    @JsonProperty("VolumeType")
    private String volumeType;

    @JsonProperty("KeyProtector")
    private JsonNode keyProtector;

    @JsonProperty("ComputerName")
    private String computerName;

    @JsonProperty("ProtectionStatus")
    private String protectionStatus;

}
