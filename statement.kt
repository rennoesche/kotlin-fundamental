fun main() {
    val sarapan = 7
    val lunch = 13
    val dinner = 19
    var sekarang = 1

    val status =
        if (sekarang>=dinner && sekarang <= 24) {
            "Seharusnya kamu sudah sarapan, makan siang, dan makan malam"
        }
        else if (sekarang>=lunch && sekarang <= 24) {
            "Seharusnya kamu sudah sarapan dan makan siang"
        }
        else if (sekarang>=sarapan && sekarang <= 24) {
            "Seharusnya kamu sudah sarapan"
        }
        else if (sekarang > 24) {
            "Mana ada jam lebih dari pukul 24"
        }
        else if (sekarang < 0) {
            "Mana ada jam bentuk negatif :v"
        }
        else {
            "Kemarin kan kamu sudah makan"
        }
    println(status)
}
