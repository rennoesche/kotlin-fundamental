fun main() {
    val carmodel = setModel("MAZDA", "CX-30", 2024)
    println(carmodel)
}
fun setModel(vendor: String, release: String, year: Int): String {
    return "$year $vendor $release Gets Technical Improvements"
}
