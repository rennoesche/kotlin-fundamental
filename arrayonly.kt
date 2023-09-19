fun arrayonly() {
    val cars = arrayOf<String>("Audi",
        "Mercedes Benz",
        "Lamborghini",
        "Toyota",
        "BMW",
        "Mustang",
        "Jeep",
        "Lexus",
        "Suzuki",
        "Fiat",
        "Subaru")
    println("array paling awal = " + cars[0] +
            "\narray paling akhir = " + cars.get(10))
    println("====================\nMengubah isi array paling awal")
    cars.set(0, "Bentley")
    println(cars.get(0))
    println("====================\nMengubah isi array paling akhir")
    cars[10] = "Mazda"
    println(cars[10])
}
  
