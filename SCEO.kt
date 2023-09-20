// Safe Calls (?.)

class Orang(val name: String?)

fun main() {
    val a: Orang? = Orang("Budi")
    val b: Orang? = null

    // Menggunakan safe calls untuk akses
    val name1: String? = a?.name
    val name2: String? = b?.name

    println("Nama 1: $name1")
    println("Nama 2: $name2")
}

// Elvis Operator (?:)

//fun main() {
//    val name1: String? = "Loraine"
//    val name2: String? = null
//
//    // Menggunakan Elvis Operator untuk memberikan nilai default
//    val uName1 = name1 ?: "Tidak ada nama"
//    val uName2 = name2 ?: "Tidak ada nama"
//
//    println("username 1: $uName1") // Output: username 1: Alice
//    println("username 2: $uName2") // Output: username 2: Tidak ada nama
//}

