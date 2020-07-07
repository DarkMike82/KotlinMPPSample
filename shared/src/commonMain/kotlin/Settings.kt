package com.mikedon.shared

expect fun platformName(): String

class Settings {
    fun greeting(): String {
        return "Hello, ${platformName()}"
    }
}