package codelab

class SmartHome(
    val tv: SmartTvDevice,
    val light: SmartLightDevice
) {
    fun decreaseTvVolume() = tv.decreaseVolume()
    fun changeTvChannelToPrevious() = tv.previousChannel()
    fun printSmartTvInfo() = tv.printTvInfo()
    fun printSmartLightInfo() = light.printLightInfo()
    fun decreaseLightBrightness() = light.decreaseBrightness()
}
