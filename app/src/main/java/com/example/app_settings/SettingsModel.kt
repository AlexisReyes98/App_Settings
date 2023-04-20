package com.example.app_settings

data class SettingsModel(
    var volume: Int,
    var bluetooth: Boolean,
    var darkMode: Boolean,
    var vibration: Boolean
)