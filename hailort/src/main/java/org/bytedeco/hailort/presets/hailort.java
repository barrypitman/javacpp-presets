package org.bytedeco.hailort.presets;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.javacpp.tools.*;

@Properties(
        value = {
                @Platform(include = "hailort.h"),
        },
        target = "org.bytedeco.hailort",
        global = "org.bytedeco.hailort.global.zlib"
)
public class hailort implements InfoMapper {

    static {
        Loader.checkVersion("org.bytedeco", "hailort");
    }

    @Override
    public void map(InfoMap infoMap) {
        infoMap.put(new Info("HAILO_MAX_ENUM", "HAILO_INFINITE", "HAILO_DEFAULT_ETH_SCAN_TIMEOUT_MS",
                        "HAILO_DEFAULT_ETH_CONTROL_PORT", "HAILO_DEFAULT_ETH_DEVICE_PORT",
                        "HAILO_DEFAULT_ETH_MAX_PAYLOAD_SIZE", "HAILO_DEFAULT_ETH_MAX_NUMBER_OF_RETRIES",
                        "HAILO_ETH_ADDRESS_ANY", "HAILO_ETH_PORT_ANY", "HAILO_MAX_NAME_SIZE",
                        "HAILO_MAX_STREAM_NAME_SIZE", "HAILO_MAX_BOARD_NAME_LENGTH", "HAILO_MAX_DEVICE_ID_LENGTH",
                        "HAILO_MAX_SERIAL_NUMBER_LENGTH", "HAILO_MAX_PART_NUMBER_LENGTH",
                        "HAILO_MAX_PRODUCT_NAME_LENGTH", "HAILO_DEFAULT_INIT_SAMPLING_PERIOD_US",
                        "HAILO_DEFAULT_INIT_AVERAGING_FACTOR", "HAILO_DEFAULT_BUFFERS_THRESHOLD",
                        "HAILO_DEFAULT_MAX_ETHERNET_BANDWIDTH_BYTES_PER_SEC", "HAILO_MAX_STREAMS_COUNT",
                        "HAILO_DEFAULT_BATCH_SIZE", "HAILO_MAX_NETWORK_GROUPS", "HAILO_MAX_NETWORK_GROUP_NAME_SIZE",
                        "HAILO_MAX_NETWORK_NAME_SIZE", "HAILO_MAX_NETWORKS_IN_NETWORK_GROUP", "HAILO_PCIE_ANY_DOMAIN",
                        "HAILO_DEFAULT_VSTREAM_QUEUE_SIZE", "HAILO_DEFAULT_VSTREAM_TIMEOUT_MS",
                        "HAILO_DEFAULT_ASYNC_INFER_TIMEOUT_MS", "HAILO_DEFAULT_ASYNC_INFER_QUEUE_SIZE",
                        "HAILO_DEFAULT_DEVICE_COUNT", "HAILO_SOC_ID_LENGTH", "HAILO_ETH_MAC_LENGTH",
                        "HAILO_UNIT_LEVEL_TRACKING_BYTES_LENGTH", "HAILO_SOC_PM_VALUES_BYTES_LENGTH",
                        "HAILO_MAX_TEMPERATURE_THROTTLING_LEVELS_NUMBER", "HAILO_UNIQUE_VDEVICE_GROUP_ID",
                        "HAILO_DEFAULT_VDEVICE_GROUP_ID", "HAILO_SCHEDULER_PRIORITY_NORMAL",
                        "HAILO_SCHEDULER_PRIORITY_MAX", "HAILO_SCHEDULER_PRIORITY_MIN", "MAX_NUMBER_OF_PLANES",
                        "NUMBER_OF_PLANES_NV12_NV21", "NUMBER_OF_PLANES_I420").cppTypes().annotations())


                .put(new Info("HAILO_STATUS_VARIABLES").translate(false)) // Enums are defined via macros, handle separately if necessary

                .put(new Info("float32_t", "float64_t", "nms_bbox_counter_t").cast().pointerTypes("FloatPointer", "DoublePointer", "IntPointer"))
                .put(new Info("hailo_version_t").translate()) // This will require a manual translation, mapping struct fields
                .put(new Info("hailo_status").cast().valueTypes("int").pointerTypes("IntPointer"));
    }
}
