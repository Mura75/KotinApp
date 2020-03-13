package com.mobile.mykotlinapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class JavaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java)
        val bankKt = BankKt("qwerty", "qwerty")
        bankKt.toString()
        val bank = Bank(null, null)
        bank.showAddress(null)
    }
}