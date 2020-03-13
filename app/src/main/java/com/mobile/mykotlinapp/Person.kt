package com.mobile.mykotlinapp

class Person {

    var name: String = ""

    var bank: Bank? = null

    companion object {
        const val type = "PERSON"

        fun sayHello(): String = "hello"
    }


    fun initInfo(
        name: String = "",
        surname: String = "",
        age: Int = 0,
        id: Int = 0,
        nationality: String = "",
        gender: String = ""
    ) {

    }
}