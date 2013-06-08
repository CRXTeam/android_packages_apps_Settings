package com.android.settings.cpa.cpustats;

public interface Constants {
    public static final String TAG = "CPU Time in States";

    public static final String TIME_IN_STATE_PATH = "/sys/devices/system/cpu/cpu0/cpufreq/stats/time_in_state";
    public static final String IO_SCHEDULER_PATH = "/sys/block/mmcblk0/queue/scheduler";
    public static final String NUM_OF_CPUS_PATH = "/sys/devices/system/cpu/present";
    public static final String PREF_OFFSETS = "pref_offsets";
}
