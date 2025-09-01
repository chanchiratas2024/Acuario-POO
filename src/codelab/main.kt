package codelab

fun main() {
    val tv = SmartTvDevice("LivingRoomTV", "Entertainment", "LED")
    val light = SmartLightDevice("KitchenLight", "Lighting", "LED")

    val home = SmartHome(tv, light)

    // Encendemos los dispositivos
    tv.turnOn()
    light.turnOn()

    // Probamos métodos
    home.decreaseTvVolume()
    home.changeTvChannelToPrevious()
    home.decreaseLightBrightness()

    // Mostramos estados
    home.printSmartTvInfo()
    home.printSmartLightInfo()

    // Información general
    tv.printDeviceInfo()
    light.printDeviceInfo()
}
