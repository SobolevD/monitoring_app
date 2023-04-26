package org.example.common;

import org.example.model.ObjectMetadata;
import org.example.model.entity.powershell.*;

import java.util.HashMap;
import java.util.Map;

import static org.example.common.Commands.*;

public abstract class ObjectsMetadataDictionary {
    private static final Map<Class<?>, ObjectMetadata> MAP = new HashMap<>() {{
        put(AclInfo[].class, ObjectMetadata.builder()
                .objectClass(AclInfo[].class)
                .columns(AclInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_ACL_COMMAND)
                .build());
        put(AppxPackageInfo[].class, ObjectMetadata.builder()
                .objectClass(AppxPackageInfo[].class)
                .columns(AppxPackageInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_APPX_PACKAGE_COMMAND)
                .build());
        put(AutologgerConfigInfo[].class, ObjectMetadata.builder()
                .objectClass(AutologgerConfigInfo[].class)
                .columns(AutologgerConfigInfo.COLUMN_NAMES)
                .command(POWERSHELL_AUTO_LOGGER_CONFIG_COMMAND)
                .build());
        put(BCClientConfigurationInfo[].class, ObjectMetadata.builder()
                .objectClass(BCClientConfigurationInfo[].class)
                .columns(BCClientConfigurationInfo.COLUMN_NAMES)
                .command(POWERSHELL_BC_CLIENT_CONFIGURATION_COMMAND)
                .build());
        put(BCContentServerConfigurationInfo[].class, ObjectMetadata.builder()
                .objectClass(BCContentServerConfigurationInfo[].class)
                .columns(BCContentServerConfigurationInfo.COLUMN_NAMES)
                .command(POWERSHELL_BC_CONTENT_SERVER_CONFIGURATION_COMMAND)
                .build());
        put(BCDataCacheInfo[].class, ObjectMetadata.builder()
                .objectClass(BCDataCacheInfo[].class)
                .columns(BCDataCacheInfo.COLUMN_NAMES)
                .command(POWERSHELL_BC_DATA_CACHE_COMMAND)
                .build());
        put(BCHashCacheInfo[].class, ObjectMetadata.builder()
                .objectClass(BCHashCacheInfo[].class)
                .columns(BCHashCacheInfo.COLUMN_NAMES)
                .command(POWERSHELL_BC_HASH_CACHE_COMMAND)
                .build());
        put(BCStatusInfo[].class, ObjectMetadata.builder()
                .objectClass(BCStatusInfo[].class)
                .columns(BCStatusInfo.COLUMN_NAMES)
                .command(POWERSHELL_BC_STATUS_COMMAND)
                .build());
        put(BitLockerVolumeInfo[].class, ObjectMetadata.builder()
                .objectClass(BitLockerVolumeInfo[].class)
                .columns(BitLockerVolumeInfo.COLUMN_NAMES)
                .command(POWERSHELL_BITLOCKER_VOLUME_COMMAND)
                .build());
        put(ComputerGeneralInfo[].class, ObjectMetadata.builder()
                .objectClass(ComputerGeneralInfo[].class)
                .columns(ComputerGeneralInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_COMPUTER_INFO_COMMAND)
                .build());
        put(ControlPanelItemInfo[].class, ObjectMetadata.builder()
                .objectClass(ControlPanelItemInfo[].class)
                .columns(ControlPanelItemInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_CONTROL_PANEL_ITEMS_COMMAND)
                .build());
        put(DAClientExperienceConfigurationInfo[].class, ObjectMetadata.builder()
                .objectClass(DAClientExperienceConfigurationInfo[].class)
                .columns(DAClientExperienceConfigurationInfo.COLUMN_NAMES)
                .command(POWERSHELL_DA_CLIENT_EXPERIENCE_CONFIGURATION_COMMAND)
                .build());
        put(DiskInfo[].class, ObjectMetadata.builder()
                .objectClass(DiskInfo[].class)
                .columns(DiskInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_DISK_COMMAND)
                .build());
        put(DiskStorageNodeViewInfo[].class, ObjectMetadata.builder()
                .objectClass(DiskStorageNodeViewInfo[].class)
                .columns(DiskStorageNodeViewInfo.COLUMN_NAMES)
                .command(POWERSHELL_DISK_STORAGE_NODE_VIEW_COMMAND)
                .build());
        put(DnsClientGlobalSettingInfo[].class, ObjectMetadata.builder()
                .objectClass(DnsClientGlobalSettingInfo[].class)
                .columns(DnsClientGlobalSettingInfo.COLUMN_NAMES)
                .command(POWERSHELL_DNS_CLIENT_GLOBAL_SETTING_COMMAND)
                .build());
        put(DnsClientInfo[].class, ObjectMetadata.builder()
                .objectClass(DnsClientInfo[].class)
                .columns(DnsClientInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_DNS_CLIENT_COMMAND)
                .build());
        put(EventLogGeneralInfo[].class, ObjectMetadata.builder()
                .objectClass(EventLogGeneralInfo[].class)
                .columns(EventLogGeneralInfo.COLUMN_NAMES)
                .command(GET_EVENT_LOG_LIST_COMMAND)
                .build());
        put(EventLogInfo[].class, ObjectMetadata.builder()
                .objectClass(EventLogInfo[].class)
                .columns(EventLogInfo.COLUMN_NAMES)
                .command(GET_EVENT_LOG_COMMAND)
                .build());
        put(HnsEndpointInfo[].class, ObjectMetadata.builder()
                .objectClass(HnsEndpointInfo[].class)
                .columns(HnsEndpointInfo.COLUMN_NAMES)
                .command(POWERSHELL_HNS_ENDPOINT_COMMAND)
                .build());
        put(HnsNamespaceInfo[].class, ObjectMetadata.builder()
                .objectClass(HnsNamespaceInfo[].class)
                .columns(HnsNamespaceInfo.COLUMN_NAMES)
                .command(POWERSHELL_HNS_NAMESPACE_COMMAND)
                .build());
        put(HnsNetworkInfo[].class, ObjectMetadata.builder()
                .objectClass(HnsNetworkInfo[].class)
                .columns(HnsNetworkInfo.COLUMN_NAMES)
                .command(POWERSHELL_HNS_NETWORK_COMMAND)
                .build());
        put(HotFixInfo[].class, ObjectMetadata.builder()
                .objectClass(HotFixInfo[].class)
                .columns(HotFixInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_HOTFIX_COMMAND)
                .build());
        put(InstalledAppsInfo[].class, ObjectMetadata.builder()
                .objectClass(InstalledAppsInfo[].class)
                .columns(InstalledAppsInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_INSTALLED_APPLICATIONS_COMMAND)
                .build());
        put(MpPreferenceInfo[].class, ObjectMetadata.builder()
                .objectClass(MpPreferenceInfo[].class)
                .columns(MpPreferenceInfo.COLUMN_NAMES)
                .command(POWERSHELL_MP_PREFERENCE_COMMAND)
                .build());
        put(Net6to4ConfigurationInfo[].class, ObjectMetadata.builder()
                .objectClass(Net6to4ConfigurationInfo[].class)
                .columns(Net6to4ConfigurationInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET6TO4CONFIGURATION_COMMAND)
                .build());
        put(NetAdapterAdvancedPropertyInfo[].class, ObjectMetadata.builder()
                .objectClass(NetAdapterAdvancedPropertyInfo[].class)
                .columns(NetAdapterAdvancedPropertyInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_ADAPTER_ADVANCED_PROPERTY_COMMAND)
                .build());
        put(NetAdapterBindingInfo[].class, ObjectMetadata.builder()
                .objectClass(NetAdapterBindingInfo[].class)
                .columns(NetAdapterBindingInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_ADAPTER_BINDING_COMMAND)
                .build());
        put(NetAdapterChecksumOffloadInfo[].class, ObjectMetadata.builder()
                .objectClass(NetAdapterChecksumOffloadInfo[].class)
                .columns(NetAdapterChecksumOffloadInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_ADAPTER_CHECKSUM_OFFLOAD_COMMAND)
                .build());
        put(NetAdapterHardwareInfoInfo[].class, ObjectMetadata.builder()
                .objectClass(NetAdapterHardwareInfoInfo[].class)
                .columns(NetAdapterHardwareInfoInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_ADAPTER_HARDWARE_INFO_COMMAND)
                .build());
        put(NetAdapterInfo[].class, ObjectMetadata.builder()
                .objectClass(NetAdapterInfo[].class)
                .columns(NetAdapterInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_ADAPTER_COMMAND)
                .build());
        put(NetAdapterIPsecOffloadInfo[].class, ObjectMetadata.builder()
                .objectClass(NetAdapterIPsecOffloadInfo[].class)
                .columns(NetAdapterIPsecOffloadInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_ADAPTER_IPSEC_OFFLOAD_COMMAND)
                .build());
        put(NetAdapterLsoInfo[].class, ObjectMetadata.builder()
                .objectClass(NetAdapterLsoInfo[].class)
                .columns(NetAdapterLsoInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_ADAPTER_LSO_COMMAND)
                .build());
        put(NetAdapterPowerManagementInfo[].class, ObjectMetadata.builder()
                .objectClass(NetAdapterPowerManagementInfo[].class)
                .columns(NetAdapterPowerManagementInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_ADAPTER_POWER_MANAGEMENT_COMMAND)
                .build());
        put(NetAdapterRdmaInfo[].class, ObjectMetadata.builder()
                .objectClass(NetAdapterRdmaInfo[].class)
                .columns(NetAdapterRdmaInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_ADAPTER_RDMA_COMMAND)
                .build());
        put(NetAdapterRscInfo[].class, ObjectMetadata.builder()
                .objectClass(NetAdapterRscInfo[].class)
                .columns(NetAdapterRscInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_ADAPTER_RSC_COMMAND)
                .build());
        put(NetAdapterRssInfo[].class, ObjectMetadata.builder()
                .objectClass(NetAdapterRssInfo[].class)
                .columns(NetAdapterRssInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_ADAPTER_RSS_COMMAND)
                .build());
        put(NetAdapterStatisticsInfo[].class, ObjectMetadata.builder()
                .objectClass(NetAdapterStatisticsInfo[].class)
                .columns(NetAdapterStatisticsInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_ADAPTER_STATISTICS_COMMAND)
                .build());
        put(NetCompartmentInfo[].class, ObjectMetadata.builder()
                .objectClass(NetCompartmentInfo[].class)
                .columns(NetCompartmentInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_COMPARTMENT_COMMAND)
                .build());
        put(NetFirewallAddressFilterInfo[].class, ObjectMetadata.builder()
                .objectClass(NetFirewallAddressFilterInfo[].class)
                .columns(NetFirewallAddressFilterInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_FIREWALL_ADDRESS_FILTER_COMMAND)
                .build());
        put(NetFirewallApplicationFilterInfo[].class, ObjectMetadata.builder()
                .objectClass(NetFirewallApplicationFilterInfo[].class)
                .columns(NetFirewallApplicationFilterInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_FIREWALL_APPLICATION_FILTER_COMMAND)
                .build());
        put(NetFirewallInterfaceFilterInfo[].class, ObjectMetadata.builder()
                .objectClass(NetFirewallInterfaceFilterInfo[].class)
                .columns(NetFirewallInterfaceFilterInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_FIREWALL_INTERFACE_FILTER_COMMAND)
                .build());
        put(NetFirewallInterfaceTypeFilterInfo[].class, ObjectMetadata.builder()
                .objectClass(NetFirewallInterfaceTypeFilterInfo[].class)
                .columns(NetFirewallInterfaceTypeFilterInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_FIREWALL_INTERFACE_TYPE_FILTER_COMMAND)
                .build());
        put(NetFirewallPortFilterInfo[].class, ObjectMetadata.builder()
                .objectClass(NetFirewallPortFilterInfo[].class)
                .columns(NetFirewallPortFilterInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_FIREWALL_PORT_FILTER_COMMAND)
                .build());
        put(NetFirewallProfileInfo[].class, ObjectMetadata.builder()
                .objectClass(NetFirewallProfileInfo[].class)
                .columns(NetFirewallProfileInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_FIREWALL_PROFILE_COMMAND)
                .build());
        put(NetFirewallRuleInfo[].class, ObjectMetadata.builder()
                .objectClass(NetFirewallRuleInfo[].class)
                .columns(NetFirewallRuleInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_FIREWALL_RULE_COMMAND)
                .build());
        put(NetFirewallSecurityFilterInfo[].class, ObjectMetadata.builder()
                .objectClass(NetFirewallSecurityFilterInfo[].class)
                .columns(NetFirewallSecurityFilterInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_FIREWALL_SECURITY_FILTER_COMMAND)
                .build());
        put(NetFirewallServiceFilterInfo[].class, ObjectMetadata.builder()
                .objectClass(NetFirewallServiceFilterInfo[].class)
                .columns(NetFirewallServiceFilterInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_FIREWALL_SERVICE_FILTER_COMMAND)
                .build());
        put(NetFirewallSettingInfo[].class, ObjectMetadata.builder()
                .objectClass(NetFirewallSettingInfo[].class)
                .columns(NetFirewallSettingInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_FIREWALL_SETTING_COMMAND)
                .build());
        put(NetIPAddressInfo[].class, ObjectMetadata.builder()
                .objectClass(NetIPAddressInfo[].class)
                .columns(NetIPAddressInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_IP_ADDRESS_COMMAND)
                .build());
        put(NetIpConfigInfo[].class, ObjectMetadata.builder()
                .objectClass(NetIpConfigInfo[].class)
                .columns(NetIpConfigInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_NET_IP_CONFIG_COMMAND)
                .build());
        put(NetIPInterfaceInfo[].class, ObjectMetadata.builder()
                .objectClass(NetIPInterfaceInfo[].class)
                .columns(NetIPInterfaceInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_IP_INTERFACE_COMMAND)
                .build());
        put(NetIPv4ProtocolInfo[].class, ObjectMetadata.builder()
                .objectClass(NetIPv4ProtocolInfo[].class)
                .columns(NetIPv4ProtocolInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_IPV4_PROTOCOL_COMMAND)
                .build());
        put(NetIPv6ProtocolInfo[].class, ObjectMetadata.builder()
                .objectClass(NetIPv6ProtocolInfo[].class)
                .columns(NetIPv6ProtocolInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_IPV6_PROTOCOL_COMMAND)
                .build());
        put(NetIsatapConfigurationInfo[].class, ObjectMetadata.builder()
                .objectClass(NetIsatapConfigurationInfo[].class)
                .columns(NetIsatapConfigurationInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_ISATAP_CONFIGURATION_COMMAND)
                .build());
        put(NetNatExternalAddressInfo[].class, ObjectMetadata.builder()
                .objectClass(NetNatExternalAddressInfo[].class)
                .columns(NetNatExternalAddressInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_NAT_EXTERNAL_ADDRESS_COMMAND)
                .build());
        put(NetNatGlobalInfo[].class, ObjectMetadata.builder()
                .objectClass(NetNatGlobalInfo[].class)
                .columns(NetNatGlobalInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_NAT_GLOBAL_COMMAND)
                .build());
        put(NetNeighborInfo[].class, ObjectMetadata.builder()
                .objectClass(NetNeighborInfo[].class)
                .columns(NetNeighborInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_NEIGHBOR_COMMAND)
                .build());
        put(NetOffloadGlobalSettingInfo[].class, ObjectMetadata.builder()
                .objectClass(NetOffloadGlobalSettingInfo[].class)
                .columns(NetOffloadGlobalSettingInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_OFFLOAD_GLOBAL_SETTING_COMMAND)
                .build());
        put(NetPrefixPolicyInfo[].class, ObjectMetadata.builder()
                .objectClass(NetPrefixPolicyInfo[].class)
                .columns(NetPrefixPolicyInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_PREFIX_POLICY_COMMAND)
                .build());
        put(NetRouteInfo[].class, ObjectMetadata.builder()
                .objectClass(NetRouteInfo[].class)
                .columns(NetRouteInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_NET_ROUTE_COMMAND)
                .build());
        put(NetTCPConnectionInfo[].class, ObjectMetadata.builder()
                .objectClass(NetTCPConnectionInfo[].class)
                .columns(NetTCPConnectionInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_TCP_CONNECTION_COMMAND)
                .build());
        put(NetTCPSettingInfo[].class, ObjectMetadata.builder()
                .objectClass(NetTCPSettingInfo[].class)
                .columns(NetTCPSettingInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_TCP_SETTING_COMMAND)
                .build());
        put(NetTeredoConfigurationInfo[].class, ObjectMetadata.builder()
                .objectClass(NetTeredoConfigurationInfo[].class)
                .columns(NetTeredoConfigurationInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_TEREDO_CONFIGURATION_COMMAND)
                .build());
        put(NetTransportFilterInfo[].class, ObjectMetadata.builder()
                .objectClass(NetTransportFilterInfo[].class)
                .columns(NetTransportFilterInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_TRANSPORT_FILTER_COMMAND)
                .build());
        put(NetUDPEndpointInfo[].class, ObjectMetadata.builder()
                .objectClass(NetUDPEndpointInfo[].class)
                .columns(NetUDPEndpointInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_UDP_ENDPOINT_COMMAND)
                .build());
        put(NetUDPSettingInfo[].class, ObjectMetadata.builder()
                .objectClass(NetUDPSettingInfo[].class)
                .columns(NetUDPSettingInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_UDP_SETTING_COMMAND)
                .build());
        put(NetworkConnectionProfileInfo[].class, ObjectMetadata.builder()
                .objectClass(NetworkConnectionProfileInfo[].class)
                .columns(NetworkConnectionProfileInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_NET_CONNECTION_PROFILES_COMMAND)
                .build());
        put(OdbcDriverInfo[].class, ObjectMetadata.builder()
                .objectClass(OdbcDriverInfo[].class)
                .columns(OdbcDriverInfo.COLUMN_NAMES)
                .command(POWERSHELL_ODBC_DRIVER_COMMAND)
                .build());
        put(OdbcDsnInfo[].class, ObjectMetadata.builder()
                .objectClass(OdbcDsnInfo[].class)
                .columns(OdbcDsnInfo.COLUMN_NAMES)
                .command(POWERSHELL_ODBC_DSN_COMMAND)
                .build());
        put(OdbcPerfCounterInfo[].class, ObjectMetadata.builder()
                .objectClass(OdbcPerfCounterInfo[].class)
                .columns(OdbcPerfCounterInfo.COLUMN_NAMES)
                .command(POWERSHELL_ODBC_PERF_COUNTER_COMMAND)
                .build());
        put(PartitionInfo[].class, ObjectMetadata.builder()
                .objectClass(PartitionInfo[].class)
                .columns(PartitionInfo.COLUMN_NAMES)
                .command(POWERSHELL_PARTITION_COMMAND)
                .build());
        put(PhysicalDiskInfo[].class, ObjectMetadata.builder()
                .objectClass(PhysicalDiskInfo[].class)
                .columns(PhysicalDiskInfo.COLUMN_NAMES)
                .command(POWERSHELL_PHYSICAL_DISK_COMMAND)
                .build());
        put(PhysicalDiskStorageNodeViewInfo[].class, ObjectMetadata.builder()
                .objectClass(PhysicalDiskStorageNodeViewInfo[].class)
                .columns(PhysicalDiskStorageNodeViewInfo.COLUMN_NAMES)
                .command(POWERSHELL_PHYSICAL_DISK_STORAGE_NODE_VIEW_COMMAND)
                .build());
        put(PnpDeviceInfo[].class, ObjectMetadata.builder()
                .objectClass(PnpDeviceInfo[].class)
                .columns(PnpDeviceInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_PNP_DEVICES_COMMAND)
                .build());
        put(PrinterDriverInfo[].class, ObjectMetadata.builder()
                .objectClass(PrinterDriverInfo[].class)
                .columns(PrinterDriverInfo.COLUMN_NAMES)
                .command(POWERSHELL_PRINTER_DRIVER_COMMAND)
                .build());
        put(PrinterInfo[].class, ObjectMetadata.builder()
                .objectClass(PrinterInfo[].class)
                .columns(PrinterInfo.COLUMN_NAMES)
                .command(POWERSHELL_PRINTER_COMMAND)
                .build());
        put(PrinterPortInfo[].class, ObjectMetadata.builder()
                .objectClass(PrinterPortInfo[].class)
                .columns(PrinterPortInfo.COLUMN_NAMES)
                .command(POWERSHELL_PRINTER_PORT_COMMAND)
                .build());
        put(ProcessResourcesInfo[].class, ObjectMetadata.builder()
                .objectClass(ProcessResourcesInfo[].class)
                .columns(ProcessResourcesInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_PROCESSES_COMMAND)
                .build());
        put(ResiliencySettingInfo[].class, ObjectMetadata.builder()
                .objectClass(ResiliencySettingInfo[].class)
                .columns(ResiliencySettingInfo.COLUMN_NAMES)
                .command(POWERSHELL_RESILIENCY_SETTING_COMMAND)
                .build());
        put(ScheduledTaskInfo[].class, ObjectMetadata.builder()
                .objectClass(ScheduledTaskInfo[].class)
                .columns(ScheduledTaskInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_SCHEDULED_TASKS_COMMAND)
                .build());
        put(ServiceInfo[].class, ObjectMetadata.builder()
                .objectClass(ServiceInfo[].class)
                .columns(ServiceInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_SERVICES_COMMAND)
                .build());
        put(StartAppsInfo[].class, ObjectMetadata.builder()
                .objectClass(StartAppsInfo[].class)
                .columns(StartAppsInfo.COLUMN_NAMES)
                .command(POWERSHELL_START_APPS_COMMAND)
                .build());
        put(StorageFaultDomainInfo[].class, ObjectMetadata.builder()
                .objectClass(StorageFaultDomainInfo[].class)
                .columns(StorageFaultDomainInfo.COLUMN_NAMES)
                .command(POWERSHELL_STORAGE_FAULT_DOMAIN_COMMAND)
                .build());
        put(StorageFileServerInfo[].class, ObjectMetadata.builder()
                .objectClass(StorageFileServerInfo[].class)
                .columns(StorageFileServerInfo.COLUMN_NAMES)
                .command(POWERSHELL_STORAGE_FILE_SERVER_COMMAND)
                .build());
        put(StorageNodeInfo[].class, ObjectMetadata.builder()
                .objectClass(StorageNodeInfo[].class)
                .columns(StorageNodeInfo.COLUMN_NAMES)
                .command(POWERSHELL_STORAGE_NODE_COMMAND)
                .build());
        put(StoragePoolInfo[].class, ObjectMetadata.builder()
                .objectClass(StoragePoolInfo[].class)
                .columns(StoragePoolInfo.COLUMN_NAMES)
                .command(POWERSHELL_STORAGE_POOL_COMMAND)
                .build());
        put(StorageProviderInfo[].class, ObjectMetadata.builder()
                .objectClass(StorageProviderInfo[].class)
                .columns(StorageProviderInfo.COLUMN_NAMES)
                .command(POWERSHELL_STORAGE_PROVIDER_COMMAND)
                .build());
        put(StorageSettingInfo[].class, ObjectMetadata.builder()
                .objectClass(StorageSettingInfo[].class)
                .columns(StorageSettingInfo.COLUMN_NAMES)
                .command(POWERSHELL_STORAGE_SETTING_COMMAND)
                .build());
        put(StorageSubSystemInfo[].class, ObjectMetadata.builder()
                .objectClass(StorageSubSystemInfo[].class)
                .columns(StorageSubSystemInfo.COLUMN_NAMES)
                .command(POWERSHELL_STORAGE_SUBSYSTEM_COMMAND)
                .build());
        put(VolumeInfo[].class, ObjectMetadata.builder()
                .objectClass(VolumeInfo[].class)
                .columns(VolumeInfo.COLUMN_NAMES)
                .command(POWERSHELL_VOLUME_COMMAND)
                .build());
        put(WMIObjectsListInfo[].class, ObjectMetadata.builder()
                .objectClass(WMIObjectsListInfo[].class)
                .columns(WMIObjectsListInfo.COLUMN_NAMES)
                .command(GET_WMI_OBJECT_INFO_LIST_COMMAND)
                .build());
    }};

    public static ObjectMetadata getObjectMetadata(Class<?> objectClass) {
        return MAP.get(objectClass);
    }
}
