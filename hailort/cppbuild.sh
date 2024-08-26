#!/bin/bash
# This file is meant to be included by the parent cppbuild.sh script
if [[ -z "$PLATFORM" ]]; then
    pushd ..
    bash cppbuild.sh "$@" zlib
    popd
    exit
fi

HAILORT_VERSION=4.18.0
download https://github.com/hailo-ai/hailort/archive/refs/tags/v$HAILORT_VERSION.tar.gz hailort-v$HAILORT_VERSION.tar.gz
mkdir -p $PLATFORM
cd $PLATFORM
tar -xzvf ../hailort-v$HAILORT_VERSION.tar.gz
cd hailort-$HAILORT_VERSION

case $PLATFORM in
    android-arm64)
        cmake -S. -Bbuild -DCMAKE_BUILD_TYPE=Release
        cmake --build build --config release --target libhailort
        mkdir -p ../include ../lib
        cp ./build/hailort/libhailort/src/libhailort.so.$HAILORT_VERSION ../lib/
        cp hailort/libhailort/include/hailo/*.h ../include/
        ;;
    android-x86_64)
        cmake -S. -Bbuild -DCMAKE_BUILD_TYPE=Release
        cmake --build build --config release --target libhailort
        mkdir -p ../include ../lib
        ;;
    linux-x86_64)
        cmake -S. -Bbuild -DCMAKE_BUILD_TYPE=Release
        cmake --build build --config release --target libhailort
        mkdir -p ../include ../lib
        cp ./build/hailort/libhailort/src/libhailort.so.$HAILORT_VERSION ../lib/
        cp hailort/libhailort/include/hailo/*.h ../include/
        ;;
    linux-arm64)
        cmake -S. -Bbuild -DCMAKE_BUILD_TYPE=Release
        cmake --build build --config release --target libhailort
        mkdir -p ../include ../lib
        cp ./build/hailort/libhailort/src/libhailort.so.$HAILORT_VERSION ../lib/
        cp hailort/libhailort/include/hailo/*.h ../include/
        ;;
    windows-x86_64)
        cmake -S. -Bbuild -DCMAKE_BUILD_TYPE=Release
        cmake --build build --config release --target libhailort
        mkdir -p ../include ../lib

        ;;
    *)
        echo "Error: Platform \"$PLATFORM\" is not supported"
        ;;
esac

cd ../..