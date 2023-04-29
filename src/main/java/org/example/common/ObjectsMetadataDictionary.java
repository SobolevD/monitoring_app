package org.example.common;

import org.example.model.ObjectMetadata;
import org.example.model.entity.powershell.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.example.common.Commands.*;
import static org.example.common.Groups.*;

public abstract class ObjectsMetadataDictionary {
    private static final Map<Class<?>, ObjectMetadata> MAP = new HashMap<>() {{
        put(AclInfo[].class, ObjectMetadata.builder()
                .objectClass(AclInfo.class)
                .columns(AclInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_ACL_COMMAND)
                .group(SECURITY)
                .simpleName("ACL Info")
                .build());
        put(AppxPackageInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(AppxPackageInfo[].class)
                .columns(AppxPackageInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_APPX_PACKAGE_COMMAND)
                .group(APPLICATION)
                .simpleName("Appx Package")
                .build());
        put(BCClientConfigurationInfo[].class, ObjectMetadata.builder()
                .objectClass(BCClientConfigurationInfo.class)
                .columns(BCClientConfigurationInfo.COLUMN_NAMES)
                .command(POWERSHELL_BC_CLIENT_CONFIGURATION_COMMAND)
                .group(BRANCH_CACHE)
                .simpleName("BC Client Configuration")
                .build());
        put(BCContentServerConfigurationInfo[].class, ObjectMetadata.builder()
                .objectClass(BCContentServerConfigurationInfo.class)
                .columns(BCContentServerConfigurationInfo.COLUMN_NAMES)
                .command(POWERSHELL_BC_CONTENT_SERVER_CONFIGURATION_COMMAND)
                .group(BRANCH_CACHE)
                .simpleName("BC Content Server Configuration")
                .build());
        put(BCDataCacheInfo[].class, ObjectMetadata.builder()
                .objectClass(BCDataCacheInfo.class)
                .columns(BCDataCacheInfo.COLUMN_NAMES)
                .command(POWERSHELL_BC_DATA_CACHE_COMMAND)
                .group(BRANCH_CACHE)
                .simpleName("BC Data Cache")
                .build());
        put(BCHashCacheInfo[].class, ObjectMetadata.builder()
                .objectClass(BCHashCacheInfo.class)
                .columns(BCHashCacheInfo.COLUMN_NAMES)
                .command(POWERSHELL_BC_HASH_CACHE_COMMAND)
                .group(BRANCH_CACHE)
                .simpleName("BC Hash Cache")
                .build());
        put(BCStatusInfo[].class, ObjectMetadata.builder()
                .objectClass(BCStatusInfo.class)
                .columns(BCStatusInfo.COLUMN_NAMES)
                .command(POWERSHELL_BC_STATUS_COMMAND)
                .group(BRANCH_CACHE)
                .simpleName("BC Status")
                .build());
        put(BitLockerVolumeInfo[].class, ObjectMetadata.builder()
                .objectClass(BitLockerVolumeInfo.class)
                .columns(BitLockerVolumeInfo.COLUMN_NAMES)
                .command(POWERSHELL_BITLOCKER_VOLUME_COMMAND)
                .group(SECURITY)
                .simpleName("BitLocker Volume")
                .build());
        put(ComputerGeneralInfo[].class, ObjectMetadata.builder()
                .objectClass(ComputerGeneralInfo.class)
                .columns(ComputerGeneralInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_COMPUTER_INFO_COMMAND)
                .group(COMMON_INFO)
                .simpleName("Computer Info")
                .build());
        put(ControlPanelItemInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(ControlPanelItemInfo[].class)
                .columns(ControlPanelItemInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_CONTROL_PANEL_ITEMS_COMMAND)
                .group(COMMON_INFO)
                .simpleName("Control Panel Items")
                .build());
        put(DAClientExperienceConfigurationInfo[].class, ObjectMetadata.builder()
                .objectClass(DAClientExperienceConfigurationInfo.class)
                .columns(DAClientExperienceConfigurationInfo.COLUMN_NAMES)
                .command(POWERSHELL_DA_CLIENT_EXPERIENCE_CONFIGURATION_COMMAND)
                .group(DIRECT_ACCESS)
                .simpleName("DA Client Experience Configuration")
                .build());
        put(DiskInfo[].class, ObjectMetadata.builder()
                .objectClass(DiskInfo.class)
                .columns(DiskInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_DISK_COMMAND)
                .group(STORAGE)
                .simpleName("Disk Info")
                .build());
        put(DiskStorageNodeViewInfo[].class, ObjectMetadata.builder()
                .objectClass(DiskStorageNodeViewInfo.class)
                .columns(DiskStorageNodeViewInfo.COLUMN_NAMES)
                .command(POWERSHELL_DISK_STORAGE_NODE_VIEW_COMMAND)
                .group(STORAGE)
                .simpleName("Dist Storage Node View")
                .build());
        put(DnsClientGlobalSettingInfo[].class, ObjectMetadata.builder()
                .objectClass(DnsClientGlobalSettingInfo.class)
                .columns(DnsClientGlobalSettingInfo.COLUMN_NAMES)
                .command(POWERSHELL_DNS_CLIENT_GLOBAL_SETTING_COMMAND)
                .group(DNS_CLIENT)
                .simpleName("DNS Client Global Settings")
                .build());
        put(DnsClientInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(DnsClientInfo[].class)
                .columns(DnsClientInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_DNS_CLIENT_COMMAND)
                .group(DNS_CLIENT)
                .simpleName("DNS Client Info")
                .build());
        put(EventLogGeneralInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(EventLogGeneralInfo[].class)
                .columns(EventLogGeneralInfo.COLUMN_NAMES)
                .command(GET_EVENT_LOG_LIST_COMMAND)
                .group(EVENT_LOG)
                .simpleName("Event Log List")
                .build());
        put(EventLogInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(EventLogInfo[].class)
                .columns(EventLogInfo.COLUMN_NAMES)
                .command(GET_EVENT_LOG_COMMAND)
                .group(EVENT_LOG)
                .simpleName("Event Log")
                .build());
        put(HnsNamespaceInfo[].class, ObjectMetadata.builder()
                .objectClass(HnsNamespaceInfo.class)
                .columns(HnsNamespaceInfo.COLUMN_NAMES)
                .command(POWERSHELL_HNS_NAMESPACE_COMMAND)
                .group(NETWORK)
                .simpleName("HNS Namespace Info")
                .build());
        put(HnsNetworkInfo[].class, ObjectMetadata.builder()
                .objectClass(HnsNetworkInfo.class)
                .columns(HnsNetworkInfo.COLUMN_NAMES)
                .command(POWERSHELL_HNS_NETWORK_COMMAND)
                .group(NETWORK)
                .simpleName("HNS Network Info")
                .build());
        put(HotFixInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(HotFixInfo[].class)
                .columns(HotFixInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_HOTFIX_COMMAND)
                .group(SYSTEM_INFO)
                .simpleName("Hotfixes Info")
                .build());
        put(InstalledAppsInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(InstalledAppsInfo[].class)
                .columns(InstalledAppsInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_INSTALLED_APPLICATIONS_COMMAND)
                .group(APPLICATION)
                .simpleName("Installed Applications")
                .build());
        put(MpPreferenceInfo[].class, ObjectMetadata.builder()
                .objectClass(MpPreferenceInfo.class)
                .columns(MpPreferenceInfo.COLUMN_NAMES)
                .command(POWERSHELL_MP_PREFERENCE_COMMAND)
                .group(SECURITY)
                .simpleName("MP Preference")
                .build());
        put(Net6to4ConfigurationInfo[].class, ObjectMetadata.builder()
                .objectClass(Net6to4ConfigurationInfo.class)
                .columns(Net6to4ConfigurationInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET6TO4CONFIGURATION_COMMAND)
                .group(NETWORK)
                .simpleName("Net 6 to 4 Configuration")
                .build());
        put(NetAdapterAdvancedPropertyInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetAdapterAdvancedPropertyInfo[].class)
                .columns(NetAdapterAdvancedPropertyInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_ADAPTER_ADVANCED_PROPERTY_COMMAND)
                .group(NETWORK)
                .simpleName("Net Adapter Advanced Property")
                .build());
        put(NetAdapterBindingInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetAdapterBindingInfo[].class)
                .columns(NetAdapterBindingInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_ADAPTER_BINDING_COMMAND)
                .group(NETWORK)
                .simpleName("Net Adapter Binding")
                .build());
        put(NetAdapterChecksumOffloadInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetAdapterChecksumOffloadInfo[].class)
                .columns(NetAdapterChecksumOffloadInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_ADAPTER_CHECKSUM_OFFLOAD_COMMAND)
                .group(NETWORK)
                .simpleName("Net Adapter Checksum Offload")
                .build());
        put(NetAdapterHardwareInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetAdapterHardwareInfo[].class)
                .columns(NetAdapterHardwareInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_ADAPTER_HARDWARE_INFO_COMMAND)
                .group(NETWORK)
                .simpleName("Net Adapter Hardware Info")
                .build());
        put(NetAdapterInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetAdapterInfo[].class)
                .columns(NetAdapterInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_ADAPTER_COMMAND)
                .group(NETWORK)
                .simpleName("Net Adapter Info")
                .build());
        put(NetAdapterIPsecOffloadInfo[].class, ObjectMetadata.builder()
                .objectClass(NetAdapterIPsecOffloadInfo.class)
                .columns(NetAdapterIPsecOffloadInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_ADAPTER_IPSEC_OFFLOAD_COMMAND)
                .group(NETWORK)
                .simpleName("Net Adapter IPSEC Offload")
                .build());
        put(NetAdapterLsoInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetAdapterLsoInfo[].class)
                .columns(NetAdapterLsoInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_ADAPTER_LSO_COMMAND)
                .group(NETWORK)
                .simpleName("Net Adapter LSO")
                .build());
        put(NetAdapterPowerManagementInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetAdapterPowerManagementInfo[].class)
                .columns(NetAdapterPowerManagementInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_ADAPTER_POWER_MANAGEMENT_COMMAND)
                .group(NETWORK)
                .simpleName("Net Adapter Power Management")
                .build());
        put(NetAdapterRdmaInfo[].class, ObjectMetadata.builder()
                .objectClass(NetAdapterRdmaInfo.class)
                .columns(NetAdapterRdmaInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_ADAPTER_RDMA_COMMAND)
                .group(NETWORK)
                .simpleName("Net Adapter RDMA")
                .build());
        put(NetAdapterRscInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetAdapterRscInfo[].class)
                .columns(NetAdapterRscInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_ADAPTER_RSC_COMMAND)
                .group(NETWORK)
                .simpleName("Net Adapter RSC")
                .build());
        put(NetAdapterRssInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetAdapterRssInfo[].class)
                .columns(NetAdapterRssInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_ADAPTER_RSS_COMMAND)
                .group(NETWORK)
                .simpleName("Net Adapter RSS")
                .build());
        put(NetAdapterStatisticsInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetAdapterStatisticsInfo[].class)
                .columns(NetAdapterStatisticsInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_ADAPTER_STATISTICS_COMMAND)
                .group(NETWORK)
                .simpleName("Net Adapter Statistics")
                .build());
        put(NetCompartmentInfo[].class, ObjectMetadata.builder()
                .objectClass(NetCompartmentInfo.class)
                .columns(NetCompartmentInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_COMPARTMENT_COMMAND)
                .group(NETWORK)
                .simpleName("Net Compartment")
                .build());
        put(NetFirewallAddressFilterInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetFirewallAddressFilterInfo[].class)
                .columns(NetFirewallAddressFilterInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_FIREWALL_ADDRESS_FILTER_COMMAND)
                .group(SECURITY)
                .simpleName("Net Firewall Address Filter")
                .build());
        put(NetFirewallApplicationFilterInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetFirewallApplicationFilterInfo[].class)
                .columns(NetFirewallApplicationFilterInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_FIREWALL_APPLICATION_FILTER_COMMAND)
                .group(SECURITY)
                .simpleName("Net Firewall Application Filter")
                .build());
        put(NetFirewallInterfaceFilterInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetFirewallInterfaceFilterInfo[].class)
                .columns(NetFirewallInterfaceFilterInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_FIREWALL_INTERFACE_FILTER_COMMAND)
                .group(SECURITY)
                .simpleName("Net Firewall Interface Filter")
                .build());
        put(NetFirewallInterfaceTypeFilterInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetFirewallInterfaceTypeFilterInfo[].class)
                .columns(NetFirewallInterfaceTypeFilterInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_FIREWALL_INTERFACE_TYPE_FILTER_COMMAND)
                .group(SECURITY)
                .simpleName("Net Firewall Interface Type Filter")
                .build());
        put(NetFirewallPortFilterInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetFirewallPortFilterInfo[].class)
                .columns(NetFirewallPortFilterInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_FIREWALL_PORT_FILTER_COMMAND)
                .group(SECURITY)
                .simpleName("Net Firewall Port Filter")
                .build());
        put(NetFirewallProfileInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetFirewallProfileInfo[].class)
                .columns(NetFirewallProfileInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_FIREWALL_PROFILE_COMMAND)
                .group(SECURITY)
                .simpleName("Net Firewall Profile")
                .build());
        put(NetFirewallRuleInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetFirewallRuleInfo[].class)
                .columns(NetFirewallRuleInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_FIREWALL_RULE_COMMAND)
                .group(SECURITY)
                .simpleName("Net Firewall Rule")
                .build());
        put(NetFirewallSecurityFilterInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetFirewallSecurityFilterInfo[].class)
                .columns(NetFirewallSecurityFilterInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_FIREWALL_SECURITY_FILTER_COMMAND)
                .group(SECURITY)
                .simpleName("Net Firewall Security Filter")
                .build());
        put(NetFirewallServiceFilterInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetFirewallServiceFilterInfo[].class)
                .columns(NetFirewallServiceFilterInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_FIREWALL_SERVICE_FILTER_COMMAND)
                .group(SECURITY)
                .simpleName("Net Firewall Service Filter")
                .build());
        put(NetFirewallSettingInfo[].class, ObjectMetadata.builder()
                .objectClass(NetFirewallSettingInfo.class)
                .columns(NetFirewallSettingInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_FIREWALL_SETTING_COMMAND)
                .group(SECURITY)
                .simpleName("Net Firewall Settings")
                .build());
        put(NetIPAddressInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetIPAddressInfo[].class)
                .columns(NetIPAddressInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_IP_ADDRESS_COMMAND)
                .group(NETWORK)
                .simpleName("Net IP Address")
                .build());
        put(NetIpConfigInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetIpConfigInfo[].class)
                .columns(NetIpConfigInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_NET_IP_CONFIG_COMMAND)
                .group(NETWORK)
                .simpleName("Net IP Config")
                .build());
        put(NetIPInterfaceInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetIPInterfaceInfo[].class)
                .columns(NetIPInterfaceInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_IP_INTERFACE_COMMAND)
                .group(NETWORK)
                .simpleName("Net IP Interface")
                .build());
        put(NetIPv4ProtocolInfo[].class, ObjectMetadata.builder()
                .objectClass(NetIPv4ProtocolInfo.class)
                .columns(NetIPv4ProtocolInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_IPV4_PROTOCOL_COMMAND)
                .group(NETWORK)
                .simpleName("Net IPV4 Protocol")
                .build());
        put(NetIPv6ProtocolInfo[].class, ObjectMetadata.builder()
                .objectClass(NetIPv6ProtocolInfo.class)
                .columns(NetIPv6ProtocolInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_IPV6_PROTOCOL_COMMAND)
                .group(NETWORK)
                .simpleName("Net IPV6 Protocol")
                .build());
        put(NetIsatapConfigurationInfo[].class, ObjectMetadata.builder()
                .objectClass(NetIsatapConfigurationInfo.class)
                .columns(NetIsatapConfigurationInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_ISATAP_CONFIGURATION_COMMAND)
                .group(NETWORK)
                .simpleName("Net ISATAP Configuration")
                .build());
        put(NetNatExternalAddressInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetNatExternalAddressInfo[].class)
                .columns(NetNatExternalAddressInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_NAT_EXTERNAL_ADDRESS_COMMAND)
                .group(NETWORK)
                .simpleName("Net NAT External Address")
                .build());
        put(NetNatGlobalInfo[].class, ObjectMetadata.builder()
                .objectClass(NetNatGlobalInfo.class)
                .columns(NetNatGlobalInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_NAT_GLOBAL_COMMAND)
                .group(NETWORK)
                .simpleName("Net NAT Global")
                .build());
        put(NetNeighborInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetNeighborInfo[].class)
                .columns(NetNeighborInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_NEIGHBOR_COMMAND)
                .group(NETWORK)
                .simpleName("Net Neighbor")
                .build());
        put(NetOffloadGlobalSettingInfo[].class, ObjectMetadata.builder()
                .objectClass(NetOffloadGlobalSettingInfo.class)
                .columns(NetOffloadGlobalSettingInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_OFFLOAD_GLOBAL_SETTING_COMMAND)
                .group(NETWORK)
                .simpleName("Net Offload Global Setting")
                .build());
        put(NetPrefixPolicyInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetPrefixPolicyInfo[].class)
                .columns(NetPrefixPolicyInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_PREFIX_POLICY_COMMAND)
                .group(NETWORK)
                .simpleName("Net Prefix Policy")
                .build());
        put(NetRouteInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetRouteInfo[].class)
                .columns(NetRouteInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_NET_ROUTE_COMMAND)
                .group(NETWORK)
                .simpleName("Net Route")
                .build());
        put(NetTCPConnectionInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetTCPConnectionInfo[].class)
                .columns(NetTCPConnectionInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_TCP_CONNECTION_COMMAND)
                .group(NETWORK)
                .simpleName("Net TCP Connection")
                .build());
        put(NetTCPSettingInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetTCPSettingInfo[].class)
                .columns(NetTCPSettingInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_TCP_SETTING_COMMAND)
                .group(NETWORK)
                .simpleName("Net TCP Settings")
                .build());
        put(NetTeredoConfigurationInfo[].class, ObjectMetadata.builder()
                .objectClass(NetTeredoConfigurationInfo.class)
                .columns(NetTeredoConfigurationInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_TEREDO_CONFIGURATION_COMMAND)
                .group(NETWORK)
                .simpleName("Net TEREDO Configuration")
                .build());
        put(NetTransportFilterInfo[].class, ObjectMetadata.builder()
                .objectClass(NetTransportFilterInfo.class)
                .columns(NetTransportFilterInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_TRANSPORT_FILTER_COMMAND)
                .group(NETWORK)
                .simpleName("Net Transport Filter")
                .build());
        put(NetUDPEndpointInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(NetUDPEndpointInfo[].class)
                .columns(NetUDPEndpointInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_UDP_ENDPOINT_COMMAND)
                .group(NETWORK)
                .simpleName("Net UDP Endpoint")
                .build());
        put(NetUDPSettingInfo[].class, ObjectMetadata.builder()
                .objectClass(NetUDPSettingInfo.class)
                .columns(NetUDPSettingInfo.COLUMN_NAMES)
                .command(POWERSHELL_NET_UDP_SETTING_COMMAND)
                .group(NETWORK)
                .simpleName("Net UDP Settings")
                .build());
        put(NetworkConnectionProfileInfo[].class, ObjectMetadata.builder()
                .objectClass(NetworkConnectionProfileInfo.class)
                .columns(NetworkConnectionProfileInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_NET_CONNECTION_PROFILES_COMMAND)
                .group(NETWORK)
                .simpleName("Net Conection Profiles")
                .build());
        put(OdbcDriverInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(OdbcDriverInfo[].class)
                .columns(OdbcDriverInfo.COLUMN_NAMES)
                .command(POWERSHELL_ODBC_DRIVER_COMMAND)
                .group(STORAGE)
                .simpleName("ODBC Driver")
                .build());
        put(OdbcDsnInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(OdbcDsnInfo[].class)
                .columns(OdbcDsnInfo.COLUMN_NAMES)
                .command(POWERSHELL_ODBC_DSN_COMMAND)
                .group(STORAGE)
                .simpleName("ODBC DSN")
                .build());
        put(OdbcPerfCounterInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(OdbcPerfCounterInfo[].class)
                .columns(OdbcPerfCounterInfo.COLUMN_NAMES)
                .command(POWERSHELL_ODBC_PERF_COUNTER_COMMAND)
                .group(STORAGE)
                .simpleName("ODBC Perf Counter")
                .build());
        put(PartitionInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(PartitionInfo[].class)
                .columns(PartitionInfo.COLUMN_NAMES)
                .command(POWERSHELL_PARTITION_COMMAND)
                .group(STORAGE)
                .simpleName("Partition")
                .build());
        put(PhysicalDiskInfo[].class, ObjectMetadata.builder()
                .objectClass(PhysicalDiskInfo.class)
                .columns(PhysicalDiskInfo.COLUMN_NAMES)
                .command(POWERSHELL_PHYSICAL_DISK_COMMAND)
                .group(STORAGE)
                .simpleName("Physical Disk")
                .build());
        put(PhysicalDiskStorageNodeViewInfo[].class, ObjectMetadata.builder()
                .objectClass(PhysicalDiskStorageNodeViewInfo.class)
                .columns(PhysicalDiskStorageNodeViewInfo.COLUMN_NAMES)
                .command(POWERSHELL_PHYSICAL_DISK_STORAGE_NODE_VIEW_COMMAND)
                .group(STORAGE)
                .simpleName("Physical Disk Storage Node View")
                .build());
        put(PnpDeviceInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(PnpDeviceInfo[].class)
                .columns(PnpDeviceInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_PNP_DEVICES_COMMAND)
                .group(PNP_DEVICE)
                .simpleName("PNP Devices")
                .build());
        put(PrinterDriverInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(PrinterDriverInfo[].class)
                .columns(PrinterDriverInfo.COLUMN_NAMES)
                .command(POWERSHELL_PRINTER_DRIVER_COMMAND)
                .group(PRINT_MANAGEMENT)
                .simpleName("Printer Driver")
                .build());
        put(PrinterInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(PrinterInfo[].class)
                .columns(PrinterInfo.COLUMN_NAMES)
                .command(POWERSHELL_PRINTER_COMMAND)
                .group(PRINT_MANAGEMENT)
                .simpleName("Printer Info")
                .build());
        put(PrinterPortInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(PrinterPortInfo[].class)
                .columns(PrinterPortInfo.COLUMN_NAMES)
                .command(POWERSHELL_PRINTER_PORT_COMMAND)
                .group(PRINT_MANAGEMENT)
                .simpleName("Printer Port")
                .build());
        put(ProcessResourcesInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(ProcessResourcesInfo[].class)
                .columns(ProcessResourcesInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_PROCESSES_COMMAND)
                .group(REALTIME_MANAGEMENT)
                .simpleName("Processes Info")
                .build());
        put(ResiliencySettingInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(ResiliencySettingInfo[].class)
                .columns(ResiliencySettingInfo.COLUMN_NAMES)
                .command(POWERSHELL_RESILIENCY_SETTING_COMMAND)
                .group(COMMON_INFO)
                .simpleName("Resiliency Settings")
                .build());
        put(ScheduledTaskInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(ScheduledTaskInfo[].class)
                .columns(ScheduledTaskInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_SCHEDULED_TASKS_COMMAND)
                .group(REALTIME_MANAGEMENT)
                .simpleName("Scheduled Tasks")
                .build());
        put(ServiceInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(ServiceInfo[].class)
                .columns(ServiceInfo.COLUMN_NAMES)
                .command(POWERSHELL_GET_SERVICES_COMMAND)
                .group(REALTIME_MANAGEMENT)
                .simpleName("Services Info")
                .build());
        put(StartAppsInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(StartAppsInfo[].class)
                .columns(StartAppsInfo.COLUMN_NAMES)
                .command(POWERSHELL_START_APPS_COMMAND)
                .group(REALTIME_MANAGEMENT)
                .simpleName("Start Apps Info")
                .build());
        put(StorageFaultDomainInfo[].class, ObjectMetadata.builder()
                .objectClass(StorageFaultDomainInfo.class)
                .columns(StorageFaultDomainInfo.COLUMN_NAMES)
                .command(POWERSHELL_STORAGE_FAULT_DOMAIN_COMMAND)
                .group(STORAGE)
                .simpleName("Storage Fault Domain")
                .build());
        put(StorageFileServerInfo[].class, ObjectMetadata.builder()
                .objectClass(StorageFileServerInfo.class)
                .columns(StorageFileServerInfo.COLUMN_NAMES)
                .command(POWERSHELL_STORAGE_FILE_SERVER_COMMAND)
                .group(STORAGE)
                .simpleName("Storage File Server")
                .build());
        put(StorageNodeInfo[].class, ObjectMetadata.builder()
                .objectClass(StorageNodeInfo.class)
                .columns(StorageNodeInfo.COLUMN_NAMES)
                .command(POWERSHELL_STORAGE_NODE_COMMAND)
                .group(STORAGE)
                .simpleName("Storage Node")
                .build());
        put(StoragePoolInfo[].class, ObjectMetadata.builder()
                .objectClass(StoragePoolInfo.class)
                .columns(StoragePoolInfo.COLUMN_NAMES)
                .command(POWERSHELL_STORAGE_POOL_COMMAND)
                .group(STORAGE)
                .simpleName("Storage Pool")
                .build());
        put(StorageProviderInfo[].class, ObjectMetadata.builder()
                .objectClass(StorageProviderInfo.class)
                .columns(StorageProviderInfo.COLUMN_NAMES)
                .command(POWERSHELL_STORAGE_PROVIDER_COMMAND)
                .group(STORAGE)
                .simpleName("Storage Provider")
                .build());
        put(StorageSettingInfo[].class, ObjectMetadata.builder()
                .objectClass(StorageSettingInfo.class)
                .columns(StorageSettingInfo.COLUMN_NAMES)
                .command(POWERSHELL_STORAGE_SETTING_COMMAND)
                .group(STORAGE)
                .simpleName("Storage Settings")
                .build());
        put(StorageSubSystemInfo[].class, ObjectMetadata.builder()
                .objectClass(StorageSubSystemInfo.class)
                .columns(StorageSubSystemInfo.COLUMN_NAMES)
                .command(POWERSHELL_STORAGE_SUBSYSTEM_COMMAND)
                .group(STORAGE)
                .simpleName("Storage Subsystem")
                .build());
        put(VolumeInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(VolumeInfo[].class)
                .columns(VolumeInfo.COLUMN_NAMES)
                .command(POWERSHELL_VOLUME_COMMAND)
                .group(STORAGE)
                .simpleName("Volume Info")
                .build());
        put(WMIObjectsListInfo[].class, ObjectMetadata.builder()
                .objectArrayClass(WMIObjectsListInfo[].class)
                .columns(WMIObjectsListInfo.COLUMN_NAMES)
                .command(GET_WMI_OBJECT_INFO_LIST_COMMAND)
                .group(WMI_OBJECTS)
                .simpleName("WMI Objects Info List")
                .build());
    }};

    public static ObjectMetadata getObjectMetadata(Class<?> objectClass) {
        return MAP.get(objectClass);
    }

    public static List<ObjectMetadata> getObjectMetadataByGroup(String group) {
        return MAP.values()
                .stream()
                .filter(objectMetadata -> objectMetadata.getGroup().equals(group))
                .collect(Collectors.toList());
    }

}
