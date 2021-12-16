package com.example.yanze_li_200411363_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
//import com.google.firebase.auth.FirebaseAuth
//import com.google.firebase.auth.GoogleAuthProvider
//import com.google.firebase.auth.ktx.auth
//import com.google.firebase.firestore.ktx.firestore
//import com.google.firebase.ktx.Firebase

class LoginActivity : AppCompatActivity() {
//    private lateinit var auth: FirebaseAuth
//    private lateinit var account: EditText
//    private lateinit var password: EditText
//    private lateinit var sign_up: Button
//    private lateinit var log_in: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
//        initial_variables()
//        button_func()

    }

//    fun initial_variables(){
//        auth = Firebase.auth
//        account = findViewById(R.id.account_area)
//        password = findViewById(R.id.password_area)
//        sign_up = findViewById(R.id.sign_up_button)
//        log_in = findViewById(R.id.log_in_button)
//    }
//
//    //Signup button onClick event
//    fun button_func() {
//        log_in.setOnClickListener {
//
//            if (TextUtils.isEmpty(account.text.toString().trim()))
//            {
//                Toast.makeText(
//                    applicationContext,
//                    "Please enter email address first!",
//                    Toast.LENGTH_SHORT
//                ).show()
//                Log.d("Creation","Enter email first!")
//            }
//            else if (TextUtils.isEmpty(password.text.toString().trim()))
//            {
//                Toast.makeText(
//                    applicationContext,
//                    "Please enter password first!",
//                    Toast.LENGTH_SHORT
//                ).show()
//                Log.d("Creation","Enter password first!")
//            }
//            else
//            {
//                val email = account.text.toString().trim()
//                val password = password.text.toString().trim()
//
//                //Add this account to the firebase.
//                auth = FirebaseAuth.getInstance()
//                auth.signInWithEmailAndPassword(email, password)
//                    .addOnCompleteListener(this) { task ->
//                        if (task.isSuccessful) {
//                            // Sign in success
//                            Toast.makeText(applicationContext, "success!", Toast.LENGTH_SHORT).show()
//                            Log.d("Creation","Success")
//                            val profile_activity = Intent(this,MainActivity::class.java)
//                            startActivity(profile_activity)
//                            this.finish()
//                        } else {
//                            // Sign in success
//                            Toast.makeText(applicationContext, "Fail!", Toast.LENGTH_SHORT).show()
//                            Log.d("Creation","Fail")
//                        }
//                    }
//
//            }
//
//        }
//        sign_up.setOnClickListener {
//            //If either account or password is empty:
//            if (TextUtils.isEmpty(account.text.toString().trim()))
//            {
//                Toast.makeText(
//                    applicationContext,
//                    "Please enter email address first!",
//                    Toast.LENGTH_SHORT
//                ).show()
//                Log.d("Creation","Enter email first!")
//            }
//            else if (TextUtils.isEmpty(password.text.toString().trim()))
//            {
//                Toast.makeText(
//                    applicationContext,
//                    "Please enter password first!",
//                    Toast.LENGTH_SHORT
//                ).show()
//                Log.d("Creation","Enter password first!")
//            }
//            else
//            {
//                val email = account.text.toString().trim()
//                val password = password.text.toString().trim()
//
//                //Add this account to the firebase.
//                auth = FirebaseAuth.getInstance()
//                auth.createUserWithEmailAndPassword(email, password)
//                    .addOnCompleteListener(this) { task ->
//                        if (task.isSuccessful) {
//                            // Sign in success
//                            Toast.makeText(applicationContext, "success!", Toast.LENGTH_SHORT).show()
//                            Log.d("Creation","Success")
//                            val profile_activity = Intent(this,MainActivity::class.java)
//                            startActivity(profile_activity)
//                            this.finish()
//                        } else {
//                            // Sign in success
//                            Toast.makeText(applicationContext, "Fail!", Toast.LENGTH_SHORT).show()
//                            Log.d("Creation","Fail")
//                        }
//                    }
//
//            }
//        }
//    }
}