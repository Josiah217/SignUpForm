package edu.temple.signupform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val saveButton = findViewById<Button>(R.id.Save)
        val textPerson = findViewById<TextView>(R.id.TextPersonName)
        val textEmail = findViewById<TextView>(R.id.TextEmailAddress)
        val textPassword = findViewById<TextView>(R.id.TextPassword)
        val textPasswordC = findViewById<TextView>(R.id.TextPasswordConfirmation)
       saveButton.setOnClickListener{
            if(textPassword.length() == 0 ||  textPasswordC.length() == 0
                ||  textEmail.length() == 0 ||  textPerson.length() == 0){
                Toast.makeText(applicationContext,"Fill out all Fields",Toast.LENGTH_LONG).show()
            }
        }

    }
}