package com.example.appexafin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.Firebase
import com.google.firebase.auth.auth

class RegistroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        val btnsave: Button = findViewById(R.id.btnSave)
        val btnview: Button = findViewById(R.id.btnView)
        val txtID : TextView = findViewById(R.id.edtID)
        val txtDescription : TextView = findViewById(R.id.edtDescrip)
        val txtQuantity : TextView = findViewById(R.id.edtQuan)
        val txtPrice : TextView = findViewById(R.id.edtPrice)
        btnsave.setOnClickListener()
        {
            Register(txtID.text.toString(),txtDescription.text.toString(), txtQuantity.text.toString(), txtPrice.text.toString())
        }
    }
    private fun Register(ID: String, Description: String, Quantity: String, Price: String)
    {

    }
}