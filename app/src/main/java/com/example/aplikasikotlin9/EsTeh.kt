package com.example.aplikasikotlin9

class EsTeh(var suhu: Int, var gula: Double, var bahan: List<String>) {
    var color: String = "coklat"
    var rasa: String = "manis"
    var suhuu: Int = suhu
    var TakaranGula: Double = gula
    var BahanEsTeh: List<String> = bahan

    fun minum() {
        println(
            "Saya sedang menikmati es teh dengan rasa yang $rasa dengan suhu $suhuu derajat celcius" +
                    " kemudian warnanya adalah $color, dan menggunakan takaran gula sebanyak $TakaranGula gram." +
                    " Teh ini dibuat dari bahan-bahan yaitu ${BahanEsTeh.joinToString(", ")}"
        )
    }
}

fun main() {
    val bahanEsTeh = listOf("teh", "gula", "air", "es")
    val esTeh = EsTeh(suhu = 60, bahan = bahanEsTeh, gula = 10.0)
    esTeh.minum()
}
