fun main() {
    val penambahan = Penambahan()
    val pengurangan = Pengurangan()
    val perkalian = Perkalian()
    val pembagian = Pembagian()

    val kalkulatorEngine = KalkulatorEngine(penambahan)

    var continuePerhitungan = true

    while (continuePerhitungan) {
        println("Masukan Angka Pertama:")
        val num1 = readLine()?.toDoubleOrNull()
        println("Masukan Angka Kedua:")
        val num2 = readLine()?.toDoubleOrNull()

        if (num1 == null || num2 == null) {
            println("Invalid input. Masukan Hanya Angka.")
        } else {
            println("Pilih Operasi (+, -, *, /):")
            val operator = readLine()

            val kalkulator = when (operator) {
                "+" -> penambahan
                "-" -> pengurangan
                "*" -> perkalian
                "/" -> pembagian
                else -> null
            }

            if (kalkulator == null) {
                println("Invalid operator. Masukan hanya salah satu operasi berikut: +, -, *, /")
            } else {
                kalkulatorEngine.kalkulator = kalkulator
                val result = kalkulator.perhitungan(num1,num2)
                println("Result: $result")
            }
        }

        println("Lanjutkan perhitungan? (y/n)")
        var continueAnswer = readLine()
        continuePerhitungan = continueAnswer?.toLowerCase() == "y"
    }
}