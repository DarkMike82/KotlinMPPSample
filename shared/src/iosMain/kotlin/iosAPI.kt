package com.mikedon.shared

import platform.UIKit.UIDevice

actual fun platformName(): String {
    return "${UIDevice.currentDevice.systemName} ${UIDevice.currentDevice.systemVersion}"
}