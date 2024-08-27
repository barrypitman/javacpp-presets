package org.bytedeco.hailort.presets;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.javacpp.tools.*;

@Properties(
        value = {
                @Platform(include = {
                        "hailort.h",
                        "platform.h"
                }),
                @Platform(value = "windows", include = {}),
                @Platform(value = "linux",
                        include = {
//                        "<unistd.h>",
//                                "<sys/time.h>",
//                                "<sys/socket.h>",
//                                "<netinet/in.h>",
//                                "<arpa/inet.h>"
                        },
                        includepath = {
                                 "hailort/src/test/resources/", // todo remove
//                                "/usr/include/x86_64-linux-gnu/",
//                                "/usr/include/"
                        }
                ),

        },
        target = "org.bytedeco.hailort",
        global = "org.bytedeco.hailort.global.hailort",
        helper = "org.bytedeco.hailort.HailoHelper"
)
public class hailort implements InfoMapper {

    static {
        Loader.checkVersion("org.bytedeco", "hailort");
    }

    @Override
    public void map(InfoMap infoMap) {
//        infoMap.put(new Info("in.h")
//                .linePatterns("struct sockaddr_in", "\\s+};",
//                        "typedef uint32_t in_addr_t;", "\\s+};",
//                        "/\\* Type to represent a port.  \\*/", "/\\* Standard well-known ports.  \\*/"
//                        ));


        // types from platform.h
        infoMap.put(new Info("socket_t").cast().valueTypes("int").pointerTypes("IntPointer"));
        infoMap.put(new Info("port_t").cast().valueTypes("int").pointerTypes("IntPointer"));
        infoMap.put(new Info("sockaddr_in").cast().javaNames("org.bytedeco.systems.linux.sockaddr").pointerTypes("Pointer"));
        infoMap.put(new Info("INVALID_SOCKET").javaText("public static final int INVALID_SOCKET = (int)(-1);"));

        infoMap.put(new Info("hailort.h").linePatterns("#ifdef __cplusplus", "#endif").skip());

        // these variables are defined in HailoHelper
        infoMap.put(new Info("hailo_status").cast().valueTypes("int").pointerTypes("IntPointer"));
        infoMap.put(new Info("HAILO_STATUS_VARIABLES").skip());

        // macros and constants
        infoMap.put(new Info("HAILO_INFINITE").javaText("public static final long HAILO_INFINITE = 0xFFFFFFFFL;"));
        infoMap.put(new Info("HAILO_PCIE_ANY_DOMAIN").javaText("public static final long HAILO_PCIE_ANY_DOMAIN = 0xFFFFFFFFL;"));
        infoMap.put(new Info("HAILO_ETH_ADDRESS_ANY").javaText("public static final String HAILO_ETH_ADDRESS_ANY = \"0.0.0.0\";"));
        infoMap.put(new Info("HAILORTAPI").cast().valueTypes("int").pointerTypes("IntPointer"));
        infoMap.put(new Info("HAILO_UNIQUE_VDEVICE_GROUP_ID").javaText("public static final String HAILO_UNIQUE_VDEVICE_GROUP_ID = \"UNIQUE\";"));
        infoMap.put(new Info("HAILO_DEFAULT_VDEVICE_GROUP_ID").javaText("public static final String HAILO_DEFAULT_VDEVICE_GROUP_ID = HAILO_UNIQUE_VDEVICE_GROUP_ID;"));
        infoMap.put(new Info("HAILO_DEFAULT_INIT_SAMPLING_PERIOD_US").javaText("public static final int HAILO_DEFAULT_INIT_SAMPLING_PERIOD_US = 1100;"));
        infoMap.put(new Info("HAILO_DEFAULT_INIT_AVERAGING_FACTOR").javaText("public static final int HAILO_DEFAULT_INIT_AVERAGING_FACTOR = 256;"));

        // mapping e.g. typedef struct _hailo_configured_network_group *hailo_configured_network_group;
        infoMap.put(new Info("hailo_hef").valueTypes("_hailo_hef").pointerTypes("@ByPtrPtr _hailo_hef"));
        infoMap.put(new Info("hailo_configured_network_group").valueTypes("_hailo_configured_network_group").pointerTypes("@ByPtrPtr _hailo_configured_network_group"));
        infoMap.put(new Info("hailo_activated_network_group").valueTypes("_hailo_activated_network_group").pointerTypes("@ByPtrPtr _hailo_activated_network_group"));
        infoMap.put(new Info("hailo_device").valueTypes("_hailo_device").pointerTypes("@ByPtrPtr _hailo_device"));
        infoMap.put(new Info("hailo_vdevice").valueTypes("_hailo_vdevice").pointerTypes("@ByPtrPtr _hailo_vdevice"));
        infoMap.put(new Info("hailo_input_stream").valueTypes("_hailo_input_stream").pointerTypes("@ByPtrPtr _hailo_input_stream"));
        infoMap.put(new Info("hailo_input_vstream").valueTypes("_hailo_input_vstream").pointerTypes("@ByPtrPtr _hailo_input_vstream"));
        infoMap.put(new Info("hailo_input_transform_context").valueTypes("_hailo_input_transform_context").pointerTypes("@ByPtrPtr _hailo_input_transform_context"));
        infoMap.put(new Info("hailo_output_stream").valueTypes("_hailo_output_stream").pointerTypes("@ByPtrPtr _hailo_output_stream"));
        infoMap.put(new Info("hailo_output_demuxer").valueTypes("_hailo_output_demuxer").pointerTypes("@ByPtrPtr _hailo_output_demuxer"));
        infoMap.put(new Info("hailo_output_transform_context").valueTypes("_hailo_output_transform_context").pointerTypes("@ByPtrPtr _hailo_output_transform_context"));
        infoMap.put(new Info("hailo_output_vstream").valueTypes("_hailo_output_vstream").pointerTypes("@ByPtrPtr _hailo_output_vstream"));

        // mapping EMPTY_STRUCT_PLACEHOLDER
        infoMap.put(new Info("EMPTY_STRUCT_PLACEHOLDER").cast().valueTypes("int").pointerTypes("IntPointer"));
//        infoMap.put(new Info("hailo_demux_params_t").pointerTypes("hailo_demux_params_t"));
//        infoMap.put(new Info("hailo_pcie_input_stream_params_t").pointerTypes("hailo_pcie_input_stream_params_t"));
//        infoMap.put(new Info("hailo_pcie_output_stream_params_t").pointerTypes("hailo_pcie_output_stream_params_t"));
//        infoMap.put(new Info("hailo_integrated_input_stream_params_t").pointerTypes("hailo_integrated_input_stream_params_t"));
//        infoMap.put(new Info("hailo_integrated_output_stream_params_t").pointerTypes("hailo_integrated_output_stream_params_t"));
    }
}
