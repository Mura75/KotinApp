package com.mobile.mykotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import java.lang.Exception

typealias superList = ArrayList<List<Map<String, String>>>

class MainActivity : AppCompatActivity() {

//    private var button: Button

    private var hello: String? = null

    private var result: String = ""

    val finalText = ""

    private lateinit var button: Button

    companion object {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list: superList = ArrayList<List<Map<String, String>>>()

        val bankKt = BankKt("fff")
        bankKt.showAddress(newAddress = "hello")

        var bank = Bank(null, null)

        val person = Person()

        person.initInfo(
                name = ""
        )

        button = findViewById(R.id.button)
        button.setOnClickListener {
            showToast(text = "hello")
        }

        hello?.let { item ->
            result = item
        }

        Person.sayHello()

        try {

        } catch (e: Exception) {

        }
    }
}
