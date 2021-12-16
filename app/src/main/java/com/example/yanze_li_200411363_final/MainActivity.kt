package com.example.yanze_li_200411363_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var add_button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initial_variable()
    }
    fun initial_variable(){
        add_button = findViewById(R.id.Add_button)
        button_func()
    }
    fun button_func() {
        add_button.setOnClickListener {
            val profile_activity = Intent(this,DetailActivity::class.java)
            startActivity(profile_activity)
            this.finish()
        }
    }
}