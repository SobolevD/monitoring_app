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
public class BitLockerVolumeInfo {
    public static final String[] COLUMN_NAMES = {"ComputerName", "MountPoint", "EncryptionMethod", "AutoUnlockEnabled", "AutoUnlockKeyStored", "MetadataVersion", "VolumeStatus", "ProtectionStatus", "LockStatus", "EncryptionPercentage", "WipePercentage", "VolumeType", "CapacityGB", "KeyProtector"};

    @JsonProperty("ComputerName")
    private String computerName;

    @JsonProperty("MountPoint")
    private String mountPoint;

    @JsonProperty("EncryptionMethod")
    private String encryptionMethod;

    @JsonProperty("AutoUnlockEnabled")
    private String autoUnlockEnabled;

    @JsonProperty("AutoUnlockKeyStored")
    private String autoUnlockKeyStored;

    @JsonProperty("MetadataVersion")
    private String metadataVersion;

    @JsonProperty("VolumeStatus")
    private String volumeStatus;

    @JsonProperty("ProtectionStatus")
    private String protectionStatus;

    @JsonProperty("LockStatus")
    private String lockStatus;

    @JsonProperty("EncryptionPercentage")
    private String encryptionPercentage;

    @JsonProperty("WipePercentage")
    private String wipePercentage;

    @JsonProperty("VolumeType")
    private String volumeType;

    @JsonProperty("CapacityGB")
    private String capacityGB;

    @JsonProperty("KeyProtector")
    private String keyProtector;

}
