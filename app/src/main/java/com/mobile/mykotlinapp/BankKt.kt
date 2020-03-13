package com.mobile.mykotlinapp

data class BankKt(
    var name: String? = "qwerty",
    var address: String? = "zxcvbn"
) {
    var rating: Int = 0
        get() = field
        set(value) {
            if (value < 0) {
                field = 0
            } else {
                field = value
            }
        }

    fun showAddress(newAddress: String = "Abay") {
        println(newAddress)
    }

}