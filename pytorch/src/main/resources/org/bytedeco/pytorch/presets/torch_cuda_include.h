#include "c10/util/ArrayRef.h"

// Included by
// ATen/cudnn/Descriptors.h
// ATen/cudnn/Types.h
// c10/cuda/CUDAGuard.h
// torch/csrc/inductor/aoti_model_container_runner_cuda.h
#include "ATen/cuda/CUDAContextLight.h"
#include "c10/cuda/CUDAStream.h"
#include "ATen/cuda/CUDAContext.h"
#include "c10/core/impl/GPUTrace.h"
#include "c10/cuda/CUDADeviceAssertionHost.h"
#include "c10/cuda/CUDAMacros.h"
#include "c10/cuda/impl/cuda_cmake_macros.h"
#include "c10/cuda/CUDAMiscFunctions.h",
#include "c10/cuda/CUDAException.h",
#include "c10/cuda/CUDAFunctions.h",
#include "ATen/cuda/Exceptions.h"
#include "ATen/cudnn/cudnn-wrapper.h"
#include "ATen/cuda/ATenCUDAGeneral.h"
#include "ATen/cudnn/Utils.h"
#include "ATen/cudnn/Handle.h"
#include "c10/cuda/CUDAGraphsC10Utils.h"
#include "c10/util/ApproximateClock.h"
#include "c10/cuda/CUDACachingAllocator.h",
#include "c10/cuda/impl/CUDAGuardImpl.h"
#include "ATen/cudnn/Descriptors.h"
#include "ATen/cudnn/Types.h"
#include "c10/cuda/CUDAGuard.h"
// Doesn't compile on Windows. Waiting for 2.2.1.
// #include "torch/csrc/inductor/aoti_model_container_runner_cuda.h"