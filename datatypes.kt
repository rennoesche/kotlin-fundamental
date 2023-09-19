fun datatypes() {
    val char = "C"
    val str = "ini data String"
    val str1 = """
      Tipe Data String
      ================
      Dengan baris banyak
  """.trimIndent()
    val benar = true
    val salah = false
    val i: Int = 99887
    val d: Double = 109.96
    val f: Float = 123.45f
    val l: Long = 12354320L
    val s: Short = 76
    val b: Byte = Byte.MIN_VALUE
    print("Tipe data char: $char" +
            "\nTipe data string: $str" +
            "\nTipe data string: \n$str1" +
            "\n\t ini tab" +
            "\n\' ini single quote" +
            "\n\" ini double quotes" +
            "\n\\ ini garis miring" +
            "\nTipe data boolean: \nbenar=$benar, salah=$salah\nbenar && salah = " + (benar&&salah) +
            "\ncontoh Int: " + i +
            "\ncontoh Double: " + d +
            "\ncontoh Float: " + f +
            "\ncontoh Long: " + l +
            "\ncontoh Short: " + s +
            "\ncontoh Byte: " + b)
}
