fun main() {
    var samsung_galaxy = MobilePhone("Android", "Samsung", "Galaxy S20 Ultra")
}

class MobilePhone(osName: String, brand: String, model: String) {

    init {
        println("Mobile object initialised with " + "osName = $osName, brand $brand and model = $model")
    }
}