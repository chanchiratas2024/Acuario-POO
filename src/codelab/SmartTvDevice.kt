package codelab

class SmartTvDevice(
    name: String,
    category: String,
    deviceType: String
) : SmartDevice(name, category, deviceType) {
    var volume: Int = 50
    var channel: Int = 1

    fun decreaseVolume() {
        if (deviceStatus == "on" && volume > 0) volume--
    }

    fun previousChannel() {
        if (deviceStatus == "on" && channel > 1) channel--
    }

    fun printTvInfo() {
        println("TV $name -> Volume: $volume, Channel: $channel")
    }
}
