package org.example.common;

public abstract class Commands {
    public static final String POWERSHELL_GET_SERVICES_COMMAND = "Get-Service";
    public static final String POWERSHELL_GET_PROCESSES_COMMAND = "Get-Process | ? {$_.SI -eq (Get-Process -PID $PID).SessionId}";
    public static final String POWERSHELL_GET_NET_CONNECTION_PROFILES_COMMAND = "Get-NetConnectionProfile";
    public static final String POWERSHELL_GET_SCHEDULED_TASKS_COMMAND = "Get-ScheduledTask";
}
