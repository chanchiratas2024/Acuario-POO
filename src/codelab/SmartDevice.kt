package codelab

open class SmartDevice(
    val name: String,
    val category: String,
    val deviceType: String
) {
    var deviceStatus: String = "off"
    var deviceTurnOnCount: Int = 0

    fun turnOn() {
        if (deviceStatus != "on") {
            deviceStatus = "on"
            deviceTurnOnCount++
        }
    }

    fun turnOff() {
        deviceStatus = "off"
    }

    fun printDeviceInfo() {
        println("Device name: $name, category: $category, type: $deviceType")
    }
}
